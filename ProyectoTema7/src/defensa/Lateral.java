package defensa;

public class Lateral extends Defensa {
	  private String puesto;

	    public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, String puesto) {
	        super(nombre, dorsal, equipo, disputasRealizadas);
	        this.puesto = puesto;
	    }

	    public String getPuesto() {
	        return puesto;
	    }

	    public void setPuesto(String puesto) {
	        this.puesto = puesto;
	        
	    }


}
