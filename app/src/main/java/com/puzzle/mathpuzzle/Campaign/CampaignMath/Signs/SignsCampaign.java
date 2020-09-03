package com.puzzle.mathpuzzle.Campaign.CampaignMath.Signs;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.puzzle.mathpuzzle.Campaign.CampaignMath.picture.PictureCampaignMath;
import com.puzzle.mathpuzzle.R;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignsCampaign extends AppCompatActivity {

    Random r1;
    Random r2;


    int x;
    Random colorrs;

    Toast toast;

    @BindView(R.id.money) TextView Money_text;
    @BindView(R.id.textFind) TextView textFind;
    @BindView(R.id.textLvls) TextView textLvls;


    @BindView(R.id.text1) TextView text1;
    @BindView(R.id.text2) TextView text2;
    @BindView(R.id.text3) TextView text3;
    @BindView(R.id.text4) TextView text4;
    @BindView(R.id.text5) TextView text5;
    @BindView(R.id.text6) TextView text6;
    @BindView(R.id.text7) TextView text7;
    @BindView(R.id.text8) TextView text8;
    @BindView(R.id.text9) TextView text9;
    @BindView(R.id.text10) TextView text10;
    @BindView(R.id.text11) TextView text11;
    @BindView(R.id.text12) TextView text12;


    @BindView(R.id.edt1) EditText edt1;
    @BindView(R.id.edt2) EditText edt2;
    @BindView(R.id.edt3) EditText edt3;
    @BindView(R.id.edt4) EditText edt4;
    @BindView(R.id.edt5) EditText edt5;
    @BindView(R.id.edt6) EditText edt6;
    @BindView(R.id.edt7) EditText edt7;
    @BindView(R.id.edt8) EditText edt8;

    @BindView(R.id.progress) ProgressBar progressBar;


    SharedPreferences prefs;
    SharedPreferences.Editor prefEdit;

    String dictionary[] = {
            "1",
            "2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    @BindView(R.id.hints)
    Button hints;
    @BindView(R.id.check) Button check;

    @BindView(R.id.WordPlus) Button WordPlus;
    @BindView(R.id.WordMinus) Button WordMinus;
    @BindView(R.id.WordMnosh) Button WordMnosh;
    @BindView(R.id.WordDel) Button WordDel;

    String result = "";
    String result2 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signs_campaign);
        ButterKnife.bind(this);


        r1 = new Random();
        r2 = new Random();
        colorrs = new Random();
        progressBar.setMax(110);

        changeWord();
        newGame();
        enterWord();
        progressBar1();
        SaveMoney();

    }

    private void checkAnswer(){
        if((dictionary[4].equalsIgnoreCase("46"))){
            if(edt1.getText().toString().equalsIgnoreCase("+")){


                if(edt2.getText().toString().equalsIgnoreCase("+")){
                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }



                } else if(edt2.getText().toString().equalsIgnoreCase("-")){
                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")) {
                        if (edt4.getText().toString().equalsIgnoreCase("+")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("-")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("*")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("/")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }



                } else if(edt2.getText().toString().equalsIgnoreCase("*")){
                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")) {
                        if (edt4.getText().toString().equalsIgnoreCase("+")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("-")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("*")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("/")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }
                }


                else if(edt2.getText().toString().equalsIgnoreCase("/")){

                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")) {
                        if (edt4.getText().toString().equalsIgnoreCase("+")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("-")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("*")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("/")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }
                }
            }else  if(edt1.getText().toString().equalsIgnoreCase("-")){

                if(edt2.getText().toString().equalsIgnoreCase("+")){
                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }



                } else if(edt2.getText().toString().equalsIgnoreCase("-")){
                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")) {
                        if (edt4.getText().toString().equalsIgnoreCase("+")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("-")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("*")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("/")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }



                } else if(edt2.getText().toString().equalsIgnoreCase("*")){
                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")) {
                        if (edt4.getText().toString().equalsIgnoreCase("+")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("-")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("*")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("/")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }
                }


                else if(edt2.getText().toString().equalsIgnoreCase("/")){

                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")) {
                        if (edt4.getText().toString().equalsIgnoreCase("+")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("-")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("*")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("/")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }
                }

            } else  if(edt1.getText().toString().equalsIgnoreCase("*")){


                if(edt2.getText().toString().equalsIgnoreCase("+")){
                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }



                } else if(edt2.getText().toString().equalsIgnoreCase("-")){
                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")) {
                        if (edt4.getText().toString().equalsIgnoreCase("+")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("-")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("*")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("/")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }



                } else if(edt2.getText().toString().equalsIgnoreCase("*")){
                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")) {
                        if (edt4.getText().toString().equalsIgnoreCase("+")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("-")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("*")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("/")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }
                }


                else if(edt2.getText().toString().equalsIgnoreCase("/")){

                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")) {
                        if (edt4.getText().toString().equalsIgnoreCase("+")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("-")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("*")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("/")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }
                }

            } else  if(edt1.getText().toString().equalsIgnoreCase("/")){


                if(edt2.getText().toString().equalsIgnoreCase("+")){
                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }



                } else if(edt2.getText().toString().equalsIgnoreCase("-")){
                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")) {
                        if (edt4.getText().toString().equalsIgnoreCase("+")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("-")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("*")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("/")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }



                } else if(edt2.getText().toString().equalsIgnoreCase("*")){
                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")) {
                        if (edt4.getText().toString().equalsIgnoreCase("+")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("-")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("*")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("/")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }
                }


                else if(edt2.getText().toString().equalsIgnoreCase("/")){

                    if(edt3.getText().toString().equalsIgnoreCase("+")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) + Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("-")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) - Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("*")){
                        if(edt4.getText().toString().equalsIgnoreCase("+")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("-")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("*")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if(edt4.getText().toString().equalsIgnoreCase("/")){
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) * Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    } else if(edt3.getText().toString().equalsIgnoreCase("/")) {
                        if (edt4.getText().toString().equalsIgnoreCase("+")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) + Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("-")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) - Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("*")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) * Integer.parseInt(text5.getText().toString()));
                        } else if (edt4.getText().toString().equalsIgnoreCase("/")) {
                            result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()) / Integer.parseInt(text4.getText().toString()) / Integer.parseInt(text5.getText().toString()));
                        }
                    }
                }
            }


            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();


        }else if(dictionary[4].equalsIgnoreCase("64")){

            if(edt1.getText().toString().equalsIgnoreCase("+")){
                if(edt2.getText().toString().equalsIgnoreCase("+")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()));
                } else  if(edt2.getText().toString().equalsIgnoreCase("-")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()));
                } else  if(edt2.getText().toString().equalsIgnoreCase("*")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()));
                }  else  if(edt2.getText().toString().equalsIgnoreCase("/")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) + Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()));
                }
            } else  if(edt1.getText().toString().equalsIgnoreCase("-")){
                if(edt2.getText().toString().equalsIgnoreCase("+")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()));
                } else  if(edt2.getText().toString().equalsIgnoreCase("-")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()));
                } else  if(edt2.getText().toString().equalsIgnoreCase("*")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()));
                }  else  if(edt2.getText().toString().equalsIgnoreCase("/")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) - Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()));
                }
            } else  if(edt1.getText().toString().equalsIgnoreCase("*")){
                if(edt2.getText().toString().equalsIgnoreCase("+")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()));
                } else  if(edt2.getText().toString().equalsIgnoreCase("-")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()));
                } else  if(edt2.getText().toString().equalsIgnoreCase("*")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()));
                }  else  if(edt2.getText().toString().equalsIgnoreCase("/")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) * Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()));
                }
            }  else  if(edt1.getText().toString().equalsIgnoreCase("/")){
                if(edt2.getText().toString().equalsIgnoreCase("+")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) + Integer.parseInt(text3.getText().toString()));
                } else  if(edt2.getText().toString().equalsIgnoreCase("-")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) - Integer.parseInt(text3.getText().toString()));
                } else  if(edt2.getText().toString().equalsIgnoreCase("*")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) * Integer.parseInt(text3.getText().toString()));
                }  else  if(edt2.getText().toString().equalsIgnoreCase("/")){
                    result = String.valueOf(Integer.parseInt(text1.getText().toString()) / Integer.parseInt(text2.getText().toString()) / Integer.parseInt(text3.getText().toString()));
                }
            }

            if(edt5.getText().toString().equalsIgnoreCase("+")){
                result2 = String.valueOf(Integer.parseInt(text5.getText().toString()) + Integer.parseInt(text6.getText().toString()));
            } else  if(edt5.getText().toString().equalsIgnoreCase("-")){
                result2 = String.valueOf(Integer.parseInt(text5.getText().toString()) - Integer.parseInt(text6.getText().toString()));
            } else  if(edt5.getText().toString().equalsIgnoreCase("*")){
                result2 = String.valueOf(Integer.parseInt(text5.getText().toString()) * Integer.parseInt(text6.getText().toString()));
            }  else  if(edt5.getText().toString().equalsIgnoreCase("/")){
                result2 = String.valueOf(Integer.parseInt(text5.getText().toString()) / Integer.parseInt(text6.getText().toString()));
            }
        } else if(dictionary[4].equalsIgnoreCase("95")){

        }

        if(dictionary[4].equalsIgnoreCase("46")) {
            if (result.equalsIgnoreCase(text12.getText().toString())) {

                int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
                money_for_open_word += 10;
                Money_text.setText("" + money_for_open_word);
                forResult();
            } else {
                edt1.setText("");
                edt2.setText("");
                edt3.setText("");
                edt4.setText("");
                edt5.setText("");
                edt6.setText("");
                edt7.setText("");
                edt8.setText("");
                String answer = getResources().getString(R.string.toastButtonCamp);
                toast = Toast.makeText(SignsCampaign.this, answer, Toast.LENGTH_LONG);
                toast.show();
            }
            }
        else if(dictionary[4].equalsIgnoreCase("64")) {
        if (result.equalsIgnoreCase(result2)) {

            int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
            money_for_open_word += 10;
            Money_text.setText("" + money_for_open_word);
            forResult();
        } else {
            edt1.setText("");
            edt2.setText("");
            edt3.setText("");
            edt4.setText("");
            edt5.setText("");
            edt6.setText("");
            edt7.setText("");
            edt8.setText("");
            String answer = getResources().getString(R.string.toastButtonCamp);
            toast = Toast.makeText(SignsCampaign.this, answer, Toast.LENGTH_LONG);
            toast.show();
        }
    }
}


    public void Check(View view) {
        checkAnswer();
    }

    public void ClickButt(View view) {
        switch (view.getId()){
            case R.id.WordPlus:
                if(dictionary[4].equalsIgnoreCase("64")) {
                    if (edt1.getText().toString().equalsIgnoreCase(""))
                        edt1.setText(WordPlus.getText().toString());
                    else if (edt2.getText().toString().equalsIgnoreCase(""))
                        edt2.setText(WordPlus.getText().toString());
                    else if (edt5.getText().toString().equalsIgnoreCase(""))
                        edt5.setText(WordPlus.getText().toString());
                }else {
                    if (edt1.getText().toString().equalsIgnoreCase(""))
                        edt1.setText(WordPlus.getText().toString());
                    else if (edt2.getText().toString().equalsIgnoreCase(""))
                        edt2.setText(WordPlus.getText().toString());
                    else if (edt3.getText().toString().equalsIgnoreCase(""))
                        edt3.setText(WordPlus.getText().toString());
                    else if (edt4.getText().toString().equalsIgnoreCase(""))
                        edt4.setText(WordPlus.getText().toString());
                    else if (edt5.getText().toString().equalsIgnoreCase(""))
                        edt5.setText(WordPlus.getText().toString());
                    else if (edt6.getText().toString().equalsIgnoreCase(""))
                        edt6.setText(WordPlus.getText().toString());
                    else if (edt7.getText().toString().equalsIgnoreCase(""))
                        edt7.setText(WordPlus.getText().toString());
                    else if (edt8.getText().toString().equalsIgnoreCase(""))
                        edt8.setText(WordPlus.getText().toString());
                }
                break;
            case R.id.WordMinus:
                if(dictionary[4].equalsIgnoreCase("64")) {
                    if (edt1.getText().toString().equalsIgnoreCase(""))
                        edt1.setText(WordMinus.getText().toString());
                    else if (edt2.getText().toString().equalsIgnoreCase(""))
                        edt2.setText(WordMinus.getText().toString());
                    else if (edt5.getText().toString().equalsIgnoreCase(""))
                        edt5.setText(WordMinus.getText().toString());
                }else {
                    if (edt1.getText().toString().equalsIgnoreCase(""))
                        edt1.setText(WordMinus.getText().toString());
                    else if (edt2.getText().toString().equalsIgnoreCase(""))
                        edt2.setText(WordMinus.getText().toString());
                    else if (edt3.getText().toString().equalsIgnoreCase(""))
                        edt3.setText(WordMinus.getText().toString());
                    else if (edt4.getText().toString().equalsIgnoreCase(""))
                        edt4.setText(WordMinus.getText().toString());
                    else if (edt5.getText().toString().equalsIgnoreCase(""))
                        edt5.setText(WordMinus.getText().toString());
                    else if (edt6.getText().toString().equalsIgnoreCase(""))
                        edt6.setText(WordMinus.getText().toString());
                    else if (edt7.getText().toString().equalsIgnoreCase(""))
                        edt7.setText(WordMinus.getText().toString());
                    else if (edt8.getText().toString().equalsIgnoreCase(""))
                        edt8.setText(WordMinus.getText().toString());
                }
                break;
            case R.id.WordMnosh:
                if(dictionary[4].equalsIgnoreCase("64")) {
                    if (edt1.getText().toString().equalsIgnoreCase(""))
                        edt1.setText(WordMnosh.getText().toString());
                    else if (edt2.getText().toString().equalsIgnoreCase(""))
                        edt2.setText(WordMnosh.getText().toString());
                    else if (edt5.getText().toString().equalsIgnoreCase(""))
                        edt5.setText(WordMnosh.getText().toString());
                }else {
                    if (edt1.getText().toString().equalsIgnoreCase(""))
                        edt1.setText(WordMnosh.getText().toString());
                    else if (edt2.getText().toString().equalsIgnoreCase(""))
                        edt2.setText(WordMnosh.getText().toString());
                    else if (edt3.getText().toString().equalsIgnoreCase(""))
                        edt3.setText(WordMnosh.getText().toString());
                    else if (edt4.getText().toString().equalsIgnoreCase(""))
                        edt4.setText(WordMnosh.getText().toString());
                    else if (edt5.getText().toString().equalsIgnoreCase(""))
                        edt5.setText(WordMnosh.getText().toString());
                    else if (edt6.getText().toString().equalsIgnoreCase(""))
                        edt6.setText(WordMnosh.getText().toString());
                    else if (edt7.getText().toString().equalsIgnoreCase(""))
                        edt7.setText(WordMnosh.getText().toString());
                    else if (edt8.getText().toString().equalsIgnoreCase(""))
                        edt8.setText(WordMnosh.getText().toString());
                }
                break;
            case R.id.WordDel:
                if(dictionary[4].equalsIgnoreCase("64")) {
                    if (edt1.getText().toString().equalsIgnoreCase(""))
                        edt1.setText(WordDel.getText().toString());
                    else if (edt2.getText().toString().equalsIgnoreCase(""))
                        edt2.setText(WordDel.getText().toString());
                    else if (edt5.getText().toString().equalsIgnoreCase(""))
                        edt5.setText(WordDel.getText().toString());
                }else {
                    if (edt1.getText().toString().equalsIgnoreCase(""))
                        edt1.setText(WordDel.getText().toString());
                    else if (edt2.getText().toString().equalsIgnoreCase(""))
                        edt2.setText(WordDel.getText().toString());
                    else if (edt3.getText().toString().equalsIgnoreCase(""))
                        edt3.setText(WordDel.getText().toString());
                    else if (edt4.getText().toString().equalsIgnoreCase(""))
                        edt4.setText(WordDel.getText().toString());
                    else if (edt5.getText().toString().equalsIgnoreCase(""))
                        edt5.setText(WordDel.getText().toString());
                    else if (edt6.getText().toString().equalsIgnoreCase(""))
                        edt6.setText(WordDel.getText().toString());
                    else if (edt7.getText().toString().equalsIgnoreCase(""))
                        edt7.setText(WordDel.getText().toString());
                    else if (edt8.getText().toString().equalsIgnoreCase(""))
                        edt8.setText(WordDel.getText().toString());
                }
                break;
        }
    }

    public void CleanEdt(View view) {
        edt1.setText("");
        edt2.setText("");
        edt3.setText("");
        edt4.setText("");
        edt5.setText("");
        edt6.setText("");
        edt7.setText("");
        edt8.setText("");
    }


    public void progressBar1() {
        Intent intent = getIntent();
        x = intent.getIntExtra("progress", 0);
        progressBar.setProgress(x);
    }

    public void forResult() {
        switch (dictionary[4]) {
            case "46":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_57 = new Intent();
                intent_57.putExtra("money_result", Money_text.getText().toString());
                intent_57.putExtra("block", "46");
                setResult(RESULT_OK, intent_57);
                finish();
                break;
            case "64":
                if (toast!= null) {
                    toast.cancel();
                }
                Intent intent_79 = new Intent();
                intent_79.putExtra("money_result", Money_text.getText().toString());
                intent_79.putExtra("block", "64");
                setResult(RESULT_OK, intent_79);
                finish();
                break;
        }
    }

    private void loadMoney(){
        prefs = getSharedPreferences("Money", MODE_PRIVATE);
        Money_text.setText(""+prefs.getInt("money", 0));
    }

    public void changeWord() {
        Intent intent = getIntent();
        dictionary[0] = intent.getStringExtra("dictionary");
        textFind.setText(dictionary[0]);
        dictionary[1] = intent.getStringExtra("answer");
        dictionary[2] = intent.getStringExtra("answer1");
        dictionary[3] = intent.getStringExtra("answer2");
        dictionary[5] = intent.getStringExtra("answer3");
        dictionary[6] = intent.getStringExtra("answer4");
        dictionary[7] = intent.getStringExtra("answer5");
        dictionary[8] = intent.getStringExtra("answer6");
        dictionary[9] = intent.getStringExtra("answer7");
        dictionary[4] = String.valueOf(intent.getIntExtra("lvl",0));

        if(intent!=null) {
            int m = intent.getIntExtra("money_data",0);
            Money_text.setText(String.valueOf(m));
            SaveMoney();
        }else{
            loadMoney();
        }

        String level = getResources().getString(R.string.levelButtonCamp);
        textLvls.setText(level + ": " + intent.getIntExtra("lvl",0));


        if((intent.getIntExtra("lvl",0)) == 46){
            edt5.setVisibility(View.GONE);
            edt6.setVisibility(View.GONE);
            edt7.setVisibility(View.GONE);
            edt8.setVisibility(View.GONE);
            text1.setText("7");
            text2.setText("5");
            text3.setText("8");
            text4.setText("2");
            text5.setText("4");
            text11.setText("=");
            text12.setText("35");

            text6.setVisibility(View.GONE);
            text7.setVisibility(View.GONE);
            text8.setVisibility(View.GONE);
            text9.setVisibility(View.GONE);
            text10.setVisibility(View.GONE);

        } else if((intent.getIntExtra("lvl",0)) == 64){

            text1.setText("1");
            text2.setText("17");
            text3.setText("3");
            edt3.setVisibility(View.GONE);
            text4.setText("=");
            edt4.setVisibility(View.GONE);
            text5.setText("9");
            text6.setText("6");

            edt6.setVisibility(View.GONE);
            edt7.setVisibility(View.GONE);
            edt8.setVisibility(View.GONE);


            text7.setVisibility(View.GONE);
            text8.setVisibility(View.GONE);
            text9.setVisibility(View.GONE);
            text10.setVisibility(View.GONE);
            text11.setVisibility(View.GONE);
            text12.setVisibility(View.GONE);

        }
    }



    private void newGame() {
        edt1.setText("");

        edt1.setEnabled(true);


    }


    private void Edt(EditText edt1){
        edt1.setCursorVisible(false);
        edt1.setLongClickable(false);
        edt1.setClickable(false);
        edt1.setFocusable(false);
        edt1.setSelected(false);
        edt1.setKeyListener(null);
    }

    private void enterWord() { // Количество вводимых слов в строку
        Edt(edt1);
        Edt(edt2);
        Edt(edt3);
        Edt(edt4);
        Edt(edt5);
        Edt(edt6);
        Edt(edt7);
        Edt(edt8);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("save_count", Money_text.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Money_text.setText(savedInstanceState.getString("save_count"));
    }

    @Override
    public void onBackPressed() {
        if (toast!= null) {
            toast.cancel();
        }
        Intent i2 = new Intent();
        i2.putExtra("money_result", Money_text.getText().toString());
        i2.putExtra("block", "0");
        setResult(RESULT_OK, i2);
        finish();
        super.onBackPressed();
    }

    public void HintsAnag(View view) {
        //showAlertDialogButtonClicked();
        finish();
    }

    public void showAlertDialogButtonClicked() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Выберите подсказку");


        String[] words = {"Открыть 1 знак", "Показать ответ"};
        builder.setItems(words, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:

                        break;
                    case 1:
                        AlertDialog.Builder builder = new AlertDialog.Builder(SignsCampaign.this);
                        View view;
                        view = LayoutInflater.from(SignsCampaign.this).inflate(R.layout.mathcampaigntips, null);
                        ImageButton imageButton = (ImageButton) view.findViewById(R.id.imageTips);

                        if(dictionary[4].equals("46")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        } else  if(dictionary[4].equals("64")){
                            imageButton.setImageResource(R.drawable.lvl101);
                        }

                        builder.setView(view);
                        builder.show();

                }
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();

    }


    @Override
    protected void onDestroy() {
        if (toast!= null) {
            toast.cancel();
        }
        SaveMoney();
        super.onDestroy();
    }

    public void GetBack(View view) {
        if (toast!= null) {
            toast.cancel();
        }
        Intent i2 = new Intent();
        i2.putExtra("money_result", Money_text.getText().toString());
        i2.putExtra("block", "0");
        setResult(RESULT_OK, i2);
        finish();
        super.onBackPressed();
    }
    private void SaveMoney(){
        prefs = getSharedPreferences("Money", MODE_PRIVATE);
        prefEdit = prefs.edit();
        prefEdit.putInt("money", Integer.parseInt(Money_text.getText().toString()));
        prefEdit.commit();
    }

    public void GoShop(View view) {
        //Intent intent = new Intent(SignsCampaign.this, Shop.class);
        //startActivity(intent);
    }
}
