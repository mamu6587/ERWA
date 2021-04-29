package com.erwa.servor.services;

import com.erwa.servor.dao.AdventurerDAO;
import com.erwa.servor.model.Adventurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AdventurerService {

    @Autowired
    private final AdventurerDAO characterDAO;

    @Autowired
    public AdventurerService(@Qualifier("AdventurerDAO") AdventurerDAO characterDAO){
        this.characterDAO = characterDAO;
    }

    public Adventurer addAdventurer(Adventurer adventurer){
        return characterDAO.save(adventurer);
    }

    public List<Adventurer> getAllAdventurers(){
        return characterDAO.findAll();
    }

    public Optional<Adventurer> getAdventurerById(UUID id){
        return Optional.of(characterDAO.getOne(id));
    }

    public void deleteAdventurerById(UUID id){
        characterDAO.deleteById(id);
    }

    public void updateAdventurerById(UUID id, Adventurer newAdventurer){
        characterDAO.save(newAdventurer);
    }
}
