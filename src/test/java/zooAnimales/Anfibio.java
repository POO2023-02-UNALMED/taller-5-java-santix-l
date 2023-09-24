package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	
	private static ArrayList<Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		
	}
	

	public Anfibio(String nombre, int edad, String genero, String habitat, String colorPiel, boolean venenoso) {
		super(nombre, edad, genero, habitat);
		
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);

	}
	
	public String movimiento() {
		
		return "saltar";
	}
	
	public  static int cantidadAnfibios() {
		
		return listado.size();
	}
	
	

	public ArrayList<Anfibio> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean getVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	

}
