package Steps;

import Base.BaseStep;
import Contanst.KontrolElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


import java.util.UUID;

public class LoginSteps  extends BaseStep implements KontrolElement {
    String uuid = UUID.randomUUID().toString();

    @Given("^Hepsi burada sayfası acilir$")
    public void HepsiburadaAnaSayfa() {
        geturl();
    }

    @When("^Login olunur$")

    public void Login()  throws InterruptedException  {
        findElementClick("myAccount",Pather.id);
        findElementClick("login",Pather.id);
        findElementClick("txtUserName",Pather.id);
        findElementSendKeys("txtUserName",Pather.id,"furbulutr@gmail.com");
        findElementClick("txtPassword",Pather.id);
        findElementSendKeys("txtPassword",Pather.id,"fener586710");
        findElementClick("btnLogin",Pather.id);
        Thread.sleep(1000);

    }
    @Then("^Login islemi kontrol edilir$")
    public void userSeesTheRegistrationForm() {
        Assert.assertTrue("Login işlemi başarısız",isElementVisible(kullaniciAdi,5));
    }

    @And("^Farkli uc urun incelenir$")
    public void arama() throws InterruptedException
    {

        geturlPC();
        PageScrolldown();
        findElementClick("//div[@class='product-detail']//h3[@title='HP 15-DW2009NT Intel Core i5 1035G1 8GB 512GB SSD MX330 FreeDos 15.6\" FHD Taşınabilir Bilgisayar 3H813EA']",Pather.xPath);
        Thread.sleep(1000);
        geturlPC();
        PageScrolldown();
        findElementClick("//div[@class='product-detail']//h3[@title='Lenovo IdeaPad IP3-15ADA05 AMD Athlon 3050U 4GB 256GB SSD Freedos 15.6\" Taşınabilir Bilgisayar 81W100CKTX']",Pather.xPath);
        Thread.sleep(1000);
        geturlPC();
        PageScrolldown();
        findElementClick("//div[@class='product-detail']//h3[@title='Asus X509JB-BR015 Intel Core i5 1035G1 8GB 512GB SSD MX110 Freedos 15.6\" Taşınabilir Bilgisayar']",Pather.xPath);
        Thread.sleep(1000);
        geturlPC();
        Thread.sleep(1000);
        findElementClick("//a[@class='OldMyAccount-WTOLC OldMyAccount-1kR4k']//span[2]",Pather.xPath);

        Thread.sleep(5000);

    }


    @Then("^Sepetimde incelenen ürünler kontrol edilir$")
    public void sepet() throws InterruptedException {

        findElementClick("//a[@class='OldMyAccount-WTOLC OldMyAccount-1kR4k']//span[2]",Pather.xPath);
        PageScrolldown();
        Assert.assertTrue("Ziyaret ettiğiniz 1. ürün sepettim de bulunamadı",isElementVisible(urun1,5));
        Assert.assertTrue("Ziyaret ettiğiniz 2. ürün sepettim de bulunamadı",isElementVisible(urun2,5));
        Assert.assertTrue("Ziyaret ettiğiniz 3. ürün sepettim de bulunamadı",isElementVisible(urun3,5));

    }






    @And("^driver close$")
    public void driverClose() {

        DriverQuit();
    }
}
