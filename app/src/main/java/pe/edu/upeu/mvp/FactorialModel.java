package pe.edu.upeu.mvp;

public class FactorialModel implements Main.Modelo{
    private  Main.Presentador presentador;

    public  FactorialModel(Main.Presentador presentador){
    this.presentador= presentador;
    }
    @Override
    public void calcularFactorial(String n) {
        int fac = 1;
        if(!n.equals("")) {
            //calculo de factorial
            int x= Integer.parseInt(n);
            for (int i= 1;i<=x;i++){
                fac = fac*i;
            }
            presentador.mostrarResultado(String.valueOf(fac));

        }else{
            //mostrar mensaje
        }

    }

    @Override
    public void calcularSuma(String s, String d) {
        int sum;
        if (!s.equals("") && !d.equals("")){
            int x = Integer.parseInt(s);
            int y = Integer.parseInt(d);
            sum = x+y;
            presentador.mostrarSuma(String.valueOf(sum));
        }

    }

    @Override
    public void calcularResta(String t, String a) {
        int rest;
        if (!t.equals("") && !a.equals("")){
            int x = Integer.parseInt(t);
            int y = Integer.parseInt(a);
            rest = x-y;
            presentador.mostrarResta(String.valueOf(rest));
        }
    }
}
