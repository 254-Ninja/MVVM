package com.example.mvvmusingdatabinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class User {
        private String email;
        private String password;

        public User(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public void setEmail(String email) {
            this.email = email;
        }


        public String getEmail() {
            return email;
        }

        public void setPassword(String password) {
            this.password = password;
        }


        public String getPassword() {
            return password;
        }


    }
}
