
package com.example;

public class ProcessIdProvider {

    public ProcessIdDescriptor getPid() {
        long pid = ProcessHandle.current().getPid();
        return new ProcessIdDescriptor( pid, "ProcessHandle" );
    }
}
