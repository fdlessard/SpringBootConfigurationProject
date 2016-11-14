package io.fdlessard.codebites.configurationexample.impl;

import io.fdlessard.codebites.configurationexample.SomeSortOfService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by fdlessard on 16-11-13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SomeSortOfServiceImplWithValueTest {

    @Autowired
    @Qualifier("someSortOfServiceImplWithValue")
    private SomeSortOfService someSortOfService;

    @Test
    public void doSomething() throws Exception {
        someSortOfService.doSomething();
    }

}