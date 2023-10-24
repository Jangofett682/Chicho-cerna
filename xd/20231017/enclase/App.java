package progii;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		DesdeHasta<String,String>
			desdeHasta = new DesdeHasta<String, String>("Juan", "Pedro");
		System.out.println(desdeHasta);
		DesdeHasta<Integer,Integer>
		desdeHastaNumero = new DesdeHasta<Integer,Integer>(0, 100);
		System.out.println(desdeHastaNumero);
		/*
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente("100","Juan"));
		clientes.add(new Cliente("101","Joy"));
		clientes.add(new Cliente("102","Pedro"));
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		*/
		
		/*
		List<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(12);
		numeros.add(16);
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
		System.out.println(numeros);
		*/
		/*
		List<String> nombres = new ArrayList<>();
		nombres.add("Carlos");
		nombres.add("Juan");
		for (String nombre : nombres) {
			System.out.println(nombre);			
		}
		*/
		
	}
}
