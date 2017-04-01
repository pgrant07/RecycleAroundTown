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
        setLocation(new Location("dummyprovider"));
        setPublic(false);
        setSize(0);
    }

    public RecycleBin(Location location, boolean isPublic, int size){
        this.setLocation(location);
        this.setPublic(isPublic);
        this.setSize(size);
    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
