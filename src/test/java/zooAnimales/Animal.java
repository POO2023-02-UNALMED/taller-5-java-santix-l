package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona = new ArrayList<>();
	
	public Animal() {
		
	}
	
	public Animal(String nombre, int edad, String genero, String habitat) {
		
		totalAnimales++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		//zona.add();
		
	}
	
	public String movimiento() {
		
		return "desplazarse";
	}
	
	
	public String totalPorTipo() {
		
		return "Mamiferos: "+ Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAvez() + "\nReptiles: "+ Reptil.cantidadReptiles()+ "\nPeces: "+ Pez.cantidadPeces() + "\nAnfibios: "+ Anfibio.cantidadAnfibios();
	}
	
	
	public int getTotalAnimales() {
		return totalAnimales;
	}

	public void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<Zona> getZona() {
		return zona;
	}

	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}

	public String toString() {
		
		return "Mi nombre es "+ nombre +", tengo una edad de " + edad + ", habito en "+ habitat + " y mi genero es " + genero + ", la zona en la que me ubico es "+ zona +", en el zoo";
	}
	
	

}
