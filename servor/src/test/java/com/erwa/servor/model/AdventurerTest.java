package com.erwa.servor.model;

import com.erwa.servor.ServorApplication;
import com.erwa.servor.dao.AdventurerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

//@ContextConfiguration({"/test-applicationContext.xml"})
@SpringBootTest(classes = ServorApplication.class)
public class AdventurerTest extends AbstractTestNGSpringContextTests {


    @Autowired
    AdventurerDAO AdventurerDAO;



    @Test
    public void testCreateAdventurer() {
        Adventurer adventurer = new Adventurer("Name", "Charclass", "Race", 0);

        AdventurerDAO.save(adventurer);

    }

    @Test
    void testDisplayAdventurer() {
        System.out.println(AdventurerDAO.findAll());
    }

    @Test
    void testSecondaryStatsAdventurer() {

    }

    @Test
    public void testPrintAdventurer(){
        Adventurer adventurer = new Adventurer("Name", "Charclass", "Race", 0);
        adventurer.toString();
    }
}
