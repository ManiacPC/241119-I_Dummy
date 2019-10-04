package com.example.aplicationdummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Actividad Principal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "onStart: Ha empezado la actividad");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume: Se ha resumido la ejecución de la actividad");
    }
    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "onPause: Se ha pausado la ejecución de la actividad");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(TAG, "onRestart: Se ha reiniciado la ejecución de la actividad");
    }

    @Override
    protected void onStop(){
        super.onStop();

        Log.i(TAG, "onStop: Se ha detenido la ejecución de la actividad");
    }
}
