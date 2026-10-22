# Web Application Quality Engineering Project

A beginner-friendly QA portfolio project demonstrating manual test design, UI automation with Selenium + Java + TestNG, and API checks using Postman.

## Project status

This repository contains a runnable starter framework and sample test cases. It uses a public demo application/API for practice. You must run the tests yourself and update the execution report with your actual results before presenting it as completed work.

## Tech stack

- Java 17+
- Maven
- Selenium WebDriver
- TestNG
- Rest Assured (API automation example)
- Postman collection
- Git/GitHub

## Project structure

```text
quality-engineering-project/
├── pom.xml
├── README.md
├── TEST_PLAN.md
├── TEST_CASES.md
├── DEFECT_REPORT_TEMPLATE.md
├── postman/
│   └── demo-api-collection.json
└── src/test/java/com/mohan/qa/
    ├── BaseTest.java
    ├── LoginPage.java
    ├── LoginTests.java
    └── ApiTests.java
```

## Prerequisites

1. Install JDK 17 or later.
2. Install Maven.
3. Install Git.
4. Install Chrome or another supported browser.

Check installations:

```bash
java -version
mvn -version
git --version
```

## Run UI automation

From the project root:

```bash
mvn clean test -Dtest=LoginTests
```

Selenium Manager can download/manage a compatible browser driver on supported setups. The demo site is a third-party public website, so availability or markup can change. If the site changes, update `LoginPage.java` and the test data.

Demo site: https://www.saucedemo.com/

The tests use the site's publicly documented practice credentials:
- Username: `standard_user`
- Password: `secret_sauce`

Only use these public demo credentials on the demo website.

## Run API automation

```bash
mvn clean test -Dtest=ApiTests
```

The API example uses JSONPlaceholder, a public fake REST API for testing:
https://jsonplaceholder.typicode.com/

## Postman

1. Open Postman.
2. Import `postman/demo-api-collection.json`.
3. Run the collection.
4. Review status codes and response assertions.
5. Save a screenshot or export a run report only after running it yourself.

## What to include in your portfolio

- Add screenshots of your own successful test runs.
- Replace the sample execution report in your portfolio with actual results.
- Add the GitHub repository URL to your resume after you upload the project.
- Be prepared to explain every test case and each assertion.

## Important honesty note

Do not claim the tests passed until you have run them locally and verified the output. Do not describe this as professional/client experience; present it as a personal learning project.
