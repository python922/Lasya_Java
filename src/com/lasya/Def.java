package com.lasya;

public class Def {

	public static void main(String[] args) {
		int age = 100;

		String def;
			if (age >= 60) {
				def = "Old man";
			} else if (age >= 20 && age <= 60) {
				def = "Adult";
			} else if (age >= 13 && age <= 19) {
				def = "Teen";
			} else {
				def = "Kid";

			}

			System.out.println(def);
		}
	}

