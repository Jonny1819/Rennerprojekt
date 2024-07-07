/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.renner;

import java.util.Comparator;

/**
 *
 * @author gerge
 */
public class VorgesetzteComparator {
    
    public static final Comparator<Vorgesetzte> problemlösefähigkeit_COMPARATOR = Comparator.comparing(Vorgesetzte::getProblemlösefähigkeit);
    public static final Comparator<Vorgesetzte> flexibilitatVeränderungsbereitschaft_COMPARATOR = Comparator.comparing(Vorgesetzte::getFlexibilitatVeränderungsbereitschaft);
    public static final Comparator<Vorgesetzte> selbstreflexion_COMPARATOR = Comparator.comparing(Vorgesetzte::getSelbstreflexion);
    public static final Comparator<Vorgesetzte> arbeitsorganisation_COMPARATOR = Comparator.comparing(Vorgesetzte::getArbeitsorganisation);
    public static final Comparator<Vorgesetzte> fachlicheKenntnisse_COMPARATOR = Comparator.comparing(Vorgesetzte::getFachlicheKenntnisse);
    public static final Comparator<Vorgesetzte> konfliktverhalten_COMPARATOR = Comparator.comparing(Vorgesetzte::getKonfliktverhalten);
    
   

}
