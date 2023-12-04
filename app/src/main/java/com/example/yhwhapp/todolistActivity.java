package com.example.yhwhapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class todolistActivity extends AppCompatActivity {

    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView listView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todolist);

        ImageButton imageButton43 = findViewById(R.id.imageButton43);
        imageButton43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalendar_calActivity();
            }
        });

        listView = findViewById(R.id.ListView);
        button = findViewById(R.id.button17);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                addItems(view);

            }


        });

        items = new ArrayList<>();
        itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(itemsAdapter);
        setUpListViewListener();
    }

    private void setUpListViewListener() {
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l){
                Context context = getApplicationContext();
                Toast.makeText(context, "Item removed", Toast.LENGTH_SHORT).show();
                items.remove(i);
                itemsAdapter.notifyDataSetChanged();
                return true;
            }
        });
    }

    private void addItems(View view) {
        EditText input = findViewById(R.id.editTextTextPersonName);
        String itemText = input.getText().toString();
        if (!(itemText.equals(""))) {
            itemsAdapter.add(itemText);
            input.setText("");
        }
        else {
            Toast.makeText(getApplicationContext(), "Please enter text", Toast.LENGTH_LONG).show();
        }


    }
    public void openCalendar_calActivity() {
        Intent intent = new Intent(this, Calendar_calActivity.class);
        startActivity(intent);
    }
}