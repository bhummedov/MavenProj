package stepDefs;

import PageObject.CheckBoxRadioPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import managers.DriverMgr;
import org.junit.jupiter.api.Assertions;

public class CheckBoxRadioDefs {
    CheckBoxRadioPage checkBoxRadioPage = new CheckBoxRadioPage(DriverMgr.getDriver());
    @And("^I validate number of (\\w+) is (\\d+)$")
    public void validate_radios_number(String type, int radios) {
        Assertions.assertEquals(radios,checkBoxRadioPage.elementSize(type));
        System.out.println("completed number of elements validation");
    }

    @And("^I select \"(.*)\" radio button$")
    public void select_radio(String city) throws InterruptedException {
        Assertions.assertTrue(checkBoxRadioPage.selectRadio(city));
        System.out.println("completed selecting radio");
    }
    @And("^I select \"(.*)\" checkbox button$")
    public void select_checkbox(String city) throws InterruptedException {
        Assertions.assertTrue(checkBoxRadioPage.selectRadio(city));
        System.out.println("completed selecting hotel ratings");
    }
    @And("^I select \"(.*)\" checkbox nested button$")
    public void select_checkboxNested(String city) throws InterruptedException {
        Assertions.assertTrue(checkBoxRadioPage.selectRadio(city));
        System.out.println("completed selecting bed types");
    }
}
