/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg4;

/**
 *
 * @author utpl
 */
public class Semana4 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int opc;
        do {
            opc = metodos.menu();
            switch (opc){
                case 1 -> metodos.leerMatriz();
                case 2 -> metodos.presentarMatriz();
                case 3 -> metodos.transponer();
                case 4 -> metodos.ejemplo();
                /*
                case 5 -> metodos.insOrder();
                case 6 -> metodos.eliminarElm();
                case 7 -> metodos.burbuja();
                case 8 -> metodos.binaria();**/
            }
        }while (opc != 0);
    }
}
