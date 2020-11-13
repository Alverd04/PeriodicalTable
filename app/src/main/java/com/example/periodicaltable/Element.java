package com.example.periodicaltable;

public class Element {

    private String simbol;
    private int numero;
    private String nom;
    private String massa_atomica;
    private String estat;
    private String configuracio;
    private String seriequimica;

    public Element(String simbol, int numero, String seriequimica, String nom, String massa_atomica, String configuracio, String estat) {
        this.simbol = simbol;
        this.numero = numero;
        this.nom = nom;
        this.massa_atomica = massa_atomica;
        this.estat = estat;
        this.configuracio = configuracio;
        this.seriequimica = seriequimica;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMassa_atomica() {
        return massa_atomica;
    }

    public String getConfiguracio() {
        return configuracio;
    }

    public void setConfiguracio(String configuracio) {
        this.configuracio = configuracio;
    }

    public String getSeriequimica() {
        return seriequimica;
    }

    public void setSeriequimica(String seriequimica) {
        this.seriequimica = seriequimica;
    }

    public void setMassa_atomica(String massa_atomica) {
        this.massa_atomica = massa_atomica;
    }
}
