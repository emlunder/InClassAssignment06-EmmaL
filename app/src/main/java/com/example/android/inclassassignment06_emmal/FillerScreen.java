package com.example.android.inclassassignment06_emmal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class FillerScreen extends AppCompatActivity
{
    EditText speciesName;
    EditText rank;
    CheckBox householdPet;
    Button submitNew;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filler_screen);

        speciesName = (EditText) findViewById(R.id.species_string);
        rank = (EditText) findViewById(R.id.rank_number);
        householdPet = (CheckBox) findViewById(R.id.pet_boolean);
        submitNew = (Button) findViewById(R.id.submit_form_button);
    }

    public void submitNew(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        String petName = speciesName.getText().toString();
        int scale = Integer.parseInt(rank.getText().toString());
        boolean petType = householdPet.isChecked();

        Pets pet = new Pets(petName, scale, petType);

        i.putExtra(Keys.PETS, pet);
        setResult(RESULT_OK, i);
        finish();
    }

}
