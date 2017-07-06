import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* HelloWorld Tester. 
* 
* @version 1.0 
*/
public class HelloWorldTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: hello() 
* 
*/ 
@Test
public void testHello() throws Exception {
    HelloWorld helloWorld = new HelloWorld();
    int result = helloWorld.hello();
    Assert.assertEquals(1, result);
}


} 
