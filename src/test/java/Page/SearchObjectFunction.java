package Page;

import org.apache.velocity.runtime.directive.Break;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SearchObjectFunction {

    WebDriverWait wait;
    private static WebDriver driver = BaseClass.driver;

    @FindBy(how = How.ID, using = "accept-cookies")
    WebElement acceptCookiesButton;

    @FindBy(how = How.ID, using = "keyword")
    WebElement jobTitleField;

    @FindBy(how = How.ID, using = "location")
    WebElement jobLocationField;

    @FindBy(how = How.ID, using = "distance-label")
    WebElement distanceField;

    @FindBy(how = How.ID, using = "distance")
    WebElement distanceDropDown;

    @FindBy(how = How.ID, using = "employer")
    WebElement employerField;

    @FindBy(how = How.ID, using = "search")
    WebElement searchButton;

    @FindBy(how = How.ID, using = "searchOptionsBtn")
    WebElement moreOptionButton;

    @FindBy(how = How.ID, using = "payRange")
    WebElement payRangeDropdown;

    @FindBy(how = How.ID, using = "clearFilters")
    WebElement clearFiltersButton;

    @FindBy(how = How.CSS, using = "a[data-test='filter-clear']")
    WebElement clearFilterLink;

    @FindBy(how = How.CSS, using = "[data-test='filter-working-pattern']")
    private WebElement workingPatternFilterLink;

    @FindBy(how = How.CSS, using = "li[data-test='search-result-workingPattern']")
    private WebElement workingPattern;

    @FindBy(how = How.ID, using = "working-pattern-full-time")
    private WebElement workingPatternFullTime;

    @FindBy(how = How.ID, using = "working-pattern-part-time")
    private WebElement workingPatternPartTime;

    @FindBy(how = How.ID, using = "working-pattern-job-share")
    private WebElement workingPatternJobShare;

    @FindBy(how = How.ID, using = "working-pattern-flexible")
    private WebElement workingPatternFlexibleWorking;

    @FindBy(how = How.ID, using = "working-pattern-remote")
    private WebElement workingPatternHomeOrRemoteWorking;

    @FindBy(how = How.ID, using = "working-pattern-compressed")
    private WebElement workingPatternCompressedHours;

    @FindBy(how = How.ID, using = "working-pattern-term-time")
    private WebElement workingPatternTermTime;

    @FindBy(how = How.ID, using = "working-pattern-annualised")
    private WebElement workingPatternAnnualisedHours;

    @FindBy(how = How.CSS, using = "#refine-search")
    private WebElement applyFilters;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Contract type')]")
    private WebElement contractTypeFilterlink;

    @FindBy(how = How.CSS, using = "li[data-test='search-result-jobType']")
    private WebElement contractTypes;

    @FindBy(how = How.ID, using = "contract-type-permanent")
    private WebElement contractTypePermanent;

    @FindBy(how = How.ID, using = "contract-type-fixed-term")
    private WebElement contractTypeFixedTerm;

    @FindBy(how = How.ID, using = "contract-type-apprenticeship")
    private WebElement contractTypeApprenticeship;

    @FindBy(how = How.ID, using = "contract-type-locum")
    private WebElement contractTypeLocum;

    @FindBy(how = How.ID, using = "contract-type-training")
    private WebElement contractTypeTraining;

    @FindBy(how = How.ID, using = "contract-type-voluntary")
    private WebElement contractTypeVoluntary;

    @FindBy(how = How.ID, using = "contract-type-secondment")
    private WebElement contractTypeSecondment;

    @FindBy(how = How.ID, using = "contract-type-honorary")
    private WebElement contractTypeHonorary;

    @FindBy(how = How.ID, using = "contract-type-bank")
    private WebElement contractTypeBank;

    @FindBy(how = How.ID, using = "contract-type-nhs-reservist")
    private WebElement contractTypeNHS;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'COVID-19')]")
    private WebElement covid19;

    @FindBy(how = How.ID, using = "covidJobsOnly")
    private WebElement covidJobs;

    @FindBy(how = How.XPATH, using = "//span[@title='COVID-19']")
    private WebElement covidJobsResult;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Pay range')]")
    private WebElement payRangeLink;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Sort by')]")
    private WebElement sortBy;

    @FindBy(how = How.ID, using = "sort")
    private WebElement sortOptions;

    @FindBy(how = How.ID, using = "pay-range-0-10")
    private WebElement payRange0to10;

    @FindBy(how = How.ID, using = "pay-range-10-20")
    private WebElement payRange10to20;

    @FindBy(how = How.ID, using = "pay-range-20-30")
    private WebElement payRange20to30;

    @FindBy(how = How.ID, using = "pay-range-30-40")
    private WebElement payRange30to40;

    @FindBy(how = How.ID, using = "pay-range-40-50")
    private WebElement payRange40to50;

    @FindBy(how = How.ID, using = "pay-range-50-60")
    private WebElement payRange50to60;

    @FindBy(how = How.ID, using = "pay-range-60-70")
    private WebElement payRange60to70;

    @FindBy(how = How.ID, using = "pay-range-70-80")
    private WebElement payRange70to80;

    @FindBy(how = How.ID, using = "pay-range-80-90")
    private WebElement payRange80to90;

    @FindBy(how = How.ID, using = "pay-range-90-100")
    private WebElement payRange90to100;

    @FindBy(how = How.ID, using = "pay-range-100")
    private WebElement payRange100plus;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'NHS pay grades and schemes')]")
    private WebElement payBandLink;

    @FindBy(how = How.ID, using = "pay-band-2")
    private WebElement payBand2;

    @FindBy(how = How.ID, using = "pay-band-3")
    private WebElement payBand3;

    @FindBy(how = How.ID, using = "pay-band-4")
    private WebElement payBand4;

    @FindBy(how = How.ID, using = "pay-band-5")
    private WebElement payBand5;

    @FindBy(how = How.ID, using = "pay-band-6")
    private WebElement payBand6;

    @FindBy(how = How.ID, using = "pay-band-7")
    private WebElement payBand7;

    @FindBy(how = How.ID, using = "pay-band-8")
    private WebElement payBand8;

    @FindBy(how = How.ID, using = "pay-band-8a")
    private WebElement payBand8A;

    @FindBy(how = How.ID, using = "pay-band-8b")
    private WebElement payBand8B;

    @FindBy(how = How.ID, using = "pay-band-8c")
    private WebElement payBand8c;

    @FindBy(how = How.ID, using = "pay-band-8d")
    private WebElement payBand8D;

    @FindBy(how = How.ID, using = "pay-band-9")
    private WebElement payBand9;

    @FindBy(how = How.ID, using = "specialty-doctor")
    private WebElement specialtyDoctor;

    @FindBy(how = How.ID, using = "foundation-doctor")
    private WebElement foundationDoctor;

    @FindBy(how = How.ID, using = "consultant")
    private WebElement consultant;

    @FindBy(how = How.ID, using = "specialty-registrar")
    private WebElement specialtyRegistrar;

    @FindBy(how = How.ID, using = "doctor-other")
    private WebElement doctorOther;

    @FindBy(how = How.ID, using = "specialist")
    private WebElement specialist;

    @FindBy(css = "div.hide-mobile #payscheme-band")
    private WebElement paySchemeElement;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Staff group')]")
    private WebElement staffGroupLink;

    @FindBy(how = How.ID, using = "staff-group-additional-clincial")
    private WebElement additionalClinicalSpecialist;

    @FindBy(how = How.ID, using = "staff-group--professional-scientific-and-technical")
    private WebElement professionalScientificAndTechnical;

    @FindBy(how = How.ID, using = "staff-group-administrative-clerical")
    private WebElement administrativeAndClerical;

    @FindBy(how = How.ID, using = "staff-group-allied-health-professionals")
    private WebElement alliedHealthProfessionals;

    @FindBy(how = How.ID, using = "staff-group-estates-and-ancillary")
    private WebElement estatesAndAncillary;

    @FindBy(how = How.ID, using = "staff-group-healthcare-scientists")
    private WebElement healthcareScientists;

    @FindBy(how = How.ID, using = "staff-group-medical-and-dental")
    private WebElement medicalAndDental;

    @FindBy(how = How.ID, using = "staff-group-nursing-and-midwifery-registered")
    private WebElement nursingAndMidwiferyRegistered;

    @FindBy(how = How.ID, using = "staff-group-students")
    private WebElement studentsCheckbox;

    @FindBy(how = How.XPATH, using = "//h3[@class='nhsuk-u-font-weight-bold']/div")
    private List<WebElement> postcode;

    @FindBy(how = How.XPATH, using = "//h3[@class='nhsuk-u-font-weight-bold']")
    private WebElement employerName;

    @FindBy(how = How.TAG_NAME, using = "h1")
    private WebElement heading;

    @FindBy(how = How.CSS, using = "a[data-test='search-result-save-job']")
    private WebElement saveThisJob;

    @FindBy(how = How.CSS, using = "a[data-test='save-search']")
    private WebElement saveSearch;

    @FindBy(how = How.ID, using = "candidate_sign_in")
    private WebElement signInButton;

    @FindBy(how = How.XPATH, using = "//div[@class='nhsuk-header__service-name']")
    private WebElement serviceNameElement;

    @FindBy(how = How.ID, using = "jobReference")
    private WebElement jobReferenceField;

    @FindBy(how = How.ID, using = "searchOptionBtn")
    private WebElement searchOptions;

    @FindBy(how = How.ID, using = "sort")
    private WebElement sortFliterLink;

    @FindBy(how = How.ID, using = "no-result-title")
    private WebElement noResultFound;

    @FindBy(css = "h2[data-test='search-result-query']")
    private WebElement locationNotFound;

    @FindBy(how = How.ID, using = "payRange")
    private WebElement payRange;

    @FindBy(how = How.XPATH, using = "//span[text()='Create job alert']/parent::*")
    private WebElement clearAlertLink;

    @FindBy(how = How.ID, using = "apply-ats-direct")
    private WebElement applyForJobLink;

    @FindBy(xpath = "//a[contains(text(), 'Create an account')]")
    private WebElement clickCreateAccountButton;

    public SearchObjectFunction() {
        if (BaseClass.driver == null) {
            throw new IllegalStateException("WebDriver is not initialized yet.");
        }
        PageFactory.initElements(BaseClass.driver, this);
    }

    public void acceptCookies() {
        try {
            acceptCookiesButton.click();
        } catch (TimeoutException e) {
            System.out.println("Cookie banner not found.");
        }
    }

    public void enterJobTitle(String jobTitle) {
        WebDriver driver = BaseClass.driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        jobTitleField.clear();
        jobTitleField.sendKeys(jobTitle);
    }

    public void enterLocation(String string1) {
        jobLocationField.clear();
        jobLocationField.sendKeys(string1);
    }

    public void enterEmployer(String string1) {
        employerField.clear();
        employerField.sendKeys(string1);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickMoreOption() {
        moreOptionButton.click();
    }

    public void payRangeSelection(String payrange) {
        try {
            Select select = new Select(payRangeDropdown);
            select.selectByValue(payrange);
        } catch (Exception e) {
            System.out.println("Failed to select pay range: " + e.getMessage());
        }
    }

    public void filterWorkingPattern(String workingPatternType) throws Exception {
        workingPatternFilterLink.click();
        switch (workingPatternType.toLowerCase()) {
            case "full-time":
                workingPatternFullTime.click();
                break;
            case "part-time":
                workingPatternPartTime.click();
                break;
            case "job share":
                workingPatternJobShare.click();
                break;
            case "flexible working":
                workingPatternFlexibleWorking.click();
                break;
            case "home or remote working":
                workingPatternHomeOrRemoteWorking.click();
                break;
            case "compressed hours":
                workingPatternCompressedHours.click();
                break;
            case "term time hours":
                workingPatternTermTime.click();
                break;
            case "annualised hours":
                workingPatternAnnualisedHours.click();
                break;
            case "":
                break;
            default:
                throw new IllegalArgumentException("invalid working pattern type");
        }
        applyFilters.click();
    }

    public void filterContractTypeJobs(String contractType) throws Exception {
        contractTypeFilterlink.click();
        switch (contractType.toLowerCase()) {
            case "permanent":
                contractTypePermanent.click();
                break;
            case "fixed-term":
                contractTypeFixedTerm.click();
                break;
            case "locum":
                contractTypeLocum.click();
                break;
            case "training":
                contractTypeTraining.click();
                break;
            case "apprenticeship":
                contractTypeApprenticeship.click();
                break;
            case "voluntary":
                contractTypeVoluntary.click();
                break;
            case "secondment":
                contractTypeSecondment.click();
                break;
            case "honorary":
                contractTypeHonorary.click();
                break;
            case "bank":
                contractTypeBank.click();
                break;
            case "nhs reservist":
                contractTypeNHS.click();
                break;
            case "":
                break;
            default:
                throw new IllegalArgumentException("invalid contract type");
        }
        applyFilters.click();
    }

    public void checkForWorkingPattern(String workingPatternType) {
        assertTrue(workingPattern.getText().contains(workingPatternType));
    }

    public boolean checkForContractType(String contractType)  {
        if(contractTypes.getText().contains(contractType)) {return true;}
        else return assertNoResultFound("No result found");
   }

    public void filterCovidJobs() {
        covid19.click();
        covidJobs.click();
        applyFilters.click();
    }

    public void checkForCovidFilter() {
        assertTrue("Covid icon is not displayed", covidJobsResult.isDisplayed());
    }

    public void filterPayRange(String payRange) throws Exception {
        payRangeLink.click();
        switch (payRange) {
            case "£0 to £10,000":
                payRange0to10.click();
                break;
            case "£10,000 to £20,000":
                payRange10to20.click();
                break;
            case "£20,000 to £30,000":
                payRange20to30.click();
                break;
            case "£30,000 to £40,000":
                payRange30to40.click();
                break;
            case "£40,000 to £50,000":
                payRange40to50.click();
                break;
            case "£50,000 to £60,000":
                payRange50to60.click();
                break;
            case "£60,000 to £70,000":
                payRange60to70.click();
                break;
            case "£70,000 to £80,000":
                payRange70to80.click();
                break;
            case "£80,000 to £90,000":
                payRange80to90.click();
                break;
            case "£90,000 to £100,000":
                payRange90to100.click();
                break;
            case "£100,000 plus":
                payRange100plus.click();
                break;
            case "":
                break;
            default:
                throw new IllegalArgumentException("invalid pay range type");
        }
        applyFilters.click();
    }

    public void checkForPayRange(String filter) {
        int min_value;
        int max_value;
        WebDriver driver = BaseClass.driver;

        int[] values = extractSalaryRange(filter);
        min_value = values[0];
        max_value = values[1];

        List<WebElement> salaryElements = driver.findElements(By.cssSelector("[data-test='search-result-salary'] strong"));
        System.out.println("Salary element: " + salaryElements);

        for (WebElement salaryElement : salaryElements) {
            String clean = salaryElement.getText().replaceAll("[£,a-zA-Z]", "").trim();
            System.out.println("Salary found: " + clean);
            String[] cleaned = clean.split(" ");
            if (cleaned.length == 2) {
                int min = Integer.parseInt(cleaned[0].trim());
                int max = Integer.parseInt(cleaned[1].trim());
                assertTrue("Salary range mismatch!!", ((Double.parseDouble(String.valueOf(min_value)) <= Double.parseDouble(String.valueOf(min))) &&
                        (Double.parseDouble(String.valueOf(max_value)) >= Double.parseDouble(String.valueOf(max)))));
            }
        }

    }

    private int[] extractSalaryRange(String salaryRange) {
        try {
            String clean = salaryRange.replaceAll("[£,]", "");
            String[] parts = clean.split("to");
            if (parts.length == 2) {
                int min = Integer.parseInt(parts[0].trim());
                int max = Integer.parseInt(parts[1].trim());
                return new int[]{min, max};
            } else {
                parts = clean.split(" ");
                int min = Integer.parseInt(parts[0].trim());
                return new int[]{min, 1500000};
            }
        } catch (Exception e) {
            return null;
        }
    }

    public void filterPaySchemeGrade(String paySchemeBand) throws Exception {
        payBandLink.click();
        switch (paySchemeBand.toLowerCase()) {
            case "band 2":
                payBand2.click();
                break;
            case "band 3":
                payBand3.click();
                break;
            case "band 4":
                payBand4.click();
                break;
            case "band 5":
                payBand5.click();
                break;
            case "band 6":
                payBand6.click();
                break;
            case "band 7":
                payBand7.click();
                break;
            case "band 8a":
                payBand8A.click();
                break;
            case "band 8b":
                payBand8B.click();
                break;
            case "band 8c":
                payBand8c.click();
                break;
            case "band 8d":
                payBand8D.click();
                break;
            case "specialty doctor":
                specialtyDoctor.click();
                break;
            case "foundation doctor":
                foundationDoctor.click();
                break;
            case "consultant":
                consultant.click();
                break;
            case "specialty registrar":
                specialtyRegistrar.click();
                break;
            case "doctor - other":
                doctorOther.click();
                break;
            case "specialist":
                specialist.click();
                break;
            case "":
                break;
            default:
                throw new IllegalArgumentException("invalid pay band type");
        }
        applyFilters.click();
    }

    public void checkForPaySchemeGrade(String expectedPaySchemeGrade) {
        WebDriver driver = BaseClass.driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List<WebElement> jobLinks = driver.findElements(By.cssSelector("[data-test='search-result-job-title']"));
        int jobCount = Math.min(jobLinks.size(), 5);

        for (int i = 0; i < jobCount; i++) {
            try {
                jobLinks = driver.findElements(By.cssSelector("[data-test='search-result-job-title']"));
                WebElement job = jobLinks.get(i);
                job.click();
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", paySchemeElement);
                String actualPayScheme = paySchemeElement.getText().trim();
                assertTrue(actualPayScheme.toLowerCase().contains(expectedPaySchemeGrade.toLowerCase()));
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                driver.navigate().back();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-test='search-result-job-title']")));
            }
        }
    }

    public void filterStaffGroup(String staffGroup) throws Exception {
        staffGroupLink.click();
        switch (staffGroup.toLowerCase()) {
            case "additional clinical services":
                additionalClinicalSpecialist.click();
                break;
            case "additional professional scientific & technical":
                professionalScientificAndTechnical.click();
                break;
            case "administrative & clerical":
                administrativeAndClerical.click();
                break;
            case "allied health professionals":
                alliedHealthProfessionals.click();
                break;
            case "estates & ancillary":
                estatesAndAncillary.click();
                break;
            case "healthcare scientists":
                healthcareScientists.click();
                break;
            case "medical & dental":
                medicalAndDental.click();
                break;
            case "nursing & midwifery registered":
                nursingAndMidwiferyRegistered.click();
                break;
            case "students":
                studentsCheckbox.click();
                break;
            case "":
                break;
            default:
                throw new IllegalArgumentException("Invalid staff group");
        }
        applyFilters.click();
    }

    public void enterWhere(String value) {
        WebDriver driver = BaseClass.driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        jobLocationField.clear();
        jobLocationField.sendKeys(value);
    }

    public boolean assertEmployerPostcode(String postcodeValue) {
        return (postcode.get(0).getText().contains(postcodeValue));
    }

    public void checkHeading(String headingValue) {
        String headingText = null;
        String actualHeading = null;
        switch (headingValue.toLowerCase()) {
            case "search for jobs in the nhs":
                headingText = "Search for jobs in the NHS";
                actualHeading = heading.getText();
                break;
            case "sign in":
                headingText = "Sign in";
                actualHeading = heading.getText();
                break;
            case "apply on nhs jobs":
                headingText = "Apply on NHS Jobs";
                actualHeading = heading.getText();
                break;
            case "you are leaving nhs jobs":
                headingText = "You are leaving NHS Jobs";
                actualHeading = heading.getText();
                String[] parts = actualHeading.split("\n");
                actualHeading = parts.length > 1 ? parts[1].trim() : actualHeading.trim();
                break;
            case "what is your name?":
                headingText = "What is your name?";
                actualHeading = heading.getText();
                break;
            default:
                throw new IllegalArgumentException("Invalid heading");
        }
        assertEquals("Heading does not match!", headingText, actualHeading);
    }

    public void saveJob() {
        saveThisJob.click();
    }

    public void clickSiginButton() {
        signInButton.click();
    }

    public void clickLogoButton() {
        serviceNameElement.click();
    }

    private String storedJobTitle;
    private String storedJobRef;

    public void getJobtitleAndReference() {
        WebDriver driver = BaseClass.driver;
        List<WebElement> jobLinks = driver.findElements(By.cssSelector("[data-test='search-result-job-title']"));
        WebElement firstResult = jobLinks.get(0);
        storedJobTitle = firstResult.getText().trim();
        firstResult.click();
        String url = driver.getCurrentUrl();
        storedJobRef = url.split("/candidate/jobadvert/")[1].split("\\?")[0];
        System.out.println("Captured Title: " + storedJobTitle);
        System.out.println("Captured RefID: " + storedJobRef);
        driver.navigate().back();
    }

    public void enterJobReference() {
        jobReferenceField.clear();
        jobReferenceField.sendKeys(storedJobRef);
    }
    public void enterJobReference(String value) {
        jobReferenceField.clear();
        jobReferenceField.sendKeys(value);
    }

    public void checkJobtitle() {
        List<WebElement> jobLinks = driver.findElements(By.cssSelector("[data-test='search-result-job-title']"));
        WebElement job = jobLinks.get(0);
        String foundTitle = job.getText();
        assertEquals("Jobtitle does not match!", foundTitle, storedJobTitle);
    }

    public void saveSearch() {
        saveSearch.click();
    }

    public void assertSearchLabelsResultsPage(int value) {
        if (value == 4) {
            Assert.assertTrue("What is not displayed", jobTitleField.isDisplayed());
            Assert.assertTrue("Where is not displayed", jobLocationField.isDisplayed());
            Assert.assertTrue("Employer is not displayed", employerField.isDisplayed());
            Assert.assertTrue("Job Reference is not displayed", jobReferenceField.isDisplayed());
            Assert.assertTrue("Search Button is not displayed", searchButton.isDisplayed());
        } else if (value == 6) {
            Assert.assertTrue("What is not displayed", jobTitleField.isDisplayed());
            Assert.assertTrue("Where is not displayed", jobLocationField.isDisplayed());
            Assert.assertTrue("Distance is not displayed ", distanceField.isDisplayed());
            Assert.assertTrue("Employer is not displayed", employerField.isDisplayed());
            Assert.assertTrue("Job Reference is not displayed", jobReferenceField.isDisplayed());
            Assert.assertTrue("Pay range is not displayed ", payRangeDropdown.isDisplayed());
            Assert.assertTrue("Clear Filer Button is not displayed", clearFiltersButton.isDisplayed());
            Assert.assertTrue("Search Button is not displayed", searchButton.isDisplayed());
        }
    }

    public void filterSort(String sortFilterValue) {
        sortFliterLink.click();
        Select selectPayRange = new Select(sortOptions);
        selectPayRange.selectByVisibleText(sortFilterValue);
    }

    public boolean assertNoResultFound(String expectedText) {
        switch (expectedText.toLowerCase()) {
            case ("no result found"):
                return (noResultFound.getText().contains(expectedText));
            case ("location not found"):
                return (locationNotFound.getText().contains(expectedText));
            default:
                return false;
        }
    }

    public void resultSummary() {
        WebDriver driver = BaseClass.driver;
        List<WebElement> results = driver.findElements(By.cssSelector("li[data-test='search-result']"));
        Assert.assertFalse("Expected at least one result", results.isEmpty());
        String firstTitle = results.get(0).findElement(By.cssSelector("[data-test='search-result-job-title']")).getText().trim();
        System.out.println("Found at least one job result – first title: " + firstTitle);
    }

    public void enterPayRange(String payRangeText) {
        Select selectPayRange =new Select(payRange);
        selectPayRange.selectByVisibleText(payRangeText);
    }

    public void clickClearFilter() {
        clearFiltersButton.click();
    }

    public void assertSearchFieldsEmpty() {
        Assert.assertTrue("What field is not empty",jobTitleField.getText().isEmpty());
        Assert.assertTrue("Where field is not empty",jobLocationField.getText().isEmpty());
        Assert.assertTrue("Job Reference field is not empty",jobReferenceField.getText().isEmpty());
        Assert.assertTrue("Employer field is not empty", employerField.getText().isEmpty());
    }

    public void clickClearFilterLink() {
        clearFilterLink.click();
    }

    public void assertCheckboxEmpty() {
        WebDriver driver = BaseClass.driver;
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                throw new AssertionError("Checkbox with label '" + checkbox.getAttribute("name") + "' is still selected.");
            }
        }
    }

    public void chooseDistance(String distanceValue) {
        Select selectDistance = new Select(distanceDropDown);
        selectDistance.selectByVisibleText(distanceValue);
    }

    public void checkDistanceValue(String value) {
        WebDriver driver = BaseClass.driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        double threshold = Double.parseDouble(value.replaceAll("[^0-9.]", ""));

        List<WebElement> distanceElements = driver.findElements(By.cssSelector("li[data-test='search-result-distance'] strong"));
        int distanceCount = Math.min(distanceElements.size(), 5);

        for (int i = 0; i < distanceCount; i++) {
            String distanceText = distanceElements.get(i).getText();
            double actualDistance = Double.parseDouble(distanceText.replaceAll("[^0-9.]", ""));

            if (actualDistance < threshold) {
                System.out.println("Distance " + actualDistance + " is less than " + threshold);
            } else {
                System.out.println("Distance " + actualDistance + " is NOT less than " + threshold);
            }
        }
    }


    public void clickAlertButton() {
        clearAlertLink.click();
    }

    public boolean assertEmployer(String expectedText) {
        return (employerName.getText().split("\n")[0].contains(expectedText));
    }

    public void applyJob() {
        WebDriver driver = BaseClass.driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> jobLinks = driver.findElements(By.cssSelector("[data-test='search-result-job-title']"));
        WebElement job = jobLinks.get(0);
        job.click();
        applyForJobLink.click();
    }

    public void clickCreateAccount() {
        clickCreateAccountButton.click();
    }

    public void checkSortFunctionality(String filter) {
        WebDriver driver = BaseClass.driver;
        switch (filter.toLowerCase()) {
            case ("best match"):
                break;
            case ("closing date"):
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
                List<WebElement> elements = driver.findElements(By.cssSelector("li[data-test='search-result-closingDate'] strong"));
                List<LocalDate> dates = new ArrayList<>();
                for (WebElement el : elements) {
                    String dateText = el.getText().trim();
                    if (!dateText.isEmpty()) {
                        dates.add(LocalDate.parse(dateText, formatter));
                    }
                }
                boolean sortedAscending = true;
                for (int i = 0; i < dates.size() - 1; i++) {
                    if (dates.get(i).isAfter(dates.get(i + 1))) {
                        System.out.printf("Dates out of order: %s before %s\n", dates.get(i), dates.get(i + 1));
                        sortedAscending = false;
                        break;
                    }
                }
                if (sortedAscending) {
                    System.out.println("Closing dates are in Ascending order.");
                } else {
                    throw new AssertionError("Closing dates are not in Ascending order.");
                }
                break;

            case "salary lowest to highest":
                List<WebElement> salaryElems = driver.findElements(By.cssSelector("li[data-test='search-result-salary'] strong"));
                List<Double> salaries = new ArrayList<>();
                for (WebElement el : salaryElems) {
                    String text = el.getText().trim();           // raw salary string
                    if (text.toLowerCase().contains("depends on")) {
                        continue;
                    }
                    String numericPart = text.split("to")[0];    // "£24,625 "
                    numericPart = numericPart.replaceAll("[^0-9.]", ""); // "24625" or "23809.50"
                    if (!numericPart.isEmpty()) {
                        salaries.add(Double.parseDouble(numericPart));
                    }
                }
                boolean ascending = true;
                for (int i = 0; i < salaries.size() - 1; i++) {
                    if (salaries.get(i) > salaries.get(i + 1)) {
                        System.out.printf("Salary out of order: %.2f before %.2f%n", salaries.get(i), salaries.get(i + 1));
                        ascending = false;
                        break;
                    }
                }
                if (ascending) {
                    System.out.println("Salaries are in ascending order (lowest to highest).");
                } else {
                    throw new AssertionError("Salaries are NOT in ascending order.");
                }
                break;

            case "salary highest to lowest":
                List<WebElement> salaryElems1 = driver.findElements(By.cssSelector("li[data-test='search-result-salary'] strong"));
                List<Double> salaries1 = new ArrayList<>();
                for (WebElement el : salaryElems1) {
                    String text = el.getText().trim();
                    if (text.toLowerCase().contains("depends on")) {
                        continue;
                    }
                    String numeric = text.split("to")[0].replaceAll("[^0-9.]", ""); // strip £ , etc.
                    if (!numeric.isEmpty()) {
                        salaries1.add(Double.parseDouble(numeric));
                    }
                }
                for (int i = 0; i < salaries1.size() - 1; i++) {
                    if (salaries1.get(i) < salaries1.get(i + 1)) {
                        throw new AssertionError(String.format("Salary order wrong: %.2f comes before %.2f", salaries1.get(i), salaries1.get(i + 1)));
                    }
                }
                System.out.println("Salaries are in descending order (highest to lowest).");
                break;

            case "distance":
                List<WebElement> distanceElems = driver.findElements(By.cssSelector("li[data-test='search-result-distance'] strong"));
                List<Double> miles = new ArrayList<>();
                for (WebElement el : distanceElems) {
                    String raw = el.getText().trim();
                    if (raw.isEmpty()) continue;
                    String numeric = raw.replaceAll("[^0-9.]", "");
                    miles.add(Double.parseDouble(numeric));
                }
                for (int i = 0; i < miles.size() - 1; i++) {
                    if (miles.get(i) > miles.get(i + 1)) {throw new AssertionError(String.format("Distance order wrong: %.2f before %.2f",miles.get(i), miles.get(i + 1)));
                    }
                }
                System.out.println("Distances are in ascending order (lowest to highest).");
            default:
                break;
        }

    }

    public void clickSearchLink() {

    }
}
