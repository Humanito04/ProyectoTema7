package equipo;

import jugador.Jugador;

public class Equipo {
private Jugador jugadores[];
	
	public Equipo() {
		this.jugadores = new Jugador[11];
		
	}
	public Jugador[] getJugadores() {
		return jugadores;
	}


	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}


	public void aniadirJugador(Jugador jugador,int posicion ) {
		if(posicion<0||posicion>this.jugadores.length-1) {
			throw new IllegalArgumentException("La posicion indicada no pertenece al array");
	 }
		this.jugadores[posicion]= jugador;
 }


}
