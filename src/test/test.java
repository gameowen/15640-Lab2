package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
	String host = (InetAddress.getLocalHost()).getHostName();
	System.out.print(host);
	}

}
