package com.redbee.presentacion;

import com.redbee.presentacion.pasos.*;

/**
 * Created by maty on 14/10/15.
 */
public class Yoda {

    private Fuerza fuerza;


    public Yoda() {
        this.fuerza = new Fuerza();
    }

    public void mostrarPresentacionDebo() {


        presentarmeDebo();

        fuerza.invocar(new Intro());

        fuerza.invocar(new PresentacionKata());

        fuerza.invocar(new PresentacionProblema());

        fuerza.invocar(new FinalizarKata());

        fuerza.invocar(new Cierre());

    }

    private void presentarmeDebo() {

        System.out.println("Hola, soy Yoda.");
        System.out.println("");
        System.out.println("");
        System.out.println("          .--.			");
        System.out.println("::\\`--._,'.::.`._.--'/::::");
        System.out.println("::::.  ` __::__ '  .::::::");
        System.out.println("::::::-:.`'..`'.:-::::::::");
        System.out.println("::::::::\\ `--' /::::::::::");
        System.out.println("");

    }
}
