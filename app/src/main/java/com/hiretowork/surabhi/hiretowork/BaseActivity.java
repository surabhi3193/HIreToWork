package com.hiretowork.surabhi.hiretowork;

import android.content.Context;
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

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    void addTextViewLink(Context context, TextView textview, SpannableString ss, int start, Class nextAct,boolean isfinish)
    {
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View textView) {
                startActivity(new Intent(context,nextAct));
                if (isfinish)
                    finish();
            }
            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }
        };
        ss.setSpan(clickableSpan, start, ss.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textview.setText(ss);
        textview.setMovementMethod(LinkMovementMethod.getInstance());
        textview.setHighlightColor(Color.TRANSPARENT);
    }
}
