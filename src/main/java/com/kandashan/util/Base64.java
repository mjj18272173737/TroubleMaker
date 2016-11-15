package com.kandashan.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64 {
	public static byte[] decode(String src) throws Exception {
		if ((src == null) || (src.length() == 0))
			return new byte[0];
		BASE64Decoder decoder = new BASE64Decoder();
		return decoder.decodeBuffer(src);
	}

	public static String encode(byte[] src) {
		if ((src == null) || (src.length == 0))
			return null;
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(src);
	}
}
