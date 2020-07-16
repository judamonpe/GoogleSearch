package com.masglobal.certificacion.googlesearch.definitions;

import java.util.List;

import com.masglobal.certificacion.googlesearch.steps.SeachSuggestionsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class SearchSuggestionsDefinitions {
	
	
	@Steps
	SeachSuggestionsSteps searchSuggestionsSteps;
	
	
	@When("the suggestions list is displayed$")
	public void theSuggestionsListIsDisplayed()  {
	    
		searchSuggestionsSteps.displaySearchSuggestionList();	
	}
	
	@When("I click on the first suggestion in the list$")
	public void iClickOnTheFirstSuggestionInTheList()  {
	    
		searchSuggestionsSteps.clickFirstSearchSuggestionList();	
	}

}
