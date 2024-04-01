package centroCampista;

public class MediaPunta extends CentroCampista {
	private int asistencias;

	public MediaPunta(String nombre, int dorsal, String equipo, int pasesCompletados, int asistencias) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.asistencias = asistencias;
	}

	public int getAsistencias() {
		return this.asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}

	@Override
	public String toString() {
		return "Media Punta [nombre= " + this.getNombre() + ", dorsal= " + this.getDorsal() + ", equipo= "
				+ this.getEquipo() + ", pases completados= " + this.getPasesCompletados() + ", asistencias= "
				+ this.asistencias + "]";
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}

	@Override
	public boolean equals(Object obj) {
		MediaPunta otro = (MediaPunta) obj;
		boolean result = false;
		if (super.equals(otro) && this.asistencias == otro.asistencias) {
			result = true;
		}
		return result;
	}

}
