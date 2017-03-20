package com.example.android.inclassassignment06_emmal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView displayText;
    String savedText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText = (TextView) findViewById(R.id.display_text);
        savedText = displayText.getText().toString();
    }

    public void openFillerScreen (View view)
    {
        Intent i = new Intent(this, FillerScreen.class);
        startActivityForResult(i, RequestCodes.ADD_PETS);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent i)
    {
        super.onActivityResult(requestCode, resultCode, i);
        if(requestCode == RequestCodes.ADD_PETS && resultCode == RESULT_OK)
        {
            Pets pet = (Pets) i.getSerializableExtra(Keys.PETS);
            savedText += pet.toString();
            displayText.setText(savedText);
        }
    }
}
