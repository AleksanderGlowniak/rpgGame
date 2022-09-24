package com.eclipse.ec.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eclipse.ec.domain.Forest;
import com.eclipse.ec.domain.OldCastle;
import com.eclipse.ec.enums.Places;
import com.eclipse.ec.enums.Wapens;
import com.eclipse.ec.repository.Character;
import com.eclipse.ec.repository.Warior;
import com.eclipse.ec.services.ForestService;
import com.eclipse.ec.services.OldCastleService;

@RestController // tworzymy brame do komunikacji z aplikacja na serwerze (z perspektywy przegladarki)
public class GameController {

		private String gameName;
		private int enemiesNumb;
		
		@RequestMapping(value = "/game", method = RequestMethod.GET) 
		public String getGameData() {
			return "my game data" + gameName + "ilośc enemies: "+ enemiesNumb;
		}
		
		@RequestMapping(value = "/game/{name}", method = RequestMethod.POST)
		@ResponseBody
		public String postGameData(@PathVariable("name")String name) {
			this.gameName = name;
			return "my game name: " + name;
			
		}
		@RequestMapping(value = "/game/enemies", method = RequestMethod.PUT)
		@ResponseBody
		public String putGameEnemies(@RequestParam("numb")int enemyNumb) {
			this.enemiesNumb = enemyNumb;
			return "set enemy Numb: " + enemyNumb;
		}
		@RequestMapping(value = "/game/fight", method = RequestMethod.GET) 
		public String getFightWithWarrior() {
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
			ForestService forestService = new ForestService();
			Forest forest = forestService.createForest();
			String resultFight = forest.fight(warrior);
			
			return resultFight;
		}	
}
