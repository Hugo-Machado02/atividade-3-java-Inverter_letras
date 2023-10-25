/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilha;
import javax.swing.JOptionPane;
/**
 *
 * @author Hugo
 */
public class Pilha {

    public static void main(String[] args) {
        int x, topo=-1;
        String frase, frase_pilha;
        
        Inverter p = new Inverter();
        
        frase = JOptionPane.showInputDialog("Digite uma Frase que tenha no máximo 20 palavras");
        
        
        
        System.out.println("Frase Inicial: " + frase);
        System.out.println("----------------------------");
        
        String[] valores = frase.split(" ");
        for (String str_separada: valores) {
            topo++;
            p.push(topo, str_separada);
        }
        
        topo = p.tamanho();
        p.imprimir(topo);
        
        
        
        
    }
}
