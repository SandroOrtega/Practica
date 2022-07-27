package com.example.sog_2022_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText edRadio;
    EditText edAlturaT;
    EditText eBaseT;
    EditText edAlturaR;
    EditText edBaseR;

    Button bCirculo;
    Button bTriangulo;
    Button bRectangulo;

    TextView ttReCirculo;
    TextView ttReTriangulo;
    TextView ttReRectangulo;

    AlertDialog.Builder dialogo;

    double area;
    DecimalFormat formato = new DecimalFormat("#.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edRadio = (EditText) findViewById(R.id.eRadio);
        edAlturaT=(EditText) findViewById(R.id.eAlturaT);
        eBaseT=(EditText) findViewById(R.id.eBaseT);
        edAlturaT=(EditText) findViewById(R.id.eAlturaR);
        edBaseR=(EditText) findViewById(R.id.eBaseR);
        bCirculo=(Button) findViewById(R.id.bCalcularCirculo);
        bTriangulo=(Button) findViewById(R.id.bCalcularTriangulo);
        bRectangulo=(Button) findViewById(R.id.bCalcularRectangulo);
        ttReRectangulo = (TextView) findViewById(R.id.tresultado_rectangulo);
        ttReCirculo = (TextView) findViewById(R.id.tresultado_circulo);
        ttReTriangulo = (TextView) findViewById(R.id.tresultado_triangulo);

        bCirculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bCirculo.getText ().toString().equals("Limpiar")){
                    edRadio.setText("");
                    ttReCirculo.setText("");
                    edRadio.requestFocus();
                    bCirculo.setText("Calcular");
                }else{
                    if (edRadio.getText().toString().length() == 0) {
                        dialogo =new AlertDialog.Builder( MainActivity.this);
                        dialogo.setTitle("ERROR");
                        dialogo.setMessage("Ingrese un valor correcto en el Radio del circulo");
                        dialogo.setCancelable(false);
                        dialogo.setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                                edRadio.requestFocus();
                            }
                        }};
                dialogo.show ();
                }else{
                area =Math.pow(Double.parseDouble(edRadio.getText().toString()),2.0) * Math.PI;
                ttReCirculo.setText("EL AREA ES:" + formato.format(area));
                bCirculo.setText("LIMPIAR");
                }
            }
        }
    });
                            bTriangulo.setOnClickListener (new View.OnClickListener)
                            @Override
                            public void onClick(View v) {
                                if (bTriangulo.getText().toString().equals("Limpiar")){
                                    edAlturaT.setText("");
                                    edBaseR.setText("");
                                    ttReTriangulo.setText("");
                                    edBaseR.requestFocus();
                                    bTriangulo.setText("Calcular");
                                }else{
                                    if (edAlturaT.getText ().toString().length()==0) {
                                        dialogo = new AlertDialog.Builder(MainActivity.this);
                                        dialogo =setTitle ("Error");
                                        dialogo.setMessage("Ingrese un valor correcto en la altuura del triangulo");
                                        dialogo.setCancelable(false);
                                        dialogo.setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int i) {
                                                dialogInterface.cancel ();
                                                edAlturaT.requestFocus();

                                            }
                                        });
                                        dialogo.show();
                                    }else {
                                        area = Double.parseDouble(edAlturaT.getText().toString())*Double.parseDouble(edBaseR.getText().toString())/2;
                                        ttReTriangulo.setText("El area es:"+formato.format(area));
                                        bTriangulo.setText("Limpiar");
                                    }
                                }
                            }
});
        bRectangulo.set.OnclickListener (new View.OnclickListener() {
            @Override
public void on
        })

                                    }
                                    }
                                    }
                                    });
                                    }
                                    }