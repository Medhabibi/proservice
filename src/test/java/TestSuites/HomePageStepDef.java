package TestSuites;

import org.junit.Assert;

import Helper.Config;
import Page.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {
	

	@When("Utilisateur clique sur le {string}")
	public void utilisateur_clique_sur_le(String menuname) throws Exception {
		HomePage menu = new HomePage();
		menu.CliqueOnMenuByName(menuname);
		
	    
	}

	@Then("La page de menu est affiche qui contient le nom de {string}")
	public void la_page_de_menu_est_affiche_qui_contient_le_nom_de(String expectedtext) {
		HomePage page = new HomePage();
	Assert.assertEquals(expectedtext, page.verifnamemenu());
	Config.driver.quit();
	
	   
	}
}
