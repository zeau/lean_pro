package com.bidanet.bdcms.dev.common;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/28.
 */
public class MapSourceTool {

    public Map map = new HashMap<String,Object>();

    public Map getMapData(){
        return map;
    }
    public MapSourceTool addMapData(String key, Object value){
        map.put(key,value);
        return this;
    }
}
