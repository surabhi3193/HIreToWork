package com.hiretowork.surabhi.hiretowork.activities.pro;

import android.os.Bundle;
import android.text.SpannableString;
import android.widget.TextView;

import com.hiretowork.surabhi.hiretowork.BaseActivity;
import com.hiretowork.surabhi.hiretowork.R;
import com.hiretowork.surabhi.hiretowork.activities.main.LoginActivity;

public class ProSignupActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_signup);
        TextView textview_login = findViewById(R.id.textview_login);
        TextView textview_terms = findViewById(R.id.textview_terms);

        SpannableString str_textciew = SpannableString.valueOf(textview_login.getText().toString());
        SpannableString str_terms = SpannableString.valueOf(textview_terms.getText().toString());

        addTextViewLink(ProSignupActivity.this, textview_login, str_textciew, str_textciew.length() - 5, LoginActivity.class, true);
        addTextViewLink(ProSignupActivity.this, textview_terms, str_terms, str_terms.length() - 18, null, true);

    }
}
