package com.example.heriprastio.dicodinglearncourse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMoveDataActivity extends AppCompatActivity {

    public static String NAMA;
    public static String EXTRA_NAMA;
    public static TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_move_data);
        textView = findViewById(R.id.tv_data);
        String nama = getIntent().getStringExtra(NAMA);
        String Ex = getIntent().getStringExtra(EXTRA_NAMA);
        String text = "Nama : " +nama+", Nama Panjang : " +Ex;
        textView.setText(text);
    }
}
