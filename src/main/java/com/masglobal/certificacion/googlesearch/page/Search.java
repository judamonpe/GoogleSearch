package com.masglobal.certificacion.googlesearch.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/?gl=us&hl=en&pws=0")
public class Search extends PageObject {

	@FindBy (xpath="//input[@name='q']")
	private WebElementFacade fieldSearch;
					
	@FindBy (xpath="//div[@class='tfB0Bf']//input[@name='btnK']")
	private WebElementFacade buttonSearch;
	
	@FindBy (xpath="//div[@id='result-stats']")
	private WebElementFacade searhResult;	
	
	@FindBy (xpath="//div[@class='SPZz6b']//h2[1]//span[1]")
	private WebElementFacade bookNameMap;	
	
	@FindBy (xpath="//div[@class='SPZz6b']//div[1]/span[1]")
	private WebElementFacade bookAuthorMap;
	
	@FindBy (xpath="//h3[text()='The Books - Patrick Rothfuss']")
	private WebElementFacade linkBoookPatrickRothfuss;
	
	@FindBy (xpath="//font[@class='copyright']")
	private WebElementFacade pagePatrickRothfuss;

	
	public void writeSearchWord(String searchWord) {
				
		fieldSearch.sendKeys(searchWord);
	}
	
	public void clickOnButtonSearch() {
		
		buttonSearch.click();
	}
	
	public boolean verifySearchResults(String results) {	
				
		if (searhResult.getText().contains(results)) {
			return true;
		}
		 return false;	
	}
	
	public boolean verifyBookName(String bookName) {
				
		if (bookNameMap.getText().toString().equals(bookName)) {
		   return true;
		}
		   return  false;
			
	}
	
	public boolean verifyAuthor(String author) {		
	
		if (bookAuthorMap.getText().toString().contains(author)) {
			return true;
		}
		 return false;	
	}
	
	public void clickOnLinkBookPatrickRothfuss() {
		
		linkBoookPatrickRothfuss.click();
	}
	
	public boolean verifypagePatrickRothfuss(String author) {		
		
		if (pagePatrickRothfuss.getText().toString().contains(author)) {
			return true;
		}
		 return false;	
	}
	
}
