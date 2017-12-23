package pl.madison;

import pl.madison.controller.ZadaniaOd1Do10;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc = new Scanner(System.in);
        ZadaniaOd1Do10 zadanie = new ZadaniaOd1Do10();
        System.out.println("Podaj zmienna");
        int zmienna = sc.nextInt();
//        zadanie.potegiLiczbyWiekszeOd1000MniejszeOd5000(zmienna);
        System.out.println(zadanie.dzielnikiLiczbyUzytkownika(zmienna));


    }
}
