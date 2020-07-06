package com.example.themovement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private Button selectAllBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        selectAllBtn=findViewById(R.id.select_all_btn);
        initListView();
        btnListener();
    }

    void initListView(){
        List<ListModal> list=new ArrayList<>();
        list.add(new ListModal(false,"Muhammad","+923324760729"));
        list.add(new ListModal(false,"shad","+923324760729"));
        list.add(new ListModal(false,"khan","+923324760729"));
        list.add(new ListModal(false,"Imran","+923324760729"));

        MAdapter adapter=new MAdapter(this,R.layout.row,list);
        listView.setAdapter(adapter);
    }

    private void btnListener(){
        selectAllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<ListModal> list=new ArrayList<>();
                list.add(new ListModal(true,"Muhammad","+92123456789"));
                list.add(new ListModal(true,"shad","+92123456789"));
                list.add(new ListModal(true,"khan","+92123456789"));
                list.add(new ListModal(true,"Imran","+92123456789"));
                MAdapter adapter=new MAdapter(MainActivity.this,R.layout.row,list);
                listView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
