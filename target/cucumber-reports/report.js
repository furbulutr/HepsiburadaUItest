$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "HepsiBuradaürün",
  "description": "",
  "id": "hepsiburadaürün",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "User registers by successfully completing the registration form",
  "description": "",
  "id": "hepsiburadaürün;user-registers-by-successfully-completing-the-registration-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@HepsiBuradaÜrün"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Hepsi burada sayfası acilir",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Login olunur",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Login islemi kontrol edilir",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Farkli uc urun incelenir",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Sepetimde incelenen ürünler kontrol edilir",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "driver close",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.HepsiburadaAnaSayfa()"
});
formatter.result({
  "duration": 9261781700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.Login()"
});
formatter.result({
  "duration": 4760111300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userSeesTheRegistrationForm()"
});
formatter.result({
  "duration": 3220255100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.arama()"
});
formatter.result({
  "duration": 17987037600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.sepet()"
});
formatter.result({
  "duration": 10444173100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.driverClose()"
});
formatter.result({
  "duration": 678038500,
  "status": "passed"
});
});