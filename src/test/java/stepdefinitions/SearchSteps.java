package stepdefinitions;

import Page.SearchObjectFunction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseClass;

import java.time.Duration;
import java.util.List;

public class SearchSteps
{
    SearchObjectFunction searchObjectFunction;

    @Given("I navigate to the NHS Candidate Search page")
    public void iNavigateToTheNHSCandidateSearchPage() {
        BaseClass.driver.get("https://www.jobs.nhs.uk/candidate/search");
        searchObjectFunction = new SearchObjectFunction();
        searchObjectFunction.acceptCookies();
    }

    @When("I search for a job with {string} as the {string}")
    public void iSearchForAJobWithAsTheJobTitle(String value, String type) {
        switch(type.toLowerCase()){
            case "job title", "skills":
                searchObjectFunction.enterJobTitle(value);
                break;
            case "postcode", "town/city":
                searchObjectFunction.enterWhere(value);
                break;
            case "job reference":
                searchObjectFunction.enterJobReference();
                break;
            case "jobreference":
                searchObjectFunction.enterJobReference(value);
                break;
            case "employer":
                searchObjectFunction.enterEmployer(value);
                break;
            case "pay range":
                searchObjectFunction.enterPayRange(value);
                break;
            case "distance":
                searchObjectFunction.chooseDistance(value);
            default:
                break;
        }

    }

    @And("I enter {string} as the {string}")
    public void iEnterAsTheLocationOrEmployer(String value, String fieldType) {
        if (fieldType.equalsIgnoreCase("location")) {
            searchObjectFunction.enterLocation(value);
        } else if (fieldType.equalsIgnoreCase("employer")) {
            searchObjectFunction.enterEmployer(value);
        } else {
            throw new IllegalArgumentException("Unsupported field type: " + fieldType);
        }
    }

    @When("I tap on {string}")
    public void iTapOn(String arg0) {
        WebDriver driver = BaseClass.driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        searchObjectFunction.clickMoreOption();
    }

    @Then("results should contain the word {string} in {string}")
    public void resultsShouldContainTheWordIn(String expectedText, String fieldType) {
        boolean isMatchFound = false;
        switch (fieldType.toLowerCase()) {
            case "job title":
                List<WebElement> jobTitles = BaseClass.driver.findElements(By.cssSelector("[data-test='search-result-job-title']"));
                isMatchFound = jobTitles.stream().anyMatch(el -> el.getText().toLowerCase().contains(expectedText.toLowerCase()));
                break;

            case "location":
                List<WebElement> employers = BaseClass.driver.findElements(By.cssSelector("[data-test='search-result-location'] h3"));
                isMatchFound = employers.stream().anyMatch(el -> el.getText().toLowerCase().contains(expectedText.toLowerCase()));
                break;
            case "postcode", "town/city":
                isMatchFound = searchObjectFunction.assertEmployerPostcode(expectedText);
                break;
            case "search results":
                isMatchFound = searchObjectFunction.assertNoResultFound(expectedText);
                break;
            case "employer":
                isMatchFound = searchObjectFunction.assertEmployer(expectedText);
                break;
            default:
                throw new IllegalArgumentException("Unsupported field type: " + fieldType);
        }
        System.out.println("Found"+isMatchFound);
        Assert.assertTrue("Expected to find '" + expectedText + "' in " + fieldType, isMatchFound);
    }

    @And("I select pay range as {string} thousand")
    public void iSelectPayRangeAsThousand(String payrange) {
        searchObjectFunction.payRangeSelection(payrange);

    }

    @And("I filter the search result for {string} {string}")
    public void iFilterTheSearchResultFor(String type, String filter) throws Exception {
        switch (type.toLowerCase()) {
            case "working pattern":
                searchObjectFunction.filterWorkingPattern(filter);
                break;
            case "contract type":
                searchObjectFunction.filterContractTypeJobs(filter);
                break;
            case "pay range":
                searchObjectFunction.filterPayRange(filter);
                break;
            case "pay scheme grade":
                searchObjectFunction.filterPaySchemeGrade(filter);
                break;
            case "staff group":
                searchObjectFunction.filterStaffGroup(filter);
                break;
            case "sort filter":
                searchObjectFunction.filterSort(filter);
                break;
            default:
                break;
        }
    }

    @Then("I can see search result for {string} {string} filter")
    public void iCanSeeSearchResultForFilter(String type, String filter) {
        try {
            boolean isMatchFound = false;
            switch (type.toLowerCase()) {
                case "working pattern":
                    searchObjectFunction.checkForWorkingPattern(filter);
                    break;
                case "contract type":
                    isMatchFound = searchObjectFunction.checkForContractType(filter);
                    if (!isMatchFound) {
                        System.out.println("Contract type '" + filter + "' was not found in the results.");
                    }
                    break;
                case "pay range":
                    searchObjectFunction.checkForPayRange(filter);
                    break;
                case "pay scheme grade":
                    searchObjectFunction.checkForPaySchemeGrade(filter);
                    break;
                case "sort":
                    searchObjectFunction.checkSortFunctionality(filter);
                    break;
                default:
                    System.out.println("Unknown filter type: " + type);
            }
        } catch (Exception e) {
            System.err.println("Exception while checking filter [" + type + "]: " + e.getMessage());
            e.printStackTrace();
        }
    }


    @And("I filter the search result for covid related jobs")
    public void iFilterTheSearchResultForCovidRelatedJobs() {
        searchObjectFunction.filterCovidJobs();
    }

    @Then("I can see search result for covid jobs")
    public void iCanSeeSearchResultForCovidJobs() {
        searchObjectFunction.checkForCovidFilter();
    }

    @And("the page correct heading should be {string}")
    public void thePageCorrectHeadingShouldBe(String headingValue) {
        searchObjectFunction.checkHeading(headingValue);
    }

    @Then("I save the job from search result")
    public void iSaveTheJobFromSearchResult() {
        searchObjectFunction.saveJob();
    }

    @And("I click first Job title and get the JobreferenceID")
    public void iClickFirstJobTitleAndGetTheJobreferenceID() {
        searchObjectFunction.getJobtitleAndReference();
    }

    @Then("results should contain the same title")
    public void resultsShouldContainTheSameTitle() {
        searchObjectFunction.checkJobtitle();
    }

    @And("I click on the save this search button")
    public void iClickOnTheSaveThisSearchButton() {
        searchObjectFunction.saveSearch();
    }

    @Then("I see all {int} search fields on search screen")
    public void iSeeAllSearchFieldsOnSearchScreen(int value) {searchObjectFunction.assertSearchLabelsResultsPage(value);}

    @Then("results should contain some job adverts")
    public void resultsShouldContainSomeJobAdverts() {searchObjectFunction.resultSummary();}

    @Then("I see the all fields data are cleared")
    public void iSeeTheAllFieldsDataAreCleared() {searchObjectFunction.assertSearchFieldsEmpty();}

    @Then("I see the all the checkboxes are deselected")
    public void iSeeTheAllTheCheckboxesAreDeselected() {searchObjectFunction.assertCheckboxEmpty();}

    @Then("I can see search result where the Distance is less than {string}")
    public void iCanSeeSearchResultWhereTheDistanceIsLessThan(String value) { searchObjectFunction.checkDistanceValue(value);}


    @And("I click on {string}")
    public void iClickOn(String buttonOrLink) {
        switch (buttonOrLink.toLowerCase()){
            case "sign in button":
                searchObjectFunction.clickSiginButton();
                break;
            case "nhs logo button":
                searchObjectFunction.clickLogoButton();
                break;
            case "search button":
                searchObjectFunction.clickSearchButton();
                break;
            case "create alert button":
                searchObjectFunction.clickAlertButton();
                break;
            case "clear filter button":
                searchObjectFunction.clickClearFilter();
                break;
            case "clear filters link":
                searchObjectFunction.clickClearFilterLink();
                break;
            case "save this search button":
                searchObjectFunction.saveSearch();
                break;
            case "create an account":
                searchObjectFunction.clickCreateAccount();
                break;
            case "search link":
                searchObjectFunction.clickSearchLink();
                break;
            case "privacy policy":
                searchObjectFunction.clickPrivacyPolicy();
                break;
            case "terms and conditions":
                searchObjectFunction.clickTermsAndConditions();
                break;
            case "cookies":
                searchObjectFunction.clickCookies();
                break;
            case "accessibility statement":
                searchObjectFunction.clickAccessibilityStatement();
                break;
            case "how to apply for jobs ":
                searchObjectFunction.clickHowtoApplyJob();
                break;
            default:
                break;
        }
    }


    @And("I select the Job to apply")
    public void iSelectTheJobToApply() {
        searchObjectFunction.applyJob();
    }


    @Then("the page correct heading should be {string} opens in new tab")
    public void thePageCorrectHeadingShouldBeOpensInNewTab(String heading) {
        searchObjectFunction.checkHeadingNewTab(heading);
    }

    @And("I {string} see Save the search option")
    public void iSeeSaveTheSearchOption(String value) {
        searchObjectFunction.checkSaveSearchVisibility(value);
    }

    @And("I {string} see the distance filter")
    public void iSeeTheDistanceFilter(String value) {
        searchObjectFunction.checkDistanceFilterVisibility(value);

    }
}
