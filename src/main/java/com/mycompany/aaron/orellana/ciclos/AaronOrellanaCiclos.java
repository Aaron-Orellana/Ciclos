package com.mycompany.aaron.orellana.ciclos;

import java.util.Scanner;

public class AaronOrellanaCiclos {

    public static void main(String[] args) {
        int bandera = 0;
        Scanner leer = new Scanner(System.in);
        Ciclos C = new Ciclos();
        while (bandera == 0) {
            System.out.println("1- Calcular medida en centimetros");
            System.out.println("2- Imprimir del 1 al 10");
            System.out.println("3- Sumar numeros del 1 al 10");
            System.out.println("4- Par o Impar");
            System.out.println("5- Promedio de 30 numeros");
            System.out.println("6- Numeros Pares del 1 al 20");
            System.out.println("7- Sumar numeros impares del 1 al 400");
            System.out.println("8- Area de un circulo");
            System.out.println("9- Perimetro de un circulo");
            System.out.println("10- Area del rectangulo");
            System.out.println("11- Volumen de una esfera");
            System.out.println("12- Calcule Area y Perimetro Cubo");
            System.out.println("13- Imprimir numeros del 1 al 100, saltando multiplos de 3");
            System.out.println("14- Imprimir numeros del 1 al 100, saltando multiplos de 5");
            System.out.println("15- Imprimir numeros del 1 al 100, saltando multiplos de 3 y 5");
            System.out.println("16- Imprimir numeros del 1 al 100, reemplazando los multiplos de 3 por Cuek");
            System.out.println("17- Calcular factorial");
            System.out.println("18- Contar digitos de un numero");
            System.out.println("19- Calcular Area y Perimetro de un cuadrado");
            System.out.println("20- Calcular Potencia de un numero");
            System.out.println("0- Salir");
            System.out.print("Ingrese su opcion: ");
            int op = leer.nextInt();
            switch (op) {
                case 0:
                    System.out.println("------------------");
                    System.out.println("Adios");
                    bandera = 1;
                    break;
                case 1:
                    System.out.println("------------------");
                    C.Ciclo1();
                    System.out.println("------------------");
                    break;
                case 2:
                    System.out.println("------------------");
                    C.Ciclo2();
                    System.out.println("------------------");
                    break;
                case 3:
                    System.out.println("------------------");
                    C.Ciclo3();
                    System.out.println("------------------");
                    break;
                case 4:
                    System.out.println("------------------");
                    C.Ciclo4();
                    System.out.println("------------------");
                    break;
                case 5:
                    System.out.println("------------------");
                    C.Ciclo5();
                    System.out.println("------------------");
                    break;
                case 6:
                    System.out.println("------------------");
                    C.Ciclo6();
                    System.out.println("------------------");
                    break;
                case 7:
                    System.out.println("------------------");
                    C.Ciclo7();
                    System.out.println("------------------");
                    break;
                case 8:
                    System.out.println("------------------");
                    C.Ciclo8();
                    System.out.println("------------------");
                    break;
                case 9:
                    System.out.println("------------------");
                    C.Ciclo9();
                    System.out.println("------------------");
                    break;
                case 10:
                    System.out.println("------------------");
                    C.Ciclo10();
                    System.out.println("------------------");
                    break;
                case 11:
                    System.out.println("------------------");
                    C.Ciclo11();
                    System.out.println("------------------");
                    break;
                case 12:
                    System.out.println("------------------");
                    C.Ciclo12();
                    System.out.println("------------------");
                    break;
                case 13:
                    System.out.println("------------------");
                    C.Ciclo13();
                    System.out.println("------------------");
                    break;
                case 14:
                    System.out.println("------------------");
                    C.Ciclo14();
                    System.out.println("------------------");
                    break;
                case 15:
                    System.out.println("------------------");
                    C.Ciclo15();
                    System.out.println("------------------");
                    break;
                case 16:
                    System.out.println("------------------");
                    C.Ciclo16();
                    System.out.println("------------------");
                    break;
                case 17:
                    System.out.println("------------------");
                    C.Ciclo17();
                    System.out.println("------------------");
                    break;
                case 18:
                    System.out.println("------------------");
                    C.Ciclo18();
                    System.out.println("------------------");
                    break;
                case 19:
                    System.out.println("------------------");
                    C.Ciclo19();
                    System.out.println("------------------");
                    break;
                case 20:
                    System.out.println("------------------");
                    C.Ciclo20();
                    System.out.println("------------------");
                    break;
            }

        }
    }
}
