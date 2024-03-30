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


}
