package com.eclipse.ec.domain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eclipse.ec.repository.Character;
import com.eclipse.ec.repository.Warior;

/**
 * 
 * @author olo88
 *
 */
public class Forest extends Place implements Occurrenceable {

	private Character[] enemies;

	public Character[] getEnemies() {
		return enemies;
	}

	public Forest() {
	};

	public Forest(int enemiesAmount) {
		this.enemies = new Character[enemiesAmount];
	}

	public void setEnemies(Character character, int idx) {
		this.enemies[idx] = character;
	}

	public void setEnemies(Character[] enemies) {
		this.enemies = enemies;
	}

	@Override
	protected String getPlaceOfOccurrence() {
		// TODO Auto-generated method stub
		return "Las";
	}

	@Override
	public String occurrenceAtTimeOfDay() {
		// TODO Auto-generated method stub
		return "Midnight";
	}

	/*
	 * public void fight(Warior warrior) { System.out.println("Now you see " +
	 * enemies.length + " enemies"); System.out.println("they names are: "); for
	 * (Character enemy : enemies) { System.out.println(enemy.getName() + ", "); }
	 * System.out.println();
	 * System.out.println("======================================================");
	 * System.out.println("Fight: ");
	 * 
	 * for (Character enemy : enemies) { if (enemy.getInitiative() <=
	 * warrior.getInitiative()) { int warriorHit = warrior.getHitPoints() +
	 * warrior.getWapen().getExtraHit(); int hp = enemy.getHitPoints() - warriorHit;
	 * enemy.setHitPoints(hp); } else { int hp = warrior.getHitPoints() -
	 * enemy.getHitPoints(); System.out.println("You was wonded, HP = " + hp);
	 * warrior.setHitPoints(hp); } if (enemy.getHitPoints() <= 0) {
	 * System.out.println("You have defited " + enemy.getName()); } }
	 * 
	 * }
	 */
	
	public String fight(Warior warrior) {
		StringBuilder sb = new StringBuilder();
		sb.append("Now you see " + enemies.length + " enemies");
		sb.append("they names are: ");
		for (Character enemy : enemies) {
			sb.append(enemy.getName() + ", ");
		}
		
		sb.append("======================================================");
		sb.append("Fight: ");

		for (Character enemy : enemies) {
			if (enemy.getInitiative() <= warrior.getInitiative()) {
				int warriorHit = warrior.getHitPoints() + warrior.getWapen().getExtraHit();
				int hp = enemy.getHitPoints() - warriorHit;
				enemy.setHitPoints(hp);
			} else {
				int hp = warrior.getHitPoints() - enemy.getHitPoints();
				sb.append("You was wonded, HP = " + hp);
				warrior.setHitPoints(hp);
			}
			if (enemy.getHitPoints() <= 0) {
				sb.append("You have defited " + enemy.getName());
			}
		}
		return sb.toString();

	}

}
