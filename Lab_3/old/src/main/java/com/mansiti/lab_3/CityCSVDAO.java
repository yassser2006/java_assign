package com.mansiti.lab_3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CityCSVDAO {

    public List<City> readFromCSV(String filePath) {
        List<City> Cities = new ArrayList<City>();
        
        File csvFile = new File(filePath);
        List<String> lines = new ArrayList<String>();
        try {
            lines = Files.readAllLines(csvFile.toPath());
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
        City city;
        for (int lineInd = 1; lineInd < lines.size(); lineInd++) {
            String line = lines.get(lineInd);
            String[] row = line.split(",");
            city = createCity(row);

            Cities.add(city);
        }
        return Cities;
    }

    public static City createCity(String[] row) {
        return new City(row[0], row[1], row[10], row[4], row[9], Boolean.parseBoolean(row[8]));
    }
}
