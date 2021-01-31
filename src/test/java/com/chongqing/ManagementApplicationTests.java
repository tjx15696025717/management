package com.chongqing;

import com.chongqing.util.CrowdFundingUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManagementApplicationTests {

	@Test
	void contextLoads() {
		try {
			System.out.println(CrowdFundingUtils.md5("123456"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
