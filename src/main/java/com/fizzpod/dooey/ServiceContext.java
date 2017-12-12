package com.fizzpod.dooey;

public class ServiceContext {

    private Args args;
    
    private CommandRegistry commandRegistry;

    
    public ServiceContext(String[] args, CommandRegistry commandRegistry) {
        super();
        this.args = new Args(args);
        this.commandRegistry = commandRegistry;
    }

    public String getCommand() {
        return args.getCommand();
    }
    
    public String getCommandAfter(String command) {
        return args.getCommandAfter(command);
    }
    
    public CommandRegistry getServices() {
        return commandRegistry;
    }

    
    
    
}
