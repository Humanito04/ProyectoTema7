package defensa;

public class Lateral extends Defensa {
	private Puesto puesto;

	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, String puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		setPuesto(puesto);
	}

	public String getPuesto() {
		return puesto.toString();
	}


	public void setPuesto(String puesto) {
		this.puesto = Puesto.valueOf(puesto);
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Lateral [nombre= " + this.getNombre() + ", dorsal= " + this.getDorsal() + ", equipo= "
				+ this.getEquipo() + ", disputas realizadas= " + this.getDisputasRealizadas() + ", puesto= "
				+ this.puesto + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Lateral otro = (Lateral) obj;
		boolean result = false;
		if (super.equals(otro) && this.puesto == otro.puesto) {
			result = true;
		}
		return result;
	}

}
