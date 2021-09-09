package com.erwa.servor.scrapor;

import com.erwa.servor.debug.Prints;
import com.erwa.servor.model.StatBlock;
import com.erwa.servor.model.StatTuple;
import com.erwa.servor.scrapor.StatExtractor.StatExtractor;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.sun.xml.bind.v2.TODO;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class ScraporTests {

    @Test
    public void getPageTest(){
        String page = Scrapor.getPage("https://www.d20pfsrd.com/bestiary/monster-listings/humanoids/goblin/");

        Prints.p("Page collected: " + page.length());
        Prints.p("contents: " + page);
        //vet inte riktigt hur jag ska testa denna; kanske inte ens behövs
    }



    @Test
    public void GoblinScrapeTest() throws IOException {

        //att byta ut mot att faktiskt scrapea en goblin


        //extract stats from goblin




    }

}
