package com.harshit.KarpRabin;

public class Algo {
    private final int prime = 101;

    private double calculateHash(String str) {
        double hash = 0 ;
        for(int i = 0 ; i < str.length() ; i++) {
            hash = hash + str.charAt(i)*Math.pow(prime, i);
        }
        return hash;
    }

    private double updateHash(double preHash, char oldchar, char newchar, int patternlength) {
        double newHash = (preHash-oldchar)/prime;
        newHash = newHash + newchar*Math.pow(prime,patternlength-1);
        return newHash;

    }
    public void search(String text, String pattern) {
        int patternlength = pattern.length();
        double patternHash = calculateHash(pattern);
        double textHash = calculateHash(text.substring(0,patternlength));

        for(int i = 0 ; i <= text.length()-patternlength ; i++) {
            if(textHash==patternHash) {
                if(text.substring(i,i+patternlength).equals(pattern)) {
                    System.out.println("Pattern found at "+i);
                }
            }
            if(i < text.length()-patternlength) {
                textHash= updateHash(textHash,text.charAt(i), text.charAt(i+patternlength),patternlength);
            }
        }

    }
}
