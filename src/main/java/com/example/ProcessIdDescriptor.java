
package com.example;

public class ProcessIdDescriptor {

    private final long pid;
    private final String providerName;

    ProcessIdDescriptor(long pid, String providerName) {
        this.pid = pid;
        this.providerName = providerName;
    }

    public long getPid() {
        return pid;
    }

    public String getProviderName() {
        return providerName;
    }
}
