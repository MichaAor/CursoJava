package com.company.pairProgramming;

import java.util.ArrayList;

public class FabricaSingleton {
	private ArrayList<Ropa> ropa;
	
	//patr�n Singleton
	private static FabricaSingleton fab=new FabricaSingleton();
	private FabricaSingleton() {
		ropa=new ArrayList<Ropa>();
	}
	public static FabricaSingleton getInstance() { return fab; }
	
	//metodos
	public void agregarRopaFabricada(Ropa r) { ropa.add(r); }
}