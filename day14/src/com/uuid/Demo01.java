package com.uuid;

import java.util.UUID;

public class Demo01 {
	public static void main(String[] args) {
		//public static UUID randomUUID()
		UUID uuid = UUID.randomUUID();
		//public String toString()
		//System.out.println(uuid.toString());//1125afd7-e5e5-44c0-8a72-bec30e6bdda3
		String str = uuid.toString().replace("-", "");
		System.out.println(str);//e6c94ad8e87141f8b94756f41dab2a8a
	}
}
