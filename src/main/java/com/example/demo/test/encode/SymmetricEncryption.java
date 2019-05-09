package com.example.demo.test.encode;

import javax.crypto.Cipher;
import java.io.UnsupportedEncodingException;

public class SymmetricEncryption {
    private String ALGORITHM="AES";
    private String CHARSET="UTF-8";
    public byte[] encryption(String key){
        byte[] bytes = create128Bit(key);
//        Cipher.getInstance();
        return new byte[]{0};
    }

    private byte[] create128Bit(String key){
        byte[] bytes = new byte[0];
        if (null == key){
            return bytes;
        }

        try {
            bytes = key.getBytes(CHARSET);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return bytes;
    }
}
