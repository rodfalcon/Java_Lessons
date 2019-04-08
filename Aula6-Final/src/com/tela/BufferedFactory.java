package com.tela;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedFactory {
	public static BufferedReader getBF() {
		return 
			new BufferedReader(new InputStreamReader(System.in));
	}
}
