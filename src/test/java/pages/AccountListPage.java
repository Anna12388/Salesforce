package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public class AccountListPage extends BasePage{

    public static final By BREADCRUMB_LABEL = By.xpath("//div[contains(@class, 'sdls-breadcrumb')]//span[text()='Accounts']");
    public AccountListPage(WebDriver driver) {
        super(driver);
    }
    public AccountListPage open(){
        driver.get(BASE_URL + "lightning/o/Account/list");
        return this;
    }
    public AccountModalPage clickNewButton(){
        driver.findElement(NEW_BUTTON).click();
        return new AccountModalPage(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(BREADCRUMB_LABEL);
    }
}
