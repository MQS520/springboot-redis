package com.mqs;

import com.mqs.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

	@Autowired
	private RedisUtil redisUtil;

	@Test
	public void contextLoads() {
//		System.out.println(redisUtil.set("aaa", "aaaa"));
//		System.out.println(redisUtil.incr("bbb", 1));
//		System.out.println(redisUtil.decr("bbb", 1));
		List<Object> list = new ArrayList<>();
		list.add("XXX");
		list.add(23);
		list.add(true);
		System.out.println(redisUtil.lSet("ccc", list));
	}

}
