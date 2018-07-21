package com.hiretowork.surabhi.hiretowork.activities.client;

import android.os.Bundle;
import android.text.SpannableString;
import android.widget.TextView;

import com.hiretowork.surabhi.hiretowork.BaseActivity;
import com.hiretowork.surabhi.hiretowork.R;
import com.hiretowork.surabhi.hiretowork.activities.main.EnterSignupActivity;
import com.hiretowork.surabhi.hiretowork.activities.main.LoginActivity;

public class ClientSignUpActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_sign_up);

        TextView textview_login = findViewById(R.id.textview_login);
        TextView textview_terms = findViewById(R.id.textview_terms);

        SpannableString str_textciew = SpannableString.valueOf(textview_login.getText().toString());
        SpannableString str_terms = SpannableString.valueOf(textview_terms.getText().toString());

        addTextViewLink(ClientSignUpActivity.this,textview_login,str_textciew,str_textciew.length()-5,LoginActivity.class,true);
        addTextViewLink(ClientSignUpActivity.this,textview_terms,str_terms,str_terms.length()-18,null,true);
    }
}
