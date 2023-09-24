package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	
	private static ArrayList<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		
	}


	public Reptil(String nombre, int edad, String genero, String habitat,String colorEscamas,int largoCola) {
		
		super(nombre, edad, genero, habitat);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
		
	}
	
	public String movimiento() {
		
		return "reptar";
	}
	
	public  static int cantidadReptiles() {
		
		return listado.size();
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		
		Reptil serpiente = new Reptil(nombre, edad , genero, "jungla", "blanco" , 1);
		
		serpientes++;
		
		return serpiente;
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		
		Reptil iguana = new Reptil(nombre, edad , genero, "humedal", "verde" , 3);
		
		iguanas++;
		
		return iguana;
	}

	public ArrayList<Reptil> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	
	

}
