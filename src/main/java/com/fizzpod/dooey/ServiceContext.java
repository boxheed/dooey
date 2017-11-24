package com.fizzpod.dooey;

public class ServiceContext {

    private Args args;
    
    private Services services;

    
    public ServiceContext(String[] args, Services services) {
        super();
        this.args = new Args(args);
        this.services = services;
    }

    public String getCommand() {
        return args.getCommand();
    }
    
    public String getCommandAfter(String command) {
        return args.getCommandAfter(command);
    }
    
    public Services getServices() {
        return services;
    }

    
    
    
}
