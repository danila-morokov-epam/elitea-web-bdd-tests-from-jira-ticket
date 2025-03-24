package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class SolutionsPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the 'Solutions' dropdown menu
    @FindBy(id = "navlink-_l2")
    private WebElement solutionsDropdown;

    // Locators for the items within the 'Solutions' dropdown
    @FindBy(id = "tabnav-_l11")
    private WebElement automotiveLink;

    @FindBy(id = "tabnav-_l38")
    private WebElement lifestyleLink;

    @FindBy(id = "tabnav-_l17")
    private WebElement consumerLink;

    @FindBy(id = "tabnav-_l39")
    private WebElement professionalLink;

    @FindBy(id = "tabnav-_l40")
    private WebElement digitalTransformationLink;

    public SolutionsPage() {
        // Default constructor
    }

    // Method to open the Solutions page
    public void open() {
        open(url);
    }

    // Method to click on the 'Solutions' dropdown to expand it
    public void expandSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    // Method to click on the 'Automotive' link within the 'Solutions' dropdown
    public void clickAutomotiveLink() {
        wait.until(ExpectedConditions.elementToBeClickable(automotiveLink));
        automotiveLink.click();
    }

    // Method to click on the 'Lifestyle' link within the 'Solutions' dropdown
    public void clickLifestyleLink() {
        wait.until(ExpectedConditions.elementToBeClickable(lifestyleLink));
        lifestyleLink.click();
    }

    // Method to click on the 'Consumer' link within the 'Solutions' dropdown
    public void clickConsumerLink() {
        wait.until(ExpectedConditions.elementToBeClickable(consumerLink));
        consumerLink.click();
    }

    // Method to click on the 'Professional' link within the 'Solutions' dropdown
    public void clickProfessionalLink() {
        wait.until(ExpectedConditions.elementToBeClickable(professionalLink));
        professionalLink.click();
    }

    // Method to click on the 'Digital Transformation' link within the 'Solutions' dropdown
    public void clickDigitalTransformationLink() {
        wait.until(ExpectedConditions.elementToBeClickable(digitalTransformationLink));
        digitalTransformationLink.click();
    }
}