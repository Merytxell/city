package fr.fms.person;

public class City {
	
	    public String cityName;

	    public City(String cityName) {
	        this.cityName = cityName;
	    }

	    public String getCityName() {
	        return cityName;
	    }

	    public void setCityName(String cityName) {
	        this.cityName = cityName;
	    }

	    @Override
	    public String toString() {
	        return cityName;
	    }
	}

