/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed3s6_ejemplo2;

/**
 *
 * @author HP
 */
public class ED3S6_EJEMPLO2 {

     public void suma(){
    int a=6;
    int b=1;
    int c=a+b;
    System.out.println("la suma de a+b es: " + c);
    mensaje();
    }
    
    private void mensaje(){
    System.out.println("Bienvenido, Programando ED");
    }
    
    public static void main(String[] args) {
        ED3S6_EJEMPLO2 obj = new ED3S6_EJEMPLO2();
        obj.suma();
        obj.mensaje();
    }
    
}