package com.example.finalmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.ProfileMenu:
                Intent intent=new Intent(MainActivity.this,DrawingActivity.class);
                startActivity(intent);
                return true;
            case R.id.SettingMenu:
                Log.i("Menu","You clicked Setting Menu!!");
                return true;
            case R.id.LogoutMenu:
                Log.i("Menu","You clicked Logout Menu");
                return true;
            default:
                Log.i("Menu","You have clicked nothing");
                return true;
        }
    }
}