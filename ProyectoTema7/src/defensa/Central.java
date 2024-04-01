package defensa;

public class Central extends Defensa {
    private int entradas;

    public Central(String nombre, int dorsal, String equipo, int disputasRealizadas, int entradas) {
        super(nombre, dorsal, equipo, disputasRealizadas);
        this.entradas = entradas;
    }

    public int getEntradas() {
        return this.entradas;
    }

    public void setEntradas(int entradas) {
       this.entradas = entradas;
       }

    @Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}

    @Override
	public String toString() {
		return "Central [nombre= " +this.getNombre() +
				", dorsal= " + this.getDorsal() +
				", equipo= " + this.getEquipo() +
				", disputasRealizadas= " + this.getDisputasRealizadas() +
				", entradas= " + this.entradas + "]";
	}
    
    @Override
	public boolean equals (Object obj) {
		Central otro = (Central) obj;
		boolean result = false;
		if(super.equals(otro) && this.entradas == otro.entradas) {
			result = true;
		}
		return result;
	}

}
