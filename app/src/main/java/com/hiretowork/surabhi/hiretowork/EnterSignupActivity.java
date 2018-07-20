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

public class EnterSignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_signup);
        TextView textview_login = findViewById(R.id.textview_login);

        SpannableString ss = SpannableString.valueOf(textview_login.getText().toString());
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View textView) {
                startActivity(new Intent(EnterSignupActivity.this, LoginActivity.class));
                finish();
            }
            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }
        };
        ss.setSpan(clickableSpan, ss.length()-5, ss.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textview_login.setText(ss);
        textview_login.setMovementMethod(LinkMovementMethod.getInstance());
        textview_login.setHighlightColor(Color.TRANSPARENT);

    }
}
