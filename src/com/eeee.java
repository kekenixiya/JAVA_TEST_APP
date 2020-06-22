package com;

import java.io.UnsupportedEncodingException;

public class eeee {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] aa = "好得冠福".getBytes("GBK");
        //
        byte[] bb = {-26,-65,-126,-17,-65,-67};
        byte[] cc = {-26,-65,-126};
        System.out.println(new String(aa,"utf-8"));
        System.out.println(aa.length);


        byte[] b_gbk = "中".getBytes("GBK");
        byte[] b_utf8 = "中".getBytes("UTF-8");
        byte[] b_iso88591 = "中".getBytes("ISO8859-1");

        String s_gbk = new String(b_gbk,"GBK");
        String s_utf8 = new String(b_utf8,"UTF-8");
        String s_iso88591 = new String(b_iso88591,"ISO8859-1");


    }
}
