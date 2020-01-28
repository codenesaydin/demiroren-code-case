package com.pages;

import com.context.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject
{
    public Browser browser;

    public PageObject(WebDriver driver)
    {
        PageFactory.initElements(driver, this);

        browser = new Browser(driver);
    }

    @FindBy(id = "notification")
    public WebElement notification;
}
