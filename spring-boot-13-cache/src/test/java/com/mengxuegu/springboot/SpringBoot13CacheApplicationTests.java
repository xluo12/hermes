package com.mengxuegu.springboot;

import com.mengxuegu.springboot.entities.User;
import com.mengxuegu.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot13CacheApplicationTests {

    // complex type
    @Autowired
    RedisTemplate redisTemplate;

    // string type
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    UserService userService;

	@Test
	public void contextLoads() {
        stringRedisTemplate.opsForValue().set("name", "mengxuegu");
        String name = stringRedisTemplate.opsForValue().get("name");
        System.out.println("Value: " + name);//mengxuegu

        stringRedisTemplate.opsForList().leftPush("myList", "a");
        stringRedisTemplate.opsForList().leftPushAll("myList", "b", "c", "d");
        List<String> myList = stringRedisTemplate.opsForList().range("myList", 0, -1);
        System.out.println("List: " + myList);//[d, c, b, a]
	}

    @Test
    public void testRedis() {
        //当我们导入了reids的启动器之后 ，springboot会采用redis作为 默认缓存，simple缓存就没有匹配上了
        User user = userService.getUserById(4);
        //保存的数据对象必须序列化  implements Serializable
        //因为redisTemplate默认采用的是jdk序列化器
        redisTemplate.opsForValue().set("user", user);
        User user1 = (User)redisTemplate.opsForValue().get("user");
        System.out.println(user1);
//        jsonRedisTemplate.opsForValue().set("user2", user);

    }

}
