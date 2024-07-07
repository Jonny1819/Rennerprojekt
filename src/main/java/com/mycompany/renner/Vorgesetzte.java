/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.renner;

/**
 *
 * @author gerge
 */
class Vorgesetzte {
    private final String name;

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
    private final String position;

    public int getID() {
        return ID;
    }



    public int getProblemlösefähigkeit() {
        return problemlösefähigkeit;
    }

    public void setProblemlösefähigkeit(int problemlösefähigkeit) {
        this.problemlösefähigkeit = problemlösefähigkeit;
    }

    public int getFlexibilitatVeränderungsbereitschaft() {
        return flexibilitatVeränderungsbereitschaft;
    }

    public void setFlexibilitatVeränderungsbereitschaft(int flexibilitatVeränderungsbereitschaft) {
        this.flexibilitatVeränderungsbereitschaft = flexibilitatVeränderungsbereitschaft;
    }

    public int getSelbstreflexion() {
        return selbstreflexion;
    }

    public void setSelbstreflexion(int selbstreflexion) {
        this.selbstreflexion = selbstreflexion;
    }

    public int getArbeitsorganisation() {
        return arbeitsorganisation;
    }

    public void setArbeitsorganisation(int arbeitsorganisation) {
        this.arbeitsorganisation = arbeitsorganisation;
    }

    public int getFachlicheKenntnisse() {
        return fachlicheKenntnisse;
    }

    public void setFachlicheKenntnisse(int fachlicheKenntnisse) {
        this.fachlicheKenntnisse = fachlicheKenntnisse;
    }

    public int getKonfliktverhalten() {
        return konfliktverhalten;
    }

    public void setKonfliktverhalten(int konfliktverhalten) {
        this.konfliktverhalten = konfliktverhalten;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    int ID;
    private int problemlösefähigkeit;
    private int flexibilitatVeränderungsbereitschaft;
    private int selbstreflexion;
    private int arbeitsorganisation;
    private int fachlicheKenntnisse;
    private int konfliktverhalten;
    
    
    private int counter;



    

    public Vorgesetzte(int ID,String name, String position,int  problemlösefähigkeit, int flexibilitatVeränderungsbereitschaft, int selbstreflexion, int arbeitsorganisation, int fachlicheKenntnisse, int konfliktverhalten, int counter) {
        this.ID=ID;
        this.counter=counter;
        this.name = name;
        this.position = position;
        this.problemlösefähigkeit = problemlösefähigkeit;
        this.flexibilitatVeränderungsbereitschaft = flexibilitatVeränderungsbereitschaft;
        this.selbstreflexion = selbstreflexion;
        this.arbeitsorganisation = arbeitsorganisation;
        this.fachlicheKenntnisse = fachlicheKenntnisse;
        this.konfliktverhalten = konfliktverhalten;
    }

     @Override
    public String toString() {
        return "Vorgesetzte{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", problemlösefähigkeit=" + problemlösefähigkeit +
                ", flexibilitatVeränderungsbereitschaft=" + flexibilitatVeränderungsbereitschaft +
                ", selbstreflexion=" + selbstreflexion +
                ", arbeitsorganisation=" + arbeitsorganisation +
                ", fachlicheKenntnisse=" + fachlicheKenntnisse +
                ", konfliktverhalten=" + konfliktverhalten +
                '}';
    }
}