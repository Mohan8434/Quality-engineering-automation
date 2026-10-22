# Manual Test Cases

Target: https://www.saucedemo.com/

| ID | Scenario | Test data | Expected result | Priority |
|---|---|---|---|---|
| TC-LOGIN-001 | Login with valid credentials | standard_user / secret_sauce | Inventory page opens | High |
| TC-LOGIN-002 | Login with wrong password | standard_user / wrong_password | Error message is displayed | High |
| TC-LOGIN-003 | Submit empty credentials | Blank / Blank | Required-field error appears | High |
| TC-LOGIN-004 | Submit with blank username | Blank / secret_sauce | Username validation error appears | Medium |
| TC-LOGIN-005 | Submit with blank password | standard_user / Blank | Password validation error appears | Medium |

## API test cases — JSONPlaceholder

| ID | Scenario | Expected result | Priority |
|---|---|---|---|
| TC-API-001 | GET /posts/1 | HTTP 200 and response id equals 1 | High |
| TC-API-002 | GET /posts | HTTP 200 and a non-empty JSON list | High |

## Execution recording template

For every run, record:
- Date and environment
- Test case ID
- Actual result
- Pass/Fail/Blocked
- Defect ID, if applicable
- Evidence or screenshot path
