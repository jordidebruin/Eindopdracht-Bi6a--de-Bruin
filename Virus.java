/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tentamen2018;

import java.util.ArrayList;

/**
 *
 * @author Jordii
 */

/**
 * Het Virus object, met vier attributen.
 */
public class Virus {
  
    private int ID;
    private String soort;
    private ArrayList<Integer> hostList;
    private String classificatie;
    
    Virus (int ID, String soort, ArrayList<Integer> hostList, String classificatie){
        this.ID = ID;
        this.soort = soort;
        this.hostList = hostList;
        this.classificatie = classificatie;
    }

// Getters en setters van de virus attributen.
    
    public void setID(){
        this.ID = ID;
    }
    
    public int getID(){
        return ID;
    }
    
    public void setSoort(){
        this.soort = soort;
    }
    
    public String getSoort(){
        return soort;
    }
    
    public void setHostList(){
        this.hostList = hostList;
    }
    
    public ArrayList<Integer> getHostList(){
        return hostList;
    }
    
    public void setClassificatie(){
        this.classificatie = classificatie;
    }
    
    public String getClassificatie(){
        return classificatie;
    }

// Het object wordt geretourneerd.
    
    @Override
    public String toString(){
        return "ID = " + ID + ", Soort = " + soort + ", HostList = " + hostList + ", Classificatie = " + classificatie;    
    }
}
