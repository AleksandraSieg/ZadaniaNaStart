package pl.madison.controller;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
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

        List<Integer> spodziewamSie =new ArrayList<Integer>();
        spodziewamSie.add(3125);

        Assert.assertEquals(spodziewamSie, wynik);
    }

    @Test
    public void dzielnikiLiczby68() throws Exception {
    }

    @Test
    public void dzielnikiLiczbyUzytkownika() throws Exception {
    }

    @Test
    public void mnozeniePrzez10() throws Exception {
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
    }

    @Test
    public void najwiekszaLiczba() throws Exception {
    }

}