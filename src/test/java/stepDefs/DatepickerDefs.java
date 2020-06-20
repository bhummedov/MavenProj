package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatepickerDefs {
    @When("I validate date selection")
    public void date_selection(){
        System.out.println("inside date selection");
    }
    @Then("I switch tp demo-frame")
    public void i_switch_tp_demo_frame() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside date selection");
    }


}
