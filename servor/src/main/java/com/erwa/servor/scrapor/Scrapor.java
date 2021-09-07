package com.erwa.servor.scrapor;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.net.URLEncoder;
import java.util.Optional;

public class Scrapor {

    //IntelliJ ville ha denna static, men känns som att man kanske vill ha flera scrapes samtidigt? varför skulle man vilja ha den static?
    public static String getPage(String page) {

        WebClient client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);
        try {
            HtmlPage result = client.getPage(page);
            //asNormalizedText verkar enklast, då får man utan headers och shit
            return result.asNormalizedText();
        } catch (Exception e) {
            e.printStackTrace();
            return "Failure";
        }
    }
}

