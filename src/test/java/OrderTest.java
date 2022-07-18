
import model.HomePage;
import model.OrderPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
@RunWith(value = Parameterized.class)
public class OrderTest {

        private String name;
        private String surname;
        private String address;
        private String phoneNumber;
        private String comment;

        public OrderTest(String name,String surname,String address,String phoneNumber, String comment) {
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.comment = comment;
        }

    ChromeDriver driver;
    @Test()
    public void parameterUpTest() {
         driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePage homePage = new HomePage(driver);
        homePage.waitForLoadHomePage();
        homePage.upOrderBtnClick();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.nameSend(name);
        orderPage.surnameSend(surname);
        orderPage.addressSend(address);
        orderPage.metroClick();
        orderPage.metroNameClick();
        orderPage.phoneNumberSend(phoneNumber);
        orderPage.nextBynClick();
        orderPage.dateClick();
        orderPage.dateValueClick();
        orderPage.rentalPeriodClick();
        orderPage.rentalPeriodValueClick();
        orderPage.colorBlackClick();
        orderPage.commentSend(comment);
        orderPage.checkoutBtnClick();
        orderPage.yesBtnClick();
        Assert.assertEquals("Заказ не офрмлен","Заказ оформлен",orderPage.getIsProcessed());
    }
    @Test()
    public void parameterDownTest() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePage homePage = new HomePage(driver);
        homePage.waitForLoadHomePage();
        homePage.scrollToDownOrder();
        homePage.downOrderBtnClick();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.nameSend(name);
        orderPage.surnameSend(surname);
        orderPage.addressSend(address);
        orderPage.metroClick();
        orderPage.metroNameClick();
        orderPage.phoneNumberSend(phoneNumber);
        orderPage.nextBynClick();
        orderPage.dateClick();
        orderPage.dateValueClick();
        orderPage.rentalPeriodClick();
        orderPage.rentalPeriodValueClick();
        orderPage.colorBlackClick();
        orderPage.commentSend(comment);
        orderPage.checkoutBtnClick();
        orderPage.yesBtnClick();
        Assert.assertEquals("Заказ не офрмлен","Заказ оформлен",orderPage.getIsProcessed());
    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"Давид", "Давоян","ул Пушкина","89999999999","СРОЧНО!!!!"},
                {"Вова", "Вовов","ул Колотушкина","87777777777","ОЧЕНЬ СРОЧНО!!!!"}
        };
        return Arrays.asList(data);
    }
}