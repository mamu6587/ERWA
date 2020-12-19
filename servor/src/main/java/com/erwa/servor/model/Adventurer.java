package com.erwa.servor.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "characters")
public class Adventurer {
private UUID id;
private String name;
private String charclass;
private String race;
private int level;

        public Adventurer(){
        }

        public Adventurer(@JsonProperty("name") String name,
                          @JsonProperty("charclass")String charclass,
                          @JsonProperty("race")String race,
                          @JsonProperty("level")int lvl){
                this.id = UUID.randomUUID();
                this.name = name;
                this.charclass = charclass;
                this.race = race;
                this.level = lvl;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        public UUID getId(){
                return id;
        }

        public void setId(UUID id){
                this.id = id;
        }

        @Column(name = "name", nullable = false)
        public String getName(){
                return name;
        }
        public void setName(String name){
                this.name = name;
        }

        @Column(name = "charclass", nullable = false)
        public String getCharclass(){
                return charclass;
        }
        public void setCharclass(String charclass){
                this.charclass = charclass;
        }
        @Column(name = "race", nullable = false)
        public String getRace() {
                return race;
        }

        public void setRace(String race) {
                this.race = race;
        }
        @Column(name = "level", nullable = false)
        public int getLvl() {
                return level;
        }

        public void setLvl(int lvl) {
                this.level = lvl;
        }

        @Override
        public String toString(){
                return "[ID:" + id + " " + name +";" + race + " " + level + " " + charclass;
        }
}
