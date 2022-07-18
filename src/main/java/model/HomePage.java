package model;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    //вверхняя кнопка заказать
    private By upOrderBtn = By.xpath("//button[@class='Button_Button__ra12g']");
    //нижняя кнопка заказать
    private By downOrderBtn = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    private WebDriver driver;
    private WebElement question;
    private WebElement answer;
    //список вопросов
    private By questions = By.xpath("//div[@class = 'accordion']/div/div");
    //заголовок
    private By header =  By.className("Header_Disclaimer__3VEni");
    public void setQuestion(String questionText) {
        question = driver.findElement(questions).findElement(By.xpath("//div[text() = '"+ questionText +"']"));
    }
    public void setAnswer(String answerText) {
        answer = driver.findElement(By.xpath("//p[text() = '"+ answerText +"']"));
    }

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickQuestion() {
        question.click();
    }
    public void waitForLoadHomePage(){
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(header));
    }
    public void scrollToQuestion() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", question);
    }
    public void scrollToDownOrder() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(downOrderBtn));
    }
    public String getAnswer (){
        return answer.getText();
    }
    public void upOrderBtnClick(){
        driver.findElement(upOrderBtn).click();
    }
    public void downOrderBtnClick(){
        driver.findElement(downOrderBtn).click();
    }



}
