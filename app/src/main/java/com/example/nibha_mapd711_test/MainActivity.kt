// Name: Nibha Maharjan
// Student ID: 301282952
// Date Completed: 20th Oct 2023
// App Desc: Test
package com.example.nibha_mapd711_test

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //Initializing shared Pref and Buttons
    private lateinit var button: Button
    private lateinit var sharedPrefs: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //page Title
        title = "Watch Buying Helper App"
        sharedPrefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        //Spinner
        val spinner: Spinner = findViewById(R.id.spinner3)
        // Create an ArrayAdapter
        ArrayAdapter.createFromResource(
            this,
            R.array.actlvl,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner.
            spinner.adapter = adapter
        }

        //Size
        var radioGroup: RadioGroup? = null
        lateinit var radioButton: RadioButton
        radioGroup = findViewById(R.id.radioGroup1)
        val selectedOption: Int = radioGroup!!.checkedRadioButtonId
        radioButton = findViewById(selectedOption)

        //Loop
        var radioGroup2: RadioGroup? = null
        lateinit var radioButton2: RadioButton
        radioGroup2 = findViewById(R.id.radioGroup2)
        val selectedOption2: Int = radioGroup2!!.checkedRadioButtonId
        radioButton = findViewById(selectedOption2)

        //Loop
        var radioGroup3: RadioGroup? = null
        lateinit var radioButton3: RadioButton
        radioGroup3 = findViewById(R.id.radioGroup2)
        val selectedOption3: Int = radioGroup3!!.checkedRadioButtonId
        radioButton = findViewById(selectedOption3)

        button = findViewById(R.id.button)
        val ch = findViewById<CheckBox>(R.id.checkBox)



        button.setOnClickListener {
            //Button Not Empty check
            val selectedOption: Int? = radioGroup?.checkedRadioButtonId
            if (selectedOption == null || selectedOption == -1) {
                Toast.makeText(this, "Select a Size", Toast.LENGTH_SHORT).show()
            } else {
                val selectedOption2: Int? = radioGroup2?.checkedRadioButtonId
                if (selectedOption2 == null || selectedOption2 == -1) {
                    Toast.makeText(this, "Select a Loop", Toast.LENGTH_SHORT).show()
                } else {
                    val selectedOption3: Int? = radioGroup3?.checkedRadioButtonId
                    if (selectedOption3 == null || selectedOption3 == -1) {
                        Toast.makeText(this, "Select a Trade", Toast.LENGTH_SHORT).show()
                    } else {
                        //Radio Button value assign
                        val radioButton = findViewById<RadioButton>(selectedOption)
                        val radioButton2 = findViewById<RadioButton>(selectedOption2)
                        val radioButton3 = findViewById<RadioButton>(selectedOption3)
                        //Shared Pref for Checkbox
                        val check = sharedPrefs.edit()
                        check.putString("check", ch.isChecked().toString())
                        check.apply()
                        //Shared Pref for Spinner
                        val spinnerdata = sharedPrefs.edit()
                        spinnerdata.putString("spin", spinner.getSelectedItem().toString())
                        spinnerdata.apply()
                        startActivity(
                            Intent(this, SecondActivity::class.java)
                                //Intent for size loop and trade
                                .putExtra("size", radioButton.text.toString())
                                .putExtra("loop", radioButton2.text.toString())
                                .putExtra("trade", radioButton3.text.toString())
                        )
                    }
                }
            }


        }
    }
}
// Assigning id of the checked radio button

// Assigning id of the checked radio button


class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {
    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
        // An item is selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos).
        val spinner: Spinner = findViewById(R.id.spinner3)
        spinner.onItemSelectedListener = this
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Another interface callback.
    }
}