package com.example.pgran.recyclearoundtown;

import android.location.Location;

/**
 * Created by pgran on 4/1/2017.
 */

public class RecycleBin {

    private Location location;
    private boolean isPublic;
    private int size;

    public RecycleBin(){
        location=new Location();
        isPublic=false;
        size=0;
    }

    public RecycleBin(location, isPublic, size){
        location=new Location();
        isPublic=false;
        size=0;
    }

}
