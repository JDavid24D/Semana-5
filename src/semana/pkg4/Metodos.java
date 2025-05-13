/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg4;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
class Metodos {
   
    Scanner sc;
    int [][] x = new int[4][4];
    public Metodos(){
        this.sc = new Scanner(System.in);

    }
    public int menu(){
        System.out.println("\n MENU");
        System.out.println("[1] leer Matriz");
        System.out.println("[2] Presentar Matriz");
        System.out.println("[3] Trasponer");
        System.out.println("[4] Ejemplo");
        return sc.nextInt();
    }
    public void leerMatriz(){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.println("Ingrese elementos [" + 1 + "] [" + j + "]: ");
                x[i][j] = sc.nextInt();
            }
        }
    }
    public void presentarMatriz(){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j] + " ");
            System.out.println("");
            }
        }
    }
    public void transponer(){
        int aux;
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x[0].length + 1; j++) {
                aux = x[i][j];
                x[i][j] = x[j][i];
                x[j][i] = aux;
            }
        }
    }
    public void ejemplo(){
        int aux,k,l;
        l = x.length -1;
        for (int i = 0; i < x.length - 1; i++) {
            k = x.length -1;
            for (int j = 0 ; j < x[0].length - 1 -i; j++) {
                aux = x[i][j];
                x[i][j] = x[k][l];
                x[k][l] = aux;
                k--;
            }
           l--; 
        }
    }
}

