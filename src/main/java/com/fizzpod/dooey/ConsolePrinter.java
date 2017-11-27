package com.fizzpod.dooey;

import java.io.Console;

import org.slf4j.helpers.MessageFormatter;

public class ConsolePrinter implements Printer {

    @Override
    public void print(String message, Object... params) {
        String formattedMessage = this.format(message, params);
        Console console = System.console();
        console.writer().print(formattedMessage);
    }
    
    private String format(String format, Object... params) {
        return MessageFormatter.arrayFormat(format, params).getMessage();
	}
    
}
