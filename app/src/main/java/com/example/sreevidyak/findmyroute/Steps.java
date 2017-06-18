package com.example.sreevidyak.findmyroute;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by sreevidyak on 18/06/2017.
 */

public class Steps {
    public Distance distance;
    public Duration duration;
    public String htmlInstruction;
    public String travelMode;
    public Steps(Distance distance,Duration duration,String htmlInstruction,String travelMode){
        this.distance = distance;
        this.duration = duration;
        this.htmlInstruction = htmlInstruction;
        this.travelMode = travelMode;
    }

}
