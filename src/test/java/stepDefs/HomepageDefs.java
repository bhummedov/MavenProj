package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageDefs {
    @Given("I am on the jquery homepage")
    public void i_am_on_the_jquery_homepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside given");
    }
    @When("I click on controlgroup")
    public void i_click_on_controlgroup() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside when");
    }
    @Then("I land on the controlgroup page")
    public void i_land_on_the_controlgroup_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside then");
    }
    @When("I click on datepicker")
    public void i_click_on_datepicker() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside when");
    }

    @Then("I land on the datepicker page")
    public void i_land_on_the_datepicker_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside then");
    }
    @When("I click on checkboxradio")
    public void i_click_on_checkboxradio() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside when");
    }
    @Then("I land on the checkboxradio page")
    public void i_land_on_the_checkboxradio_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside then");
    }
    @And("I switch to demo-frame")
    public void switch_demo_frame(){
        System.out.println("switching tp demo-frame");
    }
}
