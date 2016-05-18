package galenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.galenframework.testng.GalenTestNgTestBase;

import static java.util.Arrays.asList;

import java.io.IOException;
public class WelcomePageTest extends GalenTestNgTestBase {
	
	public static WebDriver driver = null; 

    @Override
    public WebDriver createDriver(Object[] args) {
        return new FirefoxDriver();        
    }

    @Test
    public void prodRBSPrivateDesktop() throws IOException {
        load("http://rbscouk.digital.rbsgrp.mde/private/wr403_test/landing/productlist.html", 1280, 1024);   
        checkLayout("/specs/ProdListRBSPrivate_Desktop.gspec", asList("desktop"));
 /*   	}catch(Exception e)
    	{
    		System.out.println("There are errors");
    	}*/
    }
    @Test
    public void prodRBSPrivateMobile() throws IOException {
        load("http://rbscouk.digital.rbsgrp.mde/private/wr403_test/landing/productlist.m.html", 353, 600);        
        checkLayout("/specs/ProdListRBSPrivate_Mobile.gspec", asList("mobile"));
        
    }
    @Test(enabled = false)
    public void prodNatwestPrivateDesktop() throws IOException {
       
        load("http://natwestcom.digital.rbsgrp.mde/private/wr403_test/landing/productlist.html", 1280, 1024);
        checkLayout("/specs/ProdListNatwestPrivate_Desktop.gspec", asList("desktop"));
    }
    @Test(enabled = false)
    public void prodNatwestPrivateMobile() throws IOException {
       
        load("http://natwestcom.digital.rbsgrp.mde/private/wr403_test/landing/productlist.m.html", 353, 600);
        checkLayout("/specs/ProdListNatwestPrivate_Mobile.gspec", asList("mobile"));
    }    

}