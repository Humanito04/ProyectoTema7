package delantero;

import jugador.Jugador;

public class Delantero extends Jugador {
private int goles;
	
	public Delantero (String nombre,int dorsal, String equipo, int goles) {
		super(nombre,dorsal,equipo);
		this.goles=goles;
	}

	public int getGoles() {
		return this.goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("El nombre de este delantero es "+ this.getNombre() + ", su dorsal es "+ this.getDorsal()
		+ " , su equipo es "+ this.getEquipo()+" y sus goles han sido " + this.goles);
		
	}
	
	@Override
	public String toString() {
		return "Delantero [nombre= " + this.getNombre()+", dorsal= "+ this.getDorsal()+", equipo= "+ this.getEquipo()+", goles= "
		+ this.goles + "]";
	}
	@Override
	public boolean equals (Object obj) {
		Delantero otro=(Delantero)obj;
		boolean result=false;
		if(super.equals(otro)&&this.goles==otro.goles) {
			result=true;
		}
		return result;
	}

}
