package com.example.arturmusayelyan.cardviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.arturmusayelyan.cardviewexample.models.Student;
import com.example.arturmusayelyan.cardviewexample.models.adapters.RecAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Student> studentsList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initRecAdapter();
    }

    private void init() {
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        studentsList = new ArrayList<>();
        studentsList.add(new Student("Artur", "1", "80000"));
        studentsList.add(new Student("Karen", "2", "40000"));
        studentsList.add(new Student("Vardan", "3", "70000"));
        studentsList.add(new Student("Vahag", "4", "80000"));
        studentsList.add(new Student("Gevorg", "5", "80000"));
        studentsList.add(new Student("Tamar", "6", "80000"));
        studentsList.add(new Student("Rubo", "7", "80000"));
        studentsList.add(new Student("Petros", "8", "80000"));
        studentsList.add(new Student("Yura", "9", "80000"));
        studentsList.add(new Student("Alex", "10", "80000"));
        studentsList.add(new Student("Manvel", "11", "80000"));
        studentsList.add(new Student("Mesrop", "12", "80000"));
        studentsList.add(new Student("Telo", "13", "80000"));
        studentsList.add(new Student("Omar", "14", "80000"));
        studentsList.add(new Student("Firdus", "15", "80000"));
        studentsList.add(new Student("Karlen", "16", "80000"));
        studentsList.add(new Student("Serjo", "17", "80000"));
        studentsList.add(new Student("Hakob", "18", "80000"));
        studentsList.add(new Student("Arman", "19", "80000"));
        studentsList.add(new Student("Ashot", "20", "80000"));
        studentsList.add(new Student("Axas", "21", "80000"));
    }

    private void initRecAdapter() {
        if (studentsList != null && studentsList.size() > 0) {
            RecAdapter adapter = new RecAdapter(this, studentsList);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }
}
