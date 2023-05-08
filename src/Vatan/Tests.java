package Vatan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

    public void normalFlow() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Efe\\Selenium\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.vatanbilgisayar.com/login/");

        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("test2226@hotmail.com");
        Thread.sleep(1000);

        driver.findElement(By.id("pass")).sendKeys("test12345");
        Thread.sleep(1000);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@href='/bilgisayar/']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//option[@value='UP']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@href='/5000-10000-tl-arasi/bilgisayar/?srt=UP']")).click();
        Thread.sleep(2000);

        driver.findElement(By.className("wrapper-radio")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//img[@src='https://cdn.vatanbilgisayar.com/Upload/PRODUCT/lenovo/thumb/132412-1_small.jpg']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='SEPETE GİT']")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("closePop")).click();
        Thread.sleep(3000);

        driver.findElement(By.className("icon-times-circle")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@class='btn btn-primary signup-form__button change-password-form__button']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='btnMyAccount']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@href='/MemberTransaction/Logout?returnUrl=%2F&logtab=signup']")).click();
        Thread.sleep(1000);

        String expected_url= "https://www.vatanbilgisayar.com/";
        String actual_url =driver.getCurrentUrl();

        if(expected_url.equals(actual_url)){
            System.out.println("Test successful");
        }else{
            System.out.println("Test failed");
        }
        driver.quit();


    }

    public void AlternateFlow1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Efe\\Selenium\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.vatanbilgisayar.com/login/");

        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("test2226@hotmail.com");
        Thread.sleep(1000);

        driver.findElement(By.id("pass")).sendKeys("asdgfsaa");
        Thread.sleep(1000);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("pass")).sendKeys("test12345");
        Thread.sleep(1000);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@href='/bilgisayar/']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//option[@value='UP']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@href='/5000-10000-tl-arasi/bilgisayar/?srt=UP']")).click();
        Thread.sleep(1000);

        driver.findElement(By.className("wrapper-radio")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//img[@src='https://cdn.vatanbilgisayar.com/Upload/PRODUCT/lenovo/thumb/132412-1_small.jpg']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@onclick='AddToBasket(132412, 25938, 4, [])']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='SEPETE GİT']")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("closePop")).click();
        Thread.sleep(3000);

        driver.findElement(By.className("icon-times-circle")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@class='btn btn-primary signup-form__button change-password-form__button']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='btnMyAccount']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@href='/MemberTransaction/Logout?returnUrl=%2F&logtab=signup']")).click();

    }

    public void AlternateFlow2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Efe\\Selenium\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.vatanbilgisayar.com/login/");

        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("test2226@hotmail.com");
        Thread.sleep(1000);

        driver.findElement(By.id("pass")).sendKeys("test12345");
        Thread.sleep(1000);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@href='/bilgisayar/']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//option[@value='UP']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@href='/5000-10000-tl-arasi/bilgisayar/?srt=UP']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@href='/acer-aspire-3-a315-amd-a4-9120e-1-5ghz-4gb-128gb-ssd-15-6-amd-w10.html']")).click();
        Thread.sleep(3000);

        driver.findElement(By.className("icon-store-alt")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-close-small']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='btnMyAccount']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@href='/MemberTransaction/Logout?returnUrl=%2Facer-aspire-3-a315-amd-a4-9120e-1-5ghz-4gb-128gb-ssd-15-6-amd-w10.html&logtab=signup']")).click();

    }

}




