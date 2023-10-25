/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilha;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo
 */
public class Inverter {
    String[] frase = new String[30];
    String frazeCompleta = "";
    int x, topo_pilha=-1;
    
    //imprimir a pilha
    void imprimir(int topo){
        for(int x=topo; x>=0; x--){
            frazeCompleta = frazeCompleta+ " " +this.frase[x];
        }
        
        System.out.println("Frase Inicial: " + new StringBuilder(frazeCompleta).reverse().toString());
    }
    
    //tamanho
    int tamanho(){
        return(this.topo_pilha); // retorna a quantidade de elementos presentes na pilha
    }
    
    //Inserir String
     int push(int topo, String valores){
        this.topo_pilha = topo;
        
        if(this.topo_pilha<0){
            this.topo_pilha = 0;
        }
        
        if(this.topo_pilha > 19){
            JOptionPane.showMessageDialog(null,"A pilha foi estourada");
            return(this.topo_pilha--);
        }else{
            this.frase[this.topo_pilha]=valores;
            return(this.topo_pilha);
        }
    }
}
