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

public class CampaignTestSume6x6 extends AppCompatActivity {

    @BindView(R.id.num11) Button num11;
    @BindView(R.id.num12) Button num12;
    @BindView(R.id.num13) Button num13;
    @BindView(R.id.num14) Button num14;
    @BindView(R.id.num15) Button num15;
    @BindView(R.id.num16) Button num16;
    @BindView(R.id.num21) Button num21;
    @BindView(R.id.num22) Button num22;
    @BindView(R.id.num23) Button num23;
    @BindView(R.id.num24) Button num24;
    @BindView(R.id.num25) Button num25;
    @BindView(R.id.num26) Button num26;
    @BindView(R.id.num31) Button num31;
    @BindView(R.id.num32) Button num32;
    @BindView(R.id.num33) Button num33;
    @BindView(R.id.num34) Button num34;
    @BindView(R.id.num35) Button num35;
    @BindView(R.id.num36) Button num36;
    @BindView(R.id.num41) Button num41;
    @BindView(R.id.num42) Button num42;
    @BindView(R.id.num43) Button num43;
    @BindView(R.id.num44) Button num44;
    @BindView(R.id.num45) Button num45;
    @BindView(R.id.num46) Button num46;
    @BindView(R.id.num51) Button num51;
    @BindView(R.id.num52) Button num52;
    @BindView(R.id.num53) Button num53;
    @BindView(R.id.num54) Button num54;
    @BindView(R.id.num55) Button num55;
    @BindView(R.id.num56) Button num56;
    @BindView(R.id.num61) Button num61;
    @BindView(R.id.num62) Button num62;
    @BindView(R.id.num63) Button num63;
    @BindView(R.id.num64) Button num64;
    @BindView(R.id.num65) Button num65;
    @BindView(R.id.num66) Button num66;


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
    @BindView(R.id.answer21) Button answer21;
    @BindView(R.id.answer22) Button answer22;
    @BindView(R.id.answer23) Button answer23;
    @BindView(R.id.answer24) Button answer24;
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
    @BindView(R.id.check21) Button check21;
    @BindView(R.id.check22) Button check22;
    @BindView(R.id.check23) Button check23;
    @BindView(R.id.check24) Button check24;


    @BindView(R.id.level) TextView level;

    boolean number11 = false;
    boolean number12 = false;
    boolean number13 = false;
    boolean number14 = false;
    boolean number15 = false;
    boolean number16 = false;

    boolean number21 = false;
    boolean number22 = false;
    boolean number23 = false;
    boolean number24 = false;
    boolean number25 = false;
    boolean number26 = false;

    boolean number31 = false;
    boolean number32 = false;
    boolean number33 = false;
    boolean number34 = false;
    boolean number35 = false;
    boolean number36 = false;

    boolean number41 = false;
    boolean number42 = false;
    boolean number43 = false;
    boolean number44 = false;
    boolean number45 = false;
    boolean number46 = false;

    boolean number51 = false;
    boolean number52 = false;
    boolean number53 = false;
    boolean number54 = false;
    boolean number55 = false;
    boolean number56 = false;

    boolean number61 = false;
    boolean number62 = false;
    boolean number63 = false;
    boolean number64 = false;
    boolean number65 = false;
    boolean number66 = false;

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
    boolean Answer21= false;
    boolean Answer22= false;
    boolean Answer23= false;
    boolean Answer24= false;
    int lvl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campaign_test_sume6x6);
        ButterKnife.bind(this);


        newGame();

       Check(number11,number21,number31,number41,number51,number61,answer1,answer19,num11,num21,num31,num41,num51,num61,Answer1,Answer19);
        Check(number12,number22,number32,number42,number52,number62,answer2,answer20,num12,num22,num32,num42, num52,num62,Answer2,Answer20);
        Check(number13,number23,number33,number43,number53,number63,answer3,answer21,num13,num23,num33,num43,num53,num63,Answer3,Answer21);
        Check(number14,number24,number34,number44,number54,number64,answer4,answer22,num14,num24,num34,num44,num54,num64,Answer4,Answer22);
        Check(number15,number25,number35,number45,number55,number65,answer5,answer23,num15,num25,num35,num45,num55,num65,Answer5,Answer23);
        Check(number16,number26,number36,number46,number56,number66,answer6,answer24,num16,num26,num36,num46,num56,num66,Answer6,Answer24);

        Check(number11,number12,number13,number14,number15,number16,answer7,answer13,num11,num12,num13,num14,num15,num16,Answer7,Answer13);
        Check(number21,number22,number23,number24,number25,number26,answer8,answer14,num21,num22,num23,num24,num25,num26,Answer8,Answer14);
        Check(number31,number32,number33,number34,number35,number36,answer9,answer15,num31,num32,num33,num34,num35,num36,Answer9,Answer15);
        Check(number41,number42,number43,number44,number45,number46,answer10,answer16,num41,num42,num43,num44,num45,num46,Answer10,Answer16);
        Check(number51,number52,number53,number54,number55,number56,answer11,answer17,num51,num52,num53,num54,num55,num56,Answer11,Answer17);
        Check(number61,number62,number63,number64,number65,number66,answer12,answer18,num61,num62,num63,num64,num65,num66,Answer12,Answer18);

        CheckTwo(number11,number21,number31,number41,number51,number61,check1,check19,num11,num21,num31,num41,num51,num61);
        CheckTwo(number12,number22,number32,number42,number52,number62,check2,check20,num12,num22,num32,num42,num52,num62);
        CheckTwo(number13,number23,number33,number43,number53,number63,check3,check21,num13,num23,num33,num43,num53,num63);
        CheckTwo(number14,number24,number34,number44,number54,number64,check4,check22,num14,num24,num34,num44,num54,num64);
        CheckTwo(number15,number25,number35,number45, number55,number65,check5,check23,num15,num25,num35,num45,num55,num65);
        CheckTwo(number16,number26,number36,number46, number56,number66,check6,check24,num16,num26,num36,num46,num56,num66);

        CheckTwo(number11,number12,number13,number14,number15,number16,check7,check13,num11,num12,num13,num14,num15,num16);
        CheckTwo(number21,number22,number23,number24, number25,number26,check8,check14,num21,num22,num23,num24,num25,num26);
        CheckTwo(number31,number32,number33,number34,number35,number36,check9,check15,num31,num32,num33,num34,num35,num36);
        CheckTwo(number41,number42,number43,number44, number45,number46,check10,check16,num41,num42,num43,num44,num45,num46);
        CheckTwo(number51,number52,number53,number54,number55,number56,check11,check17,num51,num52,num53,num54,num55,num56);
        CheckTwo(number61,number62,number63,number64,number65,number66,check12,check18,num61,num62,num63,num64,num65,num66);
    }

    private void insertDate(String one1, String one2,String one3,String one4, String one5, String one6, String two1,String two2,String two3,String two4
            , String two5 , String two6, String three1,String three2,String three3,String three4, String three5,String three6 ,String four1,String four2,String four3,String four4, String four5,
                          String four6 , String five1,String five2,String five3,String five4,String five5, String five6 ,String six1 ,String six2, String six3, String six4,
                            String six5, String six6,String answ1,  String answ2,  String answ3,  String answ4, String answ5, String answ6, String answ7, String answ8, String answ9,String answ10, String answ11, String answ12){
        num11.setText(one1);
        num12.setText(one2);
        num13.setText(one3);
        num14.setText(one4);
        num15.setText(one5);
        num16.setText(one6);
        num21.setText(two1);
        num22.setText(two2);
        num23.setText(two3);
        num24.setText(two4);
        num25.setText(two5);
        num26.setText(two6);
        num31.setText(three1);
        num32.setText(three2);
        num33.setText(three3);
        num34.setText(three4);
        num35.setText(three5);
        num36.setText(three6);
        num41.setText(four1);
        num42.setText(four2);
        num43.setText(four3);
        num44.setText(four4);
        num45.setText(four5);
        num46.setText(four6);

        num51.setText(five1);
        num52.setText(five2);
        num53.setText(five3);
        num54.setText(five4);
        num55.setText(five5);
        num56.setText(five6);

        num61.setText(six1);
        num62.setText(six2);
        num63.setText(six3);
        num64.setText(six4);
        num65.setText(six5);
        num66.setText(six6);

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
        answer11.setText(answ11);
        answer12.setText(answ12);
        answer13.setText(answ7);
        answer14.setText(answ8);
        answer15.setText(answ9);
        answer16.setText(answ10);
        answer17.setText(answ11);
        answer18.setText(answ12);
        answer19.setText(answ1);
        answer20.setText(answ2);
        answer21.setText(answ3);
        answer22.setText(answ4);
        answer23.setText(answ5);
        answer24.setText(answ6);
    }

    private void newGame(){
        Intent intent = getIntent();
        lvl =intent.getIntExtra("lvl",0);
        String levels = getResources().getString(R.string.levelButtonCamp);
        level.setText(levels + ":  " + lvl);

        if(lvl == 18){
            insertDate("4","17","4","7","5","8","4","1","12","9","2","3","7","4","7","3","9","6","5","8","6","8","7","5","10","2","11","8","4","9","5","3","6","9","6","11","20","18","24","25","15","19","21","17","23","24","19","17");
        }else if(lvl == 19){
            insertDate("13","6","8","14","7","5","9","4","10","13","17","6","15","18","11","9","9","11","8","9","4","8","10","17","8","5","2","7","8","4","5","9","8","7","9","4","29","32","31","27","25","30","26","30","29","29","32","28");
        }else if(lvl == 20){
            insertDate("41","30","34","7","11","8","9","1","19","18","15","24","6","21","18","24","8","14","22","16","3","12","9","16","9","12","9","8","11","10","26","13","4","14","7","6","41","34","37","40","35","46","45","34","41","28","39","46");
        }else if(lvl == 21) {
            insertDate("33","27","11","9","8","22","14","21","24","33","15","11","19","21","16","14","29","7","9","26","43","24","5","21","21","7","18","13","27","6","8","13","4","14","19","30","52","49","47","50","55","47","50","47","54","48","53","48");
        }else if(lvl == 22) {
            insertDate("41","35","25","22","22","20","14","21","14","25","22","9","39","29","19","14","17","7","25","18","20","12","34","27","9","21","9","22","26","19","17","11","31","40","23","46","64","71","76","69","70","80","69","68","75","72","69","77");
         }else if(lvl == 23) {
            insertDate("26","15","81","49","12","63","19","77","24","44","33","44","18","37","63","70","44","55","22","16","53","58","35","36","69","41","32","54","37","22","20","64","40","9","26","36","87","93","95","102","94","94","90","96","100","93","95","91");
        } else if(lvl == 24) {
            insertDate("86","97","71","64","57","51","115","77","64","41","26","25","48","53","32","49","42","44","27","86","94","61","47","27","63","53","83","28","61","64","83","25","59","30","71","64","142","150","153","148","160","155","154","156","144","148","153","153");
        } else if(lvl == 25) {
            insertDate("111","79","36","82","43","109","47","60","72","96","133","54","92","96","129","65","29","94","25","79","141","62","39","116","54","36","94","47","74","59","87","55","61","46","124","77","190","187","202","194","201","190","193","187","190","205","196","193");
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
            case R.id.num16:
                if(!number16) {
                    num16.setBackgroundResource(R.drawable.roundebutton2);
                    number16 = true;
                } else {
                    num16.setBackgroundResource(R.drawable.roundebutton);
                    number16 = false;
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
            case R.id.num26:
                if(!number26) {
                    num26.setBackgroundResource(R.drawable.roundebutton2);
                    number26 = true;
                } else {
                    num26.setBackgroundResource(R.drawable.roundebutton);
                    number26 = false;
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
            case R.id.num36:
                if(!number36) {
                    num36.setBackgroundResource(R.drawable.roundebutton2);
                    number36 = true;
                } else {
                    num36.setBackgroundResource(R.drawable.roundebutton);
                    number36 = false;
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
            case R.id.num46:
                if(!number46) {
                    num46.setBackgroundResource(R.drawable.roundebutton2);
                    number46 = true;
                } else {
                    num46.setBackgroundResource(R.drawable.roundebutton);
                    number46 = false;
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
            case R.id.num56:
                if(!number56) {
                    num56.setBackgroundResource(R.drawable.roundebutton2);
                    number56 = true;
                } else {
                    num56.setBackgroundResource(R.drawable.roundebutton);
                    number56 = false;
                }
                break;
            case R.id.num61:
                if(!number61) {
                    num61.setBackgroundResource(R.drawable.roundebutton2);
                    number61 = true;
                } else {
                    num61.setBackgroundResource(R.drawable.roundebutton);
                    number61 = false;
                }
                break;
            case R.id.num62:
                if(!number62) {
                    num62.setBackgroundResource(R.drawable.roundebutton2);
                    number62 = true;
                } else {
                    num62.setBackgroundResource(R.drawable.roundebutton);
                    number62 = false;
                }
                break;
            case R.id.num63:
                if(!number63) {
                    num63.setBackgroundResource(R.drawable.roundebutton2);
                    number63 = true;
                } else {
                    num63.setBackgroundResource(R.drawable.roundebutton);
                    number63 = false;
                }
                break;
            case R.id.num64:
                if(!number64) {
                    num64.setBackgroundResource(R.drawable.roundebutton2);
                    number64 = true;
                } else {
                    num64.setBackgroundResource(R.drawable.roundebutton);
                    number64 = false;
                }
                break;
            case R.id.num65:
                if(!number65) {
                    num65.setBackgroundResource(R.drawable.roundebutton2);
                    number65 = true;
                } else {
                    num65.setBackgroundResource(R.drawable.roundebutton);
                    number65 = false;
                }
                break;
            case R.id.num66:
                if(!number66) {
                    num66.setBackgroundResource(R.drawable.roundebutton2);
                    number66 = true;
                } else {
                    num66.setBackgroundResource(R.drawable.roundebutton);
                    number66 = false;
                }
                break;
        }

        Check(number11,number21,number31,number41,number51,number61,answer1,answer19,num11,num21,num31,num41,num51,num61,Answer1,Answer19);
        Check(number12,number22,number32,number42,number52,number62,answer2,answer20,num12,num22,num32,num42, num52,num62,Answer2,Answer20);
        Check(number13,number23,number33,number43,number53,number63,answer3,answer21,num13,num23,num33,num43,num53,num63,Answer3,Answer21);
        Check(number14,number24,number34,number44,number54,number64,answer4,answer22,num14,num24,num34,num44,num54,num64,Answer4,Answer22);
        Check(number15,number25,number35,number45,number55,number65,answer5,answer23,num15,num25,num35,num45,num55,num65,Answer5,Answer23);
        Check(number16,number26,number36,number46,number56,number66,answer6,answer24,num16,num26,num36,num46,num56,num66,Answer6,Answer24);

        Check(number11,number12,number13,number14,number15,number16,answer7,answer13,num11,num12,num13,num14,num15,num16,Answer7,Answer13);
        Check(number21,number22,number23,number24,number25,number26,answer8,answer14,num21,num22,num23,num24,num25,num26,Answer8,Answer14);
        Check(number31,number32,number33,number34,number35,number36,answer9,answer15,num31,num32,num33,num34,num35,num36,Answer9,Answer15);
        Check(number41,number42,number43,number44,number45,number46,answer10,answer16,num41,num42,num43,num44,num45,num46,Answer10,Answer16);
        Check(number51,number52,number53,number54,number55,number56,answer11,answer17,num51,num52,num53,num54,num55,num56,Answer11,Answer17);
        Check(number61,number62,number63,number64,number65,number66,answer12,answer18,num61,num62,num63,num64,num65,num66,Answer12,Answer18);

        CheckTwo(number11,number21,number31,number41,number51,number61,check1,check19,num11,num21,num31,num41,num51,num61);
        CheckTwo(number12,number22,number32,number42,number52,number62,check2,check20,num12,num22,num32,num42,num52,num62);
        CheckTwo(number13,number23,number33,number43,number53,number63,check3,check21,num13,num23,num33,num43,num53,num63);
        CheckTwo(number14,number24,number34,number44,number54,number64,check4,check22,num14,num24,num34,num44,num54,num64);
        CheckTwo(number15,number25,number35,number45, number55,number65,check5,check23,num15,num25,num35,num45,num55,num65);
        CheckTwo(number16,number26,number36,number46, number56,number66,check6,check24,num16,num26,num36,num46,num56,num66);

        CheckTwo(number11,number12,number13,number14,number15,number16,check7,check13,num11,num12,num13,num14,num15,num16);
        CheckTwo(number21,number22,number23,number24, number25,number26,check8,check14,num21,num22,num23,num24,num25,num26);
        CheckTwo(number31,number32,number33,number34,number35,number36,check9,check15,num31,num32,num33,num34,num35,num36);
        CheckTwo(number41,number42,number43,number44, number45,number46,check10,check16,num41,num42,num43,num44,num45,num46);
        CheckTwo(number51,number52,number53,number54,number55,number56,check11,check17,num51,num52,num53,num54,num55,num56);
        CheckTwo(number61,number62,number63,number64,number65,number66,check12,check18,num61,num62,num63,num64,num65,num66);

        CheckAnswer();
    }

    private void Check(boolean number11,boolean number12, boolean number13, boolean number14, boolean number15 , boolean number16,Button answer1, Button answer13
            ,Button num11, Button num21, Button num31,Button num41, Button num51, Button num61, boolean Answer1,boolean Answer13){
        if(number11 && number12 && number13 && number14 && number15 && number16){
            answer1.setBackgroundResource(R.drawable.sumabutton);
            answer13.setBackgroundResource(R.drawable.sumabutton);
        }else if(!number11 && number12 && number13 && number14 && number15 && number16){
            if((Integer.parseInt(num11.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && number14 && number15 && number16){
            if((Integer.parseInt(num21.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && !number13 && number14 && number15 && number16){
            if((Integer.parseInt(num31.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && number13 && !number14 && number15 && number16){
            if((Integer.parseInt(num41.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && number13 && number14 && !number15 && number16){
            if((Integer.parseInt(num51.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && number13 && number14 && number15 && !number16){
            if((Integer.parseInt(num61.getText().toString())) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && number14 && number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && number14 && number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && number13 && !number14 && number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && number13 && number14 && !number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && number13 && number14 && number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && number14 && number15 && number16){
            if((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num21.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && !number14 && number15 && number16){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && number14 && !number15 && number16){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && number14 && number15 && !number16){
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && !number13 && !number14 && number15 && number16){
            if((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && !number13 && number14 && !number15 && number16){
            if((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && !number13 && number14 && number15 && !number16){
            if((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && number13 && !number14 && !number15 && number16){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && number13 && !number14 && number15 && !number16){
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && number13 && number14 && !number15 && !number16){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && !number13 && number14 && number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && !number14 && number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && number14 && !number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && number14 && number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && !number14 && number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && number14 && !number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && number14 && number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && number13 && !number14 && !number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && number13 && !number14 && number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && number13 && number14 && !number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && !number14 && number15 && number16){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && number14 && !number15 && number16){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && number14 && number15 && !number16){
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && !number14 && !number15 && number16){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && !number14 && number15 && !number16){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && number14 && !number15 && !number16){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && !number13 && !number14 && !number15 && number16){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && !number13 && !number14 && number15 && !number16){
            if((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && !number13 && number14 && !number15 && !number16){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && number13 && !number14 && !number15 && !number16){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }


        else if(!number11 && !number12 && !number13 && !number14 && number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && !number13 && number14 && !number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && !number13 && number14 && number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && !number14 && !number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && !number14 && number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && number14 && !number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && !number14 && !number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && !number14 && number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && number14 && !number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && number13 && !number14 && !number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && !number14 && !number15 && number16){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && !number14 && number15 & !number16){
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && number14 && !number15 && !number16){
            if((Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && number13 && !number14 && !number15 && !number16){
            if((Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && number12 && !number13 && !number14 && !number15 && !number16){
            if((Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && !number13 && !number14 && !number15 && number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && !number13 && !number14 && number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num61.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && !number13 && number14 && !number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && number13 && !number14 && !number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && number12 && !number13 && !number14 && !number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(number11 && !number12 && !number13 && !number14 && !number15 && !number16){
            if((Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString()))) == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        } else if(!number11 && !number12 && !number13 && !number14 && !number15 && !number16){
            if((Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString())))  == Integer.parseInt(answer1.getText().toString())){
                answer1.setBackgroundResource(R.drawable.sumabutton2);
                answer13.setBackgroundResource(R.drawable.sumabutton2);
            } else {
                answer1.setBackgroundResource(R.drawable.sumabutton);
                answer13.setBackgroundResource(R.drawable.sumabutton);
            }
        }

    }

    private void CheckTwo(boolean number11,boolean number12, boolean number13, boolean number14, boolean number15, boolean number16, Button check1, Button check13
            ,Button num11, Button num21, Button num31,Button num41, Button num51,Button num61){



        if(number11 && number12 && number13 && number14 && number15 && number16){
            check1.setText("0");
            check13.setText("0");
        }else if(!number11 && number12 && number13 && number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString())));
            check13.setText("" + (Integer.parseInt(num11.getText().toString())));
        } else if(number11 && !number12 && number13 && number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num21.getText().toString())));
            check13.setText("" + (Integer.parseInt(num21.getText().toString())));
        } else if(number11 && number12 && !number13 && number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num31.getText().toString())));
            check13.setText("" + (Integer.parseInt(num31.getText().toString())));
        } else if(number11 && number12 && number13 && !number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num41.getText().toString())));
            check13.setText("" + (Integer.parseInt(num41.getText().toString())));
        } else if(number11 && number12 && number13 && number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num51.getText().toString())));
            check13.setText("" + (Integer.parseInt(num51.getText().toString())));
        } else if(number11 && number12 && number13 && number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num61.getText().toString())));
            check13.setText("" + (Integer.parseInt(num61.getText().toString())));
        } else if(!number11 && !number12 && number13 && number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString()))));
        } else if(!number11 && number12 && !number13 && number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString()))));
        } else if(!number11 && number12 && number13 && !number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num41.getText().toString()))));
        } else if(!number11 && number12 && number13 && number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString()))));
        } else if(!number11 && number12 && number13 && number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString()))));
        } else if(number11 && !number12 && !number13 && number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num21.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num21.getText().toString()))));
        } else if(number11 && !number12 && number13 && !number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num41.getText().toString())+ (Integer.parseInt(num21.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num21.getText().toString()))));
        } else if(number11 && !number12 && number13 && number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num51.getText().toString())+ (Integer.parseInt(num21.getText().toString()))));
        } else if(number11 && !number12 && number13 && number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString()))));
        } else if(number11 && number12 && !number13 && !number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num41.getText().toString()))));
        } else if(number11 && number12 && !number13 && number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num51.getText().toString()))));
        } else if(number11 && number12 && !number13 && number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num31.getText().toString()) + (Integer.parseInt(num61.getText().toString()))));
        } else if(number11 && number12 && number13 && !number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num51.getText().toString()))));
        } else if(number11 && number12 && number13 && !number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num41.getText().toString()) + (Integer.parseInt(num61.getText().toString()))));
        } else if(number11 && number12 && number13 && number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num61.getText().toString()))));
        } else if(!number11 && !number12 && !number13 && number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString()))));
        } else if(!number11 && !number12 && number13 && !number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        } else if(!number11 && !number12 && number13 && number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
        } else if(!number11 && !number12 && number13 && number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString())+ (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
        } else if(!number11 && number12 && !number13 && !number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        } else if(!number11 && number12 && !number13 && number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
        } else if(!number11 && number12 && !number13 && number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
        } else if(!number11 && number12 && number13 && !number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        } else if(!number11 && number12 && number13 && !number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        } else if(!number11 && number12 && number13 && number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
        } else if(number11 && !number12 && !number13 && !number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num21.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num21.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        } else if(number11 && !number12 && !number13 && number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num21.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num21.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
        } else if(number11 && !number12 && !number13 && number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num21.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num21.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
        } else if(number11 && !number12 && number13 && !number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num21.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num21.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        } else if(number11 && !number12 && number13 && !number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num21.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num21.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        } else if(number11 && !number12 && number13 && number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num21.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num21.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
        } else if(number11 && number12 && !number13 && !number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        } else if(number11 && number12 && !number13 && !number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        } else if(number11 && number12 && !number13 && number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
        } else if(number11 && number12 && number13 && !number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
        }


        else if(!number11 && !number12 && !number13 && !number14 && number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));

        } else if(!number11 && !number12 && !number13 && number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num51.getText().toString()))));

        } else if(!number11 && !number12 && !number13 && number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));

        } else if(!number11 && !number12 && number13 && !number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));

        } else if(!number11 && !number12 && number13 && !number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));

        } else if(!number11 && !number12 && number13 && number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));

        } else if(!number11 && number12 && !number13 && !number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));

        } else if(!number11 && number12 && !number13 && !number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));

        } else if(!number11 && number12 && !number13 && number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));

        } else if(!number11 && number12 && number13 && !number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num51.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));

        } else if(number11 && !number12 && !number13 && !number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));

        } else if(number11 && !number12 && !number13 && !number14 && number15 & !number16){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));

        } else if(number11 && !number12 && !number13 && number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString()))));

        } else if(number11 && !number12 && number13 && !number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));

        } else if(number11 && number12 && !number13 && !number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num51.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString()))));

        } else if(!number11 && !number12 && !number13 && !number14 && !number15 && number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) +  (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) +  (Integer.parseInt(num51.getText().toString()))));

        } else if(!number11 && !number12 && !number13 && !number14 && number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) +  (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) +  (Integer.parseInt(num61.getText().toString()))));
        } else if(!number11 && !number12 && !number13 && number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString())) +  (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num61.getText().toString())) +  (Integer.parseInt(num51.getText().toString()))));
        } else if(!number11 && !number12 && number13 && !number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString())) +  (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num41.getText().toString())) +  (Integer.parseInt(num51.getText().toString()))));
        } else if(!number11 && number12 && !number13 && !number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) +  (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num61.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) +  (Integer.parseInt(num51.getText().toString()))));
        } else if(number11 && !number12 && !number13 && !number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) +  (Integer.parseInt(num51.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num61.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) +  (Integer.parseInt(num51.getText().toString()))));
        } else if(!number11 && !number12 && !number13 && !number14 && !number15 && !number16){
            check1.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) +  (Integer.parseInt(num51.getText().toString())) +  (Integer.parseInt(num61.getText().toString()))));
            check13.setText("" + (Integer.parseInt(num11.getText().toString()) + (Integer.parseInt(num21.getText().toString())) + (Integer.parseInt(num31.getText().toString())) + (Integer.parseInt(num41.getText().toString())) +  (Integer.parseInt(num51.getText().toString()))+  (Integer.parseInt(num61.getText().toString()))));
        }
    }


    private void CheckAnswer(){
        if(Integer.parseInt(answer1.getText().toString()) == Integer.parseInt(check1.getText().toString()) && Integer.parseInt(answer2.getText().toString()) == Integer.parseInt(check2.getText().toString()) && Integer.parseInt(answer3.getText().toString()) == Integer.parseInt(check3.getText().toString()) &&Integer.parseInt(answer4.getText().toString()) == Integer.parseInt(check4.getText().toString())
                && Integer.parseInt(answer5.getText().toString()) == Integer.parseInt(check5.getText().toString()) && Integer.parseInt(answer6.getText().toString()) == Integer.parseInt(check6.getText().toString()) && Integer.parseInt(answer7.getText().toString()) == Integer.parseInt(check7.getText().toString()) && Integer.parseInt(answer8.getText().toString()) == Integer.parseInt(check8.getText().toString())
                && Integer.parseInt(answer9.getText().toString()) == Integer.parseInt(check9.getText().toString()) && Integer.parseInt(answer10.getText().toString()) == Integer.parseInt(check10.getText().toString()) && Integer.parseInt(answer11.getText().toString()) == Integer.parseInt(check11.getText().toString()) && Integer.parseInt(answer12.getText().toString()) == Integer.parseInt(check12.getText().toString())
                &&Integer.parseInt(answer13.getText().toString()) == Integer.parseInt(check13.getText().toString()) && Integer.parseInt(answer14.getText().toString()) == Integer.parseInt(check14.getText().toString()) && Integer.parseInt(answer15.getText().toString()) == Integer.parseInt(check15.getText().toString()) && Integer.parseInt(answer16.getText().toString()) == Integer.parseInt(check16.getText().toString())
                && Integer.parseInt(answer17.getText().toString()) == Integer.parseInt(check17.getText().toString()) && Integer.parseInt(answer18.getText().toString()) == Integer.parseInt(check18.getText().toString()) && Integer.parseInt(answer19.getText().toString()) == Integer.parseInt(check19.getText().toString()) && Integer.parseInt(answer20.getText().toString()) == Integer.parseInt(check20.getText().toString())
        && Integer.parseInt(answer21.getText().toString()) == Integer.parseInt(check21.getText().toString()) && Integer.parseInt(answer22.getText().toString()) == Integer.parseInt(check22.getText().toString()) && Integer.parseInt(answer23.getText().toString()) == Integer.parseInt(check23.getText().toString()) && Integer.parseInt(answer24.getText().toString()) == Integer.parseInt(check24.getText().toString()) ){
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
            check21.setEnabled(false);
            check22.setEnabled(false);
            check23.setEnabled(false);
            check24.setEnabled(false);

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
            answer21.setEnabled(false);
            answer22.setEnabled(false);
            answer23.setEnabled(false);
            answer24.setEnabled(false);

            num11.setEnabled(false);
            num12.setEnabled(false);
            num13.setEnabled(false);
            num14.setEnabled(false);
            num15.setEnabled(false);
            num16.setEnabled(false);
            num21.setEnabled(false);
            num22.setEnabled(false);
            num23.setEnabled(false);
            num24.setEnabled(false);
            num25.setEnabled(false);
            num26.setEnabled(false);
            num31.setEnabled(false);
            num32.setEnabled(false);
            num33.setEnabled(false);
            num34.setEnabled(false);
            num35.setEnabled(false);
            num36.setEnabled(false);
            num41.setEnabled(false);
            num42.setEnabled(false);
            num43.setEnabled(false);
            num44.setEnabled(false);
            num45.setEnabled(false);
            num46.setEnabled(false);
            num51.setEnabled(false);
            num52.setEnabled(false);
            num53.setEnabled(false);
            num54.setEnabled(false);
            num55.setEnabled(false);
            num56.setEnabled(false);
            num61.setEnabled(false);
            num62.setEnabled(false);
            num63.setEnabled(false);
            num64.setEnabled(false);
            num65.setEnabled(false);
            num66.setEnabled(false);

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
