package com.infotech.client;

import javassist.CannotCompileException;
import javassist.ClassPool;
//Set the below in VM arguments to simulate java.lang.OutOfMemoryError: Metaspace
//-XX:MaxMetaspaceSize=10m
public class MetaSpaceOOMSimulator {
	static ClassPool classPool= ClassPool.getDefault();
	public static void main(String[] args) throws CannotCompileException, RuntimeException {
		for (int i = 0; i <100000; i++) {
			Class<?> class1 = classPool.makeClass("com.infotech.client.MetaSpaceOOMSimulator:"+i).toClass();
			System.out.println(class1.getName());
		}
	}
}
