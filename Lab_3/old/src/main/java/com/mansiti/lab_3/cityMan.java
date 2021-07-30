/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mansiti.lab_3;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 *
 * @author Yasser
 */
public class cityMan {
    
    public static void main(String[] args) {
        CityCSVDAO cityDAO = new CityCSVDAO();
        List<City> cities = cityDAO.readFromCSV("cities.csv");
        
        System.out.println("Highest Population Country:" + cities.stream().max(Comparator.comparing(City::getPopulation)).toString());

    }
    
//    public Map<String,Object> highestPopulationCountry(List<City> cities) {
//        
//        return cities.stream().collect(Collectors.groupingBy(City::getCountry,(Comparator Collectors.maxBy(City::getPopulation)));
//    }
//
//    public Map<String,Object> highestPopulationContinent(List<City> cities) {
//        
//        return cities.stream().collect(Collectors.groupingBy(City::getContinent,(Comparator Collectors.maxBy(City::getPopulation)));
//    }
//
//    public Map<String,Object> highestPopulationCapital(List<City> cities) {
//        
//        return cities.stream().collect(Collectors.groupingBy(City::isCapital,(Comparator Collectors.maxBy(City::getPopulation)));
//    }

}
