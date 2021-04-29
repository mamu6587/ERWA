package com.erwa.servor.services;

import com.erwa.servor.model.StatBlock;
import com.erwa.servor.services.StatBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.UUID;

public class StatBlockServiceTests {
    @Autowired
    private StatBlockService statBlockService;

    //save, load, extract stats,
    @Test
    public void testServiceSaveLoad(){
        UUID testUUID = UUID.fromString("hej");
        StatBlock statBlock = new StatBlock(testUUID,
                "www.d20pfsrd.com/noobs/noobiest.html",6,30, 20, 13, 15, 5, 7, 2, 7,16,14,16,8,12,15,
        //special; Special qualities och abilities
                "type","senses","defensive","speeds","spellike","spells","feats","skills","languages","special");
        this.statBlockService.addStatBlock(statBlock);

    }

    public void testExtractStats(){

    }

}
