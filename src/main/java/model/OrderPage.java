package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;
    //Имя
    private By name = By.xpath("//input[@placeholder='* Имя']");
    //Фамилия
    private By surname = By.xpath("//input[@placeholder='* Фамилия']");
    //Адрес
    private By address = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    //Метро
    private By metro = By.xpath("//input[@placeholder='* Станция метро']");
    //Номер
    private By phoneNumber = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    //кнопка Далее
    private By nextByn = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //черный цвет
    private By colorBlack = By.xpath("//input[@id='black']");
    //серый цвет
    private By colorGrey = By.xpath("//input[@id='grey']");
    //Кнопка Заказать
    private By checkoutBtn = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    //Кнопка Да
    private By yesBtn = By.xpath("//button[text()='Да']");
    //Срок аренды
    private By rentalPeriod = By.xpath("//div[text()='* Срок аренды']");
    //елемент из списка
    private By rentalPeriodValue = By.xpath("//div[text()='сутки']");
    //Когда привезти
    private By date = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    //Срок аренды
    private By dateValue = By.xpath("//div[@aria-label='Choose воскресенье, 24-е июля 2022 г.']");
    //Цвет самоката
    private By isProcessed = By.xpath("//div[@class='Order_ModalHeader__3FDaJ']");
    //Станция метро
    private By metroName = By.xpath("//div[text()='Черкизовская']");
    //Коментарий для курьера
    private By comment = By.xpath("//input[@placeholder='Комментарий для курьера']");

    public void nameSend(String send){
        driver.findElement(name).sendKeys(send);
    }
    public void commentSend(String send){
        driver.findElement(comment).sendKeys(send);
    }
    public void surnameSend(String send){
        driver.findElement(surname).sendKeys(send);
    }
    public void addressSend(String send){
        driver.findElement(address).sendKeys(send);
    }
    public void metroNameClick(){
        driver.findElement(metroName).click();
    }
    public void metroClick(){
        driver.findElement(metro).click();
    }
    public void phoneNumberSend(String send){
        driver.findElement(phoneNumber).sendKeys(send);
    }
    public void nextBynClick(){
        driver.findElement(nextByn).click();
    }
    public void yesBtnClick(){
        driver.findElement(yesBtn).click();
    }
    public void checkoutBtnClick(){
        driver.findElement(checkoutBtn).click();
    }
    public void colorBlackClick(){
        driver.findElement(colorBlack).click();
    }
    public void colorGreyClick(){
        driver.findElement(colorGrey).click();
    }
    public void rentalPeriodClick(){
        driver.findElement(rentalPeriod).click();
    }
    public void rentalPeriodValueClick(){
        driver.findElement(rentalPeriodValue).click();
    }
    public void dateClick(){
        driver.findElement(date).click();
    }
    public void dateSend(String send){
        driver.findElement(date).sendKeys(send);
    }
    public void dateValueClick(){
        driver.findElement(dateValue).click();
    }
    public String getIsProcessed(){
       return driver.findElement(isProcessed).getText();
    }





    public OrderPage(WebDriver driver){
        this.driver = driver;
    }
}
