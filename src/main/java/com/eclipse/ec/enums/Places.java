package com.eclipse.ec.enums;

public enum Places {
	
	GRAVEYARD,
	CASSEL,
	SWAMP;
	
	public boolean isZombyPlace() {
		return GRAVEYARD == this;
	}

}
