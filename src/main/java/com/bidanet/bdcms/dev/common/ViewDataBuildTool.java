package com.bidanet.bdcms.dev.common;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2016/11/3.
 */
public  class ViewDataBuildTool {


    public  HashMap<Method, Method> dataViewMap=null;

    public HashMap<Method, Method> dataViewMapBuild(Class data, Class view){
        List<Field> fields = ReflectUtil.getAllFields(data);
        for (Field field : fields) {

            String fromFN = field.getName();
            String toFN = fromFN;

            Method dataM = ReflectUtil.getGetterMethodByField(fromFN, data);
            Method viewM = ReflectUtil.getSetterMethodByField(toFN, view, field.getType());
            if (dataM != null && viewM != null) {
                dataViewMap.put(dataM, viewM);
                //  view2DataMap.put(viewM,dataM);
            }
        }

        return dataViewMap;
    }


    public void forMethod(HashMap<Method, Method> methodMap,Object dataObj,Object viewObj){
        Set<Method> keySet = methodMap.keySet();
        for (Method method : keySet) {
            // 调用 get方法
            Object o = ReflectUtil.invokeMethod(method, dataObj);
            //调用set方法

            ReflectUtil.invokeMethod(methodMap.get(method), viewObj, o);
        }
    }
    public void createGetSetMapMethod(Object dataObj,Object viewObj){

        if(dataViewMap == null) {
            dataViewMap = new HashMap<>();

            dataViewMapBuild(
                    dataObj.getClass(), viewObj.getClass()
            );
        }
        forMethod(dataViewMap,dataObj,viewObj);
    }

}
