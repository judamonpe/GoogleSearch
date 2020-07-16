package com.masglobal.certificacion.googlesearch.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/?gl=us&hl=en&pws=0")
public class SearchSuggestions extends PageObject {
	
	@FindBy (xpath="//ul[@class='erkvQe']")
	private WebElementFacade displayedList;
	
	@FindBy (xpath="//ul[@class='erkvQe']//li[1]")
	private WebElementFacade firstSuggestionList;


	public void displayedSuggestionListDisplayed() {
		
		displayedList.isDisplayed();
	}
	
	public void clickFirstSuggestionList() {
				
		firstSuggestionList.click();
	}
	
		
}
