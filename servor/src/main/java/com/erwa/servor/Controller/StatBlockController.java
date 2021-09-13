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

    @GetMapping(path = "/byname/{name}")
    public List<StatBlock> getStatBlockByName(@PathVariable("name") String name){
        return service.getStatBlockByNameIgnoreCase(name)
                .orElse(null);
    }

    @GetMapping(path = "/byid/{id}")
    public StatBlock getStatBlockById(@PathVariable("id") UUID id) {
        return service.getStatBlockById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "/byid/{id}")
    public void deleteStatBlockById(@PathVariable("id") UUID id) {
        service.deleteStatBlockById(id);

    }

    @PutMapping(path = "/byid{id}")
    public void updateStatBlockById(@PathVariable("id") UUID id, @RequestBody StatBlock statblock) {
        service.updateStatBlockById(id, statblock);
    }
}
