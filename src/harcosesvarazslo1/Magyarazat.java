/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harcosesvarazslo1;

/**
 *
 * @author LukácsAlexandra(SZOF
 */
public class Magyarazat {
    public static void main(String[] args) {
        String eredeti = "abc.12x";
        int hossz = eredeti.length();
        boolean pont = eredeti.contains(".");
        System.out.println("Van benne \".\" : " + pont);
        boolean kezd = eredeti.startsWith("abc");
        boolean vege = eredeti.endsWith("2x");
        System.out.println("abc-vel kezdődik: " + kezd);
        System.out.println("2x a vége: " + vege);
        System.out.println("Első: " + eredeti.charAt(0));
        System.out.println("Utolsó: " + eredeti.charAt(hossz-1));
        String resz_string = eredeti.substring(1);
        System.out.println("Szöveg rész: " + resz_string);
        
        String uj = eredeti.substring(1);
        uj = eredeti.substring(0);
        System.out.println(uj);
        uj = eredeti.substring(1);
        System.out.println(uj);
        uj = eredeti.substring(4);
        System.out.println(uj);
        uj = eredeti.substring(0, 3);
        System.out.println(uj);
        uj = eredeti.substring(4, 6);
        System.out.println(uj);
        uj = eredeti.substring(0, 0);
        System.out.println(uj);
        //uj = eredeti.substring(3, 0);
        //System.out.println(uj);
        
        uj = eredeti.substring(4, 6);
        System.out.println(uj + (+ 2));
        
        uj = eredeti.replace("12x", "hu");
        System.out.println(uj);
    }
}
