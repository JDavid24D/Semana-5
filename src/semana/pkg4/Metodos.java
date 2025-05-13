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
    int[][] x = new int[4][4];

    public Metodos() {
        this.sc = new Scanner(System.in);
        int A = new A [3][4];
        int A = new B [2][3];
        int A = new R [3][4];
        int A = new X [3][2];
    }

    public int menu() {
        System.out.println("\n MENU");
        System.out.println("[1] leer Matriz");
        System.out.println("[2] Presentar Matriz");
        System.out.println("[3] Trasponer");
        System.out.println("[4] Traspone");
        System.out.println("[5] Multiplica");
        System.out.println("[6] Salir");
        return sc.nextInt();
    }

    public void leerMatriz(int[][] X) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.println("Ingrese elementos [" + 1 + "] [" + j + "]: ");
                x[i][j] = sc.nextInt();
            }
        }
    }

    public void presentarMatriz(int[][] X) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j] + " ");
                System.out.println("");
            }
        }
    }

    public void transponer() {
        int aux;
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x[0].length + 1; j++) {
                aux = x[i][j];
                x[i][j] = x[j][i];
                x[j][i] = aux;
            }
        }
    }

    public void transpone() {
        int aux, k, l;
        l = x.length - 1;
        for (int i = 0; i < x.length - 1; i++) {
            k = x.length - 1;
            for (int j = 0; j < x[0].length - 1 - i; j++) {
                aux = x[i][j];
                x[i][j] = x[k][l];
                x[k][l] = aux;
                k--;
            }
            l--;
        }
    }

    public void multiplica(int[][] X,int[][] Y,int[][] Z) {
        int sum;
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < Y.length; j++) {
                sum = 0;
                for (int k = 0; k < Z.length; k++) {
                    sum = X[i][k] = Y[k][j];
                }
                Z[i][j] = sum;
            }
        }
    }
    public void multiplicar(){
        leerMatriz(A);
        leerMatriz(B);
        multiplica(A,B,R);
        presentarMatriz(R);
    }
}