package paquete2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner entrada;
    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        int calN = 0;
        ArrayList<Double> list = new ArrayList<>();
        calN = validaInt("Ingrese el numero de materias: ", entrada);
        for(int i = 0; i < calN; i++){
            list.add(i, validaDouble("Digite la calificacion: " + (int)(1+ i), entrada));
        }
        for(int i = 0; i < calN; i++){
            printf("La calificacion " + (int)(i + 1) + " es: " + list.get(i));
        }
        do{
            if(validaInt("Desea agregar otra calificacion?: si=1, no=2 ", entrada) == 1){
                list.add(list.size(), validaDouble("Digite la calificacion: ", entrada));
            }else{
                break;
            }
        }while(true);
        do{
            for(int i = 0; i < list.size(); i++){
                printf("La calificacion " + (int)(i + 1) + " es: " + list.get(i));
            }
            if(validaInt("Desea eliminar alguna calificaion: si=1, no=2 ", entrada) == 1){
                list.remove(validaInt("Digite el indice de la calificacion", entrada) - 1);
            }else{
                break;
            }
        }while(true);
        double suma = 0;
        for(int i = 0; i < list.size(); i++){
            suma += list.get(i);
        }
        printf("El promedio es: " + suma/list.size());
    }
    public static void printf(String m){
        System.out.println(m);
    }
    public static int validaInt(String m, Scanner teclado){
        boolean valida = true;
        int valor = 0;
        do{
            try{
                printf(m);
                valor = teclado.nextInt();
                valida = false;
            }catch(InputMismatchException e){
                printf("Valor invalido");
                teclado.next();
            }
        }while(valida);
        return valor;
    }
    public static double validaDouble(String m, Scanner teclado){
        boolean valida = true;
        double valor = 0;
        do{
            try{
                printf(m);
                valor = teclado.nextDouble();
                valida = false;
            }catch(InputMismatchException e){
                printf("Valor invalido");
                teclado.next();
            }
        }while(valida);
        return valor;
    }
}
