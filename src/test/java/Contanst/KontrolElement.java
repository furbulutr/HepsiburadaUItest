package Contanst;


import org.openqa.selenium.By;
import util.ElementInfo;

public interface KontrolElement {


    public ElementInfo kullaniciAdi = new ElementInfo("Kullanici giris ismi", By.xpath("//a[@title='Hesabım']//span[.='furkan bulut']"));


    public ElementInfo urun1 = new ElementInfo("urun1", By.xpath("//div[@class='product-detail']//h3[@title='HP 15-DW2009NT Intel Core i5 1035G1 8GB 512GB SSD MX330 FreeDos 15.6\" FHD Taşınabilir Bilgisayar 3H813EA']"));

    public ElementInfo urun2 = new ElementInfo("urun2", By.xpath("//div[@class='product-detail']//h3[@title='Lenovo IdeaPad IP3-15ADA05 AMD Athlon 3050U 4GB 256GB SSD Freedos 15.6\" Taşınabilir Bilgisayar 81W100CKTX']"));


    public ElementInfo urun3 = new ElementInfo("urun3", By.xpath("//div[@class='product-detail']//h3[@title='Asus X509JB-BR015 Intel Core i5 1035G1 8GB 512GB SSD MX110 Freedos 15.6\" Taşınabilir Bilgisayar']"));






}
