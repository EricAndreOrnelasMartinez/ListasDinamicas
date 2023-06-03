package paquete1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    static Scanner entrada;
    public static void main(String[] args) {
        entrada = new Scanner(System.in); 
        ArrayList<Double> list = new ArrayList<Double>();
        int opc = 0;
        int index = 0;
        int calN = 0;
        boolean valida = true;
        do{
            printf("Ingrese la cantidad de calificaiones: ");
            try{
                calN = entrada.nextInt();
                valida = false;
            }catch(InputMismatchException e){
                printf("Número invalido");
                entrada.next();
            }
        }while(valida);
        for(int i = 0; i < calN; i++){
            valida = true;
            do{
                printf("Ingrese la calificacion: " + (int)(i + 1));
                try{
                    list.add(i, entrada.nextDouble());
                    valida = false;
                }catch(InputMismatchException e){
                    printf("Número invalido");
                    entrada.next();
                }
            }while(valida);
        }
        for(int i = 0; i < calN; i++){
            printf("Calificacion " + (int)(i + 1) + " = " + list.get(i));
        }
        do{
            valida = true;
            do{
                try{
                    printf("Desea ingresar otra calificacion: 1 = si, 2 = no");
                    opc = entrada.nextInt();
                    valida = false;
                }catch(InputMismatchException e){
                    printf("Numero invalido");
                    entrada.next();
                }
            }while(valida);
            valida = true;
            if(opc == 1){
                printf("Digite la nueva calificacion: ");
                index = list.size() + 1;
                list.add(index, entrada.nextDouble());
            }
        }while(opc != 1);
        
    }
    public static void printf(String m){
        System.out.println(m);
    }
}