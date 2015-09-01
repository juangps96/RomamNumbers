package com.exrcise.juan.romamnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Context;

// Juan Peñaherrera
public class RomanNumber extends AppCompatActivity {
    //Global Vars
    TextView tv_variable;
    EditText et_entry;

    //objects of the class
    Validation objValidation = new Validation();
    Convertion objConvertion = new Convertion();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roman_number);

        //Assign elements to the vars
        tv_variable = (TextView)findViewById(R.id.tv_result);
        et_entry =(EditText)findViewById(R.id.et_romannumber);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_roman_number, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*
     Convert the Roman number text to a number
     */
    public void Calculation(View v){

        //UpperCase
        et_entry.setText(et_entry.getText().toString().toUpperCase());

        //If Empty
        if (et_entry.getText().toString().isEmpty())
        {
            et_entry.setError(getString(R.string.msj_empty));
            return;
        }

        //call convertion
        if (objValidation.Validator(et_entry.getText().toString()))
            tv_variable.setText(String.valueOf(objConvertion.Calculation(et_entry.getText().toString())));
        else
            tv_variable.setText(getString(R.string.msj_wrong));

    }

    /*
    * Clean the edittextboxes
    * */
    public void Clean(View v){
        tv_variable.setText("");
        et_entry.setText("");
    }


}
