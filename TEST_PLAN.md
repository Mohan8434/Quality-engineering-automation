# Test Plan — Demo Login and Posts API

## Objective
Validate core login behaviour in the SauceDemo practice web application and basic read-only API behaviour in JSONPlaceholder.

## Scope
### In scope
- Valid login
- Invalid password
- Empty login fields
- GET existing post
- GET posts collection
- Status-code and response-data checks

### Out of scope
- Real user accounts or real customer data
- Payment flows
- Load/performance testing
- Security penetration testing
- Production systems

## Test approach
- Manual test design documented in `TEST_CASES.md`
- UI automation using Selenium WebDriver, Java, and TestNG
- API automation using Rest Assured
- Manual API collection in Postman

## Entry criteria
- JDK and Maven installed
- Internet access to the public demo systems
- Browser installed for UI tests

## Exit criteria
- All planned tests have been executed
- Failures are investigated and recorded
- Actual results and test status are documented

## Risks
- Public demo sites may be unavailable or change their UI.
- Network access or browser driver setup may affect test execution.
- API responses can change; assertions should be based on documented demo behaviour.

## Deliverables
- Automation source code
- Test cases
- Defect report template
- Postman collection
- Actual test execution report created by the person running the tests
