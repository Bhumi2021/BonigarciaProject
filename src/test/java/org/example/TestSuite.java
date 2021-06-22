package org.example;


import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    //creating object
    DemoNopCommerce demoNopCommerce=new DemoNopCommerce();
    @Test
    public void VerifyNopCommerceWebsiteOpenSuccessfully(){
       demoNopCommerce.openDemoNopCommerceWebsite();

    }
}
