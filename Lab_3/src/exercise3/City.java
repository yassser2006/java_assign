/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Yasser
 */
public class City {
    private String city, country, id, iso3, continent, capital;
    private int population;

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public String getIso3() {
        return iso3;
    }
    
    

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }
    
    
    
    @Override
    public String toString() {
        return  "ID: " + getId() +" | "+
                "City: " + getCity()+" | "+
                "Country: "+getCountry()+" | "+
                "Capital: " +getCapital() +" | "+
                "continent: "+getContinent()+" | "+                
                "Population: "+getPopulation()+" | "; //To change body of generated methods, choose Tools | Templates.
    }
    
           
}
