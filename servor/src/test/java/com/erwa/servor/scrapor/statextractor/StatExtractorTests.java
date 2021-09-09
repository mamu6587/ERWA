package com.erwa.servor.scrapor.statextractor;

import com.erwa.servor.debug.Prints;
import com.erwa.servor.model.StatBlock;
import com.erwa.servor.model.StatTuple;
import com.erwa.servor.scrapor.StatExtractor.StatExtractor;
import org.assertj.core.util.Streams;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StatExtractorTests {
    // TODO Unit tests for each function; trimList not currently in use
    public String[] testStats = {"ac","hp","will","type","special","con","speed"};
    public int[] correctInts = {16,6,-1};
    public String[] correctStrings = {"NE Small humanoid (goblinoid)","none","30 ft."};
    public String goblin;

    @BeforeSuite
    public void readGoblin(){
        try {
            String file="C:/Users/User/Documents/ERWA/servor/src/test/resources/GoblinCleanText.txt";
            Path pathToFile = Paths.get(file);

            goblin = Files.readString(pathToFile);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void statExtractTest(){
        //Tests all relevant functions from the class
        //TODO lägg till en goblin som har spells och/eller abilities
            List<String> toFind = StatExtractor.makeStatListFull();

            List<StatTuple> statList = StatExtractor.makeTupleList(goblin,toFind);

            // TODO check that a couple of the values came out correctly
            assert(true);


    }

    //TODO @Test Currently a private helper function for getStatsUsingList; should be made public or not?
    public void getStatFromListTest(List<StatTuple> statTupleList){

        //StatExtractor.getStatsFromList("ac",statTupleList);
    }

    //@Test; currently not in use
    public void trimListTest(){
        //what format trimlist currently works according to;
        String formatAC = "asdkjhlfkjxvc.lkadjdoqwijdoq.AC";

        List<String> list = StatExtractor.makeStatListFull();
        int correct = 0;
        for (String check:correctStrings
             ) {
            if(list.stream().anyMatch(s -> s.equals(check))){
                correct++;
            }
        }

        assert(correct == 7);
    }

    @Test
    public void makeTupleListTest(){
        List<String> allStats = StatBlock.getCurrentStatList();

        Prints.p(allStats.toString());

        List<StatTuple> tupleList = StatExtractor.makeTupleList(goblin,allStats);

        Prints.p(tupleList.toString());

        assert(tupleList.stream().anyMatch(statTuple -> statTuple.get(0).equals("ac") && statTuple.get(1).equals(16)));
        assert(tupleList.stream().anyMatch(statTuple -> statTuple.get(0).equals("init") && statTuple.get(1).equals(16)));

    }

    @Test
    public void makeStatListFullTest(){// TODO hur göra denna utan att bara kolla getdeclared fields mot sig själv? Måste man ha en hel lista och manuellt uppdatera?
        List <String> list = StatExtractor.makeStatListFull();
    }

    @Test
    public void getStatsFromListTest(){

    }


}
