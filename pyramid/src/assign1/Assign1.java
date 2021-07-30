/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign1;

import java.util.List;

/**
 *
 * @author Yasser
 */
public class Assign1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PyramidCSVDAO prin = new PyramidCSVDAO();
        List<Pyramid> pyramids = prin.readPyramidsFromCSV("pyramids.csv");
        int i=0;
        for(Pyramid p:pyramids){
            System.out.println("# "+ i++ + p
            );
        }
        
    }
    
}
