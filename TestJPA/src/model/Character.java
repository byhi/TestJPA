package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "characters")
public class Character implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8516457267882092716L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cid")
	private Long cid;

	@Column(name = "level")
	private Integer level;

	@Column(name = "name")
	private String name;

	@Column(name = "race")
	private String race;

	@Column(name = "caste")
	private String caste;

	@Column(name = "personality")
	private String personality;

	@Column(name = "religion")
	private String religion;

	@Column(name = "strength")
	private Integer strength;

	@Column(name = "dexterity")
	private Integer dexterity;

	@Column(name = "stamina")
	private Integer stamina;

	@Column(name = "intelligence")
	private Integer intelligence;

	@Column(name = "wisdom")
	private Integer wisdom;

	@Column(name = "charisma")
	private Integer charisma;

	@Column(name = "toughness")
	private Integer toughness;

	@Column(name = "reflex")
	private Integer reflex;

	@Column(name = "willpower")
	private Integer willpower;

	@Column(name = "hp")
	private Integer hp;

	@Column(name = "vf")
	private Integer vf;

	@Column(name = "initiative")
	private Integer initiative;

	@Column(name = "melee_attack")
	private Integer melee_attack;

	@Column(name = "distance_attack")
	private Integer distance_attack;

	@Column(name = "story")
	private String story;

	
	
	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Character [cid=" + cid + ", level=" + level + ", name=" + name + ", race=" + race + ", caste=" + caste
				+ ", personality=" + personality + ", religion=" + religion + ", strength=" + strength + ", dexterity="
				+ dexterity + ", stamina=" + stamina + ", intelligence=" + intelligence + ", wisdom=" + wisdom
				+ ", charisma=" + charisma + ", toughness=" + toughness + ", reflex=" + reflex + ", willpower="
				+ willpower + ", hp=" + hp + ", vf=" + vf + ", initiative=" + initiative + ", melee_attack="
				+ melee_attack + ", distance_attack=" + distance_attack + ", story=" + story + "]";
	}
	
	

}
