package com.bidanet.bdcms.dev.common;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.UUID;

/**
 * Created by CF on 2016/5/25.
 */
public class PasswordTool {
    public static String getSale(){
        return UUID.randomUUID().toString();
    }
    public static String getPwdEncode(String pwd,String sale){
        return DigestUtils.md5Hex(pwd+sale);
    }
}
