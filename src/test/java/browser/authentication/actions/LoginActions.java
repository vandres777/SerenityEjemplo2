package browser.authentication.actions;

import browser.inventory.User;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginActions extends UIInteractionSteps {

    @Step("Log in as {0}")
    public void as(User user) {
        openUrl("https://www.saucedemo.com/");

        //$("[data-test='username']").sendKeys(user.getUsername());
        find(By.name("user-name")).sendKeys(user.getUsername());
        //$("[data-test='password']").sendKeys(user.getPassword());
        find(By.name("password")).sendKeys(user.getPassword());
        //$("[data-test='login-button']").click();
        find(By.name("login-button")).click();
    }
}
