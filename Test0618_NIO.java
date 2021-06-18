package packageIOtest;

import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Test0618_NIO {
	public static void main(String args[]) throws IOException{
		CharBuffer charBuffer1 =CharBuffer.allocate(6);
		System.out.println("capacity:"+charBuffer1.capacity());
		System.out.println("limit of charBuffer:"+charBuffer1.limit());
		System.out.println("position"+charBuffer1.position());
		charBuffer1.put('w');
		System.out.println("limit of charBuffer:"+charBuffer1.limit());
		System.out.println("position"+charBuffer1.position());
		charBuffer1.put('d');
		System.out.println("limit of charBuffer:"+charBuffer1.limit());
		System.out.println("position"+charBuffer1.position());
		charBuffer1.flip();
		System.out.println("limit of charBuffer:"+charBuffer1.limit());
		System.out.println("position"+charBuffer1.position());
		charBuffer1.put('w');charBuffer1.put('w');
		System.out.println("limit of charBuffer:"+charBuffer1.limit());
		System.out.println("position"+charBuffer1.position());
		System.out.println("limit of charBuffer:"+charBuffer1.limit());
		
		System.out.println("cbuffer.get:"+charBuffer1.get(0));
		System.out.println("position"+charBuffer1.position());
		System.out.println("limit of charBuffer:"+charBuffer1.limit());
		
		charBuffer1.clear();
		System.out.println("position"+charBuffer1.position());
		System.out.println("limit of charBuffer:"+charBuffer1.limit());
		charBuffer1.limit(5);
		System.out.println("position"+charBuffer1.position());
		System.out.println("limit of charBuffer:"+charBuffer1.limit());
	}
}
