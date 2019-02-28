package com.example.lapresin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Tetapan_Pegas extends AppCompatActivity {

    EditText massa, periode;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tetapan__pegas);

        periode = findViewById(R.id.periode);
        massa = findViewById(R.id.massa);
        hasil = findViewById(R.id.hasil);
    }

    private double hitung(double m, double T) {
        return 4*3.14*3.14*m/(T*T);
    }

    public void percepatan(View v) {
        double m = Double.parseDouble(massa.getText().toString());
        double T = Double.parseDouble(periode.getText().toString());
        double hasil = hitung(m, T);
        this.hasil.setText(String.valueOf(hasil));
    }

    public void i (View v){
        Intent i = new Intent(this,Bandul_Matematis.class);
        startActivity(i);
    }

    public void j (View v){
        Intent j = new Intent(this,Bandul_Fisis.class);
        startActivity(j);
    }

    public void l (View v){
        Intent l = new Intent(this,Viskositas.class);
        startActivity(l);
    }

    public void m (View v){
        Intent m = new Intent(this,Koefisien_Gesekan.class);
        startActivity(m);
    }

    public void n (View v){
        Intent n = new Intent(this,Momen_Inersia.class);
        startActivity(n);
    }

}