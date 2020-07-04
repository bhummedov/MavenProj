package stepDefs;

import PageObject.CheckBoxRadioPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import managers.AutomationContext;
import managers.DriverMgr;
import org.junit.jupiter.api.Assertions;

public class CheckBoxRadioDefs {
    AutomationContext context;
    public CheckBoxRadioDefs(AutomationContext context){
        this.context = context;
    }

    CheckBoxRadioPage checkBoxRadioPage = new CheckBoxRadioPage(DriverMgr.getDriver());
    @And("^I validate number of (\\w+) is (\\d+)$")
    public void validate_radios_number(String type, int radios) {
        Assertions.assertEquals(radios,checkBoxRadioPage.elementSize(type));
        System.out.println("completed number of elements validation");
    }

    @And("^I select \"(.*)\" radio button$")
    public void select_radio(String city) throws Throwable {
        Assertions.assertTrue(checkBoxRadioPage.selectRadio(city));
        System.out.println("completed selecting radio");
    }
    @And("^I select \"(.*)\" checkbox button$")
    public void select_checkbox(String city) throws Throwable {
        Assertions.assertTrue(checkBoxRadioPage.selectRadio(city));
        System.out.println("completed selecting hotel ratings");
    }
    @And("^I select \"(.*)\" checkbox nested button$")
    public void select_checkboxNested(String city) throws Throwable {
        Assertions.assertTrue(checkBoxRadioPage.selectRadio(city));
        System.out.println("completed selecting bed types");
    }

    @And("^I only select \"(.*)\" radio button$")
    public void selection_only(String city) throws Throwable {
        checkBoxRadioPage.selectRadioOnly(city);
        context.setContextMap("buttonselected", city);
    }
    @And("^I validate radiocheckbox selection$")
    public void validateSelection() throws Throwable {
        checkBoxRadioPage.validateSelection(context.getContextMap("buttonselected"));
    }
}
