package com.infowindwos.map.marker.library.base;

/**
 * @author liang
 */
public interface IView {


    /**
     * 添加到地图上
     */
    void addToMap();

    /**
     * 从地图上移除
     */
    void removeFromMap();

    /**
     * 从地图上摧毁
     */
    void destory();

    /**
     * 是否移除
     * @return boolean
     */
    boolean isRemove();


}
