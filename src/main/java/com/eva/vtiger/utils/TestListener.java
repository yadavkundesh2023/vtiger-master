package com.eva.vtiger.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

	public static int passCounter;
	public static int failCounter;
	public static int skipCounter;
	
	@Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

	

    @Override		
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		failCounter++;
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
         // TODO Auto-generated method stub				
      skipCounter++;       		
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
    	passCounter=passCounter+1;			
        		
    }		
	
	
}
