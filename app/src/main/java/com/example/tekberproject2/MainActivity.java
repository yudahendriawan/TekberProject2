package com.example.tekberproject2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.tekberproject2.model.DataTV;
import com.example.tekberproject2.model.GuestStar;
import com.example.tekberproject2.util.Key;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvDataTv;
    private ArrayList<DataTV> list = new ArrayList<>();

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
}
