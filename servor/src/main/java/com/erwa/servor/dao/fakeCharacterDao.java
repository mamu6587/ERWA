package com.erwa.servor.dao;

import com.erwa.servor.model.Adventurer;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDAO")
public class fakeCharacterDao implements CharacterDAO {
    private static List<Adventurer> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Adventurer adventurer){
        DB.add(new Adventurer(adventurer.getName(), adventurer.getCharclass(), adventurer.getRace(), adventurer.getLvl()));
        return 1;
    }

    public List<Adventurer> selectAllAdventurers() {
        return DB;
    }

    @Override
    public Optional<Adventurer> selectAdventurerById(UUID id) {
        return DB.stream()
                .filter(Adventurer -> Adventurer.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteAdventurerById(UUID id) {
        Optional<Adventurer> hitMaybe = selectAdventurerById(id);
        if (hitMaybe.isEmpty()) {
            return 0;
        }
        else{
            DB.remove(hitMaybe.get());
            return 1;
        }
    }

    @Override
    public int updateAdventurerById(UUID id, Adventurer update) {
        return selectAdventurerById((id))
                .map(adventurer -> {
                    int indexToDelete = DB.indexOf(adventurer);
                    if (indexToDelete >= 0) {
                        DB.set(indexToDelete, update);
                        return 1;
                    }
                    return 0;
                }).orElse(0);
    }


}
