package randroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class Imagenes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagenes);
        GridView gridView = (GridView) findViewById(R.id.gv_img);
        gridView.setAdapter(new Imagenes1());
    }

    public class Imagenes1 extends BaseAdapter {
        private ArrayList<Integer> imagenes;

        public Imagenes1() {
            imagenes = new ArrayList<>();
            imagenes.add(R.mipmap.ic_launcher);
            imagenes.add(R.mipmap.ic_launcher1);
            imagenes.add(R.mipmap.ic_launcher2);
            imagenes.add(R.mipmap.ic_launcher3);
            imagenes.add(R.mipmap.ic_launcher4);
        }

        @Override
        public int getCount() {
            return imagenes.size();
        }

        @Override
        public Object getItem(int position) {
            return imagenes.get(position);
        }

        @Override
        public long getItemId(int position) {
            return imagenes.get(position);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(getApplication().getApplicationContext());
            imageView.setImageResource(imagenes.get(position));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(new GridView.LayoutParams(64, 64));
            return imageView;
        }
    }
}
