package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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

    // Method to open the homepage
    public void open() {
        open(url);
    }

    // Method to click on the "Solutions" dropdown menu
    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    // Method to verify the visibility of options under the "Solutions" dropdown menu
    public boolean areSolutionsOptionsVisible() {
        wait.until(ExpectedConditions.visibilityOf(automotiveOption));
        wait.until(ExpectedConditions.visibilityOf(lifestyleOption));
        wait.until(ExpectedConditions.visibilityOf(consumerOption));
        wait.until(ExpectedConditions.visibilityOf(professionalOption));
        wait.until(ExpectedConditions.visibilityOf(digitalTransformationOption));
        return automotiveOption.isDisplayed() && lifestyleOption.isDisplayed() &&
               consumerOption.isDisplayed() && professionalOption.isDisplayed() &&
               digitalTransformationOption.isDisplayed();
    }

    // Method to click on the "Automotive" option
    public void clickAutomotiveOption() {
        wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
        automotiveOption.click();
    }

    // Method to dismiss the dropdown by clicking outside
    public void clickOutsideDropdown() {
        // Assuming there's a specific element to click outside, like the body or another navigation item
        WebElement outsideElement = driver.findElement(By.tagName("body"));
        outsideElement.click();
    }

    // Method to dismiss the dropdown by interacting with another navigation item
    public void clickAnotherNavigationItem() {
        WebElement anotherNavItem = driver.findElement(By.id("navlink-_l1")); // Example: "Responsibility" menu
        anotherNavItem.click();
    }
}