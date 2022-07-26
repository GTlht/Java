package com.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo02 {
	public static void main(String[] args) throws UnknownHostException {
		//获取InetAddress对象
		//InetAddress inetAddress = InetAddress.getByName("10.10.10.199");
		InetAddress inetAddress = InetAddress.getByName("DESKTOP-5HO6M71");
		
		//public String getHostName()
		String hostName = inetAddress.getHostName();//"DESKTOP-5HO6M71"
		
		//public String getHostAddress()
		String hostAddress = inetAddress.getHostAddress();//"10.10.10.199"

		
		System.out.println(hostName + "..." + hostAddress);
	}
}
