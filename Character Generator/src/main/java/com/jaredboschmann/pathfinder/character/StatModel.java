package com.jaredboschmann.pathfinder.character;

import java.util.ArrayList;

public class StatModel {
	public enum StatId {
		STR,
		DEX,
		CON,
		INT,
		WIS,
		CHA;
	}
	private StatId statId;
	private String statName;
	private int statValue;
	private int statBonus;
	private int statBoosts;
	private ArrayList<SkillModel> statSkills;
	
	
	
	public StatModel() {
		if (getStatId() == StatId.STR) {
			this.statName = "Strength";
			this.statValue = 10;
			this.statBoosts = 0;
			//TODO Add getSkillModel Method
			this.statSkills.add(getSkillModel("Athletics"));
		}
	}
	
	
	public StatId getStatId() {
		return this.statId;
	}
	
	
	
}
