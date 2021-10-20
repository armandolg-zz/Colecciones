package com.generation;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        String universidades[];
        Inicializar en una linea
        String universidades[] = new String[];
        universidades[0] = "ITVH";
        universidades[1] = "ULA";
        universidades[2] = "UAM";
        universidades[3] = "UADM";
        universidades[4] = "UNADM";
        universidades[5] = "UPN";
        universidades[6] = "IPN";
        universidades[7] = "TESCO";
        String universidades[] = new String[]{"ITVL","ULA","UAM"};
        for (String universidad : universidades){
            System.out.println(universidad);
        };
         */

        Set<String> frutas = new HashSet(4);
        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melon");
        frutas.add("Lima");
        for(String fruta : frutas){
            System.out.println(fruta);
        }
        System.out.println("---------");

        Set<String> frutas2 = new TreeSet<String>();
        frutas2.add("Mango");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Melon");
        frutas2.add("Lima");

        for(String fruta : frutas2){
            System.out.println(fruta);
        }

        System.out.println("--------");
        Set<String> frutas3 = new LinkedHashSet<>(4);
        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Melon");
        frutas3.add("Lima");

        for(String fruta : frutas3){
            System.out.println(fruta);
        }

        /*
        System.out.println("------------------------------");
        System.out.println("Javier Serrano");

        final Set hashSet = new HashSet(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

        final Set treeSet = new TreeSet();
        final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

        final Set linkedHashSet = new LinkedHashSet(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
*/

        System.out.println("--------------");
        List<String> frutas4 = new ArrayList<>();
        frutas4.add("Mango");
        frutas4.add("Fresa");
        frutas4.add("Pera");
        frutas4.add("Uva");
        frutas4.add("Melon");
        frutas4.add("Lima");
        frutas4.add("mango");

        for(String fruta : frutas4){
            System.out.println(fruta);
        }

        System.out.println("Elementos array");
        System.out.println(frutas4.get(3));
        int indice = frutas4.indexOf("Melon");

        System.out.println(frutas4.get(indice));
        System.out.println("----------Array List-------------");

        List<String> frutas5 = new LinkedList<>();
        frutas5.add("Mango");
        frutas5.add("Fresa");
        frutas5.add("Pera");
        frutas5.add("Uva");
        frutas5.add("Melon");
        frutas5.add("Lima");
        frutas5.add("mango");

        for(String fruta : frutas4){
            System.out.println(fruta);
        }

        System.out.println("----------Array MAP-------------");
        Map<Integer, String> universidades = new HashMap<Integer, String>();
        universidades.put(1, "IPN");
        universidades.put(2, "UNAM");
        universidades.put(3, "UAEM");
        universidades.put(4, "EAM");
        universidades.put(5, "TESCO");
        System.out.println(universidades.get(3));
        for (Map.Entry universidad: universidades.entrySet()
        ) {
            System.out.println("Clave=" + universidad.getKey()
                    + ",valor= " + universidad.getValue());
        }
    }
}