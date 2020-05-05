/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import javax.swing.JFrame;
import logica.Sistema;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Brayan
 */
public class Modelo {
    private Vista vista;
    private Sistema sistema;

    public Modelo() {

    }
    
    public void iniciar(){

        getVentana().setVisible(true);
        getVentana().llenarMuestra(getSistema().getLista());
    }
    
    public Vista getVentana() {
        if(vista == null){
            vista = new Vista(this);
        }
        return vista;
    }
    
    public Sistema getSistema(){
        if(sistema==null){
            sistema = new Sistema();
        }
        return sistema;
    }
    
    public void enviarMedia(){
       getVentana().cambiarMedia(getSistema().calcularMedia());
    }
    
    public void enviarMediana(){
       getVentana().cambiarMediana(getSistema().calcularMediana());
     
    }
    
    public void enviarModa(){
       getVentana().cambiarModa(getSistema().calcularModa());
    }
    
    public void enviarVarianza(){
        getVentana().cambiarVarianza(getSistema().calcularVarianza());
    }
    
    public void enviarDesviacion(){
        getVentana().cambiarDesviacion(getSistema().calcularDesviacion());
    }
    
}
