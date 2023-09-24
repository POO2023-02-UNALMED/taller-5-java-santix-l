package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		
	}

	public Ave(String nombre, int edad, String genero, String habitat, String colorPlumas) {
		super(nombre, edad, genero, habitat);
		
		this.colorPlumas = colorPlumas;
		listado.add(this);
		
	}
	
	public String movimiento() {
		
		return "volar";
	}
	
	public  static int cantidadAvez() {
		
		return listado.size();
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		
		Ave halcon = new Ave(nombre, edad , genero, "montanas", "cafe glorioso");
		
		halcones++;
		
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		
		Ave aguila = new Ave(nombre, edad , genero, "montanas", "blanco y amarillo");
		
		aguilas++;
		
		return aguila;
	}


	public ArrayList<Ave> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	

}
