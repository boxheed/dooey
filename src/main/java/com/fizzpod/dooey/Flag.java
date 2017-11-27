package com.fizzpod.dooey;

import java.util.regex.Pattern;

public class Flag {

    private static final Pattern BARE_FLAG_PATTERN = Pattern.compile("-+(.*)");

    private String flag;
    
    public Flag(String flag) {
        this.flag = flag;
    }
    
    public String getFlag() {
        for(char f: flag.toCharArray()) {
            if(f != '-') {
                return String.valueOf(f);
            }
        }
        return null;
    }
    
}
