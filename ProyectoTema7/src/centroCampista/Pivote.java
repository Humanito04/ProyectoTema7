package centroCampista;

public class Pivote extends CentroCampista {
	private int intercepciones;

	public Pivote(String nombre,int dorsal, String equipo, int pasesCompletados,int intercepciones) {
		super(nombre,dorsal,equipo,pasesCompletados);
		this.intercepciones = intercepciones;
	}

	public int getIntercepciones() {
		return this.intercepciones;
	}
	public void setIntercepciones(int intercepciones) {
		this.intercepciones = intercepciones;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("El nombre de este pivote es "+ this.getNombre() + ", su dorsal es "+ this.getDorsal()
		+ " , su equipo es "+ this.getEquipo()+" y sus pases han sido " + this.getPasesCompletados() + " y su numero de intercepciones es "
		+ this.intercepciones);

	}

	@Override
	public String toString() {
		return "Pivote [nombre " + this.getNombre()+"dorsal "+ this.getDorsal()+" equipo "+ this.getEquipo()+" pases completados "
		+ this.getPasesCompletados() + "intercepciones" + this.intercepciones + "]";
	}

	@Override
	public boolean equals (Object obj) {
		Pivote otro=(Pivote)obj;
		boolean result= false;
		if(super.equals(otro) && this.intercepciones == otro.intercepciones) {
			result=true;
		}
		return result;
	}

}
