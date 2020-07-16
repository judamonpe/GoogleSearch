package com.masglobal.certificacion.googlesearch.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search.feature"
,glue="com.masglobal.certificacion.googlesearch.definitions"
,snippets=SnippetType.CAMELCASE)

public class SeachRunner {

}
