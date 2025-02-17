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

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }

    // Scenario: Dropdown Visibility
    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        homePage.open();
    }

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }

    @When("I click on the {string}

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    } dropdown menu in the main navigation bar")
    public void i_click_on_the_dropdown_menu_in_the_main_navigation_bar(String dropdownMenu) {
        homePage.getDropdownMenu(dropdownMenu).click();
    }

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }

    @Then("I should see the options {string}

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }, {string}

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }, {string}

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }, {string}

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }, and {string}

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }")
    public void i_should_see_the_options(String option1, String option2, String option3, String option4, String option5) {
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option1));
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option2));
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option3));
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option4));
        Assertions.assertTrue(homePage.isDropdownOptionVisible(option5));
    }

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }

    // Scenario: Option Navigation
    @When("I click on the {string}

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    } option")
    public void i_click_on_the_option(String option) {
        homePage.getDropdownOption(option).click();
    }

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }

    @Then("I should be navigated to the {string}

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    } section")
    public void i_should_be_navigated_to_the_section(String section) {
        Assertions.assertTrue(homePage.isSectionVisible(section));
    }

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }

    // Scenario: Dropdown Dismissal by clicking outside
    @Given("I have opened the {string}

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    } dropdown menu")
    public void i_have_opened_the_dropdown_menu(String dropdownMenu) {
        homePage.getDropdownMenu(dropdownMenu).click();
    }

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }

    @When("I click outside the dropdown menu")
    public void i_click_outside_the_dropdown_menu() {
        homePage.clickOutsideDropdown();
    }

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }

    @Then("the dropdown menu should close")
    public void the_dropdown_menu_should_close() {
        Assertions.assertFalse(homePage.isDropdownMenuVisible());
    }

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }

    // Scenario: Dropdown Dismissal by interacting with other navigation items
    @When("I click on another navigation item")
    public void i_click_on_another_navigation_item() {
        homePage.clickAnotherNavigationItem();
    }

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }
}

    // Scenario: Invalid Option Navigation
    @When("I click on a non-existent option {string}")
    public void i_click_on_a_non_existent_option(String invalidOption) {
        homePage.clickInvalidOption(invalidOption);
    }

    @Then("I should not be navigated to any section")
    public void i_should_not_be_navigated_to_any_section() {
        Assertions.assertFalse(homePage.isAnySectionVisible());
    }

    @And("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assertions.assertTrue(homePage.isErrorMessageVisible(errorMessage));
    }