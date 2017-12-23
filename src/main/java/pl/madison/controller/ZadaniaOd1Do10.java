package pl.madison.controller;

import java.util.ArrayList;
import java.util.List;

public class ZadaniaOd1Do10 {

    public int potegiLiczbyNieWiekszeNiz1000(int liczbaUzytkownika) {
        int potegowanie = 1;
        int wynikKoncowy = 0;
        while (1000 > potegowanie) {
            potegowanie = potegowanie * liczbaUzytkownika;
            if (potegowanie < 1000) {
                wynikKoncowy = potegowanie;
            }
        }
        return wynikKoncowy;
    }

    public List<Integer> potegiLiczbyWiekszeOd1000MniejszeOd5000(int liczbaUzytkownika) {
        List<Integer> potegi = new ArrayList<Integer>();

        int potegowanie = 1;
        while (potegowanie < 5000) {
            potegowanie = potegowanie * liczbaUzytkownika;
            if (potegowanie > 1000 && potegowanie <= 5000) {
                potegi.add(potegowanie);
            }
        }
        return potegi;
    }

    public List<Integer> dzielnikiLiczby68() {
        List<Integer> dzielniki = new ArrayList<Integer>();

        for (int i = 1; i <= 68; i++) {
            if (68 % i == 0) {
                dzielniki.add(i);
            }
        }

        return dzielniki;
    }

    public List<Integer> dzielnikiLiczbyUzytkownika(int liczbaUzytkownika) {
        List<Integer> dzielniki = new ArrayList<Integer>();

        for (int i = 1; i <= liczbaUzytkownika; i++) {
            if (liczbaUzytkownika % i == 0) {
                dzielniki.add(i);
            }
        }

        return dzielniki;
    }

    public int mnozeniePrzez10(int liczbaUzytkownika){
        return liczbaUzytkownika*10;
    }

    public void dzielenieDwochLiczb(double liczba1, double liczba2){
        if(liczba2==0){
            System.out.println("You're stupid!");
        }else{
            System.out.println(liczba1/liczba1);
        }
    }

    public void resztaZDzielenia(int liczba1, int liczba2){
        if(liczba2==0){
            System.out.println("no way!");
        }else{
            System.out.println(liczba1%liczba2);
        }
    }

    public void od1do500(){
        int suma = 0;
        for(int i = 1; i<=500; i++){
            suma = suma + i;
        }
    }

    public int wiekszaLubRownaLiczba(int liczba1, int liczba2){
        int wieksza = liczba1;

        if(liczba1>=liczba2){
            wieksza = liczba1;
        }else if (liczba2>=liczba1){
            wieksza = liczba2;
        }

        return wieksza;
    }

    public void najwiekszaLiczba(int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10) {
        int[] tablica = new int[]{a1, a2, a3, a4, a5, a6, a7, a8, a9, a10};

        int najwieksza = 0;
        for (int i = 0; i < tablica.length; i++) {
            if(tablica[i]>najwieksza){
                najwieksza = tablica[i];
            }
        }
    }
}
