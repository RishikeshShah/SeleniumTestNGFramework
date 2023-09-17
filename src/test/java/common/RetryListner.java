package common;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListner implements IAnnotationTransformer {
	  public void transform(
		      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		  // methods of MyRetry class will be invoked. maximum retries is implemented in MyRetry class
		  annotation.setRetryAnalyzer(MyRetry.class);
		  }

}
