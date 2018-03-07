package com.danielescobar.micalculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String operando1, operando2, operacion, sresultado;
    EditText eoperacion;
    Button  bdivicion, bmultiplicacion, bresta, bsuma, bpunto,bigual;

    int bandera = 0;
    double dresultado, doperando1, doperando2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eoperacion = findViewById(R.id.operacion);
        bsuma = findViewById(R.id.bSuma);
        bresta = findViewById(R.id.bmenos);
        bmultiplicacion = findViewById(R.id.bmultiplicacion);
        bdivicion = findViewById(R.id.bdivicion);
        bpunto = findViewById(R.id.bpunto);
        bigual = findViewById(R.id.bigual);
        operando1 = "";
        operando2 = "";
        bsuma.setEnabled(false);
        bmultiplicacion.setEnabled(false);
        bdivicion.setEnabled(false);
    }

    public void onButtonClicked1(View view) {
        if (bandera==2)
        {
            bandera=0;
        }
        bigual.setEnabled(true);
        bsuma.setEnabled(true);
        bresta.setEnabled(true);
        bmultiplicacion.setEnabled(true);
        bdivicion.setEnabled(true);
        if (bandera == 0) {
            operando1 = operando1 + "1";
            eoperacion.setText(operando1);
        } else {
            operando2 = operando2 + "1";
            eoperacion.setText(operando1 + operacion + operando2);
        }
    }

    public void onButtonClicked2(View view) {
        if (bandera==2)
        {
            bandera=0;
        }
        bigual.setEnabled(true);
        bsuma.setEnabled(true);
        bresta.setEnabled(true);
        bmultiplicacion.setEnabled(true);
        bdivicion.setEnabled(true);
        if (bandera == 0) {
            operando1 = operando1 + "2";
            eoperacion.setText(operando1);
        } else {
            operando2 = operando2 + "2";
            eoperacion.setText(operando1 + operacion + operando2);

        }
    }

    public void onButtonClicked3(View view) {
        if (bandera==2)
        {
            bandera=0;
        }
        bigual.setEnabled(true);
        bsuma.setEnabled(true);
        bresta.setEnabled(true);
        bmultiplicacion.setEnabled(true);
        bdivicion.setEnabled(true);
        if (bandera == 0) {
            operando1 = operando1 + "3";
            eoperacion.setText(operando1);
        } else {
            operando2 = operando2 + "3";
            eoperacion.setText(operando1 + operacion + operando2);

        }
    }

    public void onButtonClicked4(View view) {
        if (bandera==2)
        {
            bandera=0;
        }
        bigual.setEnabled(true);
        bsuma.setEnabled(true);
        bresta.setEnabled(true);
        bmultiplicacion.setEnabled(true);
        bdivicion.setEnabled(true);
        if (bandera == 0) {
            operando1 = operando1 + "4";
            eoperacion.setText(operando1);
        } else {
            operando2 = operando2 + "4";
            eoperacion.setText(operando1 + operacion + operando2);

        }
    }

    public void onButtonClicked5(View view) {
        if (bandera==2)
        {
            bandera=0;
        }
        bigual.setEnabled(true);
        bsuma.setEnabled(true);
        bresta.setEnabled(true);
        bmultiplicacion.setEnabled(true);
        bdivicion.setEnabled(true);
        if (bandera == 0) {
            operando1 = operando1 + "5";
            eoperacion.setText(operando1);
        } else {
            operando2 = operando2 + "5";
            eoperacion.setText(operando1 + operacion + operando2);

        }
    }

    public void onButtonClicked6(View view) {
        if (bandera==2)
        {
            bandera=0;
        }
        bigual.setEnabled(true);
        bsuma.setEnabled(true);
        bresta.setEnabled(true);
        bmultiplicacion.setEnabled(true);
        bdivicion.setEnabled(true);
        if (bandera == 0) {
            operando1 = operando1 + "6";
            eoperacion.setText(operando1);
        } else {
            operando2 = operando2 + "6";
            eoperacion.setText(operando1 + operacion + operando2);

        }
    }

    public void onButtonClicked7(View view) {
        if (bandera==2)
        {
            bandera=0;
        }
        bigual.setEnabled(true);
        bsuma.setEnabled(true);
        bresta.setEnabled(true);
        bmultiplicacion.setEnabled(true);
        bdivicion.setEnabled(true);
        if (bandera == 0) {
            operando1 = operando1 + "7";
            eoperacion.setText(operando1);
        } else {
            operando2 = operando2 + "7";
            eoperacion.setText(operando1 + operacion + operando2);

        }
    }

    public void onButtonClicked9(View view) {
        if (bandera==2)
        {
            bandera=0;
        }
        bigual.setEnabled(true);
        bsuma.setEnabled(true);
        bresta.setEnabled(true);
        bmultiplicacion.setEnabled(true);
        bdivicion.setEnabled(true);
        if (bandera == 0) {
            operando1 = operando1 + "9";
            eoperacion.setText(operando1);
        } else {
            operando2 = operando2 + "9";
            eoperacion.setText(operando1 + operacion + operando2);

        }
    }

    public void onButtonClicked0(View view) {

        if (bandera==2)
        {
            bandera=0;
        }
        bigual.setEnabled(true);
        bsuma.setEnabled(true);
        bresta.setEnabled(true);
        bmultiplicacion.setEnabled(true);
        bdivicion.setEnabled(true);
        if (bandera == 0 && operando1.length()==0) {
            operando1 = operando1 + "0.";
            eoperacion.setText(operando1);
        } else if (bandera == 1 && operando2.length()==0){
            operando2 = operando2 + "0.";
            eoperacion.setText(operando1 + operacion + operando2);

        }
        else if (bandera == 0 && operando1.length()!=0){
            operando1 = operando1 + "0";
            eoperacion.setText(operando1);

        }
        else{
            operando2 = operando2 + "0";
            eoperacion.setText(operando1 + operacion + operando2);

        }
                bpunto.setEnabled(false);
    }


    public void onButtonClicked8(View view) {
        if (bandera==2)
        {
            bandera=0;
        }
        bigual.setEnabled(true);
        bsuma.setEnabled(true);
        bresta.setEnabled(true);
        bmultiplicacion.setEnabled(true);
        bdivicion.setEnabled(true);
        if (bandera == 0) {
            operando1 = operando1 + "8";
            eoperacion.setText(operando1);
        } else {
            operando2 = operando2 + "8";
            eoperacion.setText(operando1 + operacion + operando2);

        }
    }

    public void onButtonClickedsuma(View view) {
        bigual.setEnabled(false);
        if(bandera==0) {
            bandera = 1;
            operacion = "+";
            eoperacion.setText(operando1 + operacion);

        }
        else if (bandera==2){
            bandera=1;
            operando1=sresultado;
            operando2="";
            operacion = "+";
            eoperacion.setText(operando1 + operacion);

            bigual.setEnabled(true);
        }
        else {

            doperando1 = Double.parseDouble(operando1);
            doperando2 = Double.parseDouble(operando2);
            if (operacion == "+") {
                dresultado = doperando1 + doperando2;

            } else if (operacion == "-") {
                dresultado = doperando1 - doperando2;

            } else if (operacion == "*") {
                dresultado = doperando1 * doperando2;

            } else if (operacion == "/") {
                dresultado = doperando1 / doperando2;

            }
            operando1 = String.valueOf(dresultado);
            operando2="";
            operacion = "+";
            eoperacion.setText(operando1 + operacion);

        }
        bsuma.setEnabled(false);
        bpunto.setEnabled(true);
        bdivicion.setEnabled(false);
        bmultiplicacion.setEnabled(false);
    }

    public void onButtonClickeddivicion(View view) {
        bigual.setEnabled(false);
        if(bandera==0) {
            bandera = 1;
            operacion = "/";
            eoperacion.setText(operando1 + operacion);
        }
        else if (bandera==2){
            bandera=1;
            operando1=sresultado;
            operando2="";
            operacion = "/";
            eoperacion.setText(operando1 + operacion);
            bigual.setEnabled(true);
        }
        else {

            doperando1 = Double.parseDouble(operando1);
            doperando2 = Double.parseDouble(operando2);
            if (operacion == "+") {
                dresultado = doperando1 + doperando2;

            } else if (operacion == "-") {
                dresultado = doperando1 - doperando2;

            } else if (operacion == "*") {
                dresultado = doperando1 * doperando2;

            } else if (operacion == "/") {
                dresultado = doperando1 / doperando2;

            }
            operando1 = String.valueOf(dresultado);
            operando2="";
            operacion = "/";
            eoperacion.setText(operando1 + operacion);
        }
        bsuma.setEnabled(false);
        bpunto.setEnabled(true);
        bdivicion.setEnabled(false);
        bresta.setEnabled(false);
        bmultiplicacion.setEnabled(false);
    }


    public void onButtonClickedmenos(View view) {
        bigual.setEnabled(false);
        if(bandera==0 && operando1.length()!=0) {
            bandera = 1;
            operacion = "-";
            eoperacion.setText(operando1 + operacion);

        }
        else if (bandera==2){
            bandera=1;
            operando1=sresultado;
            operando2="";
            operacion = "-";
            eoperacion.setText(operando1 + operacion);
            bigual.setEnabled(true);
        }
        else if (bandera==1 && operando2.length()!=0) {

            doperando1 = Double.parseDouble(operando1);
            doperando2 = Double.parseDouble(operando2);
            if (operacion == "+") {
                dresultado = doperando1 + doperando2;

            } else if (operacion == "-") {
                dresultado = doperando1 - doperando2;

            } else if (operacion == "*") {
                dresultado = doperando1 * doperando2;

            } else if (operacion == "/") {
                dresultado = doperando1 / doperando2;

            }


            operando1 = String.valueOf(dresultado);
            operando2="";
            operacion = "-";
            eoperacion.setText(operando1 + operacion);

        }
        else if (bandera==0)
        {
            operando1 = operando1 + "-";
            eoperacion.setText(operando1);
            bresta.setEnabled(false);
        }
        else
        {
            operando2 = operando2 + "-";
            eoperacion.setText(operando1 + operacion + operando2);
            bresta.setEnabled(false);
        }
        bsuma.setEnabled(false);
        bpunto.setEnabled(true);
        bdivicion.setEnabled(false);

        bmultiplicacion.setEnabled(false);
    }


    public void onButtonClickedmulti(View view) {
        bigual.setEnabled(false);
        if(bandera==0) {
            bandera = 1;
            operacion = "*";
            eoperacion.setText(operando1 + operacion);

        }
        else if (bandera==2){
            bandera=1;
            operando1=sresultado;
            operando2="";
            operacion = "*";
            eoperacion.setText(operando1 + operacion);
            bigual.setEnabled(true);
        }
        else {
            doperando1 = Double.parseDouble(operando1);
            doperando2 = Double.parseDouble(operando2);
            if (operacion == "+") {
                dresultado = doperando1 + doperando2;

            } else if (operacion == "-") {
                dresultado = doperando1 - doperando2;

            } else if (operacion == "*") {
                dresultado = doperando1 * doperando2;

            } else if (operacion == "/") {
                dresultado = doperando1 / doperando2;

            }

            operando1 = String.valueOf(dresultado);
            operando2="";
            operacion = "*";
            eoperacion.setText(operando1 + operacion);
        }
        bsuma.setEnabled(false);
        bpunto.setEnabled(true);
        bdivicion.setEnabled(false);

        bmultiplicacion.setEnabled(false);
    }


    public void onButtonClickedpunto(View view) {
        bigual.setEnabled(false);
        if (bandera==2)
        {
            bandera=0;
        }
        if (bandera == 0) {
            operando1 = operando1 + ".";
            eoperacion.setText(operando1);
        } else {
            operando2 = operando2 + ".";
            eoperacion.setText(operando1 + operacion + operando2);


        }
        bpunto.setEnabled(false);
        bsuma.setEnabled(false);
        bdivicion.setEnabled(false);

        bmultiplicacion.setEnabled(false);

    }

    public void onButtonClickedigual(View view) {
        if(operando2=="")
        {
            operando2="0";

        }
        if(operando1=="")
        {
            operando1="0";
        }
       doperando1 = Double.parseDouble(operando1);
       doperando2 = Double.parseDouble(operando2);
       dresultado=doperando1;
        if (operacion == "+") {
            dresultado = doperando1 + doperando2;

        } else if (operacion == "-") {
            dresultado = doperando1 - doperando2;

        } else if (operacion == "*") {
            dresultado = doperando1 * doperando2;

        } else if (operacion == "/") {
            dresultado = doperando1 / doperando2;

        }

        bigual.setEnabled(false);
        sresultado = Double.toString(dresultado);
        eoperacion.setText(sresultado);
        bandera=2;
        bpunto.setEnabled(true);
        operando1 = "";
        operando2 = "";
        operacion = "";
    }

    public void onButtonClickedborrar(View view) {
        operando1 = "";
        operando2 = "";
        eoperacion.setText("");
        bsuma.setEnabled(false);
        bmultiplicacion.setEnabled(false);
        bdivicion.setEnabled(false);
        bandera=0;
    }
}
