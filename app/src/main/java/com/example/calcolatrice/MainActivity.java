package com.example.calcolatrice;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNumber1, etNumber2;
    TextView tvResult;
    String op = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        tvResult = findViewById(R.id.tvResult);

        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnMinus = findViewById(R.id.btnMinus);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDivide = findViewById(R.id.btnDivide);
        Button btnEquals = findViewById(R.id.btnEquals);

        btnPlus.setOnClickListener(v -> op = "+");
        btnMinus.setOnClickListener(v -> op = "-");
        btnMultiply.setOnClickListener(v -> op = "*");
        btnDivide.setOnClickListener(v -> op = "/");

        btnEquals.setOnClickListener(v -> {
            double n1 = Double.parseDouble(etNumber1.getText().toString());
            double n2 = Double.parseDouble(etNumber2.getText().toString());
            double res = 0;

            if (op.equals("+")) res = n1 + n2;
            else if (op.equals("-")) res = n1 - n2;
            else if (op.equals("*")) res = n1 * n2;
            else if (op.equals("/")) res = n1 / n2;

            tvResult.setText(String.valueOf(res));
        });
    }
}