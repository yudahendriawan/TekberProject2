package com.example.tekberproject2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tekberproject2.model.DataTV;
import com.example.tekberproject2.model.GuestStar;
import com.example.tekberproject2.util.Key;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvDataTv;
    private ArrayList<DataTV> list = new ArrayList<>();
    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle(Key.TITLE_MAIN);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        rvDataTv = findViewById(R.id.rv_data);
        rvDataTv.setHasFixedSize(true);
        list.addAll(ListDataTV.getListData());

        showRecyclerCardView();



    }

    private void showRecyclerCardView() {
        rvDataTv.setLayoutManager(new LinearLayoutManager(this));
        AdapterTV adapterTV = new AdapterTV(list, getApplicationContext());
        rvDataTv.setAdapter(adapterTV);
    }

    /**
     * To exit with twice clicked back button
     */
    @Override
    public void onBackPressed(){
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
