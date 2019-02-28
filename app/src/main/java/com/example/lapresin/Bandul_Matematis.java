package com.example.lapresin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Bandul_Matematis extends AppCompatActivity {

    EditText panjangTali, periode;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bandul_matematis);

        periode = findViewById(R.id.periode);
        panjangTali = findViewById(R.id.panjang_tali);
        hasil = findViewById(R.id.hasil);
    }

    private double hitung(double l, double T) {
        return 4*3.14*3.14*l/(T*T);
    }

    public void gravitasi(View v) {
        double hasil;
        try {
            double l = Double.parseDouble(panjangTali.getText().toString());
            double T = Double.parseDouble(periode.getText().toString());
            hasil = hitung(l, T);
        } catch(Exception e){
            hasil = 0;
        }
        this.hasil.setText(String.valueOf(hasil));
    }

    public void j (View v){
        Intent j = new Intent(this,Bandul_Fisis.class);
        startActivity(j);
    }

    public void k (View v){
        Intent k = new Intent(this,Tetapan_Pegas.class);
        startActivity(k);
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