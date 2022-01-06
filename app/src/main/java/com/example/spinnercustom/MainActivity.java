package com.example.spinnercustom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.spinnercustom.custom.MultiSelectionSpinnerDialog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MultiSpinner multiSpinner  = findViewById(R.id.spinnerMultiSpinner);

        //List for storing image URL's for displaying it in the Spinner.

        List<String>  urlList = new ArrayList();
        urlList.add("https://cdn.pixabay.com/photo/2015/06/24/01/15/morning-819362_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2017/05/12/08/29/coffee-2306471_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2016/03/26/13/09/cup-of-coffee-1280537_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2013/08/11/19/46/coffee-171653_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2015/10/12/14/54/coffee-983955_960_720.jpg");

        //List for storing text content for displaying it in the Spinner.
       List<String> contentList= new ArrayList();
        contentList.add("One");
        contentList.add("Two");
        contentList.add("Three");
        contentList.add("Four");
        contentList.add("Five");


        //Setting Multi Selection Spinner with image.
        multiSpinner.setItems(this, contentList,"Select");

        //Setting Multi Selection Spinner with out image.
        //multiSpinner.setAdapterWithOutImage(this,contentList,this)
//        multiSpinner.initMultiSpinner(this,multiSpinner);
    }

}