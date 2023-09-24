package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	
	private static ArrayList<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		
	}

	public Mamifero(String nombre, int edad, String genero, String habitat, boolean pelaje, int patas) {
		super(nombre, edad, genero, habitat);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	
	}
	
	public  static int cantidadMamiferos() {
		
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		
		Mamifero caballo = new Mamifero(nombre, edad , genero, "pradera", true, 4);
		
		caballos++;
		
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		
		Mamifero leon = new Mamifero(nombre, edad , genero, "selva", true, 4);
		
		leones++;
		
		return leon;
	}
	
	public ArrayList<Mamifero> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public boolean getPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	


}
