//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        System.out.println(" Bienvenidos a la aventura de la  gran araña viajera!");
        System.out.println(" ¿cual es tu nombre?");
        String nombre = entrada.nextLine();
        System.out.println(" bienvenid@ " + nombre);
        System.out.println(" tu aventura comienza");
        System.out.println(" buena suerte " + nombre);
        int recorrido = 0;
        boolean sobrevivio = true;
        int recorrido2 =recorrido +3;
        int recorrido3 = recorrido2 +2;
        System.out.println(nombre + " abre sus ocho ojos en un pliege de la cortina a la altura del techo ");
        System.out.println(nombre + " mira hacia los lados pensando que hacer");
        System.out.println(" que deberia hacer " + nombre + " escoje una de ellas");
        //decision1//
        System.out.println(" 1.  se mueve hacia la derecha " + recorrido + "metros");
        System.out.println(" 2.  se descuelga por la cortina hasta el suelo");
        System.out.println(" 3.  no hace nada");



        int decision1 = entrada.nextInt();
        System.out.println( "1  " + nombre + "sigue avanzando");
        System.out.println( "2  " + nombre + "baja hasta el suelo");
        System.out.println( " 3 " + nombre + "sigue avanzando");
        if (decision1 == 1) {
            recorrido += 4;
            System.out.println( " \n"+ nombre + "sigue avanzando");
        } else if (decision1 == 2) {
            recorrido += 2;
            System.out.println( " \n" + nombre + "baja hasta el suelo");
        } else {
            recorrido += 0;
            System.out.println( "\n" + nombre + "vaguea y no hace nada");



        }



        //decision 2//
        System.out.println(" que debe hacer ahora, escoje una ");
        System.out.println(" 1. llega hacia el proyector");
        System.out.println(" 2. se mete en la mochila de un alumno");
        System.out.println(" 3. salta a la mesa de un alumno");

        int decision2 = entrada.nextInt();

        if (decision2 == 1) {
            recorrido2 +=2;
            System.out.println( "\n"+ nombre + "llega hacia el proyector");
        } else if (decision2 == 2) {
            recorrido2 +=3;
            System.out.println( "\n" + nombre + "se mete en la mochila de un alumno");
        }
        else
            recorrido2 +=4;
        System.out.println( "\n" + nombre + "salta a la mesa de un alumno");
        System.out.println ("elije una de las 3");


        //decision3//
        System.out.println( " 1. tapa el pryector,e" + "l profesor la ve y la tira por la ventana");
        System.out.println( " 2. la ve y la mata");
        System.out.println( " 3. se mete dentro, el alumno no la ve y se la lleva ");

        int decision3 = entrada.nextInt();

        if (decision3 == 1) {
            recorrido3 +=1;
            System.out.println(nombre + " 1.tapa el pryector,el profesor la ve y la tira por la ventana");
            sobrevivio = true;
        } else if (decision2 == 4) {
            System.out.println(nombre + " 2. la ve y la mata");
            recorrido3 += 1;
            System.out.println(nombre + " 3. se mete dentro, el alumno no la ve y se la lleva ");
            sobrevivio = true;

        } else {
            recorrido3 += 1;
            System.out.println(nombre + "el alumno la ve y la mata");
            sobrevivio = false;
            System.out.println(nombre + "elije 1,2 o 3");
            int kills=5;
            int recorridototal = (recorrido+recorrido2+recorrido3);

            System.out.println("\n--- ESTADÍSTICAS ---");
            System.out.println("Nombre de la araña: " + nombre);
            System.out.println("Distancia recorrida: " + recorridototal + " metros");
            System.out.println("Mosquitos cazados: " + kills);
            System.out.println("¿Sobrevivió?: " + (sobrevivio ? "Sí" : "No"));


        }



    }
}

