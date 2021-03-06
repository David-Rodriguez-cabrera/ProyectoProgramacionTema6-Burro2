/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidrodriguezcabrera.brisca;

import java.net.URISyntaxException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.AudioClip;

/**
 *
 * @author 1DAW06
 */
public class Botones {
    // MUSICA AL ROBAR CARTA
    AudioClip musicaRobarCarta;
    // BOTON PARA ROBAR
    Button button = new Button("Robar");

    //DEFINIR UN BOTON
    public Botones(Baraja mazo, CartasJ1View cartasJ1View, CartasJ2View cartasJ2View){
        button.setScaleX(2);
        button.setScaleY(2);
        button.setTranslateX(-100);
        button.setTranslateY(300);

        // CREAR UNA ACCION AL PULSAR EL BOTON
button.setOnAction (new EventHandler <ActionEvent> () { 
    @Override 
    // METODO PARA LA ACCION AL PULSAR EL BOTON
    public void handle (ActionEvent e) {
        
        // SI J1 TIENE MENOS DE 7 CARTAS Y QUEDAN CARTAS EN EL MAZO
        if (mazo.posCartaACoger<20 && cartasJ1View.contadorArray<6){
            
            //SONIDO TIRA CARTA
        URL urlmusicaFondo = getClass().getResource("/audio/cuckoo.wav");
        if(urlmusicaFondo != null) {
            try {
                musicaRobarCarta = new AudioClip(urlmusicaFondo.toURI().toString());
                musicaRobarCarta.play();
            } catch (URISyntaxException ex) {
            }            
        } else {
        System.out.println("No se ha encontrado el archivo de audio");
        }
        
        cartasJ1View.contadorArray= cartasJ1View.contadorArray +1;
        cartasJ1View.contador= cartasJ1View.contador +1;
        cartasJ1View.numCartasPantalla = mazo.cogerCarta();
        mazo.cartasJ1[cartasJ1View.colClic] = cartasJ1View.numCartasPantalla;
        
        System.out.println(mazo.posCartaACoger);
        cartasJ1View.strNumJ1 = String.valueOf(cartasJ1View.numCartasPantalla.numero + " " + cartasJ1View.numCartasPantalla.palo + " = " + cartasJ1View.numCartasPantalla.puntos + " puntos");
        cartasJ1View.labelJ1 = new Label(cartasJ1View.strNumJ1);
        cartasJ1View.labelJ1.setPrefWidth(cartasJ1View.TAM_X);
        cartasJ1View.add(cartasJ1View.labelJ1, cartasJ1View.contador, 0);
            System.out.println(cartasJ1View.contadorArray);
        
        } else {
            System.out.println("No quedan cartas en la baraja o no puedes robar mas cartas");
        }
        
        // SI J2 TIENE MENOS DE 7 CARTAS Y QUEDAN CARTAS EN EL MAZO
        if (mazo.posCartaACoger<20 && cartasJ2View.contadorArray<6){
            
            //SONIDO TIRA CARTA
        URL urlmusicaFondo = getClass().getResource("/audio/cuckoo.wav");
        if(urlmusicaFondo != null) {
            try {
                musicaRobarCarta = new AudioClip(urlmusicaFondo.toURI().toString());
                musicaRobarCarta.play();
            } catch (URISyntaxException ex) {
            }            
        } else {
        System.out.println("No se ha encontrado el archivo de audio");
        }
        
        cartasJ2View.contadorArray= cartasJ2View.contadorArray +1;
        cartasJ2View.contador= cartasJ2View.contador +1;
        cartasJ2View.numCartasPantalla = mazo.cogerCarta();
        mazo.cartasJ2[cartasJ2View.colClic] = cartasJ2View.numCartasPantalla;
        
        System.out.println(mazo.posCartaACoger);
        cartasJ2View.strNumJ2 = String.valueOf(cartasJ2View.numCartasPantalla.numero + " " + cartasJ2View.numCartasPantalla.palo + " = " + cartasJ2View.numCartasPantalla.puntos + " puntos");
        cartasJ2View.labelJ2 = new Label(cartasJ2View.strNumJ2);
        cartasJ2View.labelJ2.setPrefWidth(cartasJ2View.TAM_X);
        cartasJ2View.add(cartasJ2View.labelJ2, cartasJ2View.contador, 0);
            System.out.println(cartasJ2View.contadorArray);
        
        } else {
            System.out.println("No quedan cartas en la baraja o no puedes robar mas cartas");
        }
        
    }

});

        
}

    
}


