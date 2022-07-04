package browser.inventory;

import net.thucydides.core.pages.PageObject;

public class InventoryPage extends PageObject {
    public String getHeadling() {
        return $(".title").getText();
    }
}
