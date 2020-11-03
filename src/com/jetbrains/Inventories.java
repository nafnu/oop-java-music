package com.jetbrains;

import java.util.ArrayList;

public class Inventories {

    private ArrayList<Allintruments> listOfIntruments = new ArrayList<Allintruments>();


    public Inventories() {
        MessageCentre.DebugMessage("Creating a music store inventory ");
    }

    public void StorageCello (Inventories CelloToStorage) {
        listOfIntruments.add(CelloToStorage);
    }
}
