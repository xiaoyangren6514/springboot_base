package com.happy;

import com.happy.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbDemoApplicationTests {

	@Autowired
	private User user;

	@Test
	public void contextLoads() {
		System.out.println(user.toString());
	}

}
