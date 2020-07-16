package com.masglobal.certificacion.googlesearch.steps;

import org.junit.Assert;
import com.masglobal.certificacion.googlesearch.page.*;

import net.thucydides.core.annotations.Step;

public class SeachSuggestionsSteps {
	
   SearchSuggestions searchSuggestions;
  
	  
   @Step
	public void displaySearchSuggestionList() {
	   
	   searchSuggestions.displayedSuggestionListDisplayed();
	}
   
   @Step
	public void clickFirstSearchSuggestionList() {
	   
	   searchSuggestions.clickFirstSuggestionList();
	}
	        
}
