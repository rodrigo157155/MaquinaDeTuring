/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regras;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author andre
 */
public class RegrasAutonomos {

    public static final String SIMBOLO = "|#|";
    public static final String SIMBOLO_VAZIO = "  ";
    

    public static void moverFitaEsquerda(JPanel jPanel, int valorDistancia) {

        int posicaoX = jPanel.getLocation().x;

        jPanel.setLocation(posicaoX - valorDistancia, jPanel.getLocation().y);

    }

    public static void moverFitaDireita(JPanel jPanel, int valorDistancia) {

        int posicaoX = jPanel.getLocation().x;

        jPanel.setLocation(posicaoX + valorDistancia, jPanel.getLocation().y);

    }
    
    public static ArrayList<JLabel> concatenaArrays(ArrayList<JLabel> arrayList1 , ArrayList<JLabel> arrayList2){
        
        ArrayList<JLabel> arraContenado =  new ArrayList<>();
        
        for (JLabel lb : arrayList1) {
            
            arraContenado.add(lb);
            
        }
        
        for (JLabel lb : arrayList2) {
            arraContenado.add(lb);
        }
        
        return arraContenado;
    }

    public static ArrayList<JLabel> geraArryLabelSimbolos(int tam) {
        ArrayList<JLabel> novoArrayLabel = new ArrayList<>();
        JLabel novoLabel;
        for (int i = 0; i < tam; i++) {
            novoLabel = new JLabel();
            novoLabel.setText(SIMBOLO);
            novoLabel.setSize(40, 30);
            //novoLabel.setLocation((2+i*30), 0);
            novoLabel.setFont(new Font("", Font.PLAIN, 20));
            novoArrayLabel.add(novoLabel);
        }

        novoLabel = new JLabel();
        novoLabel.setText(SIMBOLO_VAZIO);
        novoLabel.setSize(40, 30);
        novoLabel.setFont(new Font("", Font.PLAIN, 20));
        novoArrayLabel.add(novoLabel);

        return novoArrayLabel;
    }

    

    public static void preencherPanelLabel(ArrayList<JLabel> arrayLabel, JPanel jPanel) {

        int cout = 0;
        for (JLabel lb : arrayLabel) {

            lb.setLocation((2+cout*30), 0); // definir possição do label no panel 
            jPanel.add(lb);
            
            cout++;
        }

    }

}
