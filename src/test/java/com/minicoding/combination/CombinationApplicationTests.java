package com.minicoding.combination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.minicoding.combination.service.LetterOutput;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CombinationApplicationTests {

	private final static Logger logger =LoggerFactory.getLogger(CombinationApplicationTests.class);
	
	
	@Autowired
	private LetterOutput letterOutput;
	
	@Test
	public void contextLoads() {
		//Enter a numeric string for a single test
		String result = letterOutput.digitsToLetterCombination("129");
		logger.info("combinations of letters:"+result);
	}

}
