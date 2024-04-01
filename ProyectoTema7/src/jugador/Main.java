package jugador;

import centroCampista.CentroCampista;
import centroCampista.MediaPunta;
import centroCampista.Pivote;
import defensa.Central;
import defensa.Defensa;
import defensa.Lateral;
import delantero.Delantero;
import delantero.DelanteroCentro;
import delantero.Extremo;
import equipo.Equipo;
import portero.Portero;

public class Main {

	public static void main(String[] args) {
		Equipo equipo1 = new Equipo();

		CentroCampista c1 = new CentroCampista("Pepa", 1, "Getafe", 4);
		MediaPunta m1 = new MediaPunta("María", 5, "Sevilla", 6, 8);
		Pivote p1 = new Pivote("Fran", 3, "Betis", 8, 9);
		Central central1 = new Central("Vladi", 5, "Betis", 7, 4);
		Defensa d1 = new Defensa("Pablo Morales", 6, "Madrid", 0);
		Lateral l1 = new Lateral("Ángel", 7, "rt", 5, "IZQUIERDA");
		Delantero delantero1 = new Delantero("Javi", 7, "Manchester City", 6);
		DelanteroCentro dCentro1 = new DelanteroCentro("Iván", 46, "Liverpool", 3, 9);
		Extremo eIzq1 = new Extremo("Raul", 75, "Atlético de Bilbao", 6, "IZQUIERDA");
		Portero prtero1 = new Portero("David", 5, "Albacete", 6);
		Extremo eDer1 = new Extremo("Víctor", 3, "El Futuro", 6, "DERECHA");

		equipo1.aniadirJugador(c1, 0);
		equipo1.aniadirJugador(m1, 1);
		equipo1.aniadirJugador(p1, 2);
		equipo1.aniadirJugador(central1, 3);
		equipo1.aniadirJugador(d1, 4);
		equipo1.aniadirJugador(delantero1, 5);
		equipo1.aniadirJugador(dCentro1, 6);
		equipo1.aniadirJugador(eIzq1, 7);
		equipo1.aniadirJugador(prtero1, 8);
		equipo1.aniadirJugador(eDer1, 9);
		equipo1.aniadirJugador(l1, 10);

		c1.mostrarDatos();
		System.out.println();
		equipo1.mostrarAlineacion();

		CentroCampista c1 = new CentroCampista("Pepa", 1, "Getafe", 4);
		MediaPunta m1 = new MediaPunta("María", 5, "Sevilla", 6, 8);
		Pivote p1 = new Pivote("Fran", 3, "Betis", 8, 9);
		Central central1 = new Central("Vladi", 5, "Betis", 7, 4);
		Defensa d1 = new Defensa("Pablo Morales", 6, "Madrid", 0);
		Lateral l1 = new Lateral("Ángel", 7, "rt", 5, "IZQUIERDA");
		Delantero delantero1 = new Delantero("Javi", 7, "Manchester City", 6);
		DelanteroCentro dCentro1 = new DelanteroCentro("Iván", 46, "Liverpool", 3, 9);
		Extremo eIzq1 = new Extremo("Raul", 75, "Atlético de Bilbao", 6, "IZQUIERDA");
		Portero prtero1 = new Portero("David", 5, "Albacete", 6);
		Extremo eDer1 = new Extremo("Víctor", 3, "El Futuro", 6, "DERECHA");


	}

}
