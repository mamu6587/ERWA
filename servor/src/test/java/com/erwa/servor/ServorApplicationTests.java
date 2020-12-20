package com.erwa.servor;

import com.erwa.servor.model.Adventurer;
import com.erwa.servor.services.AdventurerService;
import org.mockito.internal.matchers.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

@SpringBootTest
class ServorApplicationTests {
	@Autowired
	private static AdventurerService adventurerService;
/*
	@Test()
	public static void setUp(){
	Adventurer adventurer1 = new Adventurer("Klämmis","Wizard","Elf",0);
	Adventurer adventurer2 = new Adventurer("Busknisse","Paladin","Elf",0);
	//Null before saved
	//assert(adventurer1.getId()==null);
	//assert(adventurer2.getId()==null);
	adventurerService.addAdventurer(adventurer1);
	adventurerService.addAdventurer(adventurer2);
	new Assert(!adventurerService.getAllAdventurers().isEmpty());
}
*/
	@Test
	void contextLoads() {

    }

}
