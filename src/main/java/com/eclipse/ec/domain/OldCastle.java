package com.eclipse.ec.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eclipse.ec.repository.Character;
import com.eclipse.ec.repository.Trol;
import com.eclipse.ec.repository.Warior;
import com.eclipse.ec.repository.Zomby;

/**
 * 
 * @author olo88
 *
 */
public class OldCastle<T> extends Place implements Occurrenceable {

	private List<Character> enemies;
	private T boss;

	public T getBoss() {
		return boss;
	}

	public void setBoss(T boss) {
		this.boss = boss;
	}

	public List<Character> getEnemies() {
		return enemies;
	}

	public OldCastle(int i) {
	};

	public OldCastle() {
		// TODO Auto-generated constructor stub
	}

	public void setEnemies(List<Character> enemies) {
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

	public void fight(Warior warrior) {
		System.out.println("Now you see " + enemies.size() + " enemies");
		System.out.println("they names are: ");
		for (Character enemy : enemies) {
			System.out.println(enemy + ", ");
		}
		System.out.println();
		System.out.println("======================================================");
		System.out.println("Fight: ");

		enemies.forEach(enemy -> {
			if (enemy.compareTo(warrior) > 0) {
				int warriorHit = warrior.getHitPoints() + warrior.getWapen().getExtraHit();
				int hp = enemy.getHitPoints() - warriorHit;
				enemy.setHitPoints(hp);
			} else {
				int hp = warrior.getHitPoints() - enemy.getHitPoints();
				System.out.println("You was wonded, HP = " + hp);
				warrior.setHitPoints(hp);
			}
			if (enemy.getHitPoints() <= 0) {
				System.out.println("You have defited " + enemy.getName());
			}
		});
	}

	public void fightWithBoss(Warior warrior) {
		Character boss = (Character) this.boss;
		if (boss.getInitiative() <= warrior.getInitiative()) {
			int hp = boss.getHitPoints() - (warrior.getHitPoints() + warrior.getWapen().getExtraHit());
			boss.setHitPoints(hp);
			if (boss.getHitPoints() < 0) {
				System.out.println("You have defeated BOSS");
			}
		} else {
			int hp = warrior.getHitPoints() - boss.getHitPoints();
			warrior.setHitPoints(hp);
			if (warrior.getHitPoints() < 0) {
				System.out.println("You are defeated");
			}
		}

	}
}