package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Digite el numero de materias: ");
        int materias = entrada.nextInt();
        for (int i = 0; i < materias; i++){
        System.out.println("Digite la calificacion de la materia: ");
        list.add(i, entrada.nextInt());
        }
        do{
        int a = list.size();
        System.out.println("¿Te falto alguna materia?, si es asi digita 1");
        if (entrada.nextInt() == 1){
        System.out.println("Digite la calificacion faltante: ");
        list.add(a, entrada.nextInt());
        }
        else{
        break;
        }
        }while(true);
        for (int i = 0; i < list.size(); i++){
        System.out.println("La calificacion " + (i+1) + " es: " + list.get(i));
        }
        do{
        System.out.println("¿Hay alguna materia de sobra?, si es asi digita 2");
        if (entrada.nextInt() == 2){
        System.out.println("Digite en que pocision esta la calificacion");
        int b = entrada.nextInt();
        list.remove(b-1);
        for (int i = 0; i < list.size(); i++){
        System.out.println("La calificacion " + (i+1) + " es: " + list.get(i));
        }
        }
        else{
        break;
        }
        }while(true);
        int sumar = 0;
        for (int i = 0; i < list.size(); i++){
        sumar = sumar + list.get(i);
        }
        System.out.println(sumar/list.size());
        }
}
