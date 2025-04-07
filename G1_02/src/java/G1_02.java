/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.faces.bean.ManagedBean;

@ManagedBean(name="temperature")
public class G1_02 {
    private double fah; //華氏溫度
    private double cel; //攝氏溫度
    
    public void calculate(){
        cel = 5.0 / 9.0 * (fah - 32);
    }
    
    public void setFah(double fah){
        this.fah = fah;
    }
    
    public double getFah(){
        return fah;
    }
    
    public String getCel(){
        return String.format("%.2f", cel);
    }
}
