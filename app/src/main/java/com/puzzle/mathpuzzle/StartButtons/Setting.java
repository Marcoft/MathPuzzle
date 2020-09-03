package com.puzzle.mathpuzzle.StartButtons;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.puzzle.mathpuzzle.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Setting extends AppCompatActivity {

    SharedPreferences prefs;
    SharedPreferences.Editor prefEdit;

    @BindView(R.id.NotificationMain) TextView NotificationMain;
    @BindView(R.id.NotificationFirst) TextView NotificationFirst;
    @BindView(R.id.NotificationSecond) TextView NotificationSecond;
    @BindView(R.id.DardTheme) TextView DardTheme;
    @BindView(R.id.deleteDate) TextView deleteDate;
    @BindView(R.id.DeleteDateCampaign) TextView DeleteDateCampaign;
    @BindView(R.id.deleteDateRecord) TextView deleteDateRecord;


    String savedText;
    void loadText() {
        prefs = getSharedPreferences("Language", MODE_PRIVATE);
        savedText = prefs.getString("language", "");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);
        loadText();
        if(savedText.equals("Русский")){
            NotificationMain.setText("Уведомления");
            NotificationFirst.setText("Уведомления\nУтром");
            NotificationSecond.setText("Уведомления\nВечером");
            DardTheme.setText("Темная тема");
            deleteDate.setText("Сброс данных");
            DeleteDateCampaign.setText("Сброс данных Кампании");
            deleteDateRecord.setText("Сброс данных Рекордов");
        } else if(savedText.equals("English")){
            NotificationMain.setText("");
            NotificationFirst.setText("");
            NotificationSecond.setText("");
            DardTheme.setText("");
            deleteDate.setText("");
            DeleteDateCampaign.setText("");
            deleteDateRecord.setText("");
        } else if(savedText.equals("Українська")){
            NotificationMain.setText("");
            NotificationFirst.setText("");
            NotificationSecond.setText("");
            DardTheme.setText("");
            deleteDate.setText("");
            DeleteDateCampaign.setText("");
            deleteDateRecord.setText("");
        } else {
            NotificationMain.setText("Уведомления");
            NotificationFirst.setText("Уведомления\nУтром");
            NotificationSecond.setText("Уведомления\nВечером");
            DardTheme.setText("Темная тема");
            deleteDate.setText("Сброс данных");
            DeleteDateCampaign.setText("Сброс данных Кампании");
            deleteDateRecord.setText("Сброс данных Рекордов");
        }


    }


}
