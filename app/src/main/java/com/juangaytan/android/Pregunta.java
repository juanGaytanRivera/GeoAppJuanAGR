package com.juangaytan.android;

/**
 * Created by juan on 08/06/2016.
 */
public class Pregunta {

    private Integer mIdResTexto;
    private boolean mrespuestaVerdadera;

    public Pregunta(Integer IdResTexto, boolean respuestaVerdadera){
        this.mIdResTexto = IdResTexto;
        this.mrespuestaVerdadera = respuestaVerdadera;
    }

    public void setIdResTexto(Integer idResTexto){
        this.mIdResTexto = idResTexto;
    }

    public Integer getIdTexto(){
        return mIdResTexto;
    }

    public void setRespuestaVerdadera(boolean respuestaVerdadera){
        this.mrespuestaVerdadera = respuestaVerdadera;
    }

    public boolean isRespuestaVerdadera(){
        return mrespuestaVerdadera;
    }
}
