package com.mycompany.unidad5;

public class Arbol {
    public void arbolMetodo1 () {
  
        int i,j,k,n;
        n=10;
        for(i=1; i<n+(n/2); i++){
            for(j=n+(n/2); j>i; j--){
                System.out.print(" ");}
            for(k=1; k<=2*i-1; k++){
                System.out.print("*");}
            System.out.println("");
        }
        for(i=1; i<n-(n/2); i++){
            for(j=n+(n/2); j>1; j--){
                System.out.print(" ");}
            for(k=n/2; k<=(n/2)+1; k++){
                System.out.print("*");}
            System.out.println("");
        }
    }
}