package com.puzzle.mathpuzzle.CampaignSuma;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.puzzle.mathpuzzle.R;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CampaignTestSuma extends AppCompatActivity {

    @BindView(R.id.num11) Button num11;
    @BindView(R.id.num12) Button num12;
    @BindView(R.id.num13) Button num13;
    @BindView(R.id.num14) Button num14;
    @BindView(R.id.num21) Button num21;
    @BindView(R.id.num22) Button num22;
    @BindView(R.id.num23) Button num23;
    @BindView(R.id.num24) Button num24;
    @BindView(R.id.num31) Button num31;
    @BindView(R.id.num32) Button num32;
    @BindView(R.id.num33) Button num33;
    @BindView(R.id.num34) Button num34;
    @BindView(R.id.num41) Button num41;
    @BindView(R.id.num42) Button num42;
    @BindView(R.id.num43) Button num43;
    @BindView(R.id.num44) Button num44;


    @BindView(R.id.answer1) Button answer1;
    @BindView(R.id.answer2) Button answer2;
    @BindView(R.id.answer3) Button answer3;
    @BindView(R.id.answer4) Button answer4;
    @BindView(R.id.answer5) Button answer5;
    @BindView(R.id.answer6) Button answer6;
    @BindView(R.id.answer7) Button answer7;
    @BindView(R.id.answer8) Button answer8;
    @BindView(R.id.answer9) Button answer9;
    @BindView(R.id.answer10) Button answer10;
    @BindView(R.id.answer11) Button answer11;
    @BindView(R.id.answer12) Button answer12;
    @BindView(R.id.answer13) Button answer13;
    @BindView(R.id.answer14) Button answer14;
    @BindView(R.id.answer15) Button answer15;
    @BindView(R.id.answer16) Button answer16;

    @BindView(R.id.check1) Button check1;
    @BindView(R.id.check2) Button check2;
    @BindView(R.id.check3) Button check3;
    @BindView(R.id.check4) Button check4;
    @BindView(R.id.check5) Button check5;
    @BindView(R.id.check6) Button check6;
    @BindView(R.id.check7) Button check7;
    @BindView(R.id.check8) Button check8;
    @BindView(R.id.check9) Button check9;
    @BindView(R.id.check10) Button check10;
    @BindView(R.id.check11) Button check11;
    @BindView(R.id.check12) Button check12;
    @BindView(R.id.check13) Button check13;
    @BindView(R.id.check14) Button check14;
    @BindView(R.id.check15) Button check15;
    @BindView(R.id.check16) Button check16;


    @BindView(R.id.level) TextView level;

    boolean number11 = false;
    boolean number12 = false;
    boolean number13 = false;
    boolean number14 = false;

    boolean number21 = false;
    boolean number22 = false;
    boolean number23 = false;
    boolean number24 = false;

    boolean number31 = false;
    boolean number32 = false;
    boolean number33 = false;
    boolean number34 = false;

    boolean number41 = false;
    boolean number42 = false;
    boolean number43 = false;
    boolean number44 = false;

    boolean Answer1 = false;
    boolean Answer2 = false;
    boolean Answer3 = false;
    boolean Answer4= false;
    boolean Answer5= false;
    boolean Answer6= false;
    boolean Answer7= false;
    boolean Answer8= false;
    boolean Answer9= false;
    boolean Answer10= false;
    boolean Answer11 = false;
    boolean Answer12= false;
    boolean Answer13= false;
    boolean Answer14= false;
    boolean Answer15= false;
    boolean Answer16= false;
    int lvl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campaign_test_suma);
        ButterKnife.bind(this);


        newGame();

        Check(number11,number21,number31,number41,answer1,answer13,num11,num21,num31,num41,Answer1,Answer13);
        Check(number12,number22,number32,number42,answer2,answer14,num12,num22,num32,num42,Answer2,Answer14);
        Check(number13,number23,number33,number43,answer3,answer15,num13,num23,num33,num43,Answer3,Answer15);
        Check(number14,number24,number34,number44,answer4,answer16,num14,num24,num34,num44,Answer4,Answer16);

        Check(number11,number12,number13,number14,answer5,answer9,num11,num12,num13,num14,Answer5,Answer9);
        Check(number21,number22,number23,number24,answer6,answer10,num21,num22,num23,num24,Answer6,Answer10);
        Check(number31,number32,number33,number34,answer7,answer11,num31,num32,num33,num34,Answer7,Answer11);
        Check(number41,number42,number43,number44,answer8,answer12,num41,num42,num43,num44,Answer8,Answer12);

        CheckTwo(number11,number21,number31,number41,check1,check13,num11,num21,num31,num41);
        CheckTwo(number12,number22,number32,number42,check2,check14,num12,num22,num32,num42);
        CheckTwo(number13,number23,number33,number43,check3,check15,num13,num23,num33,num43);
        CheckTwo(number14,number24,number34,number44,check4,check16,num14,num24,num34,num44);

        CheckTwo(number11,number12,number13,number14,check5,check9,num11,num12,num13,num14);
        CheckTwo(number21,number22,number23,number24,check6,check10,num21,num22,num23,num24);
        CheckTwo(number31,number32,number33,number34,check7,check11,num31,num32,num33,num34);
        CheckTwo(number41,number42,number43,number44,check8,check12,num41,num42,num43,num44);
    }

    private void insertDate(String one1, String one2,String one3,String one4,String two1,String two2,String two3,String two4
    ,String three1,String three2,String three3,String three4,String four1,String four2,String four3,String four4,
                            String answ1,  String answ2,  String answ3,  String answ4, String answ5, String answ6, String answ7, String answ8){
        num11.setText(one1);
        num12.setText(one2);
        num13.setText(one3);
        num14.setText(one4);
        num21.setText(two1);
        num22.setText(two2);
        num23.setText(two3);
        num24.setText(two4);
        num31.setText(three1);
        num32.setText(three2);
        num33.setText(three3);
        num34.setText(three4);
        num41.setText(four1);
        num42.setText(four2);
        num43.setText(four3);
        num44.setText(four4);

        answer1.setText(answ1);
        answer2.setText(answ2);
        answer3.setText(answ3);
        answer4.setText(answ4);
        answer5.setText(answ5);
        answer6.setText(answ6);
        answer7.setText(answ7);
        answer8.setText(answ8);
        answer9.setText(answ5);
        answer10.setText(answ6);
        answer11.setText(answ7);
        answer12.setText(answ8);
        answer13.setText(answ1);
        answer14.setText(answ2);
        answer15.setText(answ3);
        answer16.setText(answ4);
    }

    private void newGame(){
        Intent intent = getIntent();
        lvl =intent.getIntExtra("lvl",0);
        String levels = getResources().getString(R.string.levelButtonCamp);
        level.setText(levels + ":  " + lvl);
        if(lvl == 1){
            insertDate("6","3", "4", "2", "4","8" , "4", "8", "1", "5", "7", "1", "5", "1", "6", "3", "11", "9", "15", "8", "10", "20", "7", "6");
        }else if(lvl == 2){
            insertDate("8","7","5","2","3","10","6","2","3","7","5","2","4","3","4","4","15","24","10","8","15","18","12","12");
        }else if(lvl == 3){
            insertDate("6","10","6","4","2","4","12","6","7","4","6","7","4","4","4","8","19","14","22","25","20","20","20","20");
        }else if(lvl == 4){
            insertDate("11","3","7","10","8","15","7","5","2","3","2","20","10","4","15","5","29","21","31","30","21","35","25","30");
        }else if(lvl == 5){
            insertDate("7","4","22","26","27","10","7","11","6","14","7","14","13","18","10","5","40","32","24","42","33","45","27","33");
        }else if(lvl == 6){
            insertDate("33","13","18","32","12","24","28","22","26","1","1","2","7","4","4","10","45","41","50","66","63","86","28","25");
        }else if(lvl == 7){
            insertDate("27","29","34","27","66","11","28","40","36","72","27","36","30","61","36","67","96","101","89","94","90","94","99","97");
        }else if(lvl == 8){
            insertDate("127","2","52","77","28","20","87","62","65","65","65","70","34","49","49","55","127","134","139","132","129","135","130","138");
        }else if(lvl == 9){
            insertDate("107","85","53","75","68","72","86","34","49","78","24","52","49","30","70","109","156","150","163","161","160","158","154","158");
        }
    }

    public void ClickNumber(View view) {
        switch (view.getId()){
            case R.id.num11:
                if(!number11) {
                    num11.setBackgroundResource(R.drawable.roundebutton2);
                    number11 = true;
                } else {
                    num11.setBackgroundResource(R.drawable.roundebutton);
                    number11 = false;
                }
                break;
            case R.id.num12:
                if(!number12) {
                    num12.setBackgroundResource(R.drawable.roundebutton2);
                    number12 = true;
                } else {
                    num12.setBackgroundResource(R.drawable.roundebutton);
                    number12 = false;
                }
                break;
            case R.id.num13:
                if(!number13) {
                    num13.setBackgroundResource(R.drawable.roundebutton2);
                    number13 = true;
                } else {
                    num13.setBackgroundResource(R.drawable.roundebutton);
                    number13 = false;
                }
                break;
            case R.id.num14:
                if(!number14) {
                    num14.setBackgroundResource(R.drawable.roundebutton2);
                    number14 = true;
                } else {
                    num14.setBackgroundResource(R.drawable.roundebutton);
                    number14 = false;
                }
                break;
            case R.id.num21:
                if(!number21) {
                    num21.setBackgroundResource(R.drawable.roundebutton2);
                    number21 = true;
                } else {
                    num21.setBackgroundResource(R.drawable.roundebutton);
                    number21 = false;
                }
                break;
            case R.id.num22:
                if(!number22) {
                    num22.setBackgroundResource(R.drawable.roundebutton2);
                    number22 = true;
                } else {
                    num22.setBackgroundResource(R.drawable.roundebutton);
                    number22 = false;
                }
                break;
            case R.id.num23:
                if(!number23) {
                    num23.setBackgroundResource(R.drawable.roundebutton2);
                    number23 = true;
                } else {
                    num23.setBackgroundResource(R.drawable.roundebutton);
                    number23 = false;
                }
                break;
            case R.id.num24:
                if(!number24) {
                    num24.setBackgroundResource(R.drawable.roundebutton2);
                    number24 = true;
                } else {
                    num24.setBackgroundResource(R.drawable.roundebutton);
                    number24 = false;
                }
                break;
            case R.id.num31:
                if(!number31) {
                    num31.setBackgroundResource(R.drawable.roundebutton2);
                    number31 = true;
                } else {
                    num31.setBackgroundResource(R.drawable.roundebutton);
                    number31 = false;
                }
                break;
            case R.id.num32:
                if(!number32) {
                    num32.setBackgroundResource(R.drawable.roundebutton2);
                    number32 = true;
                } else {
                    num32.setBackgroundResource(R.drawable.roundebutton);
                    number32 = false;
                }
                break;
            case R.id.num33:
                if(!number33) {
                    num33.setBackgroundResource(R.drawable.roundebutton2);
                    number33 = true;
                } else {
                    num33.setBackgroundResource(R.drawable.roundebutton);
                    number33 = false;
                }
                break;
            case R.id.num34:
                if(!number34) {
                    num34.setBackgroundResource(R.drawable.roundebutton2);
                    number34 = true;
                } else {
                    num34.setBackgroundResource(R.drawable.roundebutton);
                    number34 = false;
                }
                break;
            case R.id.num41:
                if(!number41) {
                    num41.setBackgroundResource(R.drawable.roundebutton2);
                    number41 = true;
                } else {
                    num41.setBackgroundResource(R.drawable.roundebutton);
                    number41 = false;
                }
                break;
            case R.id.num42:
                if(!number42) {
                    num42.setBackgroundResource(R.drawable.roundebutton2);
                    number42 = true;
                } else {
                    num42.setBackgroundResource(R.drawable.roundebutton);
                    number42 = false;
                }
                break;
            case R.id.num43:
                if(!number43) {
                    num43.setBackgroundResource(R.drawable.roundebutton2);
                    number43 = true;
                } else {
                    num43.setBackgroundResource(R.drawable.roundebutton);
                    number43 = false;
                }
                break;
            case R.id.num44:
                if(!number44) {
                    num44.setBackgroundResource(R.drawable.roundebutton2);
                    number44 = true;
                } else {
                    num44.setBackgroundResource(R.drawable.roundebutton);
                    number44 = false;
                }
                break;
        }

        Check(number11,number21,number31,number41,answer1,answer13,num11,num21,num31,num41,Answer1,Answer13);
        Check(number12,number22,number32,number42,answer2,answer14,num12,num22,num32,num42,Answer2,Answer14);
        Check(number13,number23,number33,number43,answer3,answer15,num13,num23,num33,num43,Answer3,Answer15);
        Check(number14,number24,number34,number44,answer4,answer16,num14,num24,num34,num44,Answer4,Answer16);

        Check(number11,number12,number13,number14,answer5,answer9,num11,num12,num13,num14,Answer5,Answer9);
        Check(number21,number22,number23,number24,answer6,answer10,num21,num22,num23,num24,Answer6,Answer10);
        Check(number31,number32,number33,number34,answer7,answer11,num31,num32,num33,num34,Answer7,Answer11);
        Check(number41,number42,number43,number44,answer8,answer12,num41,num42,num43,num44,Answer8,Answer12);

        CheckTwo(number11,number21,number31,number41,check1,check13,num11,num21,num31,num41);
        CheckTwo(number12,number22,number32,number42,check2,check14,num12,num22,num32,num42);
        CheckTwo(number13,number23,number33,number43,check3,check15,num13,num23,num33,num43);
        CheckTwo(number14,number24,number34,number44,check4,check16,num14,num24,num34,num44);

        CheckTwo(number11,number12,number13,number14,check5,check9,num11,num12,num13,num14);
        CheckTwo(number21,number22,number23,number24,check6,check10,num21,num22,num23,num24);
        CheckTwo(number31,number32,number33,number34,check7,check11,num31,num32,num33,num34);
        CheckTwo(number41,number42,number43,number44,check8,check12,num41,num42,num43,num44);

        CheckAnswer();
    }

    private void Check(boolean number11,boolean number12, boolean number13, boolean number14, Button answer1, Button answer13
    ,Button num11, Button num21, Button num31,Button num41,boolean Answer1,boolean Answer13){
        if(number11 && number12 && number13 && number14){
            answer1.setBackgroundResource(R.drawable.sumabutton);
            answer13.setBackgroundResource(R.drawable.sumabutton);
        } else if(!number11 && number12 && number13 && number14){
            if((Integer.parseInt(num11.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        } else if(number11 && !number12 && number13 && number14){
            if((Integer.parseInt(num21.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        } else if(number11 && number12 && !number13 && number14){
            if((Integer.parseInt(num31.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        } else if(number11 && number12 && number13 && !number14){
            if((Integer.parseInt(num41.getText().toString()))== Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        } else if(!number11 && !number12 && number13 && number14){
            if((Integer.parseInt(num11.getText().toString()) +  (Integer.parseInt(num21.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        } else if(!number11 && number12 && !number13 && number14){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        } else if(!number11 && number12 && number13 && !number14){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        } else if(number11 && !number12 && !number13 && number14){
            if((Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        } else if(number11 && !number12 && number13 && !number14){
            if((Integer.parseInt(num21.getText().toString()))+ (Integer.parseInt(num41.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        } else if(number11 && number12 && !number13 && !number14){
            if((Integer.parseInt(num31.getText().toString()))
                    + (Integer.parseInt(num41.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        } else if(!number11 && !number12 && !number13 && number14){
            if((Integer.parseInt(num11.getText().toString()) +  (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))
                    ) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        } else if(!number11 && !number12 && number13 && !number14){
            if((Integer.parseInt(num11.getText().toString()) +  (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        } else if(!number11 && number12 && !number13 && !number14){
            if((Integer.parseInt(num11.getText().toString())  + (Integer.parseInt(num31.getText().toString()))
                    + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        } else if(number11 && !number12 && !number13 && !number14){
            if((Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))
                    + (Integer.parseInt(num41.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        } else if(!number11 && !number12 && !number13 && !number14){
            if((Integer.parseInt(num11.getText().toString()) +  (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))
                    + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
                Answer1 = true;
                Answer13 = true;
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
                Answer1 = false;
                Answer13 = false;
            }
        }
    }

    private void CheckTwo(boolean number11,boolean number12, boolean number13, boolean number14, Button check1, Button check13
            ,Button num11, Button num21, Button num31,Button num41){
        if(number11 && number12 && number13 && number14){
            check1.setText("0");
            check13.setText("0");
        } else if(!number11 && number12 && number13 && number14){
            check1.setText("" + (Integer.parseInt(num11.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString())));
        } else if(number11 && !number12 && number13 && number14){
            check1.setText("" + (Integer.parseInt(num21.getText().toString())));
            check13.setText("" + (Integer.parseInt(num21.getText().toString())));
        } else if(number11 && number12 && !number13 && number14){
            check1.setText("" + (Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num31.getText().toString())));
        } else if(number11 && number12 && number13 && !number14){
            check1.setText("" + (Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num41.getText().toString())));
        } else if(!number11 && !number12 && number13 && number14){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) +  (Integer.parseInt(num21.getText().toString()))));
        } else if(!number11 && number12 && !number13 && number14){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString()))));
        } else if(!number11 && number12 && number13 && !number14){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString()))));
        } else if(number11 && !number12 && !number13 && number14){
            check1.setText("" + ((Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
            check13.setText("" + ((Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
        } else if(number11 && !number12 && number13 && !number14){
            check1.setText("" + ((Integer.parseInt(num21.getText().toString()))+ (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + ((Integer.parseInt(num21.getText().toString()))+ (Integer.parseInt(num41.getText().toString()))));
        } else if(number11 && number12 && !number13 && !number14){
            check1.setText("" + ((Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + ((Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        } else if(!number11 && !number12 && !number13 && number14){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) +  (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) +  (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
        } else if(!number11 && !number12 && number13 && !number14){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) +  (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) +  (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        } else if(!number11 && number12 && !number13 && !number14){
            check1.setText("" + (Integer.parseInt(num11.getText().toString())  + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString())  + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        } else if(number11 && !number12 && !number13 && !number14){
            check1.setText("" + ((Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + ((Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        } else if(!number11 && !number12 && !number13 && !number14){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) +  (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) +  (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        }
    }


    private void CheckAnswer(){
        if(Integer.parseInt(answer1.getText().toString()) == Integer.parseInt(check1.getText().toString()) && Integer.parseInt(answer2.getText().toString()) == Integer.parseInt(check2.getText().toString()) && Integer.parseInt(answer3.getText().toString()) == Integer.parseInt(check3.getText().toString()) &&Integer.parseInt(answer4.getText().toString()) == Integer.parseInt(check4.getText().toString())
                && Integer.parseInt(answer5.getText().toString()) == Integer.parseInt(check5.getText().toString()) && Integer.parseInt(answer6.getText().toString()) == Integer.parseInt(check6.getText().toString()) && Integer.parseInt(answer7.getText().toString()) == Integer.parseInt(check7.getText().toString()) && Integer.parseInt(answer8.getText().toString()) == Integer.parseInt(check8.getText().toString())
                && Integer.parseInt(answer9.getText().toString()) == Integer.parseInt(check9.getText().toString()) && Integer.parseInt(answer10.getText().toString()) == Integer.parseInt(check10.getText().toString()) && Integer.parseInt(answer11.getText().toString()) == Integer.parseInt(check11.getText().toString()) && Integer.parseInt(answer12.getText().toString()) == Integer.parseInt(check12.getText().toString())
                &&Integer.parseInt(answer13.getText().toString()) == Integer.parseInt(check13.getText().toString()) && Integer.parseInt(answer14.getText().toString()) == Integer.parseInt(check14.getText().toString()) && Integer.parseInt(answer15.getText().toString()) == Integer.parseInt(check15.getText().toString()) && Integer.parseInt(answer16.getText().toString()) == Integer.parseInt(check16.getText().toString()) ){
            check1.setEnabled(false);
            check2.setEnabled(false);
            check3.setEnabled(false);
            check4.setEnabled(false);
            check5.setEnabled(false);
            check6.setEnabled(false);
            check7.setEnabled(false);
            check8.setEnabled(false);
            check9.setEnabled(false);
            check10.setEnabled(false);
            check11.setEnabled(false);
            check12.setEnabled(false);
            check13.setEnabled(false);

            answer1.setEnabled(false);
            answer2.setEnabled(false);
            answer3.setEnabled(false);
            answer4.setEnabled(false);
            answer5.setEnabled(false);
            answer6.setEnabled(false);
            answer7.setEnabled(false);
            answer8.setEnabled(false);
            answer9.setEnabled(false);
            answer10.setEnabled(false);
            answer11.setEnabled(false);
            answer12.setEnabled(false);
            answer13.setEnabled(false);

            num11.setEnabled(false);
            num12.setEnabled(false);
            num13.setEnabled(false);
            num14.setEnabled(false);
            num21.setEnabled(false);
            num22.setEnabled(false);
            num23.setEnabled(false);
            num24.setEnabled(false);
            num31.setEnabled(false);
            num32.setEnabled(false);
            num33.setEnabled(false);
            num34.setEnabled(false);
            num41.setEnabled(false);
            num42.setEnabled(false);
            num43.setEnabled(false);
            num44.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    Intent intent_1 = new Intent();
                    intent_1.putExtra("money_result", 20);
                    intent_1.putExtra("block", lvl);
                    setResult(RESULT_OK, intent_1);
                    finish();
                }
            }, 1500);

        }
    }

    @Override
    public void onBackPressed() {
        Intent intent_1 = new Intent();
        intent_1.putExtra("money_result", 0);
        intent_1.putExtra("block", 0);
        setResult(RESULT_OK, intent_1);
        finish();
        super.onBackPressed();
    }

    public void Back(View view) {
        Intent intent_1 = new Intent();
        intent_1.putExtra("money_result", 0);
        intent_1.putExtra("block", 0);
        setResult(RESULT_OK, intent_1);
        finish();
    }
}
