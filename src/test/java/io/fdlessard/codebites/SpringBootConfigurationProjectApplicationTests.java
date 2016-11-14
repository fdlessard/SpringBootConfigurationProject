package io.fdlessard.codebites;

import io.fdlessard.codebites.configurationexample.SomeSortOfService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigurationProjectApplicationTests {

	@Test
	public void contextLoads() {
	}

	/**
     * Created by fdlessard on 16-11-11.
     */
    @RunWith(SpringRunner.class)
    @SpringBootTest
    public static class SomeSortOfServiceImplWithValueTest {

        @Autowired
        private SomeSortOfService someSortOfService;

        @Test
        public void doSomething() throws Exception {

            someSortOfService.doSomething();
        }

    }
}
