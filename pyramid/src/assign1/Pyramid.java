/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign1;

/**
 *
 * @author Yasser
 */
public class Pyramid {
    private String pharaoh, modern_name, site;
    private double height;
    
    public void set_pharaoh(String pharaoh){
        this.pharaoh = pharaoh;
    }
    
    public void set_modern_name(String modern_name){
        this.modern_name = modern_name;
    }
    
    public void set_site(String site){
        this.site = site;
    }
    
    public void set_height(double height){
        this.height = height;
    }
    
    public String get_pharaoh(){
        return pharaoh;
    }
    
    public String get_modern_name(){
        return modern_name;
    }
    
    public String get_site(){
        return site;
    }
    
    public double get_height(){
        return height;
    }

    @Override
    public String toString() {
        return "Pahraoh: "+get_pharaoh()+" | "+
                "Name: "+get_modern_name()+" | "+
                "Site: "+get_site()+" | "+
                "Height: "+get_height()+" | "; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
