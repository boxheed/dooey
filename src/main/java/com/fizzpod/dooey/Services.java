package com.fizzpod.dooey;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.spi.ServiceRegistry;

class Services {

    <T> T getService(Class<T> serviceClazz, ServiceContext context) {
        Iterator<T> services = ServiceRegistry.lookupProviders(serviceClazz);
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
        throw new IllegalArgumentException("Could not find service implementation for " + serviceClazz);
    }
    
    <T> Collection<T> getServices(Class<T> serviceClazz) {
        Iterator<T> services = ServiceRegistry.lookupProviders(serviceClazz);
        List<T> results = new LinkedList<>();
        while(services.hasNext()) {
            T service = services.next();
            results.add(service);
        }
        return results;
    }
    
}
