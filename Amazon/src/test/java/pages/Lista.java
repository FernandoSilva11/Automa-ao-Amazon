package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Lista extends PageObject{
	@FindBy(css = "span.a-color-state.a-text-bold")
	private WebElement cabecalhoResultado;
	
	
	public Lista(WebDriver driver) {
		super(driver);
	}
	
	public String lerCabecalhoResultado() {
		return cabecalhoResultado.getText();
	}
		
	public void clicar(String nomeProduto) {
	WebElement produtoDesejado = driver.findElement(By.xpath("//span[text()='"+ nomeProduto + "']"));
	produtoDesejado.click();
 	}
}