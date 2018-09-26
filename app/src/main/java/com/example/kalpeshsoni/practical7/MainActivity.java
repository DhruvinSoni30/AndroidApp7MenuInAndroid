package com.example.kalpeshsoni.practical7;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        l = findViewById(R.id.linear);
        l = new LinearLayout(this);
        l.setOnCreateContextMenuListener(this);
        setContentView(l);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @TargetApi(Build.VERSION_CODES.M)
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.red)
        {
            l.setBackgroundColor(getResources().getColor(R.color.red,null));
            return true;
        }
        else if(item.getItemId() == R.id.green)
        {
            l.setBackgroundColor(getResources().getColor(R.color.green,null));
            return true;
        }
        else
        {
            l.setBackgroundColor(getResources().getColor(R.color.blue,null));
            return true;
        }
    }
}
