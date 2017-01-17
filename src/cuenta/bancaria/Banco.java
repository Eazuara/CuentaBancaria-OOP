/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta.bancaria;

/**
 *
 * @author esteb
 */
public class Banco {
    public String name;
    public int Number;
    public double balance;
    private double withdraw;
    private double deposit;
    
    public Banco(){
    name= "Esteban Azuara Aguirre";
    Number= 2454583;
    balance= 2340.00;
   }
    public double deposit(){
        return this.deposit;
    }
    public double withdraw(){
        return this.withdraw;
    }
    public double balance(){
        return this.balance;
    }
}
