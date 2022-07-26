package com.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo01 {
	public static void main(String[] args) throws UnknownHostException {
		//public static InetAddress getByName(String host)
		/*InetAddress inetAddress = InetAddress.getByName("DESKTOP-5HO6M71");
		System.out.println(inetAddress);//DESKTOP-5HO6M71/10.10.10.199*/
		
		InetAddress inetAddress = InetAddress.getByName("10.10.10.199");
		System.out.println(inetAddress);//  /10.10.10.199
	}
}
