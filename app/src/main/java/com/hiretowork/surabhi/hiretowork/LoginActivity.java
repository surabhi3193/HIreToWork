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

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView textview_signup = findViewById(R.id.textview_signup);

        SpannableString ss = SpannableString.valueOf(textview_signup.getText().toString());
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View textView) {
                startActivity(new Intent(LoginActivity.this, EnterSignupActivity.class));
            }
            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }
        };
        ss.setSpan(clickableSpan, ss.length()-6, ss.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textview_signup.setText(ss);
        textview_signup.setMovementMethod(LinkMovementMethod.getInstance());
        textview_signup.setHighlightColor(Color.TRANSPARENT);
    }
}
