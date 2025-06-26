# Rishma-Gurudev-NHSBSA
# Functional Acceptance Test for NHS Jobs Search Functionality

This guide provides step-by-step instructions for running the automated tests in Chrome or Firefox. Additionally, it explains the test coverage.

## Prerequisites

Before you begin, ensure you have the following prerequisites installed on your system:

- [Java Development Kit (JDK) V21](https://www.oracle.com/java/technologies/javase-downloads.html)
- An Integrated Development Environment (IDE) [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Apache Maven](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/downloads)
- Selenium Web Driver - Latest Stable Version

## Step 1: Clone the Repository

To get started with test automation, you'll need to clone the Java project or repository from GitHub link below: (https://github.com/RishmaGurudev/Rishma-Gurudev-NHSBSA)

## Step 2:  Run Tests
Run the automated tests either using Chrome or Firefox using the below commands in command prompt respectively: 

(@search tag has been used)


mvn test -Dtest="SearchRunner" -Dbrowser=chrome

mvn test -Dtest="SearchRunner" -Dbrowser=firefox

## Step 3: Test Results

Test results will be available in the below locations:

**Cucumber Test Report** - /target/cucumber.html

**Extent Test Report** - /target/extent-report/ExtentReport.html


## Test Coverage under the Automated Test Framework

| No | Feature File | Tests Covered |
|----|--------------|---------------|
| 1  | ApplyForJob.feature | This feature file tests the job search and application redirection flow on the NHS website, so the jobseeker can apply for a job |
| 2  | CommonScenario.feature | This feature file tests the following:<br> - Check the heading of the different landing pages such as the Search page,<br> - Checks the working of different links and buttons such as Sign in, Create an account, NHS Jobs Logo, search link and search button<br> - Verify the search options on Search landing and Search results Screen |
| 3  | CreateJobAlert.feature | This feature file verifies the functionality of create an alert (redirects to Sign in) |
| 4  | EndToEndSearch.feature | This feature file verifies the Full search scenario using multiple filters (job title, postcode, job reference, employer, distance, working pattern, contract type, staff group, pay range, pay grade) |
| 5  | Filter-ClearFilter.feature | This feature file verifies the working of clear filter button and link |
| 6  | Filter-ContractType.feature | This feature file verifies the working of each Contract filter and checks if the Search results are relevant. |
| 7  | Filter-Covid.feature | This feature file verifies the obtained search results are related to the covid jobs |
| 8  | Filter-DistanceFilter.feature | This feature file verifies the working of Distance Filter by verifying if the results are updated based on the distance specified |
| 9  | Filter-PayBandJobs.feature | This feature file verifies the working of each Pay Band and Scheme filter and checks if the Search results are relevant. |
| 10 | Filter-PayRange.feature | This feature file verifies the working of each Pay Band and Scheme filter and checks if the Search results are relevant. |
| 11 | Filter-Sort.feature | This feature file verifies the working of sort filter and checks if the Search results are relevant to the sort options like Best Match, Closing Date, Salary (low to high, high to low) and Distance (when location is used) |
| 12 | Filter-StaffGroup.feature | This feature file verifies the working of Staff Group Filter |
| 13 | Filter-WorkingPattern.feature | This feature file verifies the working of Working Pattern Filter and checks if the results are relevant |
| 14 | FooterLink.feature | This feature file verifies whether all the footer links are clickable and opens in a new tab |
| 15 | HiddenButtonLink.feature | This feature file verifies the behavior of hidden buttons in the page such as Distance and Save the search. |
| 16 | IndividualSearchScenario.feature | This feature file verifies the working of different search fields individually |
| 17 | InvalidSearch.feature | This feature file verifies the negative scenarios of the search fields like job title, location, job reference, and employer (Scenario Outline with expected “no result” messages) |
| 18 | JobReferenceCheck.feature | This feature file verifies the working of Job Reference field (Search by job title, extract Job Reference ID of first advert, and verify search by Job Reference returns the same job) |
| 19 | SaveSearchResults.feature | This feature file verifies the working of save this search button (redirects to Sign in) |
| 20 | SavethisJob.feature | This feature file verifies the working of save this job feature (redirects to Sign in) |
| 21 | SmokeTest.feature | This feature file verifies the working of search Application |
