package ru.bai.yatmc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

public class DndCharacter {
    private String id;
    private String name;


    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int characterHp;
    private int characterAc;
    private int characterSpeed;

    private String player;
    private List<String> campaignList;
    private List<String> featList;
    private Set<Skill> dndCharacterSkillSet;
    private String race;
    private String deity;
    private List<String> itemList;
    private String otherDescription;

    public DndCharacter(String id, String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int characterHp, int characterAc, int characterSpeed, String player, List<String> campaignList, List<String> featList, Set<Skill> dndCharacterSkillSet, String race, String deity, List<String> itemList, String otherDescription) {
        this.id = id;
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.characterHp = characterHp;
        this.characterAc = characterAc;
        this.characterSpeed = characterSpeed;
        this.player = player;
        this.campaignList = campaignList;
        this.featList = featList;
        this.dndCharacterSkillSet = dndCharacterSkillSet;
        this.race = race;
        this.deity = deity;
        this.itemList = itemList;
        this.otherDescription = otherDescription;
    }

    public DndCharacter() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getCharacterHp() {
        return characterHp;
    }

    public void setCharacterHp(int characterHp) {
        this.characterHp = characterHp;
    }

    public int getCharacterAc() {
        return characterAc;
    }

    public void setCharacterAc(int characterAc) {
        this.characterAc = characterAc;
    }

    public int getCharacterSpeed() {
        return characterSpeed;
    }

    public void setCharacterSpeed(int characterSpeed) {
        this.characterSpeed = characterSpeed;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public List<String> getCampaignList() {
        return campaignList;
    }

    public void setCampaignList(List<String> campaignList) {
        this.campaignList = campaignList;
    }

    public List<String> getFeatList() {
        return featList;
    }

    public void setFeatList(List<String> featList) {
        this.featList = featList;
    }

    public Set<Skill> getDndCharacterSkillSet() {
        return dndCharacterSkillSet;
    }

    public void setDndCharacterSkillSet(Set<Skill> dndCharacterSkillSet) {
        this.dndCharacterSkillSet = dndCharacterSkillSet;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getDeity() {
        return deity;
    }

    public void setDeity(String deity) {
        this.deity = deity;
    }

    public List<String> getItemList() {
        return itemList;
    }

    public void setItemList(List<String> itemList) {
        this.itemList = itemList;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }
}

