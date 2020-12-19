package com.erwa.servor.services;

import com.erwa.servor.dao.CharacterDAO;
import com.erwa.servor.model.Adventurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AdventurerService {

    private final CharacterDAO characterDAO;

    @Autowired
    public AdventurerService(@Qualifier("fakeDAO") CharacterDAO characterDAO){
        this.characterDAO = characterDAO;
    }

    public int addAdventurer(Adventurer adventurer){
        return characterDAO.insertPerson(adventurer);
    }

    public List<Adventurer> getAllAdventurers(){
        return characterDAO.selectAllAdventurers();
    }

    public Optional<Adventurer> getAdventurerById(UUID id){
        return characterDAO.selectAdventurerById(id);
    }

    public int deleteAdventurerById(UUID id){
        return characterDAO.deleteAdventurerById(id);
    }

    public int updateAdventurerById(UUID id, Adventurer newAdventurer){
        return characterDAO.updateAdventurerById(id, newAdventurer);
    }
}
