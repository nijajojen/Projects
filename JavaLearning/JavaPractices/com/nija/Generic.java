package com.nija;

public class Generic<T> {
	T varB;

	Generic(T varB) {
		this.varB = varB;
	}

	public T getVar() {
		return varB;
	}
}
