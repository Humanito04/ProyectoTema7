package portero;

import jugador.Jugador;

public class Portero extends Jugador {
	private int paradas;

	public Portero (String nombre,int dorsal, String equipo, int paradas) {
		super(nombre,dorsal,equipo);
		this.paradas=paradas;
	}

	public int getParadas() {
		return this.paradas;
	}

	public void setParadas(int paradas) {
		this.paradas = paradas;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("El nombre de este portero es "+ this.getNombre() + ", su dorsal es "+ this.getDorsal()
				+ " , su equipo es "+ this.getEquipo()+" y sus paradas han sido " + this.paradas);

	}

	@Override
	public String toString() {
		return "Portero [nombre " + this.getNombre()+"dorsal "+ this.getDorsal()+" equipo "+ this.getEquipo()+"paradas"
		+ this.paradas + "]";
	}
	@Override
	public boolean equals (Object obj) {
		Portero otro=(Portero)obj;
		boolean result=false;
		if(super.equals(otro)&&this.paradas==otro.paradas ) {
			result=true;
		}
		return result;
	}

}
