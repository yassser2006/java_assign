package com.mansiti.lab_1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CountryCSVDAO {

    public List<Country> readFromCSV(String filePath) {
        
        List<Country> Countries = new ArrayList<Country>();
        File csvFile = new File(filePath);
        List<String> lines = new ArrayList<String>();
        try {
            lines = Files.readAllLines(csvFile.toPath());
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
        Country country;
        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] row = line.split(",");
            country = createCountry(row);
            Countries.add(country);
        }
        return Countries;
    }

    public static Country createCountry(String[] row) {
        if ( row.length < 4 ){
            String [] row1=new String [row.length + 1]; 
            row1[0] = row[0];
            row1[1] = row[1];
            row1[2] = row[2];
            row1[3] = "0";
            row = row1;
        }
        try
        {
            Integer.parseInt(row[3]);
        } catch (NumberFormatException ex)
        {
            row[3]="0"; 
        }
        return new Country(row[0], row[1], row[2], Integer.parseInt(row[3]));
    }
}
