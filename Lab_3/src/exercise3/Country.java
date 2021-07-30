/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Yasser
 */
public class Country {
    String FIFA,officialName,continent;

    public void setFIFA(String FIFA) {
        this.FIFA = FIFA;
    }

    public String getFIFA() {
        return FIFA;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }
    
    @Override
    public String toString() {
        return "FIFA: "+getFIFA()+" | "+
                "Country: "+getOfficialName()+" | "+
                "continent: "+getContinent()+" | "; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
