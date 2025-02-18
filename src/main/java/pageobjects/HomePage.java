package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void open() {
        driver.get("https://example.com"); // Replace with the actual homepage URL
    }

    public WebElement getDropdownMenu(String dropdownMenu) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav//a[text()='" + dropdownMenu + "']")));
    }

    public boolean isDropdownOptionVisible(String option) {
        return driver.findElement(By.xpath("//nav//a[text()='" + option + "']")).isDisplayed();
    }

    public WebElement getDropdownOption(String option) {
        return driver.findElement(By.xpath("//nav//a[text()='" + option + "']"));
    }

    public boolean isSectionVisible(String section) {
        return driver.findElement(By.id(section.toLowerCase().replace(" ", "-"))).isDisplayed();
    }

    public void clickOutsideDropdownMenu() {
        driver.findElement(By.cssSelector("body")).click();
    }

    public boolean isDropdownMenuVisible() {
        return driver.findElement(By.cssSelector(".dropdown-menu")).isDisplayed();
    }

    public void clickAnotherNavigationItem() {
        driver.findElement(By.cssSelector(".nav-item:not(.dropdown-menu)")).click();
    }
}