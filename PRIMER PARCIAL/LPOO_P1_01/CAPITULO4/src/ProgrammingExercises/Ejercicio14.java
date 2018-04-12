package cap04;

public class Ejercicio14 {
	public static void main(String[] args) {
		State oaxaca = new State("Oaxaca", 3800000, "Oaxaca de Juarez", 255029, "Oaxaca de Juarez2.0", 299999);
		State dfctuoso = new State("CDMX", 8800000, "Tepito", 1600000, "Netzahualcoyotl", 1827868);
		System.out.println("\tEstado 1:");
		System.out.println("Nombre del estado: "+oaxaca.getStateName());
		System.out.println("Poblacion del estado: "+oaxaca.getPopulation());
		System.out.println("Nombre de su ciudad capital: "+oaxaca.getCapitalCityName());
		System.out.println("Poblacion de su ciudad capital: "+oaxaca.getCapCityPopulation());
		System.out.println("Nombre de su ciudad mas poblada: "+oaxaca.getMostPopCityName());
		System.out.println("Poblacion de su ciudad mas poblada: "+oaxaca.getMostPopCityPopulation());
		System.out.println("\n\tEstado 2:");
		System.out.println("Nombre del estado: "+dfctuoso.getStateName());
		System.out.println("Poblacion del estado: "+dfctuoso.getPopulation());
		System.out.println("Nombre de su ciudad capital: "+dfctuoso.getCapitalCityName());
		System.out.println("Poblacion de su ciudad capital: "+dfctuoso.getCapCityPopulation());
		System.out.println("Nombre de su ciudad m�s poblada: "+dfctuoso.getMostPopCityName());
		System.out.println("Poblacion de su ciudad m�s poblada: "+dfctuoso.getMostPopCityPopulation());
	}
}
