package com.ms;

@FunctionalInterface
public interface Demo {
	void print();
	static void disp() {}
	default void show() {}
}
