/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Mauro
 */
public class TallerVectores {
    public static void main(String[] args) {
        
    }
    
    public double sumatoria(double[] vector) {
        double suma= 0;
        for (int i = 0; i < vector.length; i++) {
            suma = suma+vector[i];
        }
        return suma;
    }
    public double productoria (double[] vector){
        double productoria= 1;
        for (int i = 0; i < vector.length; i++) {
            productoria = productoria*vector[i];
        }
        return productoria;
        
    }
        public double numeroMayor (double[] v){
        double mayor= 0;
        for (int i = 0; i < v.length; i++) {
            if (mayor < v[i]){
                mayor=v[i];
            }
        }
        return mayor;
        }
        
        public double numeroMenor (double[] v){
        double menor = 10000 ;
        for (int i = 0; i < v.length; i++) {
            if (menor > v[i]){
                menor=v[i];
            }
        }
        return menor;
        }
        // TERCERO
        public double[] vectorsuma (double [] v, double[] v1){
        double[] vector = new double [v.length] ;
        for (int i = 0; i < v.length; i++) {
            vector[i]=v[i]+v1[i];
        }
        return vector;
        }
        
         public double[] vectorresta (double [] v, double[] v1){
        double[] vector = new double [v.length] ;
        for (int i = 0; i < v.length; i++) {
            vector[i]=v[i]-v1[i];
        }
        return vector;
        }
         
         // QUINTO
         
         public double primeraparte (double[] v){
             double productoria=0;
             for (int i =0 ; i < v.length /2; i++) {
                 productoria = productoria*v[i];
             }
             return productoria;
         }

         public double segundaparte (double[] v){
             double suma=0;
             for (int i =v.length/2 ; i < v.length /2; i++) {
                 suma = suma*v[i];
             }
             return suma;
         }
         public boolean simetrico(double[] v) {
             double[] vec=new double [v.length];
             int it=0;
             for (int i = v.length-1; i >= 0; i--) {
                 vec[it]=v[i];
                 it++;
             }
             for (int i = 0; i < v.length; i++) {
                 if (vec[i]!=v[i]){
                     return false;
                 
             }
                 
             }
        return true;
    }
    
}
