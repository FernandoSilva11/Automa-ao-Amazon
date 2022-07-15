package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends PageObject{
	
	@FindBy(id = "twotabsearchtextbox")
	private static WebElement busca;

	public Home(WebDriver driver) {
		super(driver);
	}
	
//	public void aceitarCookies() {
//		cookies.click();
//	}
	
	public String tituloPagina() {
		return driver.getTitle();
	}
	
	public void buscarProduto(String produto) {
		busca.clear();
		busca.sendKeys(produto + Keys.ENTER);
	}
	
	
}
