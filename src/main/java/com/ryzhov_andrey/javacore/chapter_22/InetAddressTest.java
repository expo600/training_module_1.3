package main.java.com.ryzhov_andrey.javacore.chapter_22;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);

        inetAddress = InetAddress.getByName("www.Google.com");
        System.out.println(inetAddress);

        InetAddress SW[] = InetAddress.getAllByName("www.Google.ru");
        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }

    }
}
