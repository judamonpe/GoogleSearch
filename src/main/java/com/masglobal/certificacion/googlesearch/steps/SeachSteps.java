package com.masglobal.certificacion.googlesearch.steps;

import org.junit.Assert;
import com.masglobal.certificacion.googlesearch.page.*;

import net.thucydides.core.annotations.Step;

public class SeachSteps {
	
   Search search;
   
   @Step
	public void openBrowser() {
	   search.open();	   
	}
   
   @Step
	public void searchWord(String searchWord) {
	   search.writeSearchWord(searchWord);
	}
	  
   @Step
	public void clickSearch() {
	   
	   search.clickOnButtonSearch();
	}
	  
   @Step
   public void verifyResults() {
 
	   Assert.assertTrue("About", search.verifySearchResults("About"));
   }
   
   
   @Step
   public void verifyBookNameAndAuthor(String bookName, String author) {
 
	   Assert.assertTrue(bookName, search.verifyBookName(bookName));
	   Assert.assertTrue(author, search.verifyAuthor(author));
   }
   
   @Step
   public void clickLinkBookPatrickRothfuss() {

	   search.clickOnLinkBookPatrickRothfuss();
   }
   
   @Step
   public void verifyAuthorWebPage(String author) {
 
	   Assert.assertTrue(author, search.verifypagePatrickRothfuss(author));
   }
          
}
