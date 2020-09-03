package com.puzzle.mathpuzzle.CampaignSuma;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.puzzle.mathpuzzle.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MapLevelSuma extends AppCompatActivity {

    @BindView(R.id.btn) Button  btn;
    @BindView(R.id.btn2) Button btn2;
    @BindView(R.id.btn3) Button btn3;
    @BindView(R.id.btn4) Button btn4;
    @BindView(R.id.btn5) Button btn5;
    @BindView(R.id.btn6) Button btn6;
    @BindView(R.id.btn7) Button btn7;
    @BindView(R.id.btn8) Button btn8;
    @BindView(R.id.btn9) Button btn9;
    @BindView(R.id.btn10) Button btn10;
    @BindView(R.id.btn11) Button btn11;
    @BindView(R.id.btn12) Button btn12;
    @BindView(R.id.btn13) Button btn13;
    @BindView(R.id.btn14) Button btn14;
    @BindView(R.id.btn15) Button btn15;
    @BindView(R.id.btn16) Button btn16;
    @BindView(R.id.btn17) Button btn17;
    @BindView(R.id.btn18) Button btn18;
    @BindView(R.id.btn19) Button btn19;
    @BindView(R.id.btn20) Button btn20;
    @BindView(R.id.btn21) Button btn21;
    @BindView(R.id.btn22) Button btn22;
    @BindView(R.id.btn23) Button btn23;
    @BindView(R.id.btn24) Button btn24;
    @BindView(R.id.btn25) Button btn25;
    @BindView(R.id.btn26) Button btn26;
    @BindView(R.id.btn27) Button btn27;
    @BindView(R.id.btn28) Button btn28;
    @BindView(R.id.btn29) Button btn29;
    @BindView(R.id.btn30) Button btn30;

    boolean isClicked = false;
    SharedPreferences sharedPreferences;

    int money = 0;


    SharedPreferences prefs;
    SharedPreferences.Editor prefEdit;
    String block =  "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_level_suma);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        if(intent!=null) {
            money = intent.getIntExtra("money", 0);
            //SaveMoney();
        }else{
            //loadMoney();
        }

        LoadPreferences();
    }

    @Override
    public void onBackPressed() {
        Intent i2 = new Intent();
        i2.putExtra("progressBar3",block);
        setResult(RESULT_OK, i2);
        finish();
        super.onBackPressed();
    }

    int progress = 0;

    private void resultAfterTest(String numb){
        Intent intent = new Intent(this, SumaAfterLvl.class);
        intent.putExtra("block",numb);
        intent.putExtra("money",money);
        startActivityForResult(intent,111);
    }

    public void onClick(View v){
        isClicked = false;

        switch (v.getId()){
            case R.id.btn:
                    Intent intent = new Intent(MapLevelSuma.this, CampaignTestSuma.class);
                    intent.putExtra("progress", 2);
                    intent.putExtra("lvl", 1);
                    intent.putExtra("money_data", money);
                    startActivityForResult(intent, 1);
                break;
            case R.id.btn2:
                if(!isClicked) {
                    Intent intent2 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
                    intent2.putExtra("progress",4);
                    intent2.putExtra("lvl",2);
                    intent2.putExtra("money_data",money);
                    startActivityForResult(intent2,2);
                    isClicked = true;
                }
                break;
            case R.id.btn3:
                if(!isClicked) {
                    Intent intent3 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
                    intent3.putExtra("progress",6);
                    intent3.putExtra("lvl",3);
                    intent3.putExtra("money_data",money);
                    startActivityForResult(intent3,3);
                    isClicked = true;
                }
                break;
            case R.id.btn4:
                if(!isClicked) {
                    Intent intent4 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
                    intent4.putExtra("progress",8);
                    intent4.putExtra("lvl",4);
                    intent4.putExtra("money_data",money);
                    startActivityForResult(intent4,4);
                    isClicked = true;
                }
                break;
            case R.id.btn5:
                if(!isClicked) {
                    Intent intent5 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
                    intent5.putExtra("progress",10);
                    intent5.putExtra("money_data",money);
                    intent5.putExtra("lvl",5);
                    startActivityForResult(intent5,5);
                    isClicked = true;
                }
                break;
            case R.id.btn6:
                if(!isClicked) {
                    Intent intent6 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
                    intent6.putExtra("progress",12);
                    intent6.putExtra("lvl",6);
                    intent6.putExtra("money_data",money);
                    startActivityForResult(intent6,6);
                    isClicked = true;
                }
                break;
            case R.id.btn7:
                if(!isClicked) {
                    Intent intent7 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
                    intent7.putExtra("progress",14);
                    intent7.putExtra("lvl",7);
                    intent7.putExtra("money_data",money);
                    startActivityForResult(intent7,7);
                    isClicked = true;
                }
                break;
            case R.id.btn8:
                if(!isClicked) {
                    Intent intent8 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
                    intent8.putExtra("progress",16);
                    intent8.putExtra("lvl",8);
                    intent8.putExtra("money_data",money);
                    startActivityForResult(intent8,8);
                    isClicked = true;
                }
                break;
            case R.id.btn9:
                if(!isClicked) {
                    Intent intent9 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
                    intent9.putExtra("progress",18);
                    intent9.putExtra("lvl",9);
                    intent9.putExtra("money_data",money);
                    startActivityForResult(intent9,9);
                    isClicked = true;
                }
                break;
            case R.id.btn10:
                if(!isClicked) {
                    Intent intent10 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
                    intent10.putExtra("progress",20);
                    intent10.putExtra("lvl",10);
                    intent10.putExtra("money_data",money);
                    startActivityForResult(intent10,10);
                    isClicked = true;
                }
                break;
            case R.id.btn11:
                if(!isClicked) {
                    Intent intent11 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
                    intent11.putExtra("progress",22);
                    intent11.putExtra("lvl",11);
                    intent11.putExtra("money_data",money);
                    startActivityForResult(intent11,11);
                    isClicked = true;
                }
                break;
            case R.id.btn12:
                if(!isClicked) {
                    Intent intent12 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
                    intent12.putExtra("progress",24);
                    intent12.putExtra("money_data",money);
                    intent12.putExtra("lvl",12);
                    startActivityForResult(intent12,12);
                    isClicked = true;
                }
                break;
            case R.id.btn13:
                if(!isClicked) {
                    Intent intent13 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
                    intent13.putExtra("progress",26);
                    intent13.putExtra("lvl",13);
                    intent13.putExtra("money_data",money);
                    startActivityForResult(intent13,13);
                    isClicked = true;
                }
                break;
            case R.id.btn14:
                if(!isClicked) {
                    Intent intent14 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
                    intent14.putExtra("progress",28);
                    intent14.putExtra("lvl",14);
                    intent14.putExtra("money_data",money);
                    startActivityForResult(intent14,14);
                    isClicked = true;
                }
                break;
            case R.id.btn15:
                if(!isClicked) {
                    Intent intent15 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
                    intent15.putExtra("progress",30);
                    intent15.putExtra("lvl",15);
                    intent15.putExtra("money_data",money);
                    startActivityForResult(intent15,15);
                    isClicked = true;
                }
                break;
            case R.id.btn16:
                if(!isClicked) {
                    Intent intent16 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
                    intent16.putExtra("progress",32);
                    intent16.putExtra("money_data",money);
                    intent16.putExtra("lvl",16);
                    startActivityForResult(intent16,16);
                    isClicked = true;
                }
                break;
            case R.id.btn17:
                if(!isClicked) {
                    Intent intent17 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
                    intent17.putExtra("progress",34);
                    intent17.putExtra("money_data",money);
                    intent17.putExtra("lvl",17);
                    startActivityForResult(intent17,17);
                    isClicked = true;
                }
                break;
            case R.id.btn18:
                if(!isClicked) {
                    Intent intent18 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
                    intent18.putExtra("progress",36);
                    intent18.putExtra("money_data",money);
                    intent18.putExtra("lvl",18);
                    startActivityForResult(intent18,18);
                    isClicked = true;
                }
                break;
            case R.id.btn19:
                if(!isClicked) {
                    Intent intent19 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
                    intent19.putExtra("progress",38);
                    intent19.putExtra("money_data",money);
                    intent19.putExtra("lvl",19);
                    startActivityForResult(intent19,19);
                    isClicked = true;
                }
                break;
            case R.id.btn20:
                if(!isClicked) {
                    Intent intent20 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
                    intent20.putExtra("progress",40);
                    intent20.putExtra("money_data",money);
                    intent20.putExtra("lvl",20);
                    startActivityForResult(intent20,20);
                    isClicked = true;
                }
                break;
            case R.id.btn21:
                if(!isClicked) {
                    Intent intent21 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
                    intent21.putExtra("progress",42);
                    intent21.putExtra("lvl",21);
                    intent21.putExtra("money_data",money);
                    startActivityForResult(intent21,21);
                    isClicked = true;
                }
                break;
            case R.id.btn22:
                if(!isClicked) {
                    Intent intent22 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
                    intent22.putExtra("progress",44);
                    intent22.putExtra("lvl",22);
                    intent22.putExtra("money_data",money);
                    startActivityForResult(intent22,22);
                    isClicked = true;
                }
                break;
            case R.id.btn23:
                if(!isClicked) {
                    Intent intent23 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
                    intent23.putExtra("progress",46);
                    intent23.putExtra("lvl",23);
                    intent23.putExtra("money_data",money);
                    startActivityForResult(intent23,23);
                    isClicked = true;
                }
                break;
            case R.id.btn24:
                if(!isClicked) {
                    Intent intent24 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
                    intent24.putExtra("progress",48);
                    intent24.putExtra("lvl",24);
                    intent24.putExtra("money_data",money);
                    startActivityForResult(intent24,24);
                    isClicked = true;
                }
                break;
            case R.id.btn25:
                if(!isClicked) {
                    Intent intent25 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
                    intent25.putExtra("progress",50);
                    intent25.putExtra("lvl",25);
                    intent25.putExtra("money_data",money);
                    startActivityForResult(intent25,25);
                    isClicked = true;
                }
                break;
            case R.id.btn26:
                if(!isClicked) {
                    Intent intent26 = new Intent(MapLevelSuma.this,CampaignTestSuma7x7.class);
                    intent26.putExtra("progress",52);
                    intent26.putExtra("lvl",26);
                    intent26.putExtra("money_data",money);
                    startActivityForResult(intent26,26);
                    isClicked = true;
                }
                break;
            case R.id.btn27:
                if(!isClicked) {
                    Intent intent27 = new Intent(MapLevelSuma.this,CampaignTestSuma7x7.class);
                    intent27.putExtra("progress",54);
                    intent27.putExtra("lvl",27);
                    intent27.putExtra("money_data",money);
                    startActivityForResult(intent27,27);
                    isClicked = true;
                }
                break;
            case R.id.btn28:
                if(!isClicked) {
                    Intent intent28 = new Intent(MapLevelSuma.this,CampaignTestSuma7x7.class);
                    intent28.putExtra("progress",56);
                    intent28.putExtra("lvl",28);
                    intent28.putExtra("money_data",money);
                    startActivityForResult(intent28,28);
                    isClicked = true;
                }
                break;
            case R.id.btn29:
                if(!isClicked) {
                    Intent intent29 = new Intent(MapLevelSuma.this,CampaignTestSuma7x7.class);;
                    intent29.putExtra("progress",58);
                    intent29.putExtra("lvl",29);
                    intent29.putExtra("money_data",money);
                    startActivityForResult(intent29,29);
                    isClicked = true;
                }
                break;
            case R.id.btn30:
                if(!isClicked) {
                    Intent intent30 = new Intent(MapLevelSuma.this,CampaignTestSuma7x7.class);
                    intent30.putExtra("progress",60);
                    intent30.putExtra("lvl",30);
                    intent30.putExtra("money_data",money);
                    startActivityForResult(intent30,30);
                    isClicked = true;
                }
                break;
            default:
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 111){
            block = data.getStringExtra("Block");
            if(block.equalsIgnoreCase("30")){
                finish();
            }else {
                nextLevel();
            }
        }else {
            money = data.getIntExtra("money_result", 0);
            int lvl = data.getIntExtra("block", 0);
            sharedPreferences = getPreferences(MODE_PRIVATE);

            if (lvl == 1) {
                progress = 1;
                SaveProgress();
                btn2.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next1", btn2.isEnabled());
                editor.apply();
                resultAfterTest("1");
            } else if (lvl == 2) {
                progress = 2;
                SaveProgress();
                btn3.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next2", btn3.isEnabled());
                editor.apply();
                resultAfterTest("2");
            } else if (lvl == 3) {
                progress = 3;
                SaveProgress();
                btn4.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next3", btn4.isEnabled());
                editor.apply();
                resultAfterTest("3");
            } else if (lvl == 4) {
                progress = 4;
                SaveProgress();
                btn5.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next4", btn5.isEnabled());
                editor.apply();
                resultAfterTest("4");
            } else if (lvl == 5) {
                progress = 5;
                SaveProgress();
                btn6.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next5", btn6.isEnabled());
                editor.apply();
                resultAfterTest("5");
            } else if (lvl == 6) {
                progress = 6;
                SaveProgress();
                btn7.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next6", btn7.isEnabled());
                editor.apply();
                resultAfterTest("6");
            } else if (lvl == 7) {
                progress = 7;
                SaveProgress();
                btn8.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next7", btn8.isEnabled());
                editor.apply();
                resultAfterTest("7");
            } else if (lvl == 8) {
                progress = 8;
                SaveProgress();
                btn9.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next8", btn9.isEnabled());
                editor.apply();
                resultAfterTest("8");
            } else if (lvl == 9) {
                progress = 9;
                SaveProgress();
                btn10.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next9", btn10.isEnabled());
                editor.apply();
                resultAfterTest("9");
            } else if (lvl == 10) {
                progress = 10;
                SaveProgress();
                btn11.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next10", btn11.isEnabled());
                editor.apply();
                resultAfterTest("10");
            } else if (lvl == 11) {
                progress = 11;
                SaveProgress();
                btn12.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next11", btn12.isEnabled());
                editor.apply();
                resultAfterTest("11");
            } else if (lvl == 12) {
                progress = 12;
                SaveProgress();
                btn13.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next12", btn13.isEnabled());
                editor.apply();
                resultAfterTest("12");
            } else if (lvl == 13) {
                progress = 13;
                SaveProgress();
                btn14.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next13", btn14.isEnabled());
                editor.apply();
                resultAfterTest("13");
            } else if (lvl == 14) {
                progress = 14;
                SaveProgress();
                btn15.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next14", btn15.isEnabled());
                editor.apply();
                resultAfterTest("14");
            } else if (lvl == 15) {
                progress = 15;
                SaveProgress();
                btn16.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next15", btn16.isEnabled());
                editor.apply();
                resultAfterTest("15");
            } else if (lvl == 16) {
                progress = 16;
                SaveProgress();
                btn17.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next16", btn17.isEnabled());
                editor.apply();
                resultAfterTest("16");
            } else if (lvl == 17) {
                progress = 17;
                SaveProgress();
                btn18.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next17", btn18.isEnabled());
                editor.apply();
                resultAfterTest("17");
            } else if (lvl == 18) {
                progress = 18;
                SaveProgress();
                btn19.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next18", btn19.isEnabled());
                editor.apply();
                resultAfterTest("18");
            } else if (lvl == 19) {
                progress = 19;
                SaveProgress();
                btn20.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next19", btn20.isEnabled());
                editor.apply();
                resultAfterTest("19");
            } else if (lvl == 20) {
                progress = 20;
                SaveProgress();
                btn21.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next20", btn21.isEnabled());
                editor.apply();
                resultAfterTest("20");
            } else if (lvl == 21) {
                progress = 21;
                SaveProgress();
                btn22.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next21", btn22.isEnabled());
                editor.apply();
                resultAfterTest("21");
            } else if (lvl == 22) {
                progress = 22;
                SaveProgress();
                btn23.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next22", btn23.isEnabled());
                editor.apply();
                resultAfterTest("22");
            } else if (lvl == 23) {
                progress = 23;
                SaveProgress();
                btn24.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next23", btn24.isEnabled());
                editor.apply();
                resultAfterTest("23");
            } else if (lvl == 24) {
                progress = 24;
                SaveProgress();
                btn25.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next24", btn25.isEnabled());
                editor.apply();
                resultAfterTest("24");
            } else if (lvl == 25) {
                progress = 25;
                SaveProgress();
                btn26.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next25", btn26.isEnabled());
                editor.apply();
                resultAfterTest("25");
            } else if (lvl == 26) {
                progress = 26;
                SaveProgress();
                btn27.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next26", btn27.isEnabled());
                editor.apply();
                resultAfterTest("26");
            } else if (lvl == 27) {
                progress = 27;
                SaveProgress();
                btn28.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next27", btn28.isEnabled());
                editor.apply();
                resultAfterTest("27");
            } else if (lvl == 28) {
                progress = 28;
                SaveProgress();
                btn29.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next28", btn29.isEnabled());
                editor.apply();
                resultAfterTest("28");
            } else if (lvl == 29) {
                progress = 29;
                SaveProgress();
                btn30.setEnabled(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("Next29", btn30.isEnabled());
                editor.apply();
                resultAfterTest("29");
            } else if (lvl == 30) {
                progress = 30;
                SaveProgress();
                resultAfterTest("30");
            }
        }
    }

    private void LoadPreferences(){
        sharedPreferences = getPreferences(MODE_PRIVATE);
        boolean state = sharedPreferences.getBoolean("Next1", false);
        if(state) {
            btn.setEnabled(state);
            btn.setClickable(state);
            btn2.setClickable(state);
            btn2.setEnabled(state);
        }

        boolean state2 = sharedPreferences.getBoolean("Next2", false);
        if(state2) {
            btn2.setEnabled(state2);
            btn2.setClickable(state2);
            btn3.setClickable(state2);
            btn3.setEnabled(state2);
        }

        boolean state3 = sharedPreferences.getBoolean("Next3", false);
        if(state3) {
            btn3.setEnabled(state3);
            btn3.setClickable(state3);

            btn4.setClickable(state3);
            btn4.setEnabled(state3);
        }

        boolean state4 = sharedPreferences.getBoolean("Next4", false);
        if(state4) {
            btn4.setEnabled(state4);
            btn4.setClickable(state4);
            btn5.setClickable(state4);
            btn5.setEnabled(state4);
        }

        boolean state5 = sharedPreferences.getBoolean("Next5", false);
        if(state5) {
            btn5.setEnabled(state5);
            btn5.setClickable(state5);
            btn6.setClickable(state5);
            btn6.setEnabled(state5);
        }

        boolean state6 = sharedPreferences.getBoolean("Next6", false);
        if(state6) {
            btn6.setEnabled(state6);
            btn6.setClickable(state6);
            btn7.setClickable(state6);
            btn7.setEnabled(state6);
        }

        boolean state7 = sharedPreferences.getBoolean("Next7", false);
        if(state7) {
            btn7.setEnabled(state7);
            btn7.setClickable(state7);
            btn8.setClickable(state7);
            btn8.setEnabled(state7);
        }

        boolean state8 = sharedPreferences.getBoolean("Next8", false);
        if(state8) {
            btn8.setEnabled(state8);
            btn8.setClickable(state8);
            btn9.setClickable(state8);
            btn9.setEnabled(state8);
        }

        boolean state9 = sharedPreferences.getBoolean("Next9", false);
        if(state9) {
            btn9.setEnabled(state9);
            btn9.setClickable(state9);
            btn10.setClickable(state9);
            btn10.setEnabled(state9);
        }

        boolean state10 = sharedPreferences.getBoolean("Next10", false);
        if(state10) {
            btn10.setEnabled(state10);
            btn10.setClickable(state10);
            btn11.setClickable(state10);
            btn11.setEnabled(state10);
        }

        boolean state11 = sharedPreferences.getBoolean("Next11", false);
        if(state11) {
            btn11.setEnabled(state11);
            btn11.setClickable(state11);
            btn12.setClickable(state11);
            btn12.setEnabled(state11);
        }

        boolean state12 = sharedPreferences.getBoolean("Next12", false);
        if(state12) {
            btn12.setEnabled(state12);
            btn12.setClickable(state12);
            btn13.setClickable(state12);
            btn13.setEnabled(state12);
        }

        boolean state13 = sharedPreferences.getBoolean("Next13", false);
        if(state13) {
            btn13.setEnabled(state13);
            btn13.setClickable(state13);
            btn14.setClickable(state13);
            btn14.setEnabled(state13);
        }
        boolean state14 = sharedPreferences.getBoolean("Next14", false);
        if(state14) {
            btn14.setEnabled(state14);
            btn14.setClickable(state14);
            btn15.setClickable(state14);
            btn15.setEnabled(state14);
        }

        boolean state15 = sharedPreferences.getBoolean("Next15", false);
        if(state15) {
            btn15.setEnabled(state15);
            btn15.setClickable(state15);
            btn16.setClickable(state15);
            btn16.setEnabled(state15);
        }

        boolean state16 = sharedPreferences.getBoolean("Next16", false);
        if(state16) {
            btn16.setEnabled(state16);
            btn16.setClickable(state16);
            btn17.setClickable(state16);
            btn17.setEnabled(state16);
        }

        boolean state17 = sharedPreferences.getBoolean("Next17", false);
        if(state17) {
            btn17.setEnabled(state17);
            btn17.setClickable(state17);
            btn18.setClickable(state17);
            btn18.setEnabled(state17);
        }

        boolean state18 = sharedPreferences.getBoolean("Next18", false);
        if(state18) {
            btn18.setEnabled(state18);
            btn18.setClickable(state18);
            btn19.setClickable(state18);
            btn19.setEnabled(state18);
        }

        boolean state19 = sharedPreferences.getBoolean("Next19", false);
        if(state19) {
            btn19.setEnabled(state19);
            btn19.setClickable(state19);
            btn20.setClickable(state19);
            btn20.setEnabled(state19);
        }

        boolean state20 = sharedPreferences.getBoolean("Next20", false);
        if(state20) {
            btn20.setEnabled(state20);
            btn20.setClickable(state20);
            btn21.setClickable(state20);
            btn21.setEnabled(state20);
        }

        boolean state21 = sharedPreferences.getBoolean("Next21", false);
        if(state21) {
            btn21.setEnabled(state21);
            btn21.setClickable(state21);
            btn22.setClickable(state21);
            btn22.setEnabled(state21);
        }

        boolean state22 = sharedPreferences.getBoolean("Next22", false);
        if(state22) {
            btn22.setEnabled(state22);
            btn22.setClickable(state22);
            btn23.setClickable(state22);
            btn23.setEnabled(state22);
        }

        boolean state23 = sharedPreferences.getBoolean("Next23", false);
        if(state23) {
            btn23.setEnabled(state23);
            btn23.setClickable(state23);
            btn24.setClickable(state23);
            btn24.setEnabled(state23);
        }


        boolean state24 = sharedPreferences.getBoolean("Next24", false);
        if(state24) {
            btn24.setEnabled(state24);
            btn24.setClickable(state24);
            btn25.setClickable(state24);
            btn25.setEnabled(state24);
        }

        boolean state25 = sharedPreferences.getBoolean("Next25", false);
        if(state25) {
            btn25.setEnabled(state25);
            btn25.setClickable(state25);
            btn26.setClickable(state25);
            btn26.setEnabled(state25);
        }

        boolean state26 = sharedPreferences.getBoolean("Next26", false);
        if(state26) {
            btn26.setEnabled(state26);
            btn26.setClickable(state26);
            btn27.setClickable(state26);
            btn27.setEnabled(state26);
        }

        boolean state27 = sharedPreferences.getBoolean("Next27", false);
        if(state27) {
            btn27.setEnabled(state27);
            btn27.setClickable(state27);
            btn28.setClickable(state27);
            btn28.setEnabled(state27);
        }

        boolean state28 = sharedPreferences.getBoolean("Next28", false);
        if(state28) {
            btn28.setEnabled(state28);
            btn28.setClickable(state28);
            btn29.setClickable(state28);
            btn29.setEnabled(state28);
        }

        boolean state29 = sharedPreferences.getBoolean("Next29", false);
        if(state29) {
            btn29.setEnabled(state29);
            btn29.setClickable(state29);
            btn30.setClickable(state29);
            btn30.setEnabled(state29);
        }

        sharedPreferences.edit().apply();
    }

    private void nextLevel(){
        if(block.equalsIgnoreCase("1")){
            Intent intent2 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
            intent2.putExtra("progress",4);
            intent2.putExtra("lvl",2);
            intent2.putExtra("money_data",money);
            startActivityForResult(intent2,2);
        }else if(block.equalsIgnoreCase("2")){
            Intent intent3 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
            intent3.putExtra("progress",6);
            intent3.putExtra("lvl",3);
            intent3.putExtra("money_data",money);
            startActivityForResult(intent3,3);
        }else if(block.equalsIgnoreCase("3")){
            Intent intent4 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
            intent4.putExtra("progress",8);
            intent4.putExtra("lvl",4);
            intent4.putExtra("money_data",money);
            startActivityForResult(intent4,4);
        }else if(block.equalsIgnoreCase("4")){
            Intent intent5 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
            intent5.putExtra("progress",10);
            intent5.putExtra("money_data",money);
            intent5.putExtra("lvl",5);
            startActivityForResult(intent5,5);
        }else if(block.equalsIgnoreCase("5")){
            Intent intent6 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
            intent6.putExtra("progress",12);
            intent6.putExtra("lvl",6);
            intent6.putExtra("money_data",money);
            startActivityForResult(intent6,6);
        }else if(block.equalsIgnoreCase("6")){
            Intent intent7 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
            intent7.putExtra("progress",14);
            intent7.putExtra("lvl",7);
            intent7.putExtra("money_data",money);
            startActivityForResult(intent7,7);
        }else if(block.equalsIgnoreCase("7")){
            Intent intent8 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
            intent8.putExtra("progress",16);
            intent8.putExtra("lvl",8);
            intent8.putExtra("money_data",money);
            startActivityForResult(intent8,8);
        }else if(block.equalsIgnoreCase("8")){
            Intent intent9 = new Intent(MapLevelSuma.this,CampaignTestSuma.class);
            intent9.putExtra("progress",18);
            intent9.putExtra("lvl",9);
            intent9.putExtra("money_data",money);
            startActivityForResult(intent9,9);
        }else if(block.equalsIgnoreCase("9")){
            Intent intent10 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
            intent10.putExtra("progress",20);
            intent10.putExtra("lvl",10);
            intent10.putExtra("money_data",money);
            startActivityForResult(intent10,10);
        }else if(block.equalsIgnoreCase("10")){
            Intent intent11 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
            intent11.putExtra("progress",22);
            intent11.putExtra("lvl",11);
            intent11.putExtra("money_data",money);
            startActivityForResult(intent11,11);
        }else if(block.equalsIgnoreCase("11")){
            Intent intent12 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
            intent12.putExtra("progress",24);
            intent12.putExtra("money_data",money);
            intent12.putExtra("lvl",12);
            startActivityForResult(intent12,12);
        }else if(block.equalsIgnoreCase("12")){
            Intent intent13 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
            intent13.putExtra("progress",26);
            intent13.putExtra("lvl",13);
            intent13.putExtra("money_data",money);
            startActivityForResult(intent13,13);
        }else if(block.equalsIgnoreCase("13")){
            Intent intent14 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
            intent14.putExtra("progress",28);
            intent14.putExtra("lvl",14);
            intent14.putExtra("money_data",money);
            startActivityForResult(intent14,14);
        }else if(block.equalsIgnoreCase("14")){
            Intent intent15 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
            intent15.putExtra("progress",30);
            intent15.putExtra("lvl",15);
            intent15.putExtra("money_data",money);
            startActivityForResult(intent15,15);
        }else if(block.equalsIgnoreCase("15")){
            Intent intent16 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
            intent16.putExtra("progress",32);
            intent16.putExtra("money_data",money);
            intent16.putExtra("lvl",16);
            startActivityForResult(intent16,16);
        }else if(block.equalsIgnoreCase("16")){
            Intent intent17 = new Intent(MapLevelSuma.this,CampaignTestSuma5x5.class);
            intent17.putExtra("progress",34);
            intent17.putExtra("money_data",money);
            intent17.putExtra("lvl",17);
            startActivityForResult(intent17,17);
        }else if(block.equalsIgnoreCase("17")){
            Intent intent18 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
            intent18.putExtra("progress",36);
            intent18.putExtra("money_data",money);
            intent18.putExtra("lvl",18);
            startActivityForResult(intent18,18);
        }else if(block.equalsIgnoreCase("18")){
            Intent intent19 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
            intent19.putExtra("progress",38);
            intent19.putExtra("money_data",money);
            intent19.putExtra("lvl",19);
            startActivityForResult(intent19,19);
        }else if(block.equalsIgnoreCase("19")){
            Intent intent20 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
            intent20.putExtra("progress",40);
            intent20.putExtra("money_data",money);
            intent20.putExtra("lvl",20);
            startActivityForResult(intent20,20);
        }else if(block.equalsIgnoreCase("20")){
            Intent intent21 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
            intent21.putExtra("progress",42);
            intent21.putExtra("lvl",21);
            intent21.putExtra("money_data",money);
            startActivityForResult(intent21,21);
        }else if(block.equalsIgnoreCase("21")){
            Intent intent22 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
            intent22.putExtra("progress",44);
            intent22.putExtra("lvl",22);
            intent22.putExtra("money_data",money);
            startActivityForResult(intent22,22);
        }else if(block.equalsIgnoreCase("22")){
            Intent intent23 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
            intent23.putExtra("progress",46);
            intent23.putExtra("lvl",23);
            intent23.putExtra("money_data",money);
            startActivityForResult(intent23,23);
        }else if(block.equalsIgnoreCase("23")){
            Intent intent24 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
            intent24.putExtra("progress",48);
            intent24.putExtra("lvl",24);
            intent24.putExtra("money_data",money);
            startActivityForResult(intent24,24);
        }else if(block.equalsIgnoreCase("24")){
            Intent intent25 = new Intent(MapLevelSuma.this,CampaignTestSume6x6.class);
            intent25.putExtra("progress",50);
            intent25.putExtra("lvl",25);
            intent25.putExtra("money_data",money);
            startActivityForResult(intent25,25);
        }else if(block.equalsIgnoreCase("25")){
            Intent intent26 = new Intent(MapLevelSuma.this,CampaignTestSuma7x7.class);
            intent26.putExtra("progress",52);
            intent26.putExtra("lvl",26);
            intent26.putExtra("money_data",money);
            startActivityForResult(intent26,26);
        }else if(block.equalsIgnoreCase("26")){
            Intent intent27 = new Intent(MapLevelSuma.this,CampaignTestSuma7x7.class);
            intent27.putExtra("progress",54);
            intent27.putExtra("lvl",27);
            intent27.putExtra("money_data",money);
            startActivityForResult(intent27,27);
        }else if(block.equalsIgnoreCase("27")){
            Intent intent28 = new Intent(MapLevelSuma.this,CampaignTestSuma7x7.class);
            intent28.putExtra("progress",56);
            intent28.putExtra("lvl",28);
            intent28.putExtra("money_data",money);
            startActivityForResult(intent28,28);
        }else if(block.equalsIgnoreCase("28")){
            Intent intent29 = new Intent(MapLevelSuma.this,CampaignTestSuma7x7.class);;
            intent29.putExtra("progress",58);
            intent29.putExtra("lvl",29);
            intent29.putExtra("money_data",money);
            startActivityForResult(intent29,29);
        }else if(block.equalsIgnoreCase("29")){
            Intent intent30 = new Intent(MapLevelSuma.this,CampaignTestSuma7x7.class);
            intent30.putExtra("progress",60);
            intent30.putExtra("lvl",30);
            intent30.putExtra("money_data",money);
            startActivityForResult(intent30,30);
        }
    }


    private void SaveProgress(){
        prefs = getSharedPreferences("ProgressS", MODE_PRIVATE);
        prefEdit = prefs.edit();
        prefEdit.putInt("progressS", progress);
        prefEdit.commit();
    }

}
