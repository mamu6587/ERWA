package com.erwa.servor.scrapor;

import com.erwa.servor.debug.Prints;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.javascript.host.html.HTMLElement;

import java.net.URLEncoder;
import java.util.Optional;

public class Scrapor {

    public static String getPage(String page) {

        WebClient client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);
        try {
            HtmlPage result = client.getPage(page);
            //asNormalizedText verkar enklast, då får man utan headers och shit result.asNormalizedText()
            return result.asNormalizedText();
        } catch (Exception e) {
            e.printStackTrace();
            return "Scrape failure on " + page;
        }
    }
}

