/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.util.Comparator;
import static java.util.Comparator.comparingDouble;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toCollection;
import java.util.stream.IntStream;

/**
 *
 * @author Yasser
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CityCSVDAO prin = new CityCSVDAO();
        List<City> cities = prin.readCitiesFromCSV("cities1.csv");
        int i=0;
//        for(City c:cities){
//            System.out.println("# "+ i++ + c);
//        }

        System.out.println(cities.stream().max(Comparator.comparing(City::getPopulation)).toString());
        
        Map<String, City> mostJam = cities.stream()
        .collect(Collectors.toMap(City::getIso3, Function.identity(),
        BinaryOperator.maxBy(Comparator.comparing(City::getPopulation))));
        
        mostJam.forEach((make,car) -> System.out.println(make+" "+car));
        
        Map<String, City> mostExpensives = cities.stream()
        .collect(Collectors.toMap(City::getContinent, Function.identity(),
        BinaryOperator.maxBy(Comparator.comparing(City::getPopulation))));
        
        mostExpensives.forEach((make,car) -> System.out.println(make+" "+car));
        
        System.out.println(cities.stream().max(Comparator.comparing(City::getPopulation)).get().getCapital());
        
        

//        CountryCSVDAO prin = new CountryCSVDAO();
//        List<Country> cities = prin.readCountriesFromCSV("countries.csv");
//        int i=0;
//        for(Country c:cities){
//            System.out.println("# "+ i++ + c);
//        }
//        System.out.println(cities.stream().filter(d ->d.getOfficialName().equals("Egypt")).findFirst().get().getContinent());
    }
    
}
