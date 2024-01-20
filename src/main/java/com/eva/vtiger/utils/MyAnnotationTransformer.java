package com.eva.vtiger.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
///  javaxmail  ///  smtp server address
public class MyAnnotationTransformer implements IAnnotationTransformer {

	@Override
	public void transform (final ITestAnnotation annotation, final Class testClass, final Constructor testConstructor,
			final Method testMethod) {
		annotation.setRetryAnalyzer(RetryFailedTestCases.class);
		
	}
    /////   2003 -  .xls
	///   2007 -  .xls   ,  .xlsx

}
