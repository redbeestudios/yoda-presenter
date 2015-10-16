package com.redbee.presentacion;

import com.redbee.presentacion.pasos.FuerzaStrategy;

/**
 * Created by maty on 14/10/15.
 */
public class Fuerza {

    public void invocar(FuerzaStrategy unPaso){

        unPaso.decirDebo();
    }
}
