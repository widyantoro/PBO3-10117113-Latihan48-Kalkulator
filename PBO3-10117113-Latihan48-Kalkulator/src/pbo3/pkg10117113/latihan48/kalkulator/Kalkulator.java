/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan48.kalkulator;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menampilkan hasil penjumlahan, pengurangan,
 *            perkalian, dan pembagian, dari 2 velue yang dimasukan
 *            
 */
public class Kalkulator {
   private double value1;
   private double value2;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public void setNameProject() {
      System.out.println("Project Calculator");
    }
    
    public void setNoteProject(String note) {
      System.out.println("This project show you how to manage method in java");
    }
    
    public double add(double value1, double value2) {
       return value1 + value2;
        
    }
    
    public double minus(double value1, double value2) {
       return value1 - value2;
        
    }
    
    public double multiplication(double value1, double value2) {
       return value1 * value2;
        
    }
    
    public double division(double value1, double value2) {
       return value1 / value2;
        
    }
}
