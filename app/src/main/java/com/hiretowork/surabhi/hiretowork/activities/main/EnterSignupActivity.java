package com.hiretowork.surabhi.hiretowork.activities.main;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hiretowork.surabhi.hiretowork.BaseActivity;
import com.hiretowork.surabhi.hiretowork.R;
import com.hiretowork.surabhi.hiretowork.activities.ProSignupActivity;
import com.hiretowork.surabhi.hiretowork.activities.client.ClientSignUpActivity;

public class EnterSignupActivity extends BaseActivity {

    Button client_signup_btn,pro_signup_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_signup);
        TextView textview_login = findViewById(R.id.textview_login);

         client_signup_btn =findViewById(R.id.client_signup_btn);
         pro_signup_btn =findViewById(R.id.pro_signup_btn);

         client_signup_btn.setOnClickListener(v -> didTapButton(client_signup_btn,new Intent(EnterSignupActivity.this,ClientSignUpActivity.class)));

         pro_signup_btn.setOnClickListener(v -> didTapButton(pro_signup_btn,new Intent(EnterSignupActivity.this,ProSignupActivity.class)));

        SpannableString str_textciew = SpannableString.valueOf(textview_login.getText().toString());

        addTextViewLink(EnterSignupActivity.this,textview_login,str_textciew,str_textciew.length()-5,LoginActivity.class,true);

    }


}
