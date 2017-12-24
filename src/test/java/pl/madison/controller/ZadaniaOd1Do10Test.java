package pl.madison.controller;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ZadaniaOd1Do10Test {
    ZadaniaOd1Do10 zadanie = new ZadaniaOd1Do10();

    @Test
    public void potegiLiczbyNieWiekszeNiz1000() throws Exception {
        int zmienna = 5;
        int wynik = zadanie.potegiLiczbyNieWiekszeNiz1000(zmienna);

        Assert.assertEquals(625, wynik, 0);
    }

    @Test
    public void potegiLiczbyWiekszeOd1000MniejszeOd5000() throws Exception {
        List<Integer> wynik = zadanie.potegiLiczbyWiekszeOd1000MniejszeOd5000(5);

        List<Integer> spodziewamSie = new ArrayList<Integer>();
        spodziewamSie.add(3125);

        Assert.assertEquals(spodziewamSie, wynik);
    }

    @Test
    public void dzielnikiLiczby68() throws Exception {
        List<Integer> wynik = zadanie.dzielnikiLiczby68();

        List<Integer> spodziewamSie = new ArrayList<Integer>();
        spodziewamSie.add(1);
        spodziewamSie.add(2);
        spodziewamSie.add(4);
        spodziewamSie.add(17);
        spodziewamSie.add(34);
        spodziewamSie.add(68);

        Assert.assertEquals(spodziewamSie, wynik);
    }

    @Test
    public void dzielnikiLiczbyUzytkownika() throws Exception {
        List<Integer> wynik = zadanie.dzielnikiLiczbyUzytkownika(10);

        List<Integer> spodziewamSie = Arrays.asList(1, 2, 5, 10);

        Assert.assertEquals(spodziewamSie, wynik);
    }

    @Test
    public void mnozeniePrzez10() throws Exception {
        int wynik = zadanie.mnozeniePrzez10(10);
        int spodziewamSie = 100;

        Assert.assertEquals(spodziewamSie, wynik, 0);
    }

    @Test
    public void dzielenieDwochLiczb() throws Exception {
    }

    @Test
    public void resztaZDzielenia() throws Exception {
    }

    @Test
    public void od1do500() throws Exception {
    }

    @Test
    public void wiekszaLubRownaLiczba() throws Exception {
        int wynik = zadanie.wiekszaLubRownaLiczba(7,8);
        int spodziewamSie = 8;

        Assert.assertEquals(spodziewamSie, wynik);
    }

    @Test
    public void najwiekszaLiczba() throws Exception {
        int wynik = zadanie.najwiekszaLiczba(1,6,90,2,5,12,4,-3,89,0);
        int spodziewamSie = 90;

        Assert.assertEquals(spodziewamSie, wynik);
    }

}