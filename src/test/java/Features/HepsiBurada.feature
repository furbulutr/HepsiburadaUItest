Feature: HepsiBuradaürün


  @HepsiBuradaÜrün


  Scenario: User registers by successfully completing the registration form
    Given Hepsi burada sayfası acilir
    When  Login olunur
    Then  Login islemi kontrol edilir
    And   Farkli uc urun incelenir
    Then  Sepetimde incelenen ürünler kontrol edilir
    And driver close
