package com.masglobal.certificacion.googlesearch.definitions;

import java.util.List;

import com.masglobal.certificacion.googlesearch.steps.SeachSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class SearchDefinitions {
	
	
	@Steps
	SeachSteps searchSteps;
	
	@Given("^I am on the homepage$")
	public void iAmOnTheHomePage()  {
	    
		   searchSteps.openBrowser();	    
	}


	@When("^I type (.*) into the search field$")
	public void iTypeTheNameOfTheWindIntoTheSearchField(String searchWord)  {
	    
		  searchSteps.searchWord(searchWord);	
	}
	
	
	@When("^I click the Google Search button$")
	public void iClickTheGoogleSearchButton()  {
	    
	      searchSteps.clickSearch();
	}

	@Then("^I go to the search results page$")
	public void iGoToTheSearchResultPage()  {
	    
		  searchSteps.verifyResults();
	}

	@Then("^the first result is “(.*) - (.*)”$")
	public void theFirstResultIsTheNameOfTheWindPatrickRothfuss(String bookName, String author)  {
	   
		searchSteps.verifyBookNameAndAuthor(bookName, author);
	}
	
	@When("^I click on the first result link$")
	public void iClickOnTheFirstResultLink()  {
	    
	      searchSteps.clickLinkBookPatrickRothfuss();
	}
	
	@Then("^I go to the “(.*) - The Books” page$")
	public void iGoToThePatrickRothfussTheBooksPage(String author)  {
	   
		searchSteps.verifyAuthorWebPage(author);
	}

}
