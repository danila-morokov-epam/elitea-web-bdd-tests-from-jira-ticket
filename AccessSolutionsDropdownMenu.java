package cucumberdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pageobjects.HomePage;

public class AccessSolutionsDropdownMenu {
    HomePage homePage;

    public AccessSolutionsDropdownMenu() {
        homePage = new HomePage();
    }

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        homePage.open();
    }

    @When("I click on the {string} dropdown menu in the main navigation bar")
    public void i_click_on_the_dropdown_menu_in_the_main_navigation_bar(String dropdownMenu) {
        homePage.getDropdownMenu(dropdownMenu).click();
    }

    @Then("I should see the options {string}, {string}, {string}, {string}, and {string}")
    public void i_should_see_the_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option1));
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option2));
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option3));
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option4));
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option5));
    }

    @And("I click on the {string} option")
    public void i_click_on_the_option(String option) {
        homePage.getDropdownOption(option).click();
    }

    @Then("I should be navigated to the {string} section")
    public void i_should_be_navigated_to_the_section(String section) {
        Assertions.assertTrue(homePage.isSectionVisible(section));
    }

    @Given("I have opened the {string} dropdown menu")
    public void i_have_opened_the_dropdown_menu(String dropdownMenu) {
        homePage.getDropdownMenu(dropdownMenu).click();
    }

    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        homePage.clickOutsideDropdownMenu();
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(homePage.isDropdownMenuVisible());
    }

    @When("I click on another navigation item")
    public void i_click_on_another_navigation_item() {
        homePage.clickAnotherNavigationItem();
    }
}