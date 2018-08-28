/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        System.out.println("Ingrese el número: ");
        int numero= lectura.nextInt();
        System.out.println("Ingrese la clave: ");
        int clave= lectura.nextInt();
        System.out.println("Ingrese el nombre del dueño: ");
        String dueno= lectura.next();
        System.out.println("Ingrese el saldo: ");
        double saldo= lectura.nextDouble();
        NewCuenta c1= new NewCuenta(1,123,"f",0);
        System.out.println(c1.getSaldo());
        System.out.println(NewCuenta.numCuenta);
        NewCuenta c2= new NewCuenta(2,45,"V",0);
        System.out.println(NewCuenta.numCuenta);
    }
    
}
