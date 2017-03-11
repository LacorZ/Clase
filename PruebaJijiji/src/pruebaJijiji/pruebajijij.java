package pruebaJijiji;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class pruebajijij {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tiempoInicio = System.currentTimeMillis();
		
		LinkedList<Persona> ll = new LinkedList<>();
		int contador = 0;
		ll.addLast(new Persona());
		for(Iterator<Persona> it = ll.iterator() ; contador < 10_000_000;)
		{

			ll.add(new Persona());
			if(contador%2==0)ll.removeLast();
			contador++;
		}
		double tiempoFin = System.currentTimeMillis();
		System.out.println((tiempoFin-tiempoInicio)/1000+" segundos");
		
		
		
			tiempoInicio = System.currentTimeMillis();
		
		ArrayList<Persona> ll2 = new ArrayList<>();
		contador = 0;
		ll2.add(new Persona());
		for(Iterator<Persona> it = ll2.iterator() ; contador < 10_000_000;)
		{

			ll2.add(new Persona());
			if(contador%2==0)ll2.remove(0);
			contador++;
		}
		tiempoFin = System.currentTimeMillis();
		System.out.println((tiempoFin-tiempoInicio)/1000+" segundos");
		
		
		
		
		tiempoInicio = System.currentTimeMillis();
		
		Vector<Persona> ll3 = new Vector<>();
		 contador = 0;
		ll3.add(new Persona());
		for(Iterator<Persona> it = ll.iterator() ; contador < 10_000_000;)
		{
			
			ll3.add(new Persona());
			if(contador%2==0)ll3.remove(0);
			contador++;
		}
		 tiempoFin = System.currentTimeMillis();
		System.out.println((tiempoFin-tiempoInicio)/1000+" segundos");
	}

}
