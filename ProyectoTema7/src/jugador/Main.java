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
		 Equipo e1[]= new Equipo [11];

		 CentroCampista c1= new CentroCampista ( "pepa", 1,"sef",  4);
		 MediaPunta m1= new MediaPunta( "nombre", 5,  "rty",  6 , 8);
		 Pivote p1= new Pivote ( "juanito",3, "hgf", 8,9);
		 Central central1= new Central ("vladi", 5, "dght", 7, 4);
		 Defensa d1= new Defensa ("jhg",6, "lkjh", 0);
		 Lateral l1= new Lateral ("yuk", 7, "rt", 5, "xghm");
		 Delantero delantero1= new Delantero  ("jhj",7, "hj", 6);
		 DelanteroCentro dCentro1= new DelanteroCentro ("tyu", 46, "hf", 3, 9);
		 Extremo eIzq1= new Extremo ("fjk", 75, "kh", 6, "izquierdo");
		 Portero prtero1= new Portero ("fyn",5, "Sgh", 6);
		 Extremo eDer1= new Extremo ("dfg", 3, "gnf", 6, "derecho");



	}

}
