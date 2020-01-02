package com.infowindwos.map.marker.library.param;

import com.amap.api.maps.model.MarkerOptions;

/**
 * @author liang
 */
public class BaseMarkerParam {


    private MarkerOptions options = new MarkerOptions();


    public MarkerOptions getOptions() {
        return options;
    }

    public void setOptions(MarkerOptions options) {
        this.options = options;
    }


}
