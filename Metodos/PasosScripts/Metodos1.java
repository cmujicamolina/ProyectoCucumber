package PasosScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Metodos1 {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id='contact-link']/a")
    WebElement optWebmasterSH;
	
	@Given("^Abrir el navegador y la pagina$")
	public void abrir_el_navegador_y_la_pagina() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Se abre la pagina y el navegador");
	}	
	
	@Given("^una vez que se abra dar el usuario y password y hacer login$")
	public void una_vez_que_se_abra_dar_el_usuario_y_password_y_hacer_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Se escribe usuario y password");
	}
	
	@When("^Se inicie sesion$")
	public void se_inicie_sesion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se inicia sesion");
	}
	
	@When("^realizas una accion$")
	public void realizas_una_accion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se realiza una accion");
	}
	
	@When("^validas otras accion$")
	public void validas_otras_accion() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se realiza otra accion");
	}
	
	@Then("^cuando termines de validar$")
	public void cuando_termines_de_validar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se termina de validar");
	}
	
	@Then("^realiza log out$")
	public void realiza_log_out() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Se realiza log out");
	}
	
	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	//*****Prueba del ejemplo*******//
	
	@Given("^Abrir el navegador y la pagina Contact Us$")
	public void abrir_el_navegador_y_la_pagina_contact_us() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id='contact-link']/a")).click();
		
		System.out.println("Se abre la pagina y el navegador de la pagina: automationpractice ");
	}
	
	@Given("^Una vez que se abra seleccionar el subject heading$")
	public void una_vez_que_se_abra_seleccionar_el_subject_heading() throws Throwable {
		driver.findElement(By.xpath("//select[@id='id_contact']/option[text()='Customer service']")).click();
		System.out.println("Se procedio a seleccionar el subject");		
	}

	@When("^Se ingresa un email address \"([^\"]*)\"$")
	public void se_ingresa_un_email_address(String param_email) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(param_email);
		System.out.println("email");
	}

	@When("^Se ingresa una order reference \"([^\"]*)\"$")
	public void se_ingresa_una_order_reference(String param_order) throws Throwable {
		driver.findElement(By.id("id_order")).sendKeys(param_order);
		System.out.println("order reference ");
	}

	@When("^Luego attach file \"([^\"]*)\"$")
	public void luego_attach_file(String param_ruta) throws Throwable {
		String ruta =  System.getProperty("user.dir") + param_ruta;
		driver.findElement(By.id("fileUpload")).sendKeys(ruta);
		System.out.println("attach file");
	}

	@Then("^Escribes a message \"([^\"]*)\"$")
	public void escribes_a_message(String param_mensaje) throws Throwable {
		driver.findElement(By.id("message")).sendKeys(param_mensaje);
		System.out.println("message");
	}

	@Then("^Send information$")
	public void send_information() throws Throwable {
		driver.findElement(By.id("submitMessage")).click();
		System.out.println("send information ");		
	}
	
	@Then("^Cierra el navegador$")
	public void cierra_el_navegador() throws Throwable {		
		driver.close();
		System.out.println("Se cierra el navegador");
	}
	
	@Then("^Hace click en SignIn$")
	public void hace_click_en_SignIn() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		System.out.println("click en SignIn");
	}
	
}
