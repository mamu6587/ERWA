package com.erwa.servor.Controller;

import com.erwa.servor.model.StatBlock;
import com.erwa.servor.services.StatBlockService;
import com.erwa.servor.services.StatBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class StatBlockController<list> {

    private final StatBlockService service;

    @Autowired
    public StatBlockController(StatBlockService service) {
        this.service = service;
    }

    @PostMapping
    public void addStatBlock(@RequestBody StatBlock statblock) {
        service.addStatBlock(statblock);
    }

    @GetMapping(path = "/all")
    public List<StatBlock> getAllStatBlocks() {

        return this.service.getAllStatBlocks();
    }

    //TODO Skulle makea mycket mer sense att get via name än URL; annars behöver skriva någon slags check/contains

    @GetMapping(path = "/name/{name}")
    public List<StatBlock> getStatBlockByName(@PathVariable("name") String name){
        return service.getStatBlockByName(name)
                .orElse(null);
    }
    /*
    @GetMapping(path = "/{url}")
    public StatBlock getStatBlockByURL(@PathVariable("url") String url) {
        return service.getStatBlockByURL(url)
                .orElse(null);
    }

    @DeleteMapping(path = "/{url}")
    public void deleteStatBlockByURL(@PathVariable("url") String url) {
        service.deleteStatBlockByURL(url);

    }

    @PutMapping(path = "/{url}")
    public void updateStatBlockByURL(@PathVariable("url") String url, @RequestBody StatBlock statblock) {
        service.updateStatBlockByURL(url, statblock);
    }
    */
    //Old implementation used ID

    @GetMapping(path = "{id}")
    public StatBlock getStatBlockById(@PathVariable("id") UUID id) {
        return service.getStatBlockById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteStatBlockById(@PathVariable("id") UUID id) {
        service.deleteStatBlockById(id);

    }

    @PutMapping(path = "{id}")
    public void updateStatBlockById(@PathVariable("id") UUID id, @RequestBody StatBlock statblock) {
        service.updateStatBlockById(id, statblock);
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
