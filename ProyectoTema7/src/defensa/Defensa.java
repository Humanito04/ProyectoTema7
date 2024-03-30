package defensa;

import jugador.Jugador;

public class Defensa extends Jugador {
	private int disputasRealizadas;

	public Defensa (String nombre,int dorsal, String equipo, int disputasRealizadas) {
		super(nombre,dorsal,equipo);
		this.disputasRealizadas=disputasRealizadas;
	}

	public int getDisputasRealizadas() {
		return this.disputasRealizadas;
	}

	public void setDisputasRealizadas(int disputasRealizadas) {
		this.disputasRealizadas = disputasRealizadas;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("El nombre de este defensa es "+ this.getNombre() + ", su dorsal es "+ this.getDorsal()
		+ " , su equipo es "+ this.getEquipo()+" y sus disputas han sido " + this.disputasRealizadas);

	}

	@Override
	public String toString() {
		return "Delantero [nombre " + this.getNombre()+"dorsal "+ this.getDorsal()+" equipo "+ this.getEquipo()+" disputas "
		+ this.disputasRealizadas + "]";
	}
	@Override
	public boolean equals (Object obj) {
		Defensa otro=(Defensa)obj;
		boolean result=false;
		if(super.equals(otro)&&this.disputasRealizadas==otro.disputasRealizadas) {
			result=true;
		}
		return result;
	}

}
