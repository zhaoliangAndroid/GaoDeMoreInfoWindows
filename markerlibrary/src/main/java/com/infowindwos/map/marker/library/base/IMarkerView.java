package com.infowindwos.map.marker.library.base;


import com.infowindwos.map.marker.library.marker.BaseMarkerView;


/**
 * @author liang
 */
public interface IMarkerView<W> {


    /**
     * 绑定数据
     *
     * @param infoWindowView BaseInfoWindowView
     */
    void bindInfoWindowView(BaseMarkerView.BaseInfoWindowView<W> infoWindowView);


    /**
     * 显示InfoWindow
     *
     * @param data W
     */
    void showInfoWindow(W data);

    /**
     * 隐藏InfoWindow
     */
    void hideInfoWindow();


}
