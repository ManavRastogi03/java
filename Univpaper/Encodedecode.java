package Univpaper;

import java.util.*;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;

public class Encodedecode {
    public static void main(String[] args) {
        String name="Manav";
        Encoder encode= Base64.getEncoder();
        String encodestr=encode.encodeToString(name.getBytes());
        System.out.println(encodestr);

       Decoder decoder= Base64.getDecoder();
       byte[] decode1=decoder.decode(encodestr.getBytes());
       String decode=new String(decode1);
        System.out.println(decode);


    }
}
