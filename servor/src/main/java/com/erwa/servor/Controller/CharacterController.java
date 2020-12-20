package com.erwa.servor.Controller;

import com.erwa.servor.dao.CharacterDAO;
import com.erwa.servor.model.Adventurer;
import com.erwa.servor.services.AdventurerService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class CharacterController<list> {

    private final AdventurerService adventurerService;

    @Autowired
    public CharacterController(AdventurerService adventurerService) {
        this.adventurerService = adventurerService;
    }

    @PostMapping
    public void addAdventurer(@RequestBody Adventurer adventurer) {
        adventurerService.addAdventurer(adventurer);
    }

    @GetMapping(path = "/all")
    public List<Adventurer> getAllAdventurers() {

        return this.adventurerService.getAllAdventurers();
    }

    @GetMapping(path = "{id}")
    public Adventurer getAdventurerById(@PathVariable("id") UUID id) {
        return adventurerService.getAdventurerById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteAdventurerById(@PathVariable("id") UUID id) {
        adventurerService.deleteAdventurerById(id);

    }

    @PutMapping(path = "{id}")
    public void updateAdventurerById(@PathVariable("id") UUID id, @RequestBody Adventurer adventurer) {
        adventurerService.updateAdventurerById(id, adventurer);
    }
/*
    @GetMapping("/characters")
    public List<Character> getAllCharacters(){
        return CharacterDAO.getAllCharacters();
    }

    @GetMapping("/characters/{id]")
    public ResponseEntity<Character> getCharacterById(@PathVariable(value = "id") long id){
        //här tycker de man ska ha med en resourcenotfoundexception
        return STUFF;
    }

    @RequestMapping("/")
*/
}
