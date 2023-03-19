package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Us001Page {

    public Us001Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

     @FindBy(xpath = "//button[@id='L2AGLb']")
    public WebElement cokkies;

    @FindBy(xpath = "//input[@class='gLFyf']")
    public WebElement googleSearchBox;

    @FindBy(xpath = "//span[@class='DFlfde SwHCTb']")
    public WebElement paraKarsilastirmasi;
}
