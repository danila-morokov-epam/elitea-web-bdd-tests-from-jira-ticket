package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class SolutionsPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the "Solutions" dropdown menu
    @FindBy(id = "navlink-_l2")
    private WebElement solutionsDropdown;

    // Locators for the options under the "Solutions" dropdown menu
    @FindBy(xpath = "//a[@href='/automotive']")
    private WebElement automotiveOption;

    @FindBy(xpath = "//span[@id='tabnav-_l38']")
    private WebElement lifestyleOption;

    @FindBy(xpath = "//a[@href='/lifestyle']")
    private WebElement consumerOption;

    @FindBy(xpath = "//a[@href='https://pro.harman.com']")
    private WebElement professionalOption;

    @FindBy(xpath = "//a[@href='https://services.harman.com']")
    private WebElement digitalTransformationOption;

    public SolutionsPage() {
        PageFactory.initElements(driver, this);
    }

    // Method to open the Harman homepage
    public void open() {
        driver.get(url);
    }

    // Method to click on the "Solutions" dropdown menu
    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    // Method to click on the "Automotive" option
    public void clickAutomotiveOption() {
        wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
        automotiveOption.click();
    }

    // Method to click on the "Lifestyle" option
    public void clickLifestyleOption() {
        wait.until(ExpectedConditions.elementToBeClickable(lifestyleOption));
        lifestyleOption.click();
    }

    // Method to click on the "Consumer" option
    public void clickConsumerOption() {
        wait.until(ExpectedConditions.elementToBeClickable(consumerOption));
        consumerOption.click();
    }

    // Method to click on the "Professional" option
    public void clickProfessionalOption() {
        wait.until(ExpectedConditions.elementToBeClickable(professionalOption));
        professionalOption.click();
    }

    // Method to click on the "Digital Transformation Solutions" option
    public void clickDigitalTransformationOption() {
        wait.until(ExpectedConditions.elementToBeClickable(digitalTransformationOption));
        digitalTransformationOption.click();
    }
}