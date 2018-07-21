package com.hiretowork.surabhi.hiretowork.activities.main;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.hiretowork.surabhi.hiretowork.BaseActivity;
import com.hiretowork.surabhi.hiretowork.R;

public class LoginActivity extends BaseActivity {

    private boolean isVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final ImageView show_btn = findViewById(R.id.show_btn);
        TextView textview_signup = findViewById(R.id.textview_signup);
        EditText edittext_password = findViewById(R.id.edittext_password);
       Button login_btn =findViewById(R.id.login_btn);


        SpannableString str_textciew = SpannableString.valueOf(textview_signup.getText().toString());

        addTextViewLink(LoginActivity.this,textview_signup,str_textciew,str_textciew.length()-6,EnterSignupActivity.class,false);

        show_btn.setOnClickListener(v -> {

            System.out.println("-------- isvisible ---- " + isVisible);
            if (!isVisible) {
                show_btn.setImageResource(R.drawable.show_btn);
//                    Glide.with(LoginActivity.this).load(R.drawable.show_btn).into(show_btn);
                isVisible = true;
                edittext_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

            } else {
                edittext_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                show_btn.setImageResource(R.drawable.hide);
                isVisible = false;

            }

        });
        login_btn.setOnClickListener(v -> didTapButton(login_btn,new Intent(LoginActivity.this,MainActivity.class)));
    }
}
