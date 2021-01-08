package PasosScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Metodos1 {
	WebDriver driver;
	
	@Given("^Abrir el navegador y la pagina$")
	public void abrir_el_navegador_y_la_pagina() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Se abre la pagina y el navegador");
	}
	
	@Given("^Abrir el navegador y la pagina Contact Us$")
	public void abrir_el_navegador_y_la_pagina_contact_us() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Se abre la pagina y el navegador de la pagina: automationpractice ");
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

}
