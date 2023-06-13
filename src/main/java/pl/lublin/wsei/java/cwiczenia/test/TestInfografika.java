package pl.lublin.wsei.java.cwiczenia.test;

import pl.lublin.wsei.java.cwiczenia.Infografika;

public class TestInfografika {
    public static void main(String[] args) {
        String exItem = "<item>\n" +
                "\t\t<title><![CDATA[Infografika - Dzień Dziecka (1 czerwca)]]></title>\n" +
                "\t\t<pubDate><![CDATA[Thu, 01 Jun 2023 12:00:00 +0200]]></pubDate>\n" +
                "\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-dzien-dziecka-1-czerwca,118,3.html</link>\n" +
                "\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-dzien-dziecka-1-czerwca,118,3.html</guid>\n" +
                "\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/118/3/1/dzien_dziecka_2023_slider_pl.png\" type=\"image/png\" width=\"1230\" height=\"690\">\n" +
                "\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
                "\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/118/3/1/dzien_dziecka_2023_slider_pl,k1uUwl-caFOE6tCTiHtf.png\" />\n" +
                "\t\t</media:content>\n" +
                "\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/118/3/1/dzien_dziecka_2023_slider_pl,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description>\n" +
                "\t</item>";

        Infografika infografika = new Infografika(exItem);

        System.out.println("Tytuł: " + infografika.tytul);
        System.out.println("Adres strony: " + infografika.adresStrony);
        System.out.println("Adres grafiki: " + infografika.adresGrafiki);
        System.out.println("Adres miniaturki: " + infografika.adresMiniaturki);
        System.out.println("Rozmiary: " + infografika.szerokosc +"x"+ infografika.wysokosc);
    }
}
