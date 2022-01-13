package br.com.estudos.appdolarreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText edtValorDolar, edtQuantDolar;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValorDolar = findViewById(R.id.edtValorDolar);
        edtQuantDolar = findViewById(R.id.edtQuantDolar);

        txtResult = findViewById(R.id.txtResult);

    }

    public void calcular(View view) {

        double quantDolar = Double.parseDouble(edtQuantDolar.getText().toString());
        double valorDolar = Double.parseDouble(edtValorDolar.getText().toString());
        double totalReais = valorDolar * quantDolar;

        txtResult.setText("R$: " + totalReais);
    }
}