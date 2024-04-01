package delantero;

public class DelanteroCentro extends Delantero {
	// Atributo
	int golesDePenalti;

	// Constructor
	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int goolesDePenalti) {
		super(nombre, dorsal, equipo, goles);
		this.golesDePenalti = goolesDePenalti;
	}

	// Getters y Setters
	public void setPuesto(int goolesDePenalti) {
		this.golesDePenalti = goolesDePenalti;
	}

	public int getPuesto() {
		return this.golesDePenalti;
	}

	// metodos
	@Override
	public boolean equals(Object obj) {
		DelanteroCentro otro = (DelanteroCentro) obj;
		boolean result = false;
		if (super.equals(otro) && this.golesDePenalti == otro.golesDePenalti) {
			result = true;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Delantero [nombre " + this.getNombre() + "dorsal " + this.getDorsal() + " equipo " + this.getEquipo()
				+ " goles " + this.getGoles() + "puesto" + " Goles de penalti" + this.golesDePenalti + "]";
	}

}
