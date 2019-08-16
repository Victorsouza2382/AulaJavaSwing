package janelas;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class TestaJanela {

    public static void main(String[] args) {
       
         JFrame janela = new JFrame();
        janela.setTitle("Hello Word");
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        //janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setVisible(true); 
       
        JFrame janela2 = new JFrame();
        janela2.setTitle("Hello word meio");
        janela2.setSize(700, 700);
        janela2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela2.setVisible(true);
        janela2.setLocationRelativeTo(null);
        
        JDialog dialogo = new JDialog(janela);
        dialogo.setTitle("Hello Word 2");
        //dialogo.setModal(true);
        dialogo.setSize(200, 100);
        dialogo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
        
       
    }
    
    
    
    }

