package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Produto extends PageObject{
	@FindBy(id = "productTitle")
	private WebElement lerNomeProduto;
	
	@FindBy(css = ".a-price.aok-align-center")
	private WebElement lerPrecoProduto;
	
	@FindBy(css = "span.a-price-whole")
	private WebElement valor;
	
	@FindBy(css = "span.a-price-fraction")
	private WebElement decimal;
	
	public Produto(WebDriver driver) {
		super(driver);
	}
	
	public String lerNomeProduto() {
		return lerNomeProduto.getText();
	}

	public String lerPrecoProduto() {
		return valor.getText() + "," + decimal.getText();
	}
	

}