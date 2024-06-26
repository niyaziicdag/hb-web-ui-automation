# Java Selenium Web Automation

This project is created to automate tests for Java Selenium web application using Selenium, Java, Cucumber, and Gherkin.

## About the Project

This project is used to perform automation tests for Java Selenium web application. It utilizes Cucumber scenario files, Selenium WebDriver, and Java programming language to test different features and scenarios of the web application.

## Requirements

To run this project, the following software and tools need to be installed:

- Java JDK (version 8 or above)
- Maven
- Selenium
- Cucumber
- Git (optional)
- IDE (IntelliJ IDEA, Eclipse, etc.)

## Test Cases

- The user visits the hepsiburada.com website.
- The user performs a search (Example: a popular product with reviews like "iphone").
- After the search, the user selects a product from the search results and goes to the product detail page.
- The user navigates to the "Reviews" tab for the selected product.
- The user clicks the "Yes" button for the first review among the displayed reviews.
- The user sees the message "Thank you".
- If there are no reviews in the "Reviews" tab, the user does not perform any action.

## Setup

1. **Clone the repository:**

    ```
    https://github.com/niyaziicdag/hb-web-ui-automation
    ```

2. **Navigate to the project directory:**

    ```
    cd hb-web-ui-test-automation
    ```

3. **Install dependencies:**

    ```bash
    mvn install
    ```

# Project tree

```
.
|-- src
|   |-- test
|   |   |-- java
|   |   |   |   |-- config
|   |   |   |   |   |-- BaseConfig
|   |   |   |   |-- pages
|   |   |   |   |   |-- BasePage
|   |   |   |   |   |-- HomePage
|   |   |   |   |   |-- ProductDetailPage
|   |   |   |   |   |-- SearchPage
|   |   |   |   |-- runners
|   |   |   |   |   |-- Runner
|   |   |   |   |-- stepDefinitions
|   |   |   |   |   |-- BaseSteps
|   |   |   |   |   |-- HomeSteps
|   |   |   |   |   |-- Hooks
|   |   |   |   |   |-- ProductDetailSteps
|   |   |   |   |   |-- SearchSteps
|   |   |   |   |-- utils
|   |   |   |   |   |-- Driver
|   |   |   |   |   |-- PageHelper
|   |   |-- resources
|   |   |   |-- features
|   |   |   |   |-- ProductDetail.feature
|-- git.ignore
|-- pom.xml
|-- README.md
```

## Running Tests

To run the tests for this project, you can use the following Maven command:

```bash
mvn clean test -Dtest=Runner "-Dtags=@regression" -Dbrowser="chrome"
```

## Reports

```
allure serve allure-results
```

## Screenshot

- Success Screenshots
  <img src="https://i.imgur.com/BOmVKAs.png">
  <img src="https://i.imgur.com/88qXu4B.png">
- No Comment Success Screenshots
<img src="https://i.imgur.com/aVf2Dab.png">
- Failed Screenshot
<img src="https://i.imgur.com/ajgk5s7.png">
