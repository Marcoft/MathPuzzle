package com.puzzle.mathpuzzle.CampaignSuma;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.puzzle.mathpuzzle.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SumaAfterLvl extends AppCompatActivity {

    @BindView(R.id.money) TextView money;
    @BindView(R.id.nextLvl) TextView nextLvl;
    @BindView(R.id.corect) TextView corect;
    @BindView(R.id.allLvlCompl) TextView allLvlCompl;
    @BindView(R.id.img) ImageButton img;
    @BindView(R.id.NextLevel) LinearLayout NextLevel;
    String block="";
    int Money = 0;


    SharedPreferences prefs;
    SharedPreferences.Editor prefEdit;

    private void SaveMoney(){
        prefs = getSharedPreferences("Money", MODE_PRIVATE);
        prefEdit = prefs.edit();
        prefEdit.putInt("money", Money);
        prefEdit.commit();
    }

    private void loadMoney(){
        prefs = getSharedPreferences("Money", MODE_PRIVATE);
        Money = prefs.getInt("money", 0);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suma_after_lvl);
        ButterKnife.bind(this);


        Intent intent = getIntent();
        if(intent!=null) {
            Money = intent.getIntExtra("money", 0);
            block = intent.getStringExtra("block");
            SaveMoney();
            if(block.equalsIgnoreCase("30")){
                nextLvl.setText(getResources().getText(R.string.campaign));
                img.setBackgroundResource(R.drawable.home);
                corect.setText(getResources().getText(R.string.congratulations));
                allLvlCompl.setVisibility(View.VISIBLE);
            }
        }else{
            loadMoney();
        }

        NextLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent();
                i2.putExtra("Block", block);
                setResult(RESULT_OK, i2);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent i2 = new Intent();
        i2.putExtra("Block", "0");
        setResult(RESULT_OK, i2);
        finish();
        super.onBackPressed();
    }
}
