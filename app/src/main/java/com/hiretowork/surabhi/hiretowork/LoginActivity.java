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

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView textview_signup = findViewById(R.id.textview_signup);

        SpannableString str_textciew = SpannableString.valueOf(textview_signup.getText().toString());

        addTextViewLink(LoginActivity.this,textview_signup,str_textciew,str_textciew.length()-6,EnterSignupActivity.class,true);
    }
}
