package ru.bai.yatmc.model;

import lombok.Data;

import java.util.UUID;


public class Skill {

    private String skillName;
    private String skillDescription;
    private Integer skillRank;
    private CharacterSkill id;

    public CharacterSkill getId() {
        return id;
    }

    public void setId(CharacterSkill id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public Integer getSkillRank() {
        return skillRank;
    }

    public void setSkillRank(Integer skillRank) {
        this.skillRank = skillRank;
    }

    public Skill(String skillName, String skillDescription, Integer skillRank) {
        this.skillName = skillName;
        this.skillDescription = skillDescription;
        this.skillRank = skillRank;
    }

    public Skill() {
    }

    public class CharacterSkill {
        private String characterId;
        private String skillId;

        public String getCharacterId() {
            return characterId;
        }

        public void setCharacterId(String characterId) {
            this.characterId = characterId;
        }

        public String getSkillId() {
            return skillId;
        }

        public void setSkillId(String skillId) {
            this.skillId = skillId;
        }
    }
}
