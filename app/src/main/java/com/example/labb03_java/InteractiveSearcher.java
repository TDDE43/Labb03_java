package com.example.labb03_java;


import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatEditText;

public class InteractiveSearcher extends AppCompatEditText {
    private String searchTerm;

    public InteractiveSearcher(MainActivity parent, ViewGroup root) {
        super(parent);
//        LayoutInflater inflater = LayoutInflater.from(parent); // 1
//        element = inflater.inflate(R.layout.interactive_searcher, root); // 2 and 3
        setText("");
        addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

            @Override
            public void afterTextChanged(Editable editable) {
                searchTerm = getText().toString();
                System.out.println(searchTerm);
            }
        });

    }




}
