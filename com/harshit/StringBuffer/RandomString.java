package com.harshit.StringBuffer;
import java.util.Random;

public class RandomString {
    public static String generateString(int length) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();

        for(int i=0;i<length;i++) {
            char randomchar = (char)(97+ (26*random.nextFloat()));
            sb.append(randomchar);
        }
        return sb.toString();
    }
}
