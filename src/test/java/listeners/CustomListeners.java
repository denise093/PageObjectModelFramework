package listeners;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import base.Page;
import utilities.MonitoringMail;
import utilities.TestConfig;
import utilities.Utilities;

public class CustomListeners extends Page implements ITestListener,ISuiteListener {
	
	public CustomListeners() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	public String messageBody; 
	 	
	    public void onFinish(ITestContext arg0) {	
	    	
	    	MonitoringMail mail = new MonitoringMail();
			
			try {
				messageBody = ("http://"+InetAddress.getLocalHost().getHostAddress()+":8080/job/PageObjectModel/HTML_20Report/");
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(messageBody);
			
			try {
				mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody,TestConfig.attachmentPath, TestConfig.attachmentName);
			} catch (AddressException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
	        		
	    }		

	    public void onStart(ITestContext arg0) {					
	    	test = rep.createTest(arg0.getName());					
	        		
	    }		

	    		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	  	
	    public void onTestFailure(ITestResult arg0) {					
	      
	    	System.setProperty("org.uncommons.reportng.escape-output", "false");
	    	try {
				Utilities.captureScreenshot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
	    	Reporter.log("<a target=\"_blank\" href="+Utilities.screenshotName+">Screenshot</a>");	
	    	Reporter.log("<br>");
	    
	        test.log(Status.FAIL, arg0.getName().toUpperCase()+" FAIL with exception: "+ arg0.getThrowable());	 
	        test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(Utilities.screenshotName).build());
	        rep.flush();	
	    }		

	   	
	    public void onTestSkipped(ITestResult arg0) {					
	        test.log(Status.SKIP, arg0.getName()+" Skipped the test as the Run mode is No.");			
	        rep.flush();		
	    }		

	  		
	    public void onTestStart(ITestResult arg0) {					


	        		
	    }		

	    		
	    public void onTestSuccess(ITestResult arg0) {					
	        test.log(Status.PASS, arg0.getName().toUpperCase()+" PASS");		
	        rep.flush();	
	    }		

}
