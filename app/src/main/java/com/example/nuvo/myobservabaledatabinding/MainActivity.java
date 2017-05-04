package com.example.nuvo.myobservabaledatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.nuvo.myobservabaledatabinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    MyModel myModel = new MyModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // layout file name + "Binding"
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setModel(myModel);

        binding.update.setOnClickListener(v -> {
//            myModel.update(binding.editText00.getText().toString(), binding.editText01.getText().toString());
        });
    }
}
