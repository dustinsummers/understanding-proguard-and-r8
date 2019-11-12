package com.examples.testfile5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import static android.util.Log.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendMessage((tag, message) -> d("Tester1", "My new fancy log message"));
        sendMessage((tag, message) -> d("Tester2", "My second fancy log message"));

        sendMessage(Log::d);
        sendMessage(Log::d);
    }

    private static void sendMessage(PostMan<String> message) {
        message.logTime("Default Test", "Sending a default message");
    }
}

interface PostMan<String>{
  void logTime(String tag, String message);
}