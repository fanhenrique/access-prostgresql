package banco;

import java.util.ArrayList;
import javax.swing.JFrame;

public class Teste {

    public static void main(String[] args) {

        Painel1 p1 = new Painel1();
              
        JFrame j1 = new JFrame();
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j1.add(p1);
        j1.pack();
        j1.setSize(534, 230);
        j1.setVisible(true);
        
    }
}
