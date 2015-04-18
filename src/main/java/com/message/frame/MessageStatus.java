package com.message.frame;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-3-7
 * Time: 上午2:29
 * To change this template use File | Settings | File Templates.
 */
public class MessageStatus {

    private static Map<Integer,String> map = new HashMap<Integer,String>();

    /**
     * 消息编号
     */
    public static final int MS_SUCCESS = 1;
    public static final int NOT_EXITIS = -1001;




    /**
     * 获取
     * @param statusCode
     * @return
     */
    public static String getStatusText(int statusCode) {
         return map.get(statusCode);
    }

    static {
        map.put(MS_SUCCESS, "SUCCESS");
        map.put(NOT_EXITIS, "该图文消息不存在");
    }


}
