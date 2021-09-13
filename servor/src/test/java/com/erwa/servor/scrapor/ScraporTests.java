package com.erwa.servor.scrapor;

import com.erwa.servor.debug.Prints;
import org.testng.annotations.Test;

import java.io.IOException;


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
