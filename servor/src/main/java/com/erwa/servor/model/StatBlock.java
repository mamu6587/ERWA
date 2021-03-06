package com.erwa.servor.model;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.core.style.ToStringCreator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "statblocks")
public class StatBlock {
    private UUID id;
    private String url;
    private int cr,hp, ac, touchac, flatac, init, fort, reflex, will,str,dex,con,intelligence,wis,cha;
    //special; Special qualities och abilities
    private String type,senses,defensive,speeds,spellike,spells,feats,skills,languages,special;

    public StatBlock(){

    }

    public StatBlock(@JsonProperty("id") UUID id,
                     @JsonProperty("url") String url,
                     @JsonProperty("cr") int  cr,
                     @JsonProperty("hp") int  hp,
                     @JsonProperty("ac") int  ac,
                     @JsonProperty("touchac") int  touchac,
                     @JsonProperty("flatac") int  flatac,
                     @JsonProperty("init") int  init,
                     @JsonProperty("fort") int  fort,
                     @JsonProperty("reflex") int  reflex,
                     @JsonProperty("will") int  will,
                     @JsonProperty("str") int  str,
                     @JsonProperty("dex") int dex,
                     @JsonProperty("con") int con,
                     @JsonProperty("intelligence") int intelligence,
                     @JsonProperty("wis") int wis,
                     @JsonProperty("cha") int  cha,
                     @JsonProperty("type") String type,
                     @JsonProperty("senses") String senses,
                     @JsonProperty("defensive") String defensive,
                     @JsonProperty("speeds") String speeds,
                     @JsonProperty("spellike") String spellike,
                     @JsonProperty("spells") String spells,
                     @JsonProperty("feats") String feats,
                     @JsonProperty("skills") String skills,
                     @JsonProperty("languages") String languages,
                     @JsonProperty("special") String special)
    {
        this.id = UUID.randomUUID();
        this.url = url;
        this.type = type;
        this.spells = spells;
        this.spellike = spellike;
        this.speeds = speeds;
        this.special = special;
        this.skills = skills;
        this.senses = senses;
        this.languages = languages;
        this.defensive = defensive;
        this.feats = feats;
        this.cr = cr;
        this.hp = hp;
        this.ac = ac;
        this.touchac = touchac;
        this.flatac = flatac;
        this.init = init;
        this.fort = fort;
        this.reflex = reflex;
        this.will = will;
        this.wis = wis;
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.cha = cha;
        this.intelligence = intelligence;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Column(name = "url", nullable = false)
    public String getUrl() {
        return url;
    }

    @Column(name = "cr", nullable = false)
    public int getCr() {
        return cr;
    }

    @Column(name = "hp", nullable = false)
    public int getHp() {
        return hp;
    }

    @Column(name = "ac", nullable = false)
    public int getAc() {
        return ac;
    }

    @Column(name = "touchac", nullable = false)
    public int getTouchac() {
        return touchac;
    }

    @Column(name = "flatac", nullable = false)
    public int getFlatac() {
        return flatac;
    }

    @Column(name = "init", nullable = false)
    public int getInit() {
        return init;
    }

    @Column(name = "fort", nullable = false)
    public int getFort() {
        return fort;
    }

    @Column(name = "reflex", nullable = false)
    public int getReflex() {
        return reflex;
    }

    @Column(name = "will", nullable = false)
    public int getWill() {
        return will;
    }

    @Column(name = "str", nullable = false)
    public int getStr() {
        return str;
    }

    @Column(name = "dex", nullable = false)
    public int getDex() {
        return dex;
    }

    @Column(name = "con", nullable = false)
    public int getCon() {
        return con;
    }

    @Column(name = "intelligence", nullable = false)
    public int getIntelligence() {
        return intelligence;
    }

    @Column(name = "wis", nullable = false)
    public int getWis() {
        return wis;
    }

    @Column(name = "cha", nullable = false)
    public int getCha() {
        return cha;
    }

    @Column(name = "type", nullable = false)
    public String getType() {
        return type;
    }

    @Column(name = "senses", nullable = false)
    public String getSenses() {
        return senses;
    }

    @Column(name = "defensive", nullable = false)
    public String getDefensive() {
        return defensive;
    }

    @Column(name = "speeds", nullable = false)
    public String getSpeeds() {
        return speeds;
    }

    @Column(name = "spellike", nullable = false)
    public String getSpellike() {
        return spellike;
    }

    @Column(name = "spells", nullable = false)
    public String getSpells() {
        return spells;
    }

    @Column(name = "feats", nullable = false)
    public String getFeats() {
        return feats;
    }

    @Column(name = "skills", nullable = false)
    public String getSkills() {
        return skills;
    }

    @Column(name = "languages", nullable = false)
    public String getLanguages() {
        return languages;
    }

    @Column(name = "special", nullable = false)
    public String getSpecial() {
        return special;
    }


    public void setUrl(String url) {
        this.url = url;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public void setTouchac(int touchac) {
        this.touchac = touchac;
    }

    public void setFlatac(int flatac) {
        this.flatac = flatac;
    }

    public void setInit(int init) {
        this.init = init;
    }

    public void setFort(int fort) {
        this.fort = fort;
    }

    public void setReflex(int reflex) {
        this.reflex = reflex;
    }

    public void setWill(int will) {
        this.will = will;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSenses(String senses) {
        this.senses = senses;
    }

    public void setDefensive(String defensive) {
        this.defensive = defensive;
    }

    public void setSpeeds(String speeds) {
        this.speeds = speeds;
    }

    public void setSpellike(String spellike) {
        this.spellike = spellike;
    }

    public void setSpells(String spells) {
        this.spells = spells;
    }

    public void setFeats(String feats) {
        this.feats = feats;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public String toString(){
        return new ToStringCreator(this).toString();
    }

    @Override
    public final boolean equals(Object o){
        if(!(o instanceof StatBlock))
            return false;
        if(o == null)
            return false;
        if(this == o)
            return true;


        StatBlock other = (StatBlock) o;

        if (    //compare ints first
                this.ac == other.getAc() &&
                        this.cha == other.getCha() &&
                        this.con == other.getCon() &&
                        this.cr == other.getCr() &&
                        this.flatac == other.getFlatac() &&
                        this.dex == other.getDex() &&
                        this.fort == other.getFort() &&
                        this.hp == other.getHp() &&
                        this.str == other.getStr() &&
                        this.init == other.getInit() &&
                        this.intelligence == other.getIntelligence() &&
                        this.reflex == other.getReflex() &&
                        this.touchac == other.getTouchac() &&
                        this.will == other.getWill() &&
                        this.wis == other.getWis() &&
                        //then compare strings; om jag är cool med regexp om inte så orka
                        Objects.equals(this.getFeats(),other.getFeats()) &&
                        Objects.equals(this.getDefensive(),other.getDefensive()) &&
                        Objects.equals(this.getLanguages(),other.getLanguages()) &&
                        Objects.equals(this.getSenses(),other.getSenses()) &&
                        Objects.equals(this.getSkills(),other.getSkills()) &&
                        Objects.equals(this.getSpecial(),other.getSpecial()) &&
                        Objects.equals(this.getSpeeds(),other.getSpeeds()) &&
                        Objects.equals(this.getSpellike(),other.getSpellike()) &&
                        Objects.equals(this.getSpells(),other.getSpells()) &&
                        Objects.equals(this.getType(),other.getType()) &&
                        Objects.equals(this.getUrl(),other.getUrl()) &&
                        this.feats.equals(other.feats) &&
                        this.defensive.equals(other.defensive) &&
                        this.languages.equals(other.languages) &&
                        this.senses.equals(other.senses) &&
                        this.skills.equals(other.skills) &&
                        this.special.equals(other.special) &&
                        this.speeds.equals(other.speeds) &&
                        this.spellike.equals(other.spellike) &&
                        this.spells.equals(other.spells) &&
                        this.type.equals(other.type) &&
                        this.url.equals(other.url)
        ){
            return true;
        }
        return false;
    }


    public void print(){      //behövs inte?
        
    }
}
