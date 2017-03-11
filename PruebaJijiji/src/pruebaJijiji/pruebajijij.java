package pruebaJijiji;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class pruebajijij {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tiempoInicio = System.currentTimeMillis();
		System.out.println("Este es el primer for");
		LinkedList<Persona> ll = new LinkedList<>();
		double contador = 0;
		ll.addLast(new Persona());
		for(; contador < 1_000_000_000d;)
		{

			ll.add(new Persona());
			if(contador%2==0)ll.removeLast();
			contador++;
		
		double tiempoFin = System.currentTimeMillis();
		System.out.println((tiempoFin-tiempoInicio)/1000+" segundos");
		
		
		
			tiempoInicio = System.currentTimeMillis();
			System.out.println("Este es el segundo for");
		ArrayList<Persona> ll2 = new ArrayList<>();
		contador = 0;
		ll2.add(new Persona());
		/*for(; contador < 1_000_000_000d;)
		{

			ll2.add(new Persona());
			if(contador%2==0)ll2.remove(0);
			contador++;
		}*/
		tiempoFin = System.currentTimeMillis();
		System.out.println((tiempoFin-tiempoInicio)/1000+" segundos");
		
		
		
		
		tiempoInicio = System.currentTimeMillis();
		System.out.println("Este es el tercer for");
		Vector<Persona> ll3 = new Vector<>();
		 contador = 0;
		ll3.add(new Persona());
		for(; contador < 1_000_000_000d;)
		{
			
			ll3.add(new Persona());
			if(contador%2==0)ll3.remove(0);
			contador++;
		}
		 tiempoFin = System.currentTimeMillis();
		System.out.println((tiempoFin-tiempoInicio)/1000+" segundos");
	}

}
