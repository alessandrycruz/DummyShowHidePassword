package com.example.alessandrycruz.dummyshowhidepassword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.alessandrycruz.dummyshowhidepassword.customviews.PasswordEditText_CustomView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.password_image_view_custom_view)
    ImageView mImageViewSecureOrPartialSecure;

    private PasswordEditText_CustomView mPasswordEditText_CustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mPasswordEditText_CustomView = (PasswordEditText_CustomView) findViewById(R.id.password_edit_text_custom_view);
        mPasswordEditText_CustomView.setPasswordImageView(mImageViewSecureOrPartialSecure);
    }
}