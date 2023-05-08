package Vatan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {


    public static void main(String[] args) throws InterruptedException {

        Tests tests = new Tests();

         tests.normalFlow();  // (TC1)

        // tests.AlternateFlow1(); // User enters incorrect password and system returns error message. User enters correct password and use case continues. (TC2)

        // tests.AlternateFlow2(); // User does not select the "stoktakiler" option and select item but it is not in the stocks and user exits the system.(TC7)



    }
}


