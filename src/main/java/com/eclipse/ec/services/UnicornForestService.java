package com.eclipse.ec.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eclipse.ec.domain.Forest;
import com.eclipse.ec.domain.ForestCharacter;
import com.eclipse.ec.domain.MountainsCharacter;
import com.eclipse.ec.domain.UnicornForest;
import com.eclipse.ec.repository.Zomby;
import com.eclipse.ec.repository.Character;
import com.eclipse.ec.repository.Trol;

public class UnicornForestService {

	private Map<String, MountainsCharacter> mountainsEnemies;
	private Map<String, ForestCharacter> forestCharacter;

	public UnicornForestService() {
		this.mountainsEnemies = new HashMap<>();
		this.mountainsEnemies.put("Boss1", new Trol());
		this.mountainsEnemies.put("Boss2", new Trol());

		this.forestCharacter = new HashMap<>();
		this.forestCharacter.put("Boss1", new Zomby());
		this.forestCharacter.put("Boss2", new Zomby());
	}

	public UnicornForest createForest(String placeName, String bossName) {
		UnicornForest forest;// wazne by pamietac by zwiekszac// liste przeciwnikow
		if (placeName.contains("forest")) {
			forest = new UnicornForest<ForestCharacter>();
			forest.setBoss(forestCharacter.get(bossName));
		} else {
			forest = new UnicornForest<MountainsCharacter>();
			forest.setBoss(mountainsEnemies.get(bossName));
		}

		List<Character> e = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Zomby teacherZomby = new Zomby();
			teacherZomby.setInitiative(20);
			teacherZomby.setHitPoints(2);
			teacherZomby.setName("Złombiak");
			teacherZomby.setDamageBySun(5);

			e.add(teacherZomby);
		}
		forest.setEnemies(e);
		/*
		 * Character dogZomby = new Zomby();
		 * 
		 * forest.setEnemies(teacherZomby, 0); forest.setEnemies(dogZomby, 1);
		 */

		return forest;

	}

}
