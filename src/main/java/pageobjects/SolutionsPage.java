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

    // Locators for the options under the "Solutions" dropdown
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

    // Method to open the Harman homepage
    public void open() {
        open(url);
    }

    // Method to click on the "Solutions" dropdown menu
    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    // Method to verify the visibility of dropdown options
    public boolean areDropdownOptionsVisible() {
        wait.until(ExpectedConditions.visibilityOf(automotiveOption));
        wait.until(ExpectedConditions.visibilityOf(lifestyleOption));
        wait.until(ExpectedConditions.visibilityOf(consumerOption));
        wait.until(ExpectedConditions.visibilityOf(professionalOption));
        wait.until(ExpectedConditions.visibilityOf(digitalTransformationOption));
        return automotiveOption.isDisplayed() && lifestyleOption.isDisplayed() &&
               consumerOption.isDisplayed() && professionalOption.isDisplayed() &&
               digitalTransformationOption.isDisplayed();
    }

    // Method to click on a specific option within the dropdown
    public void clickAutomotiveOption() {
        wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
        automotiveOption.click();
    }

    // Method to dismiss the dropdown by clicking outside
    public void clickOutsideDropdown() {
        // Assuming there's a method to click outside, e.g., clicking on the logo
        WebElement logo = driver.findElement(By.cssSelector(".logo"));
        wait.until(ExpectedConditions.elementToBeClickable(logo));
        logo.click();
    }

    // Method to dismiss the dropdown by interacting with other navigation items
    public void clickOtherNavigationItem() {
        WebElement otherNavItem = driver.findElement(By.linkText("Innovation"));
        wait.until(ExpectedConditions.elementToBeClickable(otherNavItem));
        otherNavItem.click();
    }
}