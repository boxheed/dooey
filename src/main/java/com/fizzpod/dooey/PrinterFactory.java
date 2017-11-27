package com.fizzpod.dooey;

public class PrinterFactory {
    
    Printer getPrinter() {
        return new ConsolePrinter();
    }
    
}
