package centroCampista;

import jugador.Jugador;

public class CentroCampista extends Jugador {
	private int pasesCompletados;

	public CentroCampista (String nombre,int dorsal, String equipo, int pasesCompletados) {
		super(nombre,dorsal,equipo);
		this.pasesCompletados = pasesCompletados;
	}

	public int getPasesCompletados() {
		return this.pasesCompletados;
	}

	public void setPasesCompletados(int pasesCompletados) {
		this.pasesCompletados = pasesCompletados;
	}
	
	
	@Override
	public void mostrarDatos() {
		System.out.println("El nombre de este centro campita es "+ this.getNombre() + ", su dorsal es "+ this.getDorsal()
		+ " , su equipo es "+ this.getEquipo()+" y sus pases han sido " + this.pasesCompletados);

	}

	@Override
	public String toString() {
		return "Centro Campista [nombre= " + this.getNombre()+", dorsal= "+ this.getDorsal()+", equipo= "+ this.getEquipo()+", pases completados= "
		+ this.pasesCompletados + "]";
	}
	@Override
	public boolean equals (Object obj) {
		CentroCampista otro=(CentroCampista)obj;
		boolean result=false;
		if(super.equals(otro)&&this.pasesCompletados==otro.pasesCompletados) {
			result=true;
		}
		return result;
	}

}
