package com.fizzpod.dooey;

import java.io.IOException;
import java.util.Collection;



public class Main {

    private static CommandRegistry services = new CommandRegistry();

    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            findAndRunCommand(args);
        } else {
            outputCommands();
        }
    }

    private static void outputCommands() {
        Collection<Command> commands = services.getCommands(Command.class);
        for(Command<?> command: commands) {
            CommandDescription desc = command.getDescription();
            System.out.println(desc.getOperator() + " - " + desc.getDescription());
        }
    }

    @SuppressWarnings("unchecked")
    private static void findAndRunCommand(String[] args) {
        ServiceContext context = new ServiceContext(args, services);
        Command<? extends Object> command = services.getCommand(Command.class, context);
        try {
            command.call();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}