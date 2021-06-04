/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign1;

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
public class PyramidCSVDAO {
    private List<Pyramid> lsta;
    public PyramidCSVDAO() {
        lsta = new ArrayList<Pyramid>();
    }
    
    
    public List<Pyramid> readPyramidsFromCSV(String fileName){
//        List<Pyramid> lsta = new ArrayList<Pyramid>();
        try {
            Scanner scanner = new Scanner(new File(fileName));
            scanner.useDelimiter(",");
            scanner.nextLine();
            while(scanner.hasNextLine()){
                lsta.add(createPyramid(scanner.nextLine().split(",")));
//                System.out.println(pyr.get_pharaoh()+"|"+pyr.get_modern_name()+"|"+pyr.get_site()+"|"+pyr.get_height()+"|");
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PyramidCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lsta;
    }
    
    public Pyramid createPyramid(String[] metadata){
        String[] sca= metadata;
        Pyramid pyr = new Pyramid();
        pyr.set_pharaoh(sca[0]+"");
        pyr.set_modern_name(sca[2]+"");
        pyr.set_site(sca[4]+"");
        if(sca[7].isEmpty()){
            pyr.set_height(Double.parseDouble("0.0"));
        }else{
            pyr.set_height(Double.parseDouble( sca[7]));
        }
        return pyr;
    }
    
}
