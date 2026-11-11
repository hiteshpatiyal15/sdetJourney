# day1JavaOopsQA
Concept: OOP in automation

OOP has four major principles:
Encapsulation	Hide internal data	Login page credentials
Inheritance	Reuse parent functionality	BaseTest class
Polymorphism	Same method, different behavior	Different browser implementations
Abstraction	Hide implementation details	WebDriver interface

Each class has a specific responsibility.

Hands-on exercise
Scenario: Create a login automation structure using Java OOP.

Requirements:
1. Create a class called BasePage.
2. Create a class called LoginPage extending BasePage.
3. Implement a method called login().
4. Create a User class with private username and password fields.
5. Use getters and setters.
6. Override a method from the parent class.

# day2JavaCollectionsQA
Java Collections — List, Set, Map and HashMap

Java Collections help you manage groups of objects dynamically.

| Collection | Stores | Allows duplicates? | Typical QA use |
|-----------|--------|-------------------|----------------|
| List | Ordered elements | Yes | Test execution results |
| Set | Unique elements | No | Finding duplicate IDs |
| Map | Key-value pairs | Keys must be unique | API response fields |
| HashMap | Key-value pairs, no guaranteed order | Keys must be unique | Test data and request payloads |

Scenario: Validate API test execution results

You have executed automated tests against an application. Your framework receives the following test results:
Test case	Result
Login	PASS
Search	PASS
Checkout	FAIL
Login	PASS
Payment	FAIL
Search	PASS

Write a Java program that:
1. Stores all test case names in a List.
2. Finds the unique test case names using a Set.
3. Stores each test case and its final status in a Map.
4. Counts the total PASS and FAIL results.
5. Prints the unique test count and final execution summary.