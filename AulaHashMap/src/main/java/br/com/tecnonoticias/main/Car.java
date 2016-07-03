package br.com.tecnonoticias.main;

public class Car {

	private Integer chassi;
	private String marca;
	
	public Car(Integer chassi, String marca) {
		this.chassi = chassi;
		this.marca = marca;
	}
	
	public String toString(){
		return chassi + " " + marca + " ";
	}
	
	public int hashCode(){
		return chassi;
	}
	
	public boolean equals(Object o){
		Car example = (Car) o;
		if (example.chassi == this.chassi) {
			return true;
		}
		return false;
	}
}
