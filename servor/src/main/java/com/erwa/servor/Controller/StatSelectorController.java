package com.erwa.servor.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("api/gui/statselector")
@RestController
public class StatSelectorController {

    //lägger koden här så länge, osäker på om man ska dela upp det i ett data access object eller hur man vill göra
    //TODO ha flera controllers? hur dela upp detta? eller bara lägga in allt i statblock?

    public List<String> pickStats(){

        List<String> pickedStats = new ArrayList<>();

        //GUI asks question here

        //get all stats and add here
        //pickedStats.add

        return pickedStats;
    }



}
