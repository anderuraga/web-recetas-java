package com.ipartek.formacion.recetas.ejercicios.herencia;

public class Pajaro extends Animal implements Vendible, Volador {

	private boolean volador;

	public Pajaro(String raza, float precio) {
		super(raza, precio);
		this.volador = false;
	}

	public boolean isVolador() {
		return volador;
	}

	public void setVolador(boolean volador) {
		this.volador = volador;
	}

	@Override
	public void despegar() {
		System.out.println("Legando a las alturas");
	}

	@Override
	public void aterrizar() {
		System.out.println("Aterriza como puedas 2 y un medio");

	}

	@Override
	public void generarFactura() {
		System.out.println("Factura generada");

	}

}
