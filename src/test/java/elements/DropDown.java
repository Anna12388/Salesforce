package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    String dropDownLocator = "//span[text()='%']/ancestor::div[contains(@class, 'uiInput')]//input";
    String optionLocator = "//div[contains(@class, 'visible')]//a[text() = '%s']";

    WebDriver driver;
    String label;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void selectOption(String option){
        driver.findElement(By.xpath(String.format(dropDownLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();

    }
}
