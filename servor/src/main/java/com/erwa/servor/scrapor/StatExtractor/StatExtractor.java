package com.erwa.servor.scrapor.StatExtractor;

import com.erwa.servor.debug.Prints;
import com.erwa.servor.model.StatBlock;
import com.erwa.servor.model.StatTuple;

import javax.persistence.Tuple;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.*;

public abstract class StatExtractor {
    //extracts stats in list from block and returns list of tuples with {name,value}
    public static List<StatTuple> makeTupleList(String block, List<String> statsToFind){

        List<StatTuple> statList = new ArrayList<>();

        Pattern pattern;
        Matcher matcher;
        while(!statsToFind.isEmpty()){
            //TODO https://regexr.com/ to build regexs; might need individual for different stats or groups thereof
            //TODO Ideally tie type of stat looked for to different patterns; string and int,
            String regex = statsToFind.get(0) + " [0-9]+";
            pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
            matcher = pattern.matcher(block);
            Prints.p("currently looking for " + regex);

            if(matcher.find()){
                String result = matcher.group();

                Prints.p(result);

                String trimmedResult = result.replaceAll("[^0-9]","");
                if(trimmedResult != null && !trimmedResult.isBlank()){
                    int value = Integer.parseInt(trimmedResult);
                    Tuple tuple = new StatTuple(result, value);
                    Prints.p("Results found, " + result + " equals " + value);
                } else {
                    Prints.p("Result not found, " + (trimmedResult != null) + " Or else it was blank" + trimmedResult.isBlank());
                }
            } else {
                Prints.p("Pattern not found");
            }
            statsToFind.remove(0);
        }//TODO regex magic to pick out each stat in list from the block

        return statList;
    }

    //helper function, to search thru statList and get correct value, none otherwise
    private Optional<StatTuple> getStatFromList(List<StatTuple> list, String stat){
        for (StatTuple statTuple : list) {
            if (stat.equals(statTuple.get(0))) {
                return Optional.of(statTuple);
            }
        }
        return Optional.empty();
    }

    //Tar ut alla stats från ett vanligt StatBlock i en lista
    public static List<String> makeStatListFull(){
        //testa alla stats från goblin ovan, att de hämtas rätt.
        List<String> toFind = StatBlock.getCurrentStatList();


        //Prints.p("List made, contains" + toFind.toString());

        return toFind;
    }


    //returns a new copy of list with leading symbols up until and including dot
    private List<String> trimList(List<String> toTrim){
        //currently expects strings of format A-z*.n, where n is the substring to extract.
        return null;
    }


}
