package com.Anakost;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;

public class Main {
    static String html="DNS=%24-_.%2B+%D0%B0+%D0%B1+%D0%B2+%D0%B3+%D0%B4+%D0%B6+%D0%B7&field+1=%21*%27%28%29%2C&field+2=%3B%3F%3A%40%26%3D%2F&field+3=%25%5C%7B%7D%5B%5D%23%5E%7E%7C";
    public static void main(String[] args) throws UnsupportedEncodingException {
        HashMap<String,String> map=decodeString(html);
    }
    private static HashMap<String,String> decodeString(String s) throws UnsupportedEncodingException {

        String[]hello=s.split("&");
        HashMap<String,String> map=new HashMap<String,String>();
        for (String string:hello){
            String name = string.substring(0, string.indexOf("="));
            String value = string.substring( string.indexOf("=")+1,string.length());
            System.out.println();
            map.put(URLDecoder.decode(name,"UTF-8"),URLDecoder.decode(value,"UTF-8"));
        }
        // write your code here
        return map;
    }
}
