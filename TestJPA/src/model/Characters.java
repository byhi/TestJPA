package model;

import javax.persistence.Column;

public class Characters {

	private Integer level;
	private String name;
	private String race;
	private String caste;
	private String personality;
	private String religion;
	private Integer strength;
	private Integer dexterity;
	private Integer stamina;
	private Integer intelligence;
	private Integer wisdom;
	private Integer charisma;
	private Integer toughness;
	private Integer reflex;
	private Integer willpower;
	private Integer hp;
	private Integer vf;
	private Integer initiative;
	private Integer melee_attack;
	private Integer distance_attack;
	private String story;
	public Characters(Integer level, String name, String race, String caste, String personality, String religion,
			Integer strength, Integer dexterity, Integer stamina, Integer intelligence, Integer wisdom,
			Integer charisma, Integer toughness, Integer reflex, Integer willpower, Integer hp, Integer vf,
			Integer initiative, Integer melee_attack, Integer distance_attack, String story) {
		super();
		this.level = level;
		this.name = name;
		this.race = race;
		this.caste = caste;
		this.personality = personality;
		this.religion = religion;
		this.strength = strength;
		this.dexterity = dexterity;
		this.stamina = stamina;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
		this.toughness = toughness;
		this.reflex = reflex;
		this.willpower = willpower;
		this.hp = hp;
		this.vf = vf;
		this.initiative = initiative;
		this.melee_attack = melee_attack;
		this.distance_attack = distance_attack;
		this.story = story;
	}
	
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getPersonality() {
		return personality;
	}
	public void setPersonality(String personality) {
		this.personality = personality;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public Integer getDexterity() {
		return dexterity;
	}
	public void setDexterity(Integer dexterity) {
		this.dexterity = dexterity;
	}
	public Integer getStamina() {
		return stamina;
	}
	public void setStamina(Integer stamina) {
		this.stamina = stamina;
	}
	public Integer getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}
	public Integer getWisdom() {
		return wisdom;
	}
	public void setWisdom(Integer wisdom) {
		this.wisdom = wisdom;
	}
	public Integer getCharisma() {
		return charisma;
	}
	public void setCharisma(Integer charisma) {
		this.charisma = charisma;
	}
	public Integer getToughness() {
		return toughness;
	}
	public void setToughness(Integer toughness) {
		this.toughness = toughness;
	}
	public Integer getReflex() {
		return reflex;
	}
	public void setReflex(Integer reflex) {
		this.reflex = reflex;
	}
	public Integer getWillpower() {
		return willpower;
	}
	public void setWillpower(Integer willpower) {
		this.willpower = willpower;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getVf() {
		return vf;
	}
	public void setVf(Integer vf) {
		this.vf = vf;
	}
	public Integer getInitiative() {
		return initiative;
	}
	public void setInitiative(Integer initiative) {
		this.initiative = initiative;
	}
	public Integer getMelee_attack() {
		return melee_attack;
	}
	public void setMelee_attack(Integer melee_attack) {
		this.melee_attack = melee_attack;
	}
	public Integer getDistance_attack() {
		return distance_attack;
	}
	public void setDistance_attack(Integer distance_attack) {
		this.distance_attack = distance_attack;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	
	
}
