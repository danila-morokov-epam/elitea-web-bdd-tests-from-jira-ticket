package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class HomePage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the Solutions dropdown menu
    @FindBy(id = "navlink-_l2")
    private WebElement solutionsDropdownMenu;

    // Locators for the options under the Solutions dropdown menu
    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//a[contains(text(), 'Automotive')]")
    private WebElement automotiveOption;

    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//span[contains(text(), 'Lifestyle')]")
    private WebElement lifestyleOption;

    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//a[contains(text(), 'Consumer')]")
    private WebElement consumerOption;

    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//a[contains(text(), 'Professional')]")
    private WebElement professionalOption;

    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//a[contains(text(), 'Digital Transformation Solutions')]")
    private WebElement digitalTransformationOption;

    // Constructor
    public HomePage() {
        super();
    }

    // Method to open the homepage
    public void open() {
        open(url);
    }

    // Method to get the dropdown menu
    public WebElement getDropdownMenu(String dropdownMenu) {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdownMenu));
        return solutionsDropdownMenu;
    }

    // Method to check if an option is visible
    public boolean isOptionVisible(String option) {
        WebElement optionElement = getOption(option);
        wait.until(ExpectedConditions.visibilityOf(optionElement));
        return optionElement.isDisplayed();
    }

    // Method to get an option element
    public WebElement getOption(String option) {
        switch (option) {
            case "Automotive":
                return automotiveOption;
            case "Lifestyle":
                return lifestyleOption;
            case "Consumer":
                return consumerOption;
            case "Professional":
                return professionalOption;
            case "Digital Transformation Solutions":
                return digitalTransformationOption;
            default:
                throw new IllegalArgumentException("Invalid option: " + option);
        }
    }

    // Method to check if a section is visible
    public boolean isSectionVisible(String section) {
        // Implement logic to verify if the section is visible after navigation
        // This might involve checking the URL or a specific element on the page
        return true; // Placeholder
    }

    // Method to click outside the dropdown menu
    public void clickOutsideDropdownMenu() {
        // Implement logic to click outside the dropdown menu
        // This might involve clicking on a known element outside the dropdown
    }

    // Method to check if the dropdown menu is visible
    public boolean isDropdownMenuVisible(String dropdownMenu) {
        wait.until(ExpectedConditions.invisibilityOf(solutionsDropdownMenu));
        return !solutionsDropdownMenu.isDisplayed();
    }

    // Method to click on another navigation item
    public void clickOnAnotherNavigationItem() {
        // Implement logic to click on another navigation item
        // This might involve clicking on a known element in the navigation bar
    }
}