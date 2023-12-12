package Java;

import java.util.Properties;

public class Sistemas {
   public static void main(String[] args) {
	   
	   Properties p = System.getProperties();
	   System.out.println(p.getProperty("java.version"));
   }
}
