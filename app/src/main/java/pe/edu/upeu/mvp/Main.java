package pe.edu.upeu.mvp;

public interface Main {
    public interface Vista{
        public void mostrarResultado(String r);
        public void mostrarSuma(String m);
        public void mostrarResta(String e);
    }
    public interface Presentador{
        public void mostrarResultado(String r);
        public void calcularFactorial(String n);
        public void mostrarSuma(String m);
        public void calcularSuma(String s,String d);
        public void mostrarResta(String e);
        public void calcularResta(String t,String a);
    }
    public interface Modelo{
        public void calcularFactorial(String n);
        public void calcularSuma(String s,String d);
        public void calcularResta(String t,String a);
    }

}
