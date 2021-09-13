package com.erwa.servor.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("api/gui/statselector")
@RestController
public class PresentorController {

    //lägger koden här så länge, osäker på om man ska dela upp det i ett data access object eller hur man vill göra
    /*TODO ha flera controllers; dela upp efter areas; rimligtvis presentation, database, ev scraping för någon slags web-connection
    tänker mig att ha
*/
    public List<String> pickStats(){

        List<String> pickedStats = new ArrayList<>();

        //GUI asks question here

        //get all stats and add here
        //pickedStats.add

        return pickedStats;
    }



}
