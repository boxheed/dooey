package com.fizzpod.dooey;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Args {

    List<String> args;
    
    public Args(String[] args) {
        this.args = Arrays.asList(args);
    }
    
    public Collection<Flag> getFlags() {
        List<Flag> flags = new LinkedList<>();
        for(String arg: args) {
            if(arg.startsWith("-")) {
                Flag flag = new Flag(arg);
                flags.add(flag);
            } else {
                break;
            }
            
        }
        return flags;
    }
    
    public String getCommand() {
        for(String arg: args) {
            if(!arg.startsWith("-")) {
                return arg;
            }
        }
        return null;
    }
    
    public String getCommandAfter(String command) {
        boolean next = false;
        for(String arg: args) {
            if(next) {
                return arg;
            } else if(arg.equals(command)) {
                next = true;
            }
        }
        return null;
    }
    
}
