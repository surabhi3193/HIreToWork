package com.hiretowork.surabhi.hiretowork;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

public class EnterSignupActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_signup);
        TextView textview_login = findViewById(R.id.textview_login);

        SpannableString str_textciew = SpannableString.valueOf(textview_login.getText().toString());

        addTextViewLink(EnterSignupActivity.this,textview_login,str_textciew,str_textciew.length()-5,LoginActivity.class,true);

    }
}
