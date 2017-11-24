package com.fizzpod.dooey;

public class Flag {

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
