package com.example.lapresin;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Model extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);
        scope = findViewById(R.id.Model);
        Adapter adap = new Adapter();
        scope.setAdapter(adap);
    }
    ListView scope;
    class Adapter extends BaseAdapter{
        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View vw = getLayoutInflater().inflate(R.layout.model_layout,null);
            TextView tv= vw.findViewById(R.id.nama);
            tv.setText("nama " +(position+1));
            return vw;
        }
    }


}
