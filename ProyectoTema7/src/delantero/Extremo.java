package delantero;

public class Extremo extends Delantero {
	// Atributo
		Puesto puesto;

		// Constructor
		public Extremo(String nombre, int dorsal, String equipo, int goles, String puesto) {
			super(nombre, dorsal, equipo, goles);
			setPuesto(puesto);
		}

		// Getters y Setters
		public void setPuesto(String puesto) {
			this.puesto = Puesto.valueOf(puesto);
		}

		public String getPuesto() {
			return this.puesto.toString();
		}

}
