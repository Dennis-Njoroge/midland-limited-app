package com.example.agro_irrigation.Activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.example.agro_irrigation.R;

public class HelpActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView cvFeedback, cvContacts, cvAbout, cvFAQ;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        changeStatusBarColor();
        init();
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setTitle("Help Center");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

    }
    private void init() {
        //initializing variables
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        cvFeedback = findViewById(R.id.contact_us);
        cvContacts = findViewById(R.id.contact_details);
        cvFAQ = findViewById(R.id.faq);
        cvAbout = findViewById(R.id.about);

        //setting onClick Listener
        cvFeedback.setOnClickListener(this);
        cvFAQ.setOnClickListener(this);
        cvAbout.setOnClickListener(this);
        cvContacts.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.contact_us:
                i = new Intent(this, ContactUsActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
                break;
            case R.id.faq:
                i = new Intent(this, FaqActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
                break;
            default:
                break;
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);
    }
    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.TRANSPARENT);
            window.setStatusBarColor(getResources().getColor(R.color.register_bk_color));
        }
    }
}
