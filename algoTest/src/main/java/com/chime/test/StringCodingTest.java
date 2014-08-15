package com.chime.test; 

import com.sun.corba.se.spi.orb.StringPair;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 테스트 1 
 * @author 코딩테스트 응시자 : 곽채화 
 *
 */
public class StringCodingTest {
	// TODO Thread를 이용하여 다중 요청 처리하는 상황을 만들자..

	public static void main(String[] args) {
		System.out.println("Redis Test***");

		
		RedisTest();

	}

	private static void RedisTest() {
		JedisPool pool = new JedisPool(new JedisPoolConfig(), "localhost");
		Jedis jedis = pool.getResource();

		try {
			jedis.set("id1", "jello. hi? my name is kwak chae hwa! good.");
			jedis.set("id2", "jojo");

			System.out.println(jedis.get("id1"));
			// System.out.println(jedis.get("id2"));

			String retStr = jedis.get("id1");
			
			retStr = convertChar(retStr, "\\.");
			retStr = convertChar(retStr, "\\!");
			retStr = convertChar(retStr, "\\?");

			System.out.println(retStr);

			// System.out.println(jedis.dbSize());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			pool.returnResource(jedis);
		}
		pool.destroy();
	}


	/**
	 * java 내장함수를 이용해서 처리 
	 * 
	 * @param rawString
	 * @param chk
	 * @return
	 */
	private static String convertChar(String rawString, String chk) {

		String wordStr[] = rawString.split(chk);

		String temp = "";
		for (String str : wordStr) {

			if (str != "") {
				
				str += chk.substring(1);
				temp += str.trim().toUpperCase().charAt(0)
						+ str.trim().substring(1) + " ";
			}
		}
		return temp;
	}

}
