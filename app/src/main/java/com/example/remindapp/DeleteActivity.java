package com.example.remindapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class DeleteActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    ImageView menuIcon;
    DrawerLayout drawerLayout;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        drawerLayout = findViewById(R.id.drawer_delete_layout);
        navigationView = findViewById(R.id.navigation_view);
        menuIcon = findViewById(R.id.menu_icon);

        navigationDrawer();

    }

    private void navigationDrawer() {
        //Nav Drawer
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_delete);

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(drawerLayout.isDrawerVisible(GravityCompat.START)){
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else drawerLayout.openDrawer(GravityCompat.START);
            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.nav_home){
            Intent intent = new Intent(DeleteActivity.this, MainActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_add) {
            Intent intent = new Intent(DeleteActivity.this, AddActivity.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.nav_edit) {
            Intent intent = new Intent(DeleteActivity.this, EditActivity.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.nav_delete) {
            Intent intent = new Intent(DeleteActivity.this, DeleteActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}