package cn.maixedu.zsb.utils;

import cn.maixedu.zsb.model.view.WechatSession;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/8/29
 */
public class Static {
    public static ConcurrentHashMap<String, WechatSession> storeSession = new ConcurrentHashMap<>();
}
