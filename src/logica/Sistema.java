/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Brayan
 */
public class Sistema {
    private ArrayList<Integer> lista;
    public Sistema() {
        lista = new ArrayList<Integer>();
        llenarLista();
    }
    
    /**
     * Lista de datos usada para calcular valores estadisticos
     */
    public void llenarLista(){
        lista.add(10);
        lista.add(15);
        lista.add(12);
        lista.add(12);
        lista.add(11);
        lista.add(14);
        lista.add(15);
        lista.add(13);
        lista.add(12);
        lista.add(13);
        lista.add(10);
        lista.add(11);
        lista.add(11);
        lista.add(12);
        lista.add(15);
        lista.add(14);
        lista.add(13);
    }
    
    public double calcularMedia(){
        double suma=0;
        for(int i=0;i<lista.size();i++){
            suma = suma + lista.get(i);
        }
        return (suma/lista.size());
    }
    
    public double calcularMediana(){
        int valor=0;
        lista.sort(null);
        if(lista.size()%2==0){
            valor = (lista.get((lista.size()-1)/2) + lista.get((lista.size())/2))/2;
        }else{
            valor = lista.get((lista.size()-1)/2);
        }
        return valor;
    }
    
    public double calcularModa(){
        int maximoNumRepeticiones= 0;
        double moda= 0;

        for(int i=0; i<lista.size(); i++){
            int numRepeticiones= 0;
            for(int j=0; j<lista.size(); j++){
                if(lista.get(i)==lista.get(j)){
                    numRepeticiones++;
                }   
                if(numRepeticiones>maximoNumRepeticiones){
                    moda= lista.get(i);
                    maximoNumRepeticiones= numRepeticiones;
                }   
            }
        }   
        return moda;
    }
    
    public double calcularVarianza(){
        int dato=0;
        int sum1=0,sum2=0;
        double varianza,size;
        size = lista.size();
        for(int i=0; i<size; i++){
            dato= lista.get(i);
            sum1 = sum1 + dato;
            sum2 = sum2 + dato*dato;
        }
        varianza = (sum2/(size-1))-( (sum1*sum1)/(size*(size-1)));
        return varianza;
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }
    
    public double calcularDesviacion(){
        double valor;
        valor = Math.sqrt(calcularVarianza());
        return valor;
    }
    
    
}
