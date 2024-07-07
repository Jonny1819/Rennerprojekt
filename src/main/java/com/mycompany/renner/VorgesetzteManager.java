/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.renner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author gerge
 */
public class VorgesetzteManager {
   public  List<Vorgesetzte> vorgesetzteList = new ArrayList<>();

    public List<Vorgesetzte> getVorgesetzteList() {
        return vorgesetzteList;
    }

    public void setVorgesetzteList(List<Vorgesetzte> vorgesetzteList) {
        this.vorgesetzteList = vorgesetzteList;
    }

    public  VorgesetzteManager() {
            vorgesetzteList = this.vorgesetzteList;

        // Példányosítunk három Vorgesetzte objektumot
        Vorgesetzte vorgesetzte1 = new Vorgesetzte(1,"John Mustermann", "Manager", 0, 0, 0, 0, 0, 0,0);
        Vorgesetzte vorgesetzte2 = new Vorgesetzte(2,"Jane Mustermann", "Director", 0, 0, 0, 0, 0, 0,0);
        Vorgesetzte vorgesetzte3 = new Vorgesetzte(3,"Mike Mustermann", "Supervisor", 0, 0, 0, 0, 0, 0,0);
        Vorgesetzte vorgesetzte4 = new Vorgesetzte(4,"Stefan Mustermann", "IT Manager", 0, 0, 0, 0, 0, 0,0);

        // Hozzáadjuk a példányokat a listához
        vorgesetzteList.add(vorgesetzte1);
        vorgesetzteList.add(vorgesetzte2);
        vorgesetzteList.add(vorgesetzte3);
        vorgesetzteList.add(vorgesetzte4);
       
    }
    
    public void VorgesetzteUpdate(int idToModify, int stat1, int stat2, int stat3, int stat4, int stat5, int stat6){
         
        Vorgesetzte found = null;

        for (Vorgesetzte v : vorgesetzteList) {
            if (v.getID() == idToModify) {
                found = v;
                break;
                
            }
        }

        if (found != null) {
            // Modify the found element's parameters
            
            found.setProblemlösefähigkeit(stat1);
            found.setFlexibilitatVeränderungsbereitschaft(stat2);
            found.setSelbstreflexion(stat3);
            found.setArbeitsorganisation(stat4);
            found.setFachlicheKenntnisse(stat5);
            found.setKonfliktverhalten(stat6);
            found.setCounter(found.getCounter()+1);
        } else {
            System.out.println("Element with ID " + idToModify + " not found.");
        }
    }
    

    
}
