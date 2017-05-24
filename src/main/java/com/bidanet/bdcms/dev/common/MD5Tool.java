package com.bidanet.bdcms.dev.common;

import java.security.MessageDigest;

/**
 * Created by yf007 on 2016/12/30.
 */
public class MD5Tool {

    public static String toMd5(String url) {
        try {
            //生成实现指定摘要算法的 MessageDigest 对象。
            MessageDigest md = MessageDigest.getInstance("MD5");
            //使用指定的字节数组更新摘要。
            md.update(url.getBytes());
            //通过执行诸如填充之类的最终操作完成哈希计算。
            byte b[] = md.digest();
            //生成具体的md5密码到buf数组
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
//            System.out.println("32位: " + buf.toString());// 32位的加密
//            System.out.println("16位: " + buf.toString().substring(8, 24));// 16位的加密，其实就是32位加密后的截取
            return buf.toString();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
