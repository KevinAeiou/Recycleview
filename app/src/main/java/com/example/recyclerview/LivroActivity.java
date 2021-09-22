package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LivroActivity extends AppCompatActivity {

    private TextView txtTitle, txtDescription, txtCategoria;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_livro);

        txtTitle = findViewById(R.id.txtTitulo);
        txtDescription = findViewById(R.id.txtDescricao);
        txtCategoria = findViewById(R.id.txtCategoria);
        img = findViewById(R.id.livroThumbnail);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Titulo");
        String Description = intent.getExtras().getString("Descrição");
        int image =  intent.getExtras().getInt("Thumbnail");

        txtTitle.setText(Title);
        txtDescription.setText(Description);
        img.setImageResource(image);

    }
}