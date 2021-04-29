package com.erwa.servor.model;

import com.erwa.servor.dao.StatBlockDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.UUID;

public class StatBlockTest {

   /* public class StatBlock {
        private String origin;
        private Integer CR,hp, ac, touchac, flatac, init, fort, reflex, will,str,dex,con,intelligence,wis,cha;
        //special; Special qualities och abilities
        private String type,senses,defensive,speeds,spellike,spells,feats,skills,languages,special;

        public StatBlock(){}

        public String toString(){
            return new ToStringCreator(this).toString();
        }
    }
*/


    @Test
    public void testCreateStatBlock(){
    }

    @Test
    public void testStatBlockEquals(){
        UUID testUUID = UUID.fromString("test");

        StatBlock statBlock = new StatBlock(testUUID,
                "www.d20pfsrd.com/noobs/noobiest.html",6,30, 20, 13, 15, 5, 7, 2, 7,16,14,16,8,12,15,
                //special; Special qualities och abilities
                "type","senses","defensive","speeds","spellike","spells","feats","skills","languages","special");

        StatBlock statBlock2 = new StatBlock(testUUID,
                "www.d20pfsrd.com/noobs/noobiest.html",6,30, 20, 13, 15, 5, 7, 2, 7,16,14,16,8,12,15,
                //special; Special qualities och abilities
                "type","senses","defensive","speeds","spellike","spells","feats","skills","languages","special");
assert(statBlock.equals(statBlock2));

        boolean exception = false;

try{
    Object o = new Object();
    statBlock.equals(o);
}catch(IllegalArgumentException e){
    exception = true;
}
assert(exception = true);
    }

    @Test
    public void testPrintStatBlock(){

    }

    @Test
    public void testExtractStats(){

    }

    @Test
    public void testVerifyStats(){}
}
