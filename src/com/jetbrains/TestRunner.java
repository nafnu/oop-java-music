package com.jetbrains;

public class TestRunner {

    public void Run() {

        RunObjects();
        RunInventories();

    }

    public void RunObjects(){

        Cello c1 = new Cello();
        Conga ca1 = new Conga();
        Drums d1 = new Drums();
        Guitar g1 = new Guitar();
        Harmonica h1 = new Harmonica();
        Harp ha1 = new Harp();
        Maracas m1 = new Maracas();
        Piano p1 = new Piano ();
        Trombone t1 = new Trombone();

    }

    public void RunInventories(){

        Inventories inventories = new Inventories();
        Cello c1 = new Cello();
        Cello c2 = new Cello();
        Cello c3 = new Cello();

        inventories.StorageCello(c1);
        inventories.StorageCello(c2);
        inventories.StorageCello(c3);

    }
}
