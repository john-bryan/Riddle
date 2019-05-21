package sg.edu.rp.c346.riddle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tv = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question1");
        tv.setText(questionSelected + " answer is: Gone");

    }
}
