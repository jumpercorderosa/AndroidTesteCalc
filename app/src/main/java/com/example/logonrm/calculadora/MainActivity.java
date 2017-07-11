package com.example.logonrm.calculadora;

import android.os.StrictMode;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.etDisplay) EditText etDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btnUm, R.id.btnDois, R.id.btnTres, R.id.btnQuatro, R.id.btnCinco,
            R.id.btnSeis, R.id.btnSete, R.id.btnOito, R.id.btnNove, R.id.btnZero,
            R.id.btnMinus, R.id.btnPlus, R.id.btnVezes, R.id.btnDivide, R.id.btnHash,
            R.id.btnDot})
    public void handleClick(Button button) {

        boolean operador_pressed = false;
        String operador;

        switch (button.getId()) {
            case R.id.btnUm:


                if(!operador_pressed) {
                    etDisplay.append(button.getText().toString());
                } else {
                    int x = Integer.parseInt(etDisplay.getText().toString());
                    int y = Integer.parseInt(button.getText().toString());

                    //Interpreter interpreter = new Interpreter;

                    String aux = String.valueOf(x) + operador + String.valueOf(y);

                    etDisplay.setText("");

                    //etDisplay.setText(String.valueOf(x + operador + y));

                    operador = "";
                    operador_pressed = false;

                }

                break;
            case R.id.btnDois:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnTres:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnQuatro:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnCinco:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnSeis:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnSete:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnOito:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnNove:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnZero:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnPlus:
                operador = "+";
                operador_pressed = true;
                break;
            case R.id.btnMinus:
                operador = "-";
                operador_pressed = true;
                break;
            case R.id.btnDivide:
                operador = "/";
                operador_pressed = true;
                break;
            case R.id.btnVezes:
                operador = "*";
                operador_pressed = true;
                break;
        }

    }
}
