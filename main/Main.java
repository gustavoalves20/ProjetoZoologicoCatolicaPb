package main;

import model.*;

public class Main {
    public static void main(String[] args) {

        Ambiente ambiente = new Ambiente(3);



        Baleia baleia1 = new Baleia("Mar","Baleia Rosa","Baleia Orca","Macho");
        Papagaio papagaio1 = new Papagaio("Ceu","Kleiton","Louro","Macho");
        Galinha galinha1 = new Galinha("Chiqueiro","Galinha","Marans","Macho");

        ambiente.setListaAnimais(1,"Tanque",baleia1);
        ambiente.setListaAnimais(2,"Aviario",papagaio1);
        ambiente.setListaAnimais(0,"Toca do lobo",galinha1);


        Zoologico oZoologico = new Zoologico("Sousa Zoologico",ambiente);


        System.out.println("\n" + oZoologico.getAmbiente());
    }


}