package BasePageTest;
import BasePage.BasePage;
import org.testng.annotations.Test;

class BasePageTests extends BasePage {

    @Test(priority = 1)
    public void TestBasePage() throws InterruptedException {
        String pageURL = "";
//Insert app URL above
        Thread.sleep(4000);

        if (driver.getCurrentUrl().contains(pageURL)) {
            System.out.println("The webpage URL is correct. Webpage URL is " + pageURL);
        } else {
            System.out.println("Invalid URL, Actual webpage URL is " + driver.getCurrentUrl());
        }
    }


}
