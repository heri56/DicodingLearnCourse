package com.example.heriprastio.dicodinglearncourse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnmovedata;
    public static String NAMA = "Heri";
    public static String EXTRA_NAMA = "Heri Prastio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        btnmovedata = findViewById(R.id.btn_movedata);

        btnmovedata.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intentmovedata = new Intent(IntentActivity.this, ShowMoveDataActivity.class);
        intentmovedata.putExtra(ShowMoveDataActivity.NAMA, "Ok");
        intentmovedata.putExtra(ShowMoveDataActivity.EXTRA_NAMA, "Siap");
        startActivity(intentmovedata);

    }
}
