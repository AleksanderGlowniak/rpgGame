package com.eclipse.ec;

import java.lang.reflect.Method;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eclipse.ec.domain.Forest;
import com.eclipse.ec.domain.Occurrenceable;
import com.eclipse.ec.domain.OldCastle;
import com.eclipse.ec.domain.UnicornForest;
import com.eclipse.ec.enums.Places;
import com.eclipse.ec.enums.Wapens;
import com.eclipse.ec.repository.*;
import com.eclipse.ec.repository.Character;
import com.eclipse.ec.services.ForestService;
import com.eclipse.ec.services.OldCastleService;
import com.eclipse.ec.services.UnicornForestService;
import com.eclipse.ec.services.exceptions.ToShortWarriorNameException;

@SpringBootApplication
public class EcApplication {

	public static void main(String[] args) { 
	SpringApplication.run(EcApplication.class, args);
	}

	public static void mainA(String[] args) {
		/*
		 * Character zomby = new Zomby(); Character drakula = new Character(); Character
		 * bat = new Character();
		 * 
		 * bat.setInitiative("20"); System.out.println(bat.getInitiative());
		 * 
		 * zomby.setHitPoints(10); System.out.println(zomby.getHitPoints());
		 * 
		 * ForestService forestService = new ForestService(); Forest forestWithEnemies =
		 * forestService.createForest();
		 * 
		 * forestWithEnemies.showPlaceOfOccurrence();
		 * System.out.println(((Occurrenceable)
		 * forestWithEnemies).occurrenceAtTimeOfDay());
		 * 
		 * Character enemy = new Character(); Class clazz = enemy.getClass();
		 * System.out.println(clazz.getSimpleName()); for (Method method :
		 * clazz.getMethods()) { System.out.println(method.getName());
		 * 
		 * Warior warrior = new Warior(); try { warrior.setName("KONAN B."); } catch
		 * (ToShortWarriorNameException e) {
		 * System.out.println("Your Warrior has too short name"); }
		 * warrior.setVisitedPlace(Places.GRAVEYARD); warrior.setWapen(Wapens.STICK); }
		 */
		Warior warrior = new Warior();
		try {
			warrior.setName("konan");
			warrior.setVisitedPlace(Places.GRAVEYARD);
			warrior.setWapen(Wapens.STICK);
			warrior.setHitPoints(30);
			warrior.setInitiative(20);
		} catch (Exception e) {
			System.out.println("Your Warrior has too short name");
			
		}
		OldCastleService forestService = new OldCastleService();
		OldCastle forest = forestService.createForest();
		forest.fight(warrior);
		// forest.fightWithBoss(warrior);
	}
}
