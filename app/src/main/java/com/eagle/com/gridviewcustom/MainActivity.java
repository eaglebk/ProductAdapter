package com.eagle.com.gridviewcustom;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import com.eagle.com.gridviewcustom.adapter.ProductAdapter;
import com.eagle.com.gridviewcustom.dto.Product;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Product> products = new ArrayList<>();
        products.add(new Product("Product #1", 22));
        products.add(new Product("Product #2", 66));
        products.add(new Product("Product #3", 89));
        products.add(new Product("Product #4", 77));

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new ProductAdapter(this, products));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
