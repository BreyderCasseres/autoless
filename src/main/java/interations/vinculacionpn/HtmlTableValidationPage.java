package interations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.core.Serenity.getDriver;

public class HtmlTableValidationPage {

    public static void verifyHtmlTableData() {
        WebDriver webDriver = getDriver();
        WebElement htmlTableElement = webDriver.findElement(By.xpath("//div[@class='gendoc']//table")); //get the table WebElement
        List<WebElement> rowElements = htmlTableElement.findElements(By.xpath(".//tr")); //get all of the row WebElements from the table
        rowElements.remove(0); //remove the "header" row from the list of row WebElements
        for (WebElement row: rowElements){
            System.out.println(row);
        }
    }
}