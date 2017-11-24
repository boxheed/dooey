package com.fizzpod.dooey;

import java.util.concurrent.Callable;

public interface Command<T> extends Callable<T> {

    boolean accept(ServiceContext context);

    CommandDescription getDescription();
    
}
