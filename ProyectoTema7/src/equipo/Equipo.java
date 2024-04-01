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
		if(posicion<0||posicion>this.jugadores.length) {
			throw new IllegalArgumentException("La posicion indicada no pertenece al array");
	 }
		this.jugadores[posicion]= jugador;
 }
	public void mostrarAlineacion() {
	    for (int i = 0; i < jugadores.length; i++) {
	        if (jugadores[i] == null) {
	            throw new IllegalArgumentException("Posición " + i + " no cubierta");
	        }
	    }
	   
	    
	    System.out.println("Equipo [ "+  
		this.jugadores[0].toString()+
		this.jugadores[1].toString()+
		this.jugadores[2].toString()+
		this.jugadores[3].toString()+
		this.jugadores[4].toString()+
		this.jugadores[5].toString()+
		this.jugadores[6].toString()+
		this.jugadores[7].toString()+
		this.jugadores[8].toString()+
		this.jugadores[9].toString()+
		this.jugadores[10].toString() + 
		" ]"); ;
	}

}
