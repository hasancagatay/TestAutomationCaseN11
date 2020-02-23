import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by apple01 on 23.02.2020.
 */
public class LoginConstant {

    private By buttonSignIn = By.cssSelector(".btnSignIn");
    private By inputEmail = By.id("email");
    private By inputPassword = By.id("password");
    private By buttonLogin = By.id("loginButton");
    private By loginResult = By.xpath(".//*[@id='header']/div/div/div[3]/div[2]/div[1]/div[1]/a[1]");
    private By searchBox = By.id("searchData");
    private By buttonSearch = By.className("searchBtn");
    private By resultSearch = By.className("resultText");
    private By currentPage = By.className("currentPage");
    private By addBasket = By.className("btnAddBasket");
    private By productPagePrice = By.className("newPrice");
    private By goBasket = By.className("myBasketHolder");
    private By basketPagePrice = By.className("priceArea");

    public By getBasketPagePrice() {
        return basketPagePrice;
    }

    public void setBasketPagePrice(By basketPagePrice) {
        this.basketPagePrice = basketPagePrice;
    }

    public By getGoBasket() {
        return goBasket;
    }

    public void setGoBasket(By goBasket) {
        this.goBasket = goBasket;
    }

    public By getProductPagePrice() {
        return productPagePrice;
    }

    public void setProductPagePrice(By productPagePrice) {
        this.productPagePrice = productPagePrice;
    }

    public LoginConstant() {
    }

    public By getButtonSignIn() {
        return buttonSignIn;
    }

    public void setButtonSignIn(By buttonSignIn) {
        this.buttonSignIn = buttonSignIn;
    }

    public By getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(By inputEmail) {
        this.inputEmail = inputEmail;
    }

    public By getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(By inputPassword) {
        this.inputPassword = inputPassword;
    }

    public By getButtonLogin() {
        return buttonLogin;
    }

    public void setButtonLogin(By buttonLogin) {
        this.buttonLogin = buttonLogin;
    }

    public By getLoginResult() {
        return loginResult;
    }

    public void setLoginResult(By loginResult) {
        this.loginResult = loginResult;
    }

    public By getSearchBox() {
        return searchBox;
    }

    public void setSearchBox(By searchBox) {
        this.searchBox = searchBox;
    }

    public By getButtonSearch() {
        return buttonSearch;
    }

    public void setButtonSearch(By buttonSearch) {
        this.buttonSearch = buttonSearch;
    }

    public By getResultSearch() {
        return resultSearch;
    }

    public void setResultSearch(By resultSearch) {
        this.resultSearch = resultSearch;
    }

    public By getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(By currentPage) {
        this.currentPage = currentPage;
    }

    public By getAddBasket() {
        return addBasket;
    }

    public void setAddBasket(By addBasket) {
        this.addBasket = addBasket;
    }

}

