package com.mx.java.arreglos;

import java.util.Arrays;
import java.util.Random;

public class GeneraArreglo {

	static int [] arreglo;
	static int tamano=0;
	public GeneraArreglo() {
	// TODO Auto-generated constructor stub
		System.out.println("GeneraArreglo.GeneraArreglo() ::#CONSTRUCTOR#::");
		
}
	// llena el arreglo y lo escribe
	public int llenaArreglo(int tamano) {
		System.out.println("GeneraArreglo.llenaArreglo()");
		arreglo=new int[tamano];
		System.out.print("[");
		for (int i = 0; i < tamano; i++) {
			
			arreglo[i]=generaValores(tamano);
			System.out.print(arreglo[i]+",");
		}
		System.out.print("] \n");
		
		System.out.println(":: ordenando :: menor a mayor");
		//ordena los numeros de menor a mayor
		Arrays.sort(arreglo);
		System.out.println(Arrays.toString(arreglo));
		
		//recorrer de mayor a menor
		System.out.println(" #:: ordenando ::# mayor a menor");
		System.out.print("[");
		for (int i = arreglo.length-1; i>=0 ; i--) {
			System.out.print(arreglo[i]+" ");
		}
		System.out.print("]");
		
		return 0;
	}
	
	// llemado de arreglo con numeros aleatorios
	public static int generaValores(int tamano) {
		//System.out.println("GeneraArreglo.generaValores()");
		Random r=new Random();
		return r.nextInt(tamano+10);
	}
	
	
	
	
}
