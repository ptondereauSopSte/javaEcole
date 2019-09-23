package com.company;
import com.company.classes.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Création du magasin
	    Magasin monoprix = new Magasin("Monoprix Marseille République", "3 rue de la République", 3, 600);
	    monoprix.print();

        //Création des articles
	    Habit pull = new Habit("Pull",40);
        Electromenager frigo = new Electromenager("Réfrigérateur",300);
        Primeur pomme = new Primeur("Pomme",1);
        //Article pour majeurs
        Alcool vodka = new Alcool("Vodka",10);
	    pull.print();
        vodka.print();
        frigo.print();
        pomme.print();

        //On fait acheter des articles au magasin
        monoprix.achete(frigo,1);
        monoprix.achete(pomme,5);
        System.out.println(monoprix.getListQuantiteArticles().toString());
        monoprix.achete(frigo,1);

        //On va lancer une solde sur les pommes

        //System.out.println(monoprix.getListTauxArticles().toString());
        monoprix.lancerSoldes(frigo,20);
        //System.out.println(monoprix.getListTauxArticles().toString());
    }
}
