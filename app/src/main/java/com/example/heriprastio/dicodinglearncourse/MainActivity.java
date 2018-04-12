package com.example.heriprastio.dicodinglearncourse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtWidth, edtHeight, edtLength;
    private Button btnCalculate, btnInten;
    private TextView tvResult;

    private static final String STATE_HASIL = "state_hasil";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtWidth = findViewById(R.id.edt_width);
        edtHeight = findViewById(R.id.edt_height);
        edtLength = findViewById(R.id.edt_length);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);
        btnInten = findViewById(R.id.btn_inten);
        btnCalculate.setOnClickListener(this);
        btnInten.setOnClickListener(this);
        if (savedInstanceState != null) {
            String hasil = savedInstanceState.getString(STATE_HASIL);
            tvResult.setText(hasil);
        }


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(STATE_HASIL, tvResult.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_calculate:
                String length = edtLength.getText().toString().trim();
                String width = edtWidth.getText().toString().trim();
                String height = edtHeight.getText().toString().trim();
                boolean ismEmpetyFields = false;
                if (TextUtils.isEmpty(length)) {
                    ismEmpetyFields = true;
                    edtLength.setError("Field Bagian Ini Tidak Boleh Kosong");
                }
                if (TextUtils.isEmpty(width)) {
                    ismEmpetyFields = true;
                    edtWidth.setError("Field Bagian Ini Tidak Boleh Kosong");
                }
                if (TextUtils.isEmpty(height)) {
                    ismEmpetyFields = true;
                    edtHeight.setError("Field Bagian Ini Tidak Boleh Kosong");
                }
                if (!ismEmpetyFields) {
                    double l = Double.parseDouble(length);
                    double w = Double.parseDouble(width);
                    double h = Double.parseDouble(height);
                    double volume = l * w * h;
                    tvResult.setText(String.valueOf(volume));
                }
                break;

            case R.id.btn_inten:
                Intent i = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(i);
                break;
        }

    }
}
