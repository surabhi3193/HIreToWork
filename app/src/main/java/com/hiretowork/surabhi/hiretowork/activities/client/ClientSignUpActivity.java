package com.hiretowork.surabhi.hiretowork.activities.client;

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
import com.hiretowork.surabhi.hiretowork.activities.main.LoginActivity;

public class ClientSignUpActivity extends BaseActivity {

    private boolean isPassVisible = false;
    private boolean isConfPassVisible = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_sign_up);

        Button register_btn = findViewById(R.id.register_btn);
        TextView textview_login = findViewById(R.id.textview_login);
        TextView textview_terms = findViewById(R.id.textview_terms);
        final ImageView show_btn = findViewById(R.id.show_btn);
        final ImageView conf_show_btn = findViewById(R.id.conf_show_btn);
        EditText edittext_password = findViewById(R.id.edittext_password);
        EditText edittext_conf_password = findViewById(R.id.edittext_conf_password);

        SpannableString str_textciew = SpannableString.valueOf(textview_login.getText().toString());
        SpannableString str_terms = SpannableString.valueOf(textview_terms.getText().toString());

        addTextViewLink(ClientSignUpActivity.this, textview_login, str_textciew, str_textciew.length() - 5, LoginActivity.class, true);
        addTextViewLink(ClientSignUpActivity.this, textview_terms, str_terms, str_terms.length() - 18, null, true);


        register_btn.setOnClickListener(v -> didTapButton(register_btn,new Intent(ClientSignUpActivity.this,ClientDashBoard.class)));


        show_btn.setOnClickListener(v -> {

            System.out.println("-------- isvisible ---- " + isPassVisible);
            if (!isPassVisible) {
                show_btn.setImageResource(R.drawable.show_btn);
//                    Glide.with(LoginActivity.this).load(R.drawable.show_btn).into(show_btn);
                isPassVisible = true;
                edittext_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

            } else {
                edittext_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                show_btn.setImageResource(R.drawable.hide);
                isPassVisible = false;

            }

        });

        conf_show_btn.setOnClickListener(v -> {

            System.out.println("-------- isvisible ---- " + isConfPassVisible);
            if (!isConfPassVisible) {
                conf_show_btn.setImageResource(R.drawable.show_btn);
//                    Glide.with(LoginActivity.this).load(R.drawable.show_btn).into(show_btn);
                isConfPassVisible = true;
                edittext_conf_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

            } else {
                edittext_conf_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                conf_show_btn.setImageResource(R.drawable.hide);
                isConfPassVisible = false;

            }

        });


    }
}
