package com.example.john.testrecyclertabs;

import java.util.ArrayList;

public class DataSource extends ArrayList {
    private ArrayList<DataClass> DataSource = new ArrayList<>();

    public ArrayList getData() {
        DataSource.add(new DataClass("Matthew", "News App Pt. 2", 1));
        DataSource.add(new DataClass("Olivia", "News App Pt. 1", 2));
        DataSource.add(new DataClass("Chris", "Inventory", 3));
        DataSource.add(new DataClass("Rosario", "Tour Guide", 4));
        DataSource.add(new DataClass("Peter", "Tour Guide", 5));
        DataSource.add(new DataClass("MacKenzie", "News App Pt. 2", 6));
        DataSource.add(new DataClass("Tim", "Music Player", 7));
        DataSource.add(new DataClass("Dave", "News App Pt. 2", 8));
        //More Angry_Nerds go here
        return DataSource;
    }
}