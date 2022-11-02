package cci.TI;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Threat Intel POC

    public void login() throws InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("pageLoadStrategy", "none");

        Configuration.timeout = 60000;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1366x768";
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;
        Configuration.browserCapabilities = capabilities;

        //open("https://cci.my.salesforce.com");
        //$("input#username").shouldBe(Condition.visible).sendKeys("pocpocpocGith@cci.com.tr.sf.qa88");
        //$("input#password").shouldBe(Condition.visible).sendKeys("02112022_1347");
        open("https://cci.my.salesforce.com");
        $("input#username").shouldBe(Condition.visible).sendKeys("eray.turker@cci.com.tr.sf.pre1");
        $("input#password").shouldBe(Condition.visible).sendKeys("02112022_1347");
        $("input#Login").shouldBe(Condition.visible).click();
        waitForSecond(10);

}
