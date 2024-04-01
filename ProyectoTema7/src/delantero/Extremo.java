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
		
		//Metodos
		@Override
		public boolean equals (Object obj) {
			Extremo otro=(Extremo)obj;
			boolean result=false;
			if(super.equals(otro)&&this.getPuesto()==otro.getPuesto()) {
				result=true;
			}
			return result;
		}
		
		@Override
		public String toString() {
			return "Delantero [nombre= " + this.getNombre() + ", dorsal= " + this.getDorsal() + ", equipo= "
					+ this.getEquipo() + ", goles= " + this.getGoles() + ", puesto= " + this.getPuesto() + "]";
		}

}
