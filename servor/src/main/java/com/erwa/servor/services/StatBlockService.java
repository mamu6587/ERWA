package com.erwa.servor.services;

import com.erwa.servor.dao.StatBlockDAO;
import com.erwa.servor.model.StatBlock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StatBlockService {

    @Autowired
    private final StatBlockDAO DAO;

    @Autowired
    public StatBlockService(@Qualifier("StatBlockDAO") StatBlockDAO DAO){
        this.DAO = DAO;
    }

    public StatBlock addStatBlock(StatBlock adventurer){
        return DAO.save(adventurer);
    }

    public List<StatBlock> getAllStatBlocks(){
        return DAO.findAll();
    }


    public Optional<StatBlock> getStatBlockById(UUID id){return Optional.of(DAO.getOne(id));}

    public void deleteStatBlockById(UUID id){DAO.deleteById(id);}

    public void updateStatBlockById(UUID id, StatBlock newStatBlock){DAO.save(newStatBlock);}

/*
    public Optional<StatBlock> getStatBlockByURL(String URL){
    return Optional.of(DAO.getOne(URL));
    }

    public void deleteStatBlockByURL(String url){DAO.deleteById(url);}

    //Behövs denna?
    public void updateStatBlockByURL(String url, StatBlock newStatBlock){DAO.save(newStatBlock);}
*/
    public Optional<List<StatBlock>> getStatBlockByNameIgnoreCase(String name) { return Optional.of(DAO.findByNameIgnoreCase(name)); }

}
