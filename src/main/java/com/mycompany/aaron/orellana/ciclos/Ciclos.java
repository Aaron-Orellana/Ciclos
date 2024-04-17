package com.mycompany.aaron.orellana.ciclos;

import java.util.*;

public class Ciclos {

    Scanner leer = new Scanner(System.in);

    public void Ciclo1() {
        int bandera = 0;
        while (bandera == 0) {
            int km = 0;
            int m = 0;
            int c;
            System.out.print("Ingrese los centimetros que desea calcular: ");
            int n = leer.nextInt();
            while (n >= 100000) {
                n = n - 100000;
                km++;
            }
            while (n >= 100) {
                n = n - 100;
                m++;
            }
            c = n;
            System.out.println("Km: " + km + " M: " + m + " Cm: " + c);
            System.out.println("Desea calcular nuevamente? [1] Si [2] No");
            int op = leer.nextInt();
            if (op == 1) {
                bandera = 0;
            }
            if (op == 2) {
                bandera = 1;
            }
        }
    }

    public void Ciclo2() {
        int n = 1;
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println("");
    }

    public void Ciclo3() {
        int n = 1;
        int s = 0;
        while (n <= 10) {
            s = s + n;
            n++;
        }
        System.out.println("La suma es: " + s);
    }

    public void Ciclo4() {
        String op = "s";
        while (!op.equals("N") && !op.equals("No")) {
            System.out.print("Ingrese un numero: ");
            int n = leer.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + " Es Par");
            } else {
                System.out.println(n + " Es Impar");
            }
            System.out.println("Desea continuar (N o No para finalizar): ");
            op = leer.next();
        }
    }

    public void Ciclo5() {
        double s = 0;
        for (int i = 0; i < 30; i++) {
            System.out.println("Ingrese numero " + (i + 1) + " del promedio: ");
            double n = leer.nextInt();
            s = s + n;
        }
        System.out.println("Promedio: " + (s / 30));
    }

    public void Ciclo6() {
        int n = 1;
        while (n <= 20) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
            n++;
        }
        System.out.println("");
    }

    public void Ciclo7() {
        int n = 1;
        int s = 0;
        while (n <= 400) {
            if (n % 2 != 0) {
                s = s + n;
            }
            n++;
        }
        System.out.println("La suma es: " + s);
    }

    public void Ciclo8() {
        int bandera = 0;
        while (bandera == 0) {
            double r = 0;
            while (bandera == 0) {
                System.out.println("Ingrese el radio: ");
                r = leer.nextDouble();
                if (r > 0) {
                    bandera = 1;
                } else {
                    System.out.println("Ingrese un numero positivo");
                }
            }
            double area = Math.PI * r * r;
            System.out.println("El area del circulo es: " + area);
            System.out.println("Desea calcular nuevamente? [1] Si [2] No");
            int op = leer.nextInt();
            if (op == 1) {
                bandera = 0;
            }
            if (op == 2) {
                bandera = 1;
            }
        }
    }

    public void Ciclo9() {
        int bandera = 0;
        while (bandera == 0) {
            double r = 0;
            while (bandera == 0) {
                System.out.println("Ingrese el radio: ");
                r = leer.nextDouble();
                if (r > 0) {
                    bandera = 1;
                } else {
                    System.out.println("Ingrese un numero positivo");
                }
            }
            double perimetro = Math.PI * 2 * r;
            System.out.println("El perimetro del circulo es: " + perimetro);
            System.out.println("Desea calcular nuevamente? [1] Si [2] No");
            int op = leer.nextInt();
            if (op == 1) {
                bandera = 0;
            }
            if (op == 2) {
                bandera = 1;
            }
        }
    }

    public void Ciclo10() {
        int bandera = 0;
        while (bandera == 0) {
            double ladoA = 0;
            double ladoB = 0;
            while (bandera == 0) {
                System.out.println("Ingrese el ladoA: ");
                ladoA = leer.nextDouble();
                System.out.println("Ingrese el ladoB: ");
                ladoB = leer.nextDouble();
                if (ladoA > 0 && ladoB > 0) {
                    bandera = 1;
                } else {
                    System.out.println("Uno de los numeros no corresponde a un numero positivo");
                }
            }
            double area = ladoA * ladoB;
            System.out.println("El area del rectangulo es: " + area);
            System.out.println("Desea calcular nuevamente? [1] Si [2] No");
            int op = leer.nextInt();
            if (op == 1) {
                bandera = 0;
            }
            if (op == 2) {
                bandera = 1;
            }
        }
    }

    public void Ciclo11() {
        int bandera = 0;
        while (bandera == 0) {
            double r = 0;
            while (bandera == 0) {
                System.out.println("Ingrese el radio: ");
                r = leer.nextDouble();
                if (r > 0) {
                    bandera = 1;
                } else {
                    System.out.println("Ingrese un numero positivo");
                }
            }
            double volumen = (4 * Math.PI * r * r * r) / 3;
            System.out.println("El volumen de la esfera es: " + volumen);
            System.out.println("Desea calcular nuevamente? [1] Si [2] No");
            int op = leer.nextInt();
            if (op == 1) {
                bandera = 0;
            }
            if (op == 2) {
                bandera = 1;
            }
        }
    }

    public void Ciclo12() {
        int bandera = 0;
        while (bandera == 0) {
            double lado = 0;
            while (bandera == 0) {
                System.out.println("Ingrese el lado: ");
                lado = leer.nextDouble();
                if (lado > 0) {
                    bandera = 1;
                } else {
                    System.out.println("Ingrese un numero positivo");
                }
            }
            double area = 6 * (lado * lado);
            double perimetro = 12 * lado;
            System.out.println("El area del cubo es: " + area);
            System.out.println("El perimetro del cubo es: " + perimetro);
            System.out.println("Desea calcular nuevamente? [1] Si [2] No");
            int op = leer.nextInt();
            if (op == 1) {
                bandera = 0;
            }
            if (op == 2) {
                bandera = 1;
            }
        }
    }

    public void Ciclo13() {
        for (int n = 1; n <= 100; n++) {
            if (n % 3 != 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println("");
    }

    public void Ciclo14() {
        int n = 1;
        while (n <= 100) {
            if (n % 5 != 0) {
                System.out.print(n + " ");
            }
            n++;
        }
        System.out.println("");
    }

    public void Ciclo15() {
        int n = 1;
        while (n <= 100) {
            if (n % 5 != 0 && n % 3 != 0){
                System.out.print(n + " ");
            }
            n++;
        }
        System.out.println("");
    }

    public void Ciclo16() {
        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0) {
                System.out.print("Cuek ");
            } else {
                System.out.print(n + " ");
            }
        }
        System.out.println("");
    }

    public void Ciclo17() {
        int bandera = 0;
        while (bandera == 0){
            int factorial = 1;
            System.out.println("Ingrese el numero: ");
            int n = leer.nextInt(); 
            for (int i = 1 ; i<=n ; i++){
                factorial *= i;
            }
            System.out.println("El factorial del numero "+n+" es: "+ factorial);
            System.out.println("Desea calcular nuevamente? [1] Si [2] No");
            int op = leer.nextInt();
            if (op == 1) {
                bandera = 0;
            }
            if (op == 2) {
                bandera = 1;
            }
        }
    }

    public void Ciclo18() {
        int bandera = 0;
        while (bandera == 0){
            int digitos = 0;
            int inicial;
            System.out.println("Ingrese el numero: ");
            int n = leer.nextInt();
            inicial = n;
            while (n>0){
                n/=10;
                digitos++;
            }
            System.out.println("Los digitos del numero "+inicial+" son: "+ digitos);
            System.out.println("Desea calcular nuevamente? [1] Si [2] No");
            int op = leer.nextInt();
            if (op == 1) {
                bandera = 0;
            }
            if (op == 2) {
                bandera = 1;
            }
        }
    }

    public void Ciclo19() {
        int bandera = 0;
        while (bandera == 0) {
            double lado = 0;
            while (bandera == 0) {
                System.out.println("Ingrese el lado: ");
                lado = leer.nextDouble();
                if (lado > 0) {
                    bandera = 1;
                } else {
                    System.out.println("Ingrese un numero positivo");
                }
            }
            double area = lado * lado;
            double perimetro = 4 * lado;
            System.out.println("El area del cuadrado es: " + area);
            System.out.println("El perimetro del cuadrado es: " + perimetro);
            System.out.println("Desea calcular nuevamente? [1] Si [2] No");
            int op = leer.nextInt();
            if (op == 1) {
                bandera = 0;
            }
            if (op == 2) {
                bandera = 1;
            }
        }
    }

    public void Ciclo20() {
        int bandera = 0;
        while (bandera == 0) {
            double base = 0;
            double exponente = 0;
            while (bandera == 0) {
                System.out.println("Ingrese la base: ");
                base = leer.nextDouble();
                System.out.println("Ingrese el exponente: ");
                exponente = leer.nextDouble();
                if (base > 0 && exponente >0) {
                    bandera = 1;
                } else {
                    System.out.println("Uno de los numeros no corresponde a un numero positivo");
                }
            }
            double potencia = Math.pow(base, exponente);
            System.out.println("El resultado es: " + potencia);
            System.out.println("Desea calcular nuevamente? [1] Si [2] No");
            int op = leer.nextInt();
            if (op == 1) {
                bandera = 0;
            }
            if (op == 2) {
                bandera = 1;
            }
        }
    }
}
