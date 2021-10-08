package com.example.examenjava2021;

public class MedidaC02 {

    //------Atributos--------//
    private long milisegundos;
    private int co2electronica;
    private int co2telematica;
    private int co2aula9;

    //------Constructor----//
    public MedidaC02(long milisegundos, int co2electronica, int co2telematica, int co2aula9) {
        this.milisegundos = milisegundos;
        this.co2electronica = co2electronica;
        this.co2telematica = co2telematica;
        this.co2aula9 = co2aula9;
    }

    //--------Getters & setters-------//
    public long getMilisegundos() {
        return milisegundos;
    }

    public void setMilisegundos(long milisegundos) {
        this.milisegundos = milisegundos;
    }

    public int getCo2electronica() {
        return co2electronica;
    }

    public void setCo2electronica(int co2electronica) {
        this.co2electronica = co2electronica;
    }

    public int getCo2telematica() {
        return co2telematica;
    }

    public void setCo2telematica(int co2telematica) {
        this.co2telematica = co2telematica;
    }

    public int getCo2aula9() {
        return co2aula9;
    }

    public void setCo2aula9(int co2aula9) {
        this.co2aula9 = co2aula9;
    }
}
