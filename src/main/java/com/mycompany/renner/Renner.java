/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.renner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author gerge
 */
public class Renner {


    public static void main(String[] args) {
      VorgesetzteManager VM = new VorgesetzteManager();
      VM.VorgesetzteUpdate(1,1,3,5,2,7,2);
      VM.VorgesetzteUpdate(2,3,4,2,1,3,1);
      VM.VorgesetzteUpdate(3,2,1,3,4,1,6);
      VM.VorgesetzteUpdate(4,4,5,1,3,2,3);
      
      for (Vorgesetzte v : VM.getVorgesetzteList()) {
            System.out.println(v.getName()+"  "+v.getPosition()+"  "+v.getArbeitsorganisation()+"  "+v.getFachlicheKenntnisse()+"  "
                    +v.getFlexibilitatVeränderungsbereitschaft()+"  "+v.getKonfliktverhalten()+"  "+v.getSelbstreflexion()+"  "+v.getProblemlösefähigkeit());
      }
       List<Vorgesetzte> vorgesetzteList = new ArrayList<>();
       vorgesetzteList = VM.getVorgesetzteList();
        Collections.sort(vorgesetzteList, VorgesetzteComparator.problemlösefähigkeit_COMPARATOR);
      for (Vorgesetzte v : vorgesetzteList) {
            System.out.println(v);
        }
    }
}


