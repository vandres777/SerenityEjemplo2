package browser;

import browser.authentication.actions.LoginActions;
import browser.inventory.InventoryPage;
import browser.inventory.User;
import io.cucumber.core.plugin.SerenityReporter;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SerenityRunner.class)
public class WhenLogginOn {

    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;

    InventoryPage inventoryPage;

    @Test
    public void usersCanLogOnViaTheHomePage() {

        login.as(User.STANDARD_USER);

        //should see product catalog
        Serenity.reportThat("The inventory page should be displayed with the correct title",
                ()->assertThat(inventoryPage.getHeadling()).isEqualToIgnoringCase("Products"));
    }
}

