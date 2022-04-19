/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ON;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args){
       RegrasFactory regra = new RegrasBrasil();
       PratoFeito prato = regra.criaPratoFeito();
       Sobremesa sobremesa = regra.criaSobremesa();
       
       prato.ExibirPrato();
       sobremesa.ExibirSobremesa();
       
       
       regra = new RegrasArgentina();
       prato = regra.criaPratoFeito();
       sobremesa = regra.criaSobremesa();
       
       prato.ExibirPrato();
       sobremesa.ExibirSobremesa();
        
    }    
    
}
