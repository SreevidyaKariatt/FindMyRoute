package com.example.sreevidyak.findmyroute;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sreevidyak on 18/06/2017.
 */

public class Route {

    public Distance distance;
    public Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;
    public List<Steps> steps = new ArrayList<>();

    public List<LatLng> points;
}
