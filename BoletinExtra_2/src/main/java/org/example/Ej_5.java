package org.example;
import java.util.Scanner;
public class Ej_5 {
    public static void main(String[]args){
        int diasDesplazamiento;
        double quilometraje,sueldoFijo,importeVentas,sueldoBruto,sueldoFluido;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos dias de desplazamiento tuviste?");
        diasDesplazamiento = sc.nextInt();
        System.out.println("Cuantos kilometros recorriste?");
        quilometraje = sc.nextDouble();
        System.out.println("Cual fue tu importe en ventas?");
        importeVentas = sc.nextDouble();
        System.out.println("Cual es tu sueldo fijo?");
        sueldoFijo = sc.nextDouble();
        sc.close();
        sueldoBruto=(quilometraje*2+diasDesplazamiento*30+sueldoFijo+importeVentas*5/100);
        System.out.println("Tu sueldo bruto es "+sueldoBruto+"€");
        sueldoFluido = sueldoBruto-sueldoBruto*18/100-36;
        System.out.println("Tu sueldo fluido es "+ sueldoFluido+"€");
    }
}