/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidrodriguezcabrera.brisca;

/**
 *
 * @author Usuario
 */
public class Reinicio {
    public Reinicio(Baraja mazo,CartasJ1View cartasJ1View,CartasJ2View cartasJ2View, App App){
        System.out.println("Reinicio");
        mazo.numCartas = 0;
        mazo.posCartaACoger=0;
        mazo.posCartaACogerJ1=0;
        mazo.posCartaACogerJ2=0;
        mazo.barajarCartas();
        mazo.mostrarBaraja();
        mazo.getCartaAleatoria(0, 19);
        cartasJ1View.contador = 6;
        cartasJ1View.contadorArray = 6;
        App.musicaFondo.stop();
        App.musicaFondo.play();
        CartasJ1View cartasJ1ViewReinicio = new CartasJ1View(mazo);
        App.paneRoot.setBottom(cartasJ1ViewReinicio);
        CartasJ2View cartasJ2ViewReinicio = new CartasJ2View(mazo);
        App.paneRoot.setTop(cartasJ2ViewReinicio);
        Botones botonesReinicio = new Botones(mazo, cartasJ1ViewReinicio);
        App.paneRoot.setRight(botonesReinicio.button);
    }
}
