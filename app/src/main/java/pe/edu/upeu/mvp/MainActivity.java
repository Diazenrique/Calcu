package pe.edu.upeu.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Main.Vista {
    private Main.Presentador presentador;
    private Button button,btnsuma,btnresta;
    private EditText edt1,edtsuma,edtsuma2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presentador = new FactorialPresentador(this);
        edt1 = (EditText) findViewById(R.id.txtn);
        edtsuma = (EditText) findViewById(R.id.txtsuma);
        edtsuma2 = (EditText) findViewById(R.id.txtsuma2);
        button = (Button) findViewById(R.id.btnc);
        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.calcularFactorial(edt1.getText().toString());
            }
        });
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.calcularSuma(edtsuma.getText().toString(),edtsuma2.getText().toString());
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.calcularResta(edtsuma.getText().toString(),edtsuma2.getText().toString());
            }
        });

    }

    @Override
    public void mostrarResultado(String r) {
        Toast.makeText(getApplicationContext(), "Factorial:" + r, Toast.LENGTH_LONG).show();


    }

    @Override
    public void mostrarSuma(String m) {
        Toast.makeText(getApplicationContext(), "Suma" + m, Toast.LENGTH_LONG).show();
        ;
    }

    @Override
    public void mostrarResta(String e) {
        Toast.makeText(getApplicationContext(),"Resta" + e,Toast.LENGTH_LONG).show();
    }
}