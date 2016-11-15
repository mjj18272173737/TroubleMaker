package com.kandashan.util;

import java.math.BigInteger;
import java.security.MessageDigest;


public class DigestUtil {
	
	 public static final String MD5 = "MD5";
	  public static final String SHA = "SHA";
	  private static final String SEED = "SEMDMS";
	  private static MessageDigest digMd5 = null;
	  private static MessageDigest digSha = null;

	  public synchronized static byte[] digest(byte[] src, String type) throws Exception {
	    if (("MD5".equals(type)) && (digMd5 == null)) {
	      digMd5 = MessageDigest.getInstance("MD5");
	    }

	    if (("SHA".equals(type)) && (digSha == null)) {
	      digSha = MessageDigest.getInstance("SHA");
	    }

	    MessageDigest dig = "MD5".equals(type) ? digMd5 : digSha;
	    dig.reset();
	    dig.update(src);
	    return dig.digest("SEMDMS".getBytes());
	  }

	  public static String digestToHex(byte[] src, String type) throws Exception {
	    byte[] ret = digest(src, type);
	    BigInteger hex = new BigInteger(ret);
	    return hex.toString(16);
	  }

	  public static void main(String[] args) throws Exception {
	    for (int i = 0; i < 3; i++) {
	      System.out.println(digest(("src" + i).getBytes(), "MD5").length);
	      System.out.println(Base64.encode(digest("123456".getBytes(), "MD5")));
	      System.out.println(digestToHex(("src" + i).getBytes(), "MD5"));
	    }
	    
	    String pwd ="1";
	    String enPwd = Base64.encode(DigestUtil.digest(pwd.getBytes(), "MD5"));
	    System.out.println("pwd="+enPwd);
	  }
	
}
