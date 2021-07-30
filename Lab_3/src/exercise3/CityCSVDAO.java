/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yasser
 */
public class CityCSVDAO {
    
    private ArrayList<City> lsta;
    private List<Country> countries; 
    public CityCSVDAO() {
        lsta = new ArrayList<City>();
        countries = new CountryCSVDAO().readCountriesFromCSV("countries.csv");
    }
    
    
    public List<City> readCitiesFromCSV(String fileName){
//        List<Pyramid> lsta = new ArrayList<Pyramid>();
        try {
            Scanner scanner = new Scanner(new File(fileName));
            scanner.useDelimiter(",");
            scanner.nextLine();
            while(scanner.hasNextLine()){
                lsta.add(createCity(scanner.nextLine().split(",")));
//                System.out.println(pyr.get_pharaoh()+"|"+pyr.get_modern_name()+"|"+pyr.get_site()+"|"+pyr.get_height()+"|");
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CityCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lsta;
    }
    
    public City createCity(String[] metadata){
        String[] sca= metadata;
        City city = new City();
        city.setCity(sca[0]+"");
        city.setCountry(sca[4]+"");
        city.setIso3(sca[6]+"");
        city.setCapital(sca[8]+"");
        city.setPopulation(Integer.parseInt(sca[9].substring(1, sca[9].length() - 1)));
        city.setId(sca[10]+"");
        
        try {
            city.setContinent(countries.stream().filter(d ->d.getFIFA().equals( sca[6].substring(1, sca[6].length() - 1)+"")).findFirst().get().getContinent());
        
        } catch (Exception e) {
            city.setContinent("AS");
        }
        return city;
    }
    
}
