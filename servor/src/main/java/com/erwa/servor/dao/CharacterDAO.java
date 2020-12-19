package com.erwa.servor.dao;

import com.erwa.servor.model.Adventurer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CharacterDAO{

    int insertPerson(UUID id, Adventurer adventurer);

    default int insertPerson(Adventurer adventurer){
        UUID id = UUID.randomUUID();
        return insertPerson(id, adventurer);
    }

    public List<Adventurer> selectAllAdventurers();

    Optional<Adventurer> selectAdventurerById(UUID id);

    int deleteAdventurerById(UUID id);

    int updateAdventurerById(UUID id, Adventurer adventurer);

}
