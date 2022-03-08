package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ders1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\erdis\\OneDrive\\Belgeler\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        System.out.println("suandaki url : "+driver.getCurrentUrl());
        System.out.println("su anki baslik : "+ driver.getTitle());


        driver.navigate().to("https://www.google.com.tr/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);


        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);




        Thread.sleep(3000);
    driver.close();



    }

}
