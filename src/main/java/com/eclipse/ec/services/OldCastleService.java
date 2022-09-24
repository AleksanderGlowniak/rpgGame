package com.eclipse.ec.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.eclipse.ec.domain.Forest;
import com.eclipse.ec.domain.OldCastle;
import com.eclipse.ec.repository.Zomby;
import com.eclipse.ec.repository.Character;
import com.eclipse.ec.repository.Trol;
import com.eclipse.ec.repository.Zigolak;

public class OldCastleService {

	public OldCastle createForest() { //nazwa powinna być inna np createSite
		OldCastle castle = new OldCastle();

		List<Character>characters = IntStream.range(0, 100)
									.mapToObj(idx->{
										switch (idx % 3) {
										case 0:{
											var zomby = new Zomby();
											zomby.setDamageBySun(10);
											zomby.setHitPoints(5);
											zomby.setInitiative(3);
											zomby.setName("Zombiak");
											return zomby;
										}
										case 1:{
											var trol = new Trol();
											trol.setDamageBySun(10);
											trol.setHitPoints(5);
											trol.setInitiative(3);
											trol.setName("Trolak");
											return trol;
										}
										case 2:{
											var zigolak = new Zigolak();
											zigolak.setDamageBySun(10);
											zigolak.setHitPoints(5);
											zigolak.setInitiative(3);
											zigolak.setName("Zigolak");
											return zigolak;
										}
										default: return null;
										}	
									})
									.collect(Collectors.toList());
									castle.setEnemies(characters);
									
				return castle;
											
	}
}
