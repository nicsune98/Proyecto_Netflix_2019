
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Movie;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aplicacion {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Movie m1=new Movie();
        Movie m2 = new Movie(1,120,60, "El terror en el complexivo", "Programacion", "Vivi",true,(short)(2018));
        m1.setId((int)(Math.random()*100));
        m1.setTitle(JOptionPane.showInputDialog("ingresa un titulo"));
        m1.setGenre(entrada.nextLine());
        
        JOptionPane.showMessageDialog(null,m1.toString());
          JOptionPane.showMessageDialog(null,m2.toString());
        
    }
    
}
