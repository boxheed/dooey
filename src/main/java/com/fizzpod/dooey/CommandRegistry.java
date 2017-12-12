package com.fizzpod.dooey;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.spi.ServiceRegistry;

/**
 * 
 */
class CommandRegistry {

    <T> T getCommand(Class<T> commandClazz, ServiceContext context) {
        Iterator<T> services = ServiceRegistry.lookupProviders(commandClazz);
        while(services.hasNext()) {
            T service = services.next();
            if(service instanceof Command) {
                if(((Command<?>)service).accept(context)) {
                    return service;
                }
            } else {
                return service;
            }
        }
        throw new IllegalArgumentException("Could not find service implementation for " + commandClazz);
    }
    
    <T> Collection<T> getCommands(Class<T> commandClazz) {
        Iterator<T> services = ServiceRegistry.lookupProviders(commandClazz);
        List<T> results = new LinkedList<>();
        while(services.hasNext()) {
            T service = services.next();
            results.add(service);
        }
        return results;
    }
    
}
