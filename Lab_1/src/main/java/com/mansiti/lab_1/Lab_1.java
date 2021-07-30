package com.mansiti.lab_1;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author YasserIbrahim
 */
public class Lab_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CountryCSVDAO countryDAO = new CountryCSVDAO();
        List<Country> countries = countryDAO.readFromCSV("countries.csv");
        CityCSVDAO cityDAO = new CityCSVDAO();
        List<City> cities = cityDAO.readFromCSV("cities.csv");
        Map<String, City> countryCity = new HashMap<>();
        Collections.sort(cities, Collections.reverseOrder());
        for (Country country : countries) {
            for (City city : cities) {
                if (city.getCountry() == country.getName())
                    countryCity.put(country.getId(), city);
            }
        }

     
      
       
    }
    
}
