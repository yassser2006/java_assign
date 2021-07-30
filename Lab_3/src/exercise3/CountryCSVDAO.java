/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yasser
 */
public class CountryCSVDAO {
    
    private ArrayList<Country> lsta;
    public CountryCSVDAO() {
        lsta = new ArrayList<Country>();
    }
    
    
    public List<Country> readCountriesFromCSV(String fileName){
//        List<Pyramid> lsta = new ArrayList<Pyramid>();
        try {
            Scanner scanner = new Scanner(new File(fileName));
            scanner.useDelimiter(",");
            scanner.nextLine();
            while(scanner.hasNextLine()){
                lsta.add(createCountry(scanner.nextLine().split(",")));
//                System.out.println(pyr.get_pharaoh()+"|"+pyr.get_modern_name()+"|"+pyr.get_site()+"|"+pyr.get_height()+"|");
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CityCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lsta;
    }
   
    
    public Country createCountry(String[] metadata){
        String[] sca= metadata;
        Country country = new Country();
        country.setFIFA(sca[0]+"");
        country.setOfficialName(sca[1]+"");
        country.setContinent(sca[2]+"");
        return country;
    }
    
    
    
}
