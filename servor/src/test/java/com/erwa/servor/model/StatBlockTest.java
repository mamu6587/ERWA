package com.erwa.servor.model;

import com.erwa.servor.ServorApplication;
import com.erwa.servor.dao.StatBlockDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.List;
import java.util.UUID;

@SpringBootTest(classes = ServorApplication.class)
public class StatBlockTest extends AbstractTestNGSpringContextTests {

    @Test
    public void testStatBlockEquals(){
        UUID testUUID = UUID.randomUUID();

        StatBlock statBlock = new StatBlock(testUUID,
                "www.d20pfsrd.com/noobs/noobiest.html","noob",6,30, 20, 13, 15, 5, 7, 2, 7,16,14,16,8,12,15,
                //special; Special qualities och abilities
                "type","senses","defensive","speeds","spellike","spells","feats","skills","languages","special");

        StatBlock statBlock2 = new StatBlock(testUUID,
                "www.d20pfsrd.com/noobs/noobiest.html","noob",6,30, 20, 13, 15, 5, 7, 2, 7,16,14,16,8,12,15,
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

    //@Test for later, if we introduce secondary stats or want to check derived stats
    public void testVerifyStats(){}

    @Test
    public void testGetCurrentStatList(){
        List<String> statList = StatBlock.getCurrentStatList();

        assert(!statList.stream().anyMatch(s -> s.equals("id")));
        assert(!statList.stream().anyMatch(s -> s.equals("url")));
    }
}
