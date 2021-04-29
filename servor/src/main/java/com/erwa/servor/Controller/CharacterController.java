package com.erwa.servor.Controller;

import com.erwa.servor.model.Adventurer;
import com.erwa.servor.services.AdventurerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

//@RequestMapping("api/v1/person")
//@RestController
public class CharacterController<list> {

    private final AdventurerService Service;

    @Autowired
    public CharacterController(AdventurerService Service) {
        this.Service = Service;
    }

    @PostMapping
    public void addAdventurer(@RequestBody Adventurer adventurer) {
        Service.addAdventurer(adventurer);
    }

    @GetMapping(path = "/all")
    public List<Adventurer> getAllAdventurers() {

        return this.Service.getAllAdventurers();
    }

    @GetMapping(path = "{id}")
    public Adventurer getAdventurerById(@PathVariable("id") UUID id) {
        return Service.getAdventurerById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteAdventurerById(@PathVariable("id") UUID id) {
        Service.deleteAdventurerById(id);

    }

    @PutMapping(path = "{id}")
    public void updateAdventurerById(@PathVariable("id") UUID id, @RequestBody Adventurer adventurer) {
        Service.updateAdventurerById(id, adventurer);
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
