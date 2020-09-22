import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){this.driver = driver;}

    public ElementsPage clickElementsPage(){
        clickLink("Elements");
        return new ElementsPage(driver);
    }
    public FormsPage clickFormsPage(){
        clickLink("Forms");
        return new FormsPage(driver);
    }
    public AlertsWindowsPage clickAlertsWindowsPage(){
        clickLink("Alerts, Frame & Windows");
        return new AlertsWindowsPage(driver);
    }
    public WidgetsPage clickWidgetsPage(){
        clickLink("Widgets");
        return new WidgetsPage(driver);
    }
    public InteractionsPage clickInteractionPage(){
        clickLink("Interactions");
        return new InteractionsPage(driver);
    }
    public BooksPage clickBooksPage(){
        clickLink("Book Store Application");
        return new BooksPage(driver);
    }

    private void clickLink(String linkText){driver.findElement(By.linkText(linkText)).click();}
}
