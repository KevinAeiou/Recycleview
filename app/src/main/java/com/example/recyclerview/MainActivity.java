package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List <ListaActivity> lstBook;
    RecyclerView listDados;
    RecyclerViewAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listDados = findViewById(R.id.rv);
        lstBook = new ArrayList<>();
        lstBook.add(new ListaActivity("Titulo Um", "Category Book", "Description book", R.drawable.buss));
        lstBook.add(new ListaActivity("Titulo Dois", "Category Book", "Description book", R.drawable.coracao_icon));
        lstBook.add(new ListaActivity("Titulo Tres", "Category Book", "Description book", R.drawable.iron_man_icon));
        lstBook.add(new ListaActivity("Titulo Quatro", "Category Book", "Description book", R.drawable.mounts_icon));
        lstBook.add(new ListaActivity("Titulo Cinco", "Category Book", "Description book", R.drawable.tv_icon));
        lstBook.add(new ListaActivity("Titulo Seis", "Category Book", "Description book", R.drawable.train_icon));
        lstBook.add(new ListaActivity("Titulo Um", "Category Book", "Description book", R.drawable.buss));
        lstBook.add(new ListaActivity("Titulo Dois", "Category Book", "Description book", R.drawable.coracao_icon));
        lstBook.add(new ListaActivity("Titulo Tres", "Category Book", "Description book", R.drawable.iron_man_icon));
        lstBook.add(new ListaActivity("Titulo Quatro", "Category Book", "Description book", R.drawable.mounts_icon));
        lstBook.add(new ListaActivity("Titulo Cinco", "Category Book", "Description book", R.drawable.tv_icon));


        myAdapter = new RecyclerViewAdapter(this, lstBook);
        listDados.setLayoutManager(new GridLayoutManager(this, 3));
        listDados.setAdapter(myAdapter);

    }
}