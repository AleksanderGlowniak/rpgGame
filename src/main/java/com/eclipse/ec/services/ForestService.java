package com.eclipse.ec.services;

import com.eclipse.ec.domain.Forest;
import com.eclipse.ec.repository.Zomby;
import com.eclipse.ec.repository.Character;

public class ForestService {

	public Forest createForest() {
		Forest forest = new Forest(2); // wazne by pamietac by zwiekszac liste przeciwnikow
		Zomby teacherZomby = new Zomby();
		teacherZomby.setInitiative(20);
		teacherZomby.setHitPoints(2);
		teacherZomby.setName("Teacher Zombe");
		teacherZomby.setDamageBySun(10);

		Character dogZomby = new Zomby();

		forest.setEnemies(teacherZomby, 0);
		forest.setEnemies(dogZomby, 1);

		return forest;

	}

}
