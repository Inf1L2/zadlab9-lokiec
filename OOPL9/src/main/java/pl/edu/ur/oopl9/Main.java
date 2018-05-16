/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.main.java.pl.edu.ur.oopl9;
import java.util.*;

/**
 *
 * @author lokyiec
 */

public class Main {
    public static void main(String[] args) {
        int w;
        Scanner s = new Scanner(System.in);
        System.out.println("Wybierz zadanie: [1, 2, 4]");
        w = s.nextInt();

        switch (w) {
            case 1:
                Zad_1.Zad_1();
                break;
            case 2:
                Zad_2.Zad_2();
                break;
            case 4:
                Zad_4.Zad_4();
                break;
            default:
                System.out.println("ERROR 404");
                break;
        }
    }
}
