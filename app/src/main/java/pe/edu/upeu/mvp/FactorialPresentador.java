package pe.edu.upeu.mvp;

import android.view.View;

public class FactorialPresentador implements Main.Presentador {
    private Main.Modelo model;
    private Main.Vista vista;
    public FactorialPresentador(Main.Vista vista){
        this.vista = vista;
        model = new FactorialModel(this);

    }
    @Override
    public void mostrarResultado(String r) {
        if(vista !=null){
            vista.mostrarResultado(r);
        }
    }

    @Override
    public void calcularFactorial(String n) {
        if(vista !=null){
            model.calcularFactorial(n);
    }
    }

    @Override
    public void mostrarSuma(String m) {
        if(vista !=null){
            vista.mostrarSuma(m);
        }
    }

    @Override
    public void calcularSuma(String s, String d) {
       if(vista !=null){
           model.calcularSuma(s,d);
       }
    }

    @Override
    public void mostrarResta(String e) {
        if(vista !=null){
            vista.mostrarResta(e);
        }
    }

    @Override
    public void calcularResta(String t, String a) {
        if(vista !=null){
            model.calcularResta(t,a);
        }
    }

}
