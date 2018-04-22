package app.com.opproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CommonSigninScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_signup_screen);
    }


    public void goToFacultySignupScreen(View view) {
        Intent facultySignupIntent;
        facultySignupIntent = new Intent(this, FacultySignupActivity.class);
        startActivity(facultySignupIntent);
    }

    public void goToStudentSignupScreen(View view) {

    }

}
