/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ON;

/**
 *
 * @author Aluno
 */
public class RegrasBrasil implements RegrasFactory{
    
    
    @Override
    public PratoFeito criaPratoFeito() {
        return new PratoFeitoBrasil();
    }

    @Override
    public Sobremesa criaSobremesa() {
        return new SobremesaBrasil();
    }
    
}
