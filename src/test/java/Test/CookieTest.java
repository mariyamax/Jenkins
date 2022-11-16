package Test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CookieTest {

  @Parameters({"Name","HelloString"})
  @Test
  public static void CookieTest(String name,String helloString){
    String sayHello = "Hello, ";
    Assert.assertEquals(sayHello.concat(name),helloString);
  }

}
