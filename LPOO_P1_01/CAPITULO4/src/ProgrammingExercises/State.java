package cap04;

public class State {
	private String stateName;
	private Integer population;
	private City capitalCity;
	private City mostPopCity;
	public State(String stateName, Integer statePopulation, 
			String capitalCity, Integer capCityPopulation,
			String mostPopCity, Integer mostPopCityPopulation) {
		this.stateName = stateName;
		this.population = statePopulation;
		this.capitalCity = new City(capitalCity, capCityPopulation);
		this.mostPopCity = new City(mostPopCity, mostPopCityPopulation);
		
	}
	public String getStateName() {
		return stateName;
	}
	public Integer getPopulation() {
		return population;
	}
	public String getCapitalCityName() {
		return capitalCity.getCityName();
	}
	public Integer getCapCityPopulation() {
		return capitalCity.getCityPopulation();
	}
	public String getMostPopCityName() {
		return mostPopCity.getCityName();
	}
	public Integer getMostPopCityPopulation() {
		return mostPopCity.getCityPopulation();
	}
	
	//create the city class to be a nonstatic, private inner class within the state class
	//the city class contains a city's name and population
	//create a class to assing values to and display values from two state objects. 
	//Save the files as State.java and TestState.java
	private class City{
		private String cityName;
		private Integer cityPopulation;
		public City(String cityName, Integer cityPopulation) {
			this.cityName = cityName;
			this.cityPopulation = cityPopulation;
		}
		/*public void setCityName(String name) {
			cityName = name;
		}*/
		/*public void setCityPopulation(Integer pop) {
			cityPopulation = pop;
		}*/ //Metodos no requeridos por el problema, pero pudieran ser usados.
		public String getCityName() {
			return cityName;
		}
		public Integer getCityPopulation() {
			return cityPopulation;
		}
		
	}
}
