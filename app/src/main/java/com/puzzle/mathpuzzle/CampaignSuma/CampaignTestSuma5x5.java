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

import butterknife.BindView;
import butterknife.ButterKnife;

public class CampaignTestSuma5x5 extends AppCompatActivity {

    @BindView(R.id.num11) Button num11;
    @BindView(R.id.num12) Button num12;
    @BindView(R.id.num13) Button num13;
    @BindView(R.id.num14) Button num14;
    @BindView(R.id.num15) Button num15;
    @BindView(R.id.num21) Button num21;
    @BindView(R.id.num22) Button num22;
    @BindView(R.id.num23) Button num23;
    @BindView(R.id.num24) Button num24;
    @BindView(R.id.num25) Button num25;
    @BindView(R.id.num31) Button num31;
    @BindView(R.id.num32) Button num32;
    @BindView(R.id.num33) Button num33;
    @BindView(R.id.num34) Button num34;
    @BindView(R.id.num35) Button num35;
    @BindView(R.id.num41) Button num41;
    @BindView(R.id.num42) Button num42;
    @BindView(R.id.num43) Button num43;
    @BindView(R.id.num44) Button num44;
    @BindView(R.id.num45) Button num45;
    @BindView(R.id.num51) Button num51;
    @BindView(R.id.num52) Button num52;
    @BindView(R.id.num53) Button num53;
    @BindView(R.id.num54) Button num54;
    @BindView(R.id.num55) Button num55;


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
    @BindView(R.id.answer17) Button answer17;
    @BindView(R.id.answer18) Button answer18;
    @BindView(R.id.answer19) Button answer19;
    @BindView(R.id.answer20) Button answer20;

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
    @BindView(R.id.check17) Button check17;
    @BindView(R.id.check18) Button check18;
    @BindView(R.id.check19) Button check19;
    @BindView(R.id.check20) Button check20;


    @BindView(R.id.level) TextView level;

    boolean number11 = false;
    boolean number12 = false;
    boolean number13 = false;
    boolean number14 = false;
    boolean number15 = false;

    boolean number21 = false;
    boolean number22 = false;
    boolean number23 = false;
    boolean number24 = false;
    boolean number25 = false;

    boolean number31 = false;
    boolean number32 = false;
    boolean number33 = false;
    boolean number34 = false;
    boolean number35 = false;

    boolean number41 = false;
    boolean number42 = false;
    boolean number43 = false;
    boolean number44 = false;
    boolean number45 = false;

    boolean number51 = false;
    boolean number52 = false;
    boolean number53 = false;
    boolean number54 = false;
    boolean number55 = false;

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
    boolean Answer17= false;
    boolean Answer18= false;
    boolean Answer19= false;
    boolean Answer20= false;
    int lvl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campaign_test_suma5x5);
        ButterKnife.bind(this);


        newGame();

        Check(number11,number21,number31,number41,number51,answer1,answer16,num11,num21,num31,num41,num51,Answer1,Answer16);
        Check(number12,number22,number32,number42,number52,answer2,answer17,num12,num22,num32,num42, num52,Answer2,Answer17);
        Check(number13,number23,number33,number43,number53,answer3,answer18,num13,num23,num33,num43,num53,Answer3,Answer18);
        Check(number14,number24,number34,number44,number54,answer4,answer19,num14,num24,num34,num44,num54,Answer4,Answer19);
        Check(number15,number25,number35,number45,number55,answer5,answer20,num15,num25,num35,num45,num55,Answer5,Answer20);

        Check(number11,number12,number13,number14,number15,answer6,answer11,num11,num12,num13,num14,num15,Answer6,Answer11);
        Check(number21,number22,number23,number24,number25,answer7,answer12,num21,num22,num23,num24,num25,Answer7,Answer12);
        Check(number31,number32,number33,number34,number35,answer8,answer13,num31,num32,num33,num34,num35,Answer8,Answer13);
        Check(number41,number42,number43,number44,number45,answer9,answer14,num41,num42,num43,num44,num45,Answer9,Answer14);
        Check(number51,number52,number53,number54,number55,answer10,answer15,num51,num52,num53,num54,num55,Answer10,Answer15);

        CheckTwo(number11,number21,number31,number41,number51,check1,check16,num11,num21,num31,num41,num51);
        CheckTwo(number12,number22,number32,number42,number52,check2,check17,num12,num22,num32,num42,num52);
        CheckTwo(number13,number23,number33,number43,number53,check3,check18,num13,num23,num33,num43,num53);
        CheckTwo(number14,number24,number34,number44,number54,check4,check19,num14,num24,num34,num44,num54);
        CheckTwo(number15,number25,number35,number45, number55,check5,check20,num15,num25,num35,num45,num55);

        CheckTwo(number11,number12,number13,number14,number15,check6,check11,num11,num12,num13,num14,num15);
        CheckTwo(number21,number22,number23,number24, number25,check7,check12,num21,num22,num23,num24,num25);
        CheckTwo(number31,number32,number33,number34,number35,check8,check13,num31,num32,num33,num34,num35);
        CheckTwo(number41,number42,number43,number44, number45,check9,check14,num41,num42,num43,num44,num45);
        CheckTwo(number51,number52,number53,number54,number55,check10,check15,num51,num52,num53,num54,num55);
    }

    private void insertDate(String one1, String one2,String one3,String one4, String one5, String two1,String two2,String two3,String two4
          , String two5 ,String three1,String three2,String three3,String three4, String three5,String four1,String four2,String four3,String four4, String four5,
                          String five1,String five2,String five3,String five4,String five5, String answ1,  String answ2,  String answ3,  String answ4, String answ5, String answ6, String answ7, String answ8, String answ9,String answ10){
        num11.setText(one1);
        num12.setText(one2);
        num13.setText(one3);
        num14.setText(one4);
        num15.setText(one5);
        num21.setText(two1);
        num22.setText(two2);
        num23.setText(two3);
        num24.setText(two4);
        num25.setText(two5);
        num31.setText(three1);
        num32.setText(three2);
        num33.setText(three3);
        num34.setText(three4);
        num35.setText(three5);
        num41.setText(four1);
        num42.setText(four2);
        num43.setText(four3);
        num44.setText(four4);
        num45.setText(four5);

        num51.setText(five1);
        num52.setText(five2);
        num53.setText(five3);
        num54.setText(five4);
        num55.setText(five5);

        answer1.setText(answ1);
        answer2.setText(answ2);
        answer3.setText(answ3);
        answer4.setText(answ4);
        answer5.setText(answ5);
        answer6.setText(answ6);
        answer7.setText(answ7);
        answer8.setText(answ8);
        answer9.setText(answ9);
        answer10.setText(answ10);
        answer11.setText(answ6);
        answer12.setText(answ7);
        answer13.setText(answ8);
        answer14.setText(answ9);
        answer15.setText(answ10);
        answer16.setText(answ1);
        answer17.setText(answ2);
        answer18.setText(answ3);
        answer19.setText(answ4);
        answer20.setText(answ5);
    }

    private void newGame(){
        Intent intent = getIntent();
        lvl =intent.getIntExtra("lvl",0);
        String levels = getResources().getString(R.string.levelButtonCamp);
        level.setText(levels + ":  " + lvl);
        if(lvl == 10){
           insertDate("7","3","11","6","5","5","7","3","11","2","4","9","13","8","18","9","4","8","8","12","4","11","9","15","5","25","34","31","34","30","21","26","35","33","39");
        }else if(lvl == 11){
            insertDate("29","11","10","19","12","24","10","34","12","12","9","10","5","28","9","12","19","5","9","21","8","28","27","18","17","41","39","44","49","50","52","46","33","47","45");
        }else if(lvl == 12){
            insertDate("43","28","15","16","12","22","37","14","27","15","18","17","37","19","5","13","9","28","27","32","21","13","23","54","52","56","67","65","70","69","71","64","59","68","65");
        }else if(lvl == 13) {
            insertDate("63","38","25","54","25","21","53","20","18","4","24","31","40","20","35","21","26","20","60","21","21","20","60","4","25","87","84","80","78","89","88","75","90","80","85");
        }else if(lvl == 14) {
            insertDate("64","38","38","32","32","30","30","22","69","34","34","57","24","13","67","36","67","43","24","57","54","48","70","30","42","100","105","94","99","101","102","103","91","103","100");
        }else if(lvl == 15) {
            insertDate("84","44","40","71","55","34","47","37","57","61","39","51","74","48","86","69","18","37","73","25","91","24","54","71","41","125","137","114","130","141","139","152","125","116","115");
        }else if(lvl == 16) {
            insertDate("92","34","64","28","96","23","144","77","36","94","48","78","58","32","94","35","35","49","116","72","60","86","124","73","100","187","179","182","184","190","188","180","184","186","184");
        }else if(lvl == 17) {
            insertDate("206","125","68","12","69","1","67","200","69","131","91","74","4","18","40","10","84","10","194","100","106","45","122","37","101","207","199","204","206","210","206","200","209","204","207");
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
            case R.id.num15:
                if(!number15) {
                    num15.setBackgroundResource(R.drawable.roundebutton2);
                    number15 = true;
                } else {
                    num15.setBackgroundResource(R.drawable.roundebutton);
                    number15 = false;
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
            case R.id.num25:
                if(!number25) {
                    num25.setBackgroundResource(R.drawable.roundebutton2);
                    number25 = true;
                } else {
                    num25.setBackgroundResource(R.drawable.roundebutton);
                    number25 = false;
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
            case R.id.num35:
                if(!number35) {
                    num35.setBackgroundResource(R.drawable.roundebutton2);
                    number35 = true;
                } else {
                    num35.setBackgroundResource(R.drawable.roundebutton);
                    number35 = false;
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
            case R.id.num45:
                if(!number45) {
                    num45.setBackgroundResource(R.drawable.roundebutton2);
                    number45 = true;
                } else {
                    num45.setBackgroundResource(R.drawable.roundebutton);
                    number45 = false;
                }
                break;
            case R.id.num51:
                if(!number51) {
                    num51.setBackgroundResource(R.drawable.roundebutton2);
                    number51 = true;
                } else {
                    num51.setBackgroundResource(R.drawable.roundebutton);
                    number51 = false;
                }
                break;
            case R.id.num52:
                if(!number52) {
                    num52.setBackgroundResource(R.drawable.roundebutton2);
                    number52 = true;
                } else {
                    num52.setBackgroundResource(R.drawable.roundebutton);
                    number52 = false;
                }
                break;
            case R.id.num53:
                if(!number53) {
                    num53.setBackgroundResource(R.drawable.roundebutton2);
                    number53 = true;
                } else {
                    num53.setBackgroundResource(R.drawable.roundebutton);
                    number53 = false;
                }
                break;
            case R.id.num54:
                if(!number54) {
                    num54.setBackgroundResource(R.drawable.roundebutton2);
                    number54 = true;
                } else {
                    num54.setBackgroundResource(R.drawable.roundebutton);
                    number54 = false;
                }
                break;
            case R.id.num55:
                if(!number55) {
                    num55.setBackgroundResource(R.drawable.roundebutton2);
                    number55 = true;
                } else {
                    num55.setBackgroundResource(R.drawable.roundebutton);
                    number55 = false;
                }
                break;
        }

        Check(number11,number21,number31,number41,number51,answer1,answer16,num11,num21,num31,num41,num51,Answer1,Answer16);
        Check(number12,number22,number32,number42,number52,answer2,answer17,num12,num22,num32,num42, num52,Answer2,Answer17);
        Check(number13,number23,number33,number43,number53,answer3,answer18,num13,num23,num33,num43,num53,Answer3,Answer18);
        Check(number14,number24,number34,number44,number54,answer4,answer19,num14,num24,num34,num44,num54,Answer4,Answer19);
        Check(number15,number25,number35,number45,number55,answer5,answer20,num15,num25,num35,num45,num55,Answer5,Answer20);

        Check(number11,number12,number13,number14,number15,answer6,answer11,num11,num12,num13,num14,num15,Answer6,Answer11);
        Check(number21,number22,number23,number24,number25,answer7,answer12,num21,num22,num23,num24,num25,Answer7,Answer12);
        Check(number31,number32,number33,number34,number35,answer8,answer13,num31,num32,num33,num34,num35,Answer8,Answer13);
        Check(number41,number42,number43,number44,number45,answer9,answer14,num41,num42,num43,num44,num45,Answer9,Answer14);
        Check(number51,number52,number53,number54,number55,answer10,answer15,num51,num52,num53,num54,num55,Answer10,Answer15);

        CheckTwo(number11,number21,number31,number41,number51,check1,check16,num11,num21,num31,num41,num51);
        CheckTwo(number12,number22,number32,number42,number52,check2,check17,num12,num22,num32,num42,num52);
        CheckTwo(number13,number23,number33,number43,number53,check3,check18,num13,num23,num33,num43,num53);
        CheckTwo(number14,number24,number34,number44,number54,check4,check19,num14,num24,num34,num44,num54);
        CheckTwo(number15,number25,number35,number45, number55,check5,check20,num15,num25,num35,num45,num55);

        CheckTwo(number11,number12,number13,number14,number15,check6,check11,num11,num12,num13,num14,num15);
        CheckTwo(number21,number22,number23,number24, number25,check7,check12,num21,num22,num23,num24,num25);
        CheckTwo(number31,number32,number33,number34,number35,check8,check13,num31,num32,num33,num34,num35);
        CheckTwo(number41,number42,number43,number44, number45,check9,check14,num41,num42,num43,num44,num45);
        CheckTwo(number51,number52,number53,number54,number55,check10,check15,num51,num52,num53,num54,num55);

        CheckAnswer();
    }

    private void Check(boolean number11,boolean number12, boolean number13, boolean number14, boolean number15 ,Button answer1, Button answer13
            ,Button num11, Button num21, Button num31,Button num41, Button num51, boolean Answer1,boolean Answer13){
        if(number11 && number12 && number13 && number14 && number15){
            answer1.setBackgroundResource(R.drawable.sumabutton);
            answer13.setBackgroundResource(R.drawable.sumabutton);
        }else if(!number11 && number12 && number13 && number14 && number15){
            if((Integer.parseInt(num11.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && number14 && number15){
            if((Integer.parseInt(num21.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && !number13 && number14 && number15){
            if((Integer.parseInt(num31.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && number13 && !number14 && number15){
            if((Integer.parseInt(num41.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && number13 && number14 && !number15){
            if((Integer.parseInt(num51.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && number14 && number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(!number11 && number12 && !number13 && number14 && number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num31.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(!number11 && number12 && number13 && !number14 && number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num41.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(!number11 && number12 && number13 && number14 && !number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(number11 && !number12 && !number13 && number14 && number15){
            if((Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(number11 && !number12 && number13 && !number14 && number15){
            if((Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num21.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(number11 && !number12 && number13 && number14 && !number15){
            if((Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(number11 && number12 && !number13 && !number14 && number15){
            if((Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(number11 && number12 && number13 && !number14 && !number15){
            if((Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(number11 && number12 && !number13 && number14 && !number15){
            if((Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num51.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(!number11 && !number12 && !number13 && number14 && number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(!number11 && !number12 && number13 && !number14 && number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num41.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(!number11 && !number12 && number13 && number14 && !number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num51.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(!number11 && number12 && !number13 && !number14 && number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(!number11 && number12 && !number13 && number14 && !number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(!number11 && number12 && number13 && !number14 && !number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(number11 && !number12 && !number13 && !number14 && number15){
            if((Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(number11 && !number12 && !number13 && number14 && !number15){
            if((Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(number11 && !number12 && number13 && !number14 && !number15){
            if((Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num51.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(number11 && number12 && !number13 && !number14 && !number15){
            if((Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString()) + Integer.parseInt(num31.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(!number11 && !number12 && !number13 && !number14 && number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(!number11 && number12 && !number13 && !number14 && !number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(!number11 && !number12 && number13 && !number14 && !number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(number11 && !number12 && !number13 && !number14 && !number15){
            if((Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }  else if(!number11 && !number12 && !number13 && number14 && !number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num51.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && !number13 && !number14 && !number15){
            if((Integer.parseInt(num11.getText().toString()) + Integer.parseInt(num21.getText().toString()) + Integer.parseInt(num31.getText().toString()) + Integer.parseInt(num41.getText().toString()) + Integer.parseInt(num51.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }

    }

    private void CheckTwo(boolean number11,boolean number12, boolean number13, boolean number14, boolean number15, Button check1, Button check13
            ,Button num11, Button num21, Button num31,Button num41, Button num51){


        if(number11 && number12 && number13 && number14 && number15){
            check1.setText("0");
            check13.setText("0");
        }else if(!number11 && number12 && number13 && number14 && number15){
            check1.setText("" + (Integer.parseInt(num11.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString())));
        } else if(number11 && !number12 && number13 && number14 && number15){
            check1.setText("" + (Integer.parseInt(num21.getText().toString())));
            check13.setText("" + (Integer.parseInt(num21.getText().toString())));
        } else if(number11 && number12 && !number13 && number14 && number15){
            check1.setText("" + (Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num31.getText().toString())));
        } else if(number11 && number12 && number13 && !number14 && number15){
            check1.setText("" + (Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num41.getText().toString())));
        } else if(number11 && number12 && number13 && number14 && !number15){
            check1.setText("" + (Integer.parseInt(num51.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString())));
        } else if(!number11 && !number12 && number13 && number14 && number15){
            check1.setText("" + ((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())))));
            check13.setText("" + ((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())))));
        }  else if(!number11 && number12 && !number13 && number14 && number15){
            check1.setText("" + ((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString())))));
            check13.setText("" + ((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString())))));
        }  else if(!number11 && number12 && number13 && !number14 && number15){
            check1.setText("" + ((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString())))));
            check13.setText("" + ((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString())))));
        }  else if(!number11 && number12 && number13 && number14 && !number15){
            check1.setText("" + ((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())))));
            check13.setText("" + ((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())))));
        }  else if(number11 && !number12 && !number13 && number14 && number15){
            check1.setText("" + ((Integer.parseInt(num21.getText().toString()) + (Integer.parseInt(num31.getText().toString())))));
            check13.setText("" + ((Integer.parseInt(num21.getText().toString()) + (Integer.parseInt(num31.getText().toString())))));
        }  else if(number11 && !number12 && number13 && !number14 && number15){
            check1.setText("" + ((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString())))));
            check13.setText("" + ((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString())))));
        }  else if(number11 && !number12 && number13 && number14 && !number15){
            check1.setText("" + ((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())))));
            check13.setText("" + ((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())))));
        }  else if(number11 && number12 && !number13 && !number14 && number15){
            check1.setText("" + ((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num41.getText().toString())))));
            check13.setText("" + ((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num41.getText().toString())))));
        }  else if(number11 && number12 && number13 && !number14 && !number15){
            check1.setText("" + ((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num51.getText().toString())))));
            check13.setText("" + ((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num51.getText().toString())))));
        }  else if(number11 && number12 && !number13 && number14 && !number15){
            check1.setText("" + ((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num51.getText().toString())))));
            check13.setText("" + ((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num51.getText().toString())))));
        }  else if(!number11 && !number12 && !number13 && number14 && number15){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
        }  else if(!number11 && !number12 && number13 && !number14 && number15){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        }  else if(!number11 && !number12 && number13 && number14 && !number15){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
        }  else if(!number11 && number12 && !number13 && !number14 && number15){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
        }  else if(!number11 && number12 && !number13 && number14 && !number15){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
        }  else if(!number11 && number12 && number13 && !number14 && !number15){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
        }  else if(number11 && !number12 && !number13 && !number14 && number15){
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
        }  else if(number11 && !number12 && !number13 && number14 && !number15){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
        }  else if(number11 && !number12 && number13 && !number14 && !number15){
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
        }  else if(number11 && number12 && !number13 && !number14 && !number15){
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
        }  else if(!number11 && !number12 && !number13 && !number14 && number15){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))+ (Integer.parseInt(num41.getText().toString()))));
        }  else if(!number11 && number12 && !number13 && !number14 && !number15){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString()))+ (Integer.parseInt(num41.getText().toString()))));
        }  else if(!number11 && !number12 && number13 && !number14 && !number15){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString()))+ (Integer.parseInt(num41.getText().toString()))));
        }  else if(number11 && !number12 && !number13 && !number14 && !number15){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))+ (Integer.parseInt(num41.getText().toString()))));
        }  else if(!number11 && !number12 && !number13 && number14 && !number15){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))+ (Integer.parseInt(num51.getText().toString()))));
        } else if(!number11 && !number12 && !number13 && !number14 && !number15){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))+ (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
        }
    }


    private void CheckAnswer(){
        if(Integer.parseInt(answer1.getText().toString()) == Integer.parseInt(check1.getText().toString()) && Integer.parseInt(answer2.getText().toString()) == Integer.parseInt(check2.getText().toString()) && Integer.parseInt(answer3.getText().toString()) == Integer.parseInt(check3.getText().toString()) &&Integer.parseInt(answer4.getText().toString()) == Integer.parseInt(check4.getText().toString())
                && Integer.parseInt(answer5.getText().toString()) == Integer.parseInt(check5.getText().toString()) && Integer.parseInt(answer6.getText().toString()) == Integer.parseInt(check6.getText().toString()) && Integer.parseInt(answer7.getText().toString()) == Integer.parseInt(check7.getText().toString()) && Integer.parseInt(answer8.getText().toString()) == Integer.parseInt(check8.getText().toString())
                && Integer.parseInt(answer9.getText().toString()) == Integer.parseInt(check9.getText().toString()) && Integer.parseInt(answer10.getText().toString()) == Integer.parseInt(check10.getText().toString()) && Integer.parseInt(answer11.getText().toString()) == Integer.parseInt(check11.getText().toString()) && Integer.parseInt(answer12.getText().toString()) == Integer.parseInt(check12.getText().toString())
                &&Integer.parseInt(answer13.getText().toString()) == Integer.parseInt(check13.getText().toString()) && Integer.parseInt(answer14.getText().toString()) == Integer.parseInt(check14.getText().toString()) && Integer.parseInt(answer15.getText().toString()) == Integer.parseInt(check15.getText().toString()) && Integer.parseInt(answer16.getText().toString()) == Integer.parseInt(check16.getText().toString())
       && Integer.parseInt(answer17.getText().toString()) == Integer.parseInt(check17.getText().toString()) && Integer.parseInt(answer18.getText().toString()) == Integer.parseInt(check18.getText().toString()) && Integer.parseInt(answer19.getText().toString()) == Integer.parseInt(check19.getText().toString()) && Integer.parseInt(answer20.getText().toString()) == Integer.parseInt(check20.getText().toString()) ){
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
            check14.setEnabled(false);
            check15.setEnabled(false);
            check16.setEnabled(false);
            check17.setEnabled(false);
            check18.setEnabled(false);
            check19.setEnabled(false);
            check20.setEnabled(false);

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
            answer14.setEnabled(false);
            answer15.setEnabled(false);
            answer16.setEnabled(false);
            answer17.setEnabled(false);
            answer18.setEnabled(false);
            answer19.setEnabled(false);
            answer20.setEnabled(false);

            num11.setEnabled(false);
            num12.setEnabled(false);
            num13.setEnabled(false);
            num14.setEnabled(false);
            num15.setEnabled(false);
            num21.setEnabled(false);
            num22.setEnabled(false);
            num23.setEnabled(false);
            num24.setEnabled(false);
            num25.setEnabled(false);
            num31.setEnabled(false);
            num32.setEnabled(false);
            num33.setEnabled(false);
            num34.setEnabled(false);
            num35.setEnabled(false);
            num41.setEnabled(false);
            num42.setEnabled(false);
            num43.setEnabled(false);
            num44.setEnabled(false);
            num45.setEnabled(false);
            num51.setEnabled(false);
            num52.setEnabled(false);
            num53.setEnabled(false);
            num54.setEnabled(false);
            num55.setEnabled(false);

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
