package com.example.alessandrycruz.dummyshowhidepassword.customviews;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by alessandry.cruz on 6/6/2017.
 */

public class PasswordEditText_CustomView extends AppCompatEditText {
    private int drawableResourceSecureOrPartialSecure;

    private AppCompatEditText mAppCompatEditText;

    public PasswordEditText_CustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        drawableResourceSecureOrPartialSecure = android.R.drawable.ic_secure;
        mAppCompatEditText = this;

        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    public void setPasswordImageView(final ImageView imageView) {
        if (imageView != null) {
            imageView.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (drawableResourceSecureOrPartialSecure == android.R.drawable.ic_secure) {
                        imageView.setImageResource(android.R.drawable.ic_partial_secure);
                        drawableResourceSecureOrPartialSecure = android.R.drawable.ic_partial_secure;

                        mAppCompatEditText.setTransformationMethod(new SingleLineTransformationMethod());
                        mAppCompatEditText.setSelection(mAppCompatEditText.getText().length());
                    } else {
                        imageView.setImageResource(android.R.drawable.ic_secure);
                        drawableResourceSecureOrPartialSecure = android.R.drawable.ic_secure;

                        mAppCompatEditText.setTransformationMethod(new PasswordTransformationMethod());
                        mAppCompatEditText.setSelection(mAppCompatEditText.getText().length());
                    }
                }
            });
        }
    }
}