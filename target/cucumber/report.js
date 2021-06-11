$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/Bank\u0026Cash.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Bank\u0026Chash"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "User should be able login with valid credentials",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "User enter \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User will land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User fill up the form entering \"\u003caccountTitle\u003e\"and \"\u003cdescription\u003e\"and \"\u003cinitialBalance\u003e\"and \"\u003caccountNumber\u003e\"and \"\u003ccontactPerson\u003e\"and \"\u003cphone\u003e\"and \"\u003cinternetBankingUrl\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "clicks on submit",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should be able to see validate",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingUrl"
      ],
      "line": 18,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Money Market Account",
        "Personal",
        "$ 15,00,000.00",
        "1345845613",
        "Mr.Vikani",
        "459-137-1313",
        "www.BOA.com"
      ],
      "line": 19,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2879409300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDef_BankCash.user_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 75461600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User should be able login with valid credentials",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Bank\u0026Chash"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enter \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User will land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User fill up the form entering \"Money Market Account\"and \"Personal\"and \"$ 15,00,000.00\"and \"1345845613\"and \"Mr.Vikani\"and \"459-137-1313\"and \"www.BOA.com\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "clicks on submit",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should be able to see validate",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 12
    },
    {
      "val": "abc123",
      "offset": 36
    }
  ],
  "location": "StepsDef_BankCash.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 3147691500,
  "status": "passed"
});
formatter.match({
  "location": "StepsDef_BankCash.user_clicks_singin_button()"
});
formatter.result({
  "duration": 3322024100,
  "status": "passed"
});
formatter.match({
  "location": "StepsDef_BankCash.user_will_land_on_the_Dashboard_page()"
});
formatter.result({
  "duration": 18402900,
  "status": "passed"
});
formatter.match({
  "location": "StepsDef_BankCash.user_clicks_on_bank_and_cash()"
});
formatter.result({
  "duration": 47827400,
  "status": "passed"
});
formatter.match({
  "location": "StepsDef_BankCash.user_clicks_on_new_account()"
});
formatter.result({
  "duration": 495928100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Money Market Account",
      "offset": 32
    },
    {
      "val": "Personal",
      "offset": 58
    },
    {
      "val": "$ 15,00,000.00",
      "offset": 72
    },
    {
      "val": "1345845613",
      "offset": 92
    },
    {
      "val": "Mr.Vikani",
      "offset": 108
    },
    {
      "val": "459-137-1313",
      "offset": 123
    },
    {
      "val": "www.BOA.com",
      "offset": 141
    }
  ],
  "location": "StepsDef_BankCash.user_fill_up_the_form_entering_and_and_and_and_and_and_and(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 404201600,
  "status": "passed"
});
formatter.match({
  "location": "StepsDef_BankCash.clicks_on_submit()"
});
formatter.result({
  "duration": 877610900,
  "status": "passed"
});
formatter.match({
  "location": "StepsDef_BankCash.user_should_be_able_to_see_validate()"
});
formatter.result({
  "duration": 2102900,
  "status": "passed"
});
formatter.after({
  "duration": 660082700,
  "status": "passed"
});
});