package com.example.examenjava2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CalidadAire {

    //--------------------------------------------//
    // Hora local Gandia Epoch del 7.10.2021 de las 8:00 am a las 17:00 pm
    static long FECHA[]={1633586400000L, 1633590000000L, 1633593600000L, 1633597200000L, 1633600800000L, 1633604400000L, 1633608000000L,1633611600000L, 1633615200000L, 1633618800000L};

    // Mediciones de la concentración de CO2 (calidad del aire en partículas por millón, ppm) en las aulas
    static int LELECTRONICA[] = {500, 650, 700, 850, 875, 600, 550, 650, 850, 600};
    static int LTELEMATICA[] = {450, 500, 675, 875, 850, 700, 750, 880, 700, 600};
    static int AULA9[] = {450, 500, 550, 650, 700, 800, 750, 600, 650, 600};

    public static void  main( String[] args){

        //--------------------------------------------------------------//
        Set<Integer> MedidasTodasLasAulas = new HashSet<>();

        for(int i=0; i<LELECTRONICA.length; i++) {
            MedidasTodasLasAulas.add(LELECTRONICA[i]);
        }

        for(int i=0; i<LTELEMATICA.length; i++) {
            MedidasTodasLasAulas.add(LTELEMATICA[i]);
        }

        for(int i=0; i<AULA9.length; i++) {
            MedidasTodasLasAulas.add(AULA9[i]);
        }

        System.out.println(MedidasTodasLasAulas.toString());

        //----------------------------------------------------------------//


        HashMap<Integer, String> MayorDe800ppm = new HashMap<>();

        int cantidadMedidasElectronica = 0;
        int cantidadMedidasTelematica = 0;
        int cantidadMedidasAula9 = 0;

        for (int i = 0; i < LELECTRONICA.length; i++) {
            if (LELECTRONICA[i] > 800) {
                cantidadMedidasElectronica += 1;
            }
            MayorDe800ppm.put(cantidadMedidasElectronica, "LELECTRONICA");
        }

        for (int i = 0; i < LTELEMATICA.length; i++) {
            if (LTELEMATICA[i]>800){
                cantidadMedidasTelematica += 1;
            }
            MayorDe800ppm.put(cantidadMedidasTelematica,"LTELEMATICA");
        }

        for (int i = 0; i < AULA9.length; i++) {
            if (AULA9[i]>800){
                cantidadMedidasAula9 += 1;
            }
            MayorDe800ppm.put(cantidadMedidasAula9,"AULA9");
        }
            System.out.println("ppm de las aulas que han alcanzado 800ppm" + MayorDe800ppm.toString() );

    }

}