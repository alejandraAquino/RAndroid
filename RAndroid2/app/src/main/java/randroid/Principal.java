package randroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {
    private ListView lstv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstv = (ListView) findViewById(R.id.lstv);
        lstv.setAdapter(new Colores(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.datos)));
    }
    public void onClick(View v){
        startActivity(new Intent(this, Imagenes.class));
    }
    public class Colores extends ArrayAdapter {
        private ArrayList<Integer> colores;
        public Colores(Context context, int resource, Object[] objects) {
            super(context, resource, objects);
            colores = new ArrayList<>();
            colores.add(getResources().getColor(R.color.linea1));
            colores.add(getResources().getColor(R.color.linea3));
            colores.add(getResources().getColor(R.color.linea4));
            colores.add(getResources().getColor(R.color.linea5));
            colores.add(getResources().getColor(R.color.linea8));
            colores.add(getResources().getColor(R.color.linea9));
            colores.add(getResources().getColor(R.color.linea11));
            colores.add(getResources().getColor(R.color.linea10));
            colores.add(getResources().getColor(R.color.linea12));
            colores.add(getResources().getColor(R.color.linea13));
            colores.add(getResources().getColor(R.color.linea14));
            colores.add(getResources().getColor(R.color.linea15));
            colores.add(getResources().getColor(R.color.linea2));
            colores.add(getResources().getColor(R.color.linea6));
            colores.add(getResources().getColor(R.color.linea7));
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = super.getView(position, convertView, parent);
            view.setBackgroundColor(colores.get(position));
            return view;
        }
    }
}
