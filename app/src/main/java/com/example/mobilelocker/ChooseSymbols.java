package com.example.mobilelocker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChooseSymbols extends AppCompatActivity implements View.OnClickListener {


    private Button btnChooseGreek;
    private Button btnChooseChessandcard;

    private Button btnChoose;
    private TextView tv;

    private int id=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_symbols);

        tv = findViewById(R.id.chooseSymbols_preview);

        btnChooseGreek = findViewById(R.id.btnSetGreek);
        btnChooseGreek.setOnClickListener(this);
        btnChooseChessandcard = findViewById(R.id.btnSetChessandcard);
        btnChooseChessandcard.setOnClickListener(this);

    }

    public void btnChooseClick(View view){
        switch (id){
            case 0:
                CurrentSymbols.setCurrentGreek();
                break;
            case 1:
                CurrentSymbols.setCurrentChessandcard();
                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSetGreek:
                tv.setText(CurrentSymbols.greekSymbols);
                id = 0;
                break;
            case R.id.btnSetChessandcard:
                Log.i("LOG",CurrentSymbols.chessandcardSymbols);
                id=1;
                tv.setText(CurrentSymbols.chessandcardSymbols);
                break;
        }
    }
}
