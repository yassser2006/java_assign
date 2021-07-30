package com.mansiti.lab_3;

public class City implements Comparable<City> {
    private String id, name, continent,  country, population;
    private boolean capital;

    public City(String name, String continent, String id, String country, String population, boolean capital) {
        this.id = id;
        this.name = name;
        this.continent = continent;
        this.country = country;
        this.population = population;
        this.capital = capital;
    }
    
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return this.continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPopulation() {
        return this.population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public boolean isCapital() {
        return this.capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public int compareTo(City c) {
        return this.getPopulation().compareTo(c.getPopulation());
    }
    
    @Override
    public String toString() {
        return  "ID: " + getId() +" | "+
                "Name: "+getName()+" | "+
                "Country: "+getCountry()+" | "+
                "Capital: " +isCapital() +" | "+
                "continent: "+getContinent()+" | "+                
                "Population: "+getPopulation()+" | "; //To change body of generated methods, choose Tools | Templates.
    }
}
