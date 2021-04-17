/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author rushi
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int num[] = {1,2,3,4};
        //System.out.println(num[5]);
        try{
            int a[]= {1,2,3,4};
            System.out.println(a[5]);
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally{
            System.out.println("this block executed or resource cleanup");
            
        }
    }
    
}
