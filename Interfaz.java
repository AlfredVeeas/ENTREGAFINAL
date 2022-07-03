/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

/**
 *
 * @author evert
 */
public class Interfaz extends Frame{
    private MenuBar menu;
    
    public Interfaz (){
        this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
            });
    }
    
    public void Configuracion(){
             
                this.setTitle("FeriaClick");
                this.setSize(1000, 600);// w,h
                this.setLocation(100,100);
                
                
                
                Font titleFont = new Font("arial", Font.BOLD, 25);
                Font labelFont =new  Font("arial", Font.PLAIN, 25);
                Font textFont =new  Font("arial", Font.PLAIN, 25);
         
                
                FlowLayout miFlowLayout = new FlowLayout(FlowLayout.CENTER);
               
                Label lblMessage= new Label("Bienvenidos a mi FeriaClick");
                
                lblMessage.setSize(3000000,30000000);
               
                this.setLayout( miFlowLayout );
                this.add(lblMessage);
                
                this.setVisible(true);
                
                
                
                
         }
    
    public void CrearMenu(){
             menu= new MenuBar();
             
             
             Menu menuA = new Menu( "Vendedor" );
             Menu menuB = new Menu( "Ferias" );
             Menu menuC = new Menu( "Cliente");
             //Menu menuD = new Menu( "Repartidor");
             
             MenuItem submenuC=new MenuItem("Crear");
             menuA.add(submenuC);
             MenuItem submenuR=new MenuItem("Consultar");
             menuA.add(submenuR);
             MenuItem submenuU=new MenuItem("Modificar / eliminar");
             menuA.add(submenuU);
             /*
             MenuItem submenuD=new MenuItem("Eliminar");
             menuA.add(submenuD);
             */
             MenuItem submenuCF=new MenuItem("Crear");
             menuB.add(submenuCF);
             MenuItem submenuRF=new MenuItem("Consultar");
             menuB.add(submenuRF);
             MenuItem submenuUF=new MenuItem("Modificar / Eliminar");
             menuB.add(submenuUF);
             
             
             MenuItem submenuCC=new MenuItem("Comprar producto");
             menuC.add(submenuCC);
             MenuItem submenuRC=new MenuItem("Agregar fondos");
             menuC.add(submenuRC);
             
             
             
             Vendedor vendedor=new Vendedor();
             Feria feria = new Feria();
             Cliente cliente=new Cliente();
             //actionlistener
            //interfaz crear vendedor
            submenuC.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){                 
                        vendedor.CrearVendedor();                        
                    }                   
             });
             
            //mostrar vendedor
            submenuR.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent a) {                       
                        vendedor.ConsultarVendedor();                                                
                    }                    
             });
             //modificar y eliminar vendedor
             submenuU.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent i) {
                        SwiModVen uivendedor = new SwiModVen();
                        uivendedor.setVisible(true);
                         
                    }
                    
             });
             
             /*eliminar vendedor
             submenuD.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent o) {
                       SwiModVen uivendedor = new SwiModVen();
                       uivendedor.setVisible(true);
                        
                         
                    }
                    
             });*/
             // crear feria
             submenuCF.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent ingresarFeria){
                     
                     feria.IngresarFeria();
                 }
             });
             // Mostrar ferias
             submenuRF.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent ingresarFeria){
                     
                     feria.MostrarFerias();
                 }
             });
             //Actualizar y eliminar ferias
             submenuUF.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent ingresarFeria){
                     
                    SwingFeriaMYE swing = new SwingFeriaMYE();
                    swing.setVisible(true);
                 }
             });
             // consultar cliente
             submenuCC.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent ingresarFeria){
                     SwingCliente swingcliente = new SwingCliente();
                     swingcliente.setVisible(true);
                    
                 }
             });
             
             menu.add(menuA);
             menu.add(menuB);
             menu.add(menuC);
             //menu.add(menuD);
             setMenuBar(menu); 
             
         }
}
