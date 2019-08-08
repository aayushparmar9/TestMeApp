$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login-functionality;login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user logged in successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login-functionality;login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 10,
      "id": "login-functionality;login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "Admin",
        "",
        "password456"
      ],
      "line": 11,
      "id": "login-functionality;login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "Lalitha",
        "",
        "password123"
      ],
      "line": 12,
      "id": "login-functionality;login-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login-functionality;login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"Admin\" and \"password456\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginFeatureStepdefinition.navigateToHomePage()"
});
formatter.result({
  "duration": 14928621900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "password456",
      "offset": 25
    }
  ],
  "location": "LoginFeatureStepdefinition.userEntersAnd(String,String)"
});
formatter.result({
  "duration": 2697026100,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureStepdefinition.userLoggedInSuccessfully()"
});
formatter.result({
  "duration": 887803000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login-functionality;login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"Lalitha\" and \"password123\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginFeatureStepdefinition.navigateToHomePage()"
});
formatter.result({
  "duration": 10013998400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lalitha",
      "offset": 13
    },
    {
      "val": "password123",
      "offset": 27
    }
  ],
  "location": "LoginFeatureStepdefinition.userEntersAnd(String,String)"
});
formatter.result({
  "duration": 1260870800,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureStepdefinition.userLoggedInSuccessfully()"
});
formatter.result({
  "duration": 746147100,
  "status": "passed"
});
});