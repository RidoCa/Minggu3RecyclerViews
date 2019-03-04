package com.rido.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rido.recyclerview.Mahasiswa;
import com.rido.recyclerview.MahasiswaAdapter;
import com.rido.recyclerview.R;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);


    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Ridho Choirul Anam 1", "1731710053", "012345678"));
        mahasiswaArrayList.add(new Mahasiswa("Ridho Choirul Anam 2", "1731710054", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ridho Choirul Anam 3", "1731710055", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Ridho Choirul Anam 4", "1731710056", "876543210"));
    }
}
