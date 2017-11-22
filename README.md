## Test Runners and Test Reports

This repository contains three projects. They all use Maven as a build tool and are intended to showcase TestNG and Allure Reports in action:
- exercise - contains exercises that are intended to be done by those attending the training. See related presentation for more details.
- testngexample - contains set of demo tests that use some of the most frequesntly used TestNG annotations/functionality. 
Easiest way to run this: latest Eclipse + Eclipse TestNG plugin(available at Eclipse marketplace). Run `maven test` command if you wish to run it with Maven Surefire plugin or run testng.xml suite or individual tests with TestNG plugin.
- testngallureexample - contains set of demo tests that use most frequently used annotations/functionality from both TestNG and Allure framework. Easiest way to run this: latest Eclipse. Run `maven test allure:serve` to execute all tests and generate allure report. It will automatically be open once all tests are finished. 
