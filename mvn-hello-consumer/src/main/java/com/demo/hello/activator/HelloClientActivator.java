package com.demo.hello.activator;

import com.demo.hello.Hello;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * author : lch
 * date : 2014/10/22
 * depiction :
 */
public class HelloClientActivator implements BundleActivator {
    Hello hello;

    public void start(BundleContext context) throws Exception {
        hello = new Hello();
        hello.sayHi();
    }

    public void stop(BundleContext context) throws Exception {
        hello = null;
    }

}
