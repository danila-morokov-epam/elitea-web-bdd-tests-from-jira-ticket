package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class SolutionsPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the 'Solutions' dropdown toggle
    @FindBy(id = "navlink-_l2")
    private WebElement solutionsDropdownToggle;

    // Locator for the 'Solutions' dropdown menu
    @FindBy(css = "ul[aria-labelledby='navlink-_l2']")
    private WebElement solutionsDropdownMenu;

    // Locators for the items within the 'Solutions' dropdown
    @FindBy(css = "ul[aria-labelledby='navlink-_l2'] a")
    private List<WebElement> solutionsDropdownItems;

    // Method to open the page
    public void open() {
        open(url);
    }

    // Method to click on the 'Solutions' dropdown toggle
    public void clickSolutionsDropdownToggle() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdownToggle));
        solutionsDropdownToggle.click();
    }

    // Method to get the text of all items in the 'Solutions' dropdown
    public List<String> getSolutionsDropdownItemsText() {
        wait.until(ExpectedConditions.visibilityOf(solutionsDropdownMenu));
        return solutionsDropdownItems.stream().map(WebElement::getText).toList();
    }

    // Method to select an item from the 'Solutions' dropdown by visible text
    public void selectSolutionsDropdownItem(String itemText) {
        wait.until(ExpectedConditions.visibilityOf(solutionsDropdownMenu));
        for (WebElement item : solutionsDropdownItems) {
            if (item.getText().equalsIgnoreCase(itemText)) {
                item.click();
                break;
            }
        }
    }
}