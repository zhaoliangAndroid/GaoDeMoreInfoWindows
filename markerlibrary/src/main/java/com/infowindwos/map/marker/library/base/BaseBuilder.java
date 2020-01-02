package com.infowindwos.map.marker.library.base;

import android.content.Context;

import com.amap.api.maps.AMap;

/**
 * @author liang
 */
public abstract class BaseBuilder {

    private Context context;
    private AMap map;


    public BaseBuilder(Context context, AMap map) {
        this.context = context;
        this.map = map;
    }


    public Context getContext() {
        return context;
    }


    public AMap getMap() {
        return map;
    }


}
