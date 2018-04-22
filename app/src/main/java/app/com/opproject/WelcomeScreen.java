package app.com.opproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class WelcomeScreen extends AppCompatActivity {

    //ImageView facultyImg = (ImageView) findViewById(R.id.facultyImage);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
    }


    public void goToSignInScreen(View view) {
        Intent commonSigninIntent;
        commonSigninIntent = new Intent(this, CommonSigninScreenActivity.class);
        startActivity(commonSigninIntent);
    }

    public void goToLoginScreen(View view) {
        Intent loginIntent = new Intent(this, LoginScreenActivity.class);
        startActivity(loginIntent);
    }
}
