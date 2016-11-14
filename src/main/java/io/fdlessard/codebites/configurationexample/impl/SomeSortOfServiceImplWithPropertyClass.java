package io.fdlessard.codebites.configurationexample.impl;

import io.fdlessard.codebites.configurationexample.SomeSortOfService;
import io.fdlessard.codebites.configurationexample.properties.MessagesProperties;
import io.fdlessard.codebites.configurationexample.properties.SomeProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fdlessard on 16-11-09.
 */
@Service
public class SomeSortOfServiceImplWithPropertyClass implements SomeSortOfService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SomeSortOfServiceImplWithValue.class);

    @Autowired
    private SomeProperties someProperties;

    @Autowired
    private MessagesProperties messagesProperties;


    public void doSomething() {

        LOGGER.info("SomeSortOfService.version = {}", someProperties.getVersion());
        LOGGER.info("SomeSortOfService.scope = {}", someProperties.getScope());
        LOGGER.info("SomeSortOfService.url = {}", someProperties.getUrl());
        LOGGER.info("SomeSortOfService.path = {}", someProperties.getPath());

        LOGGER.info("message.info.user = {}", messagesProperties.getInfo().getUser());
        LOGGER.info("message.info.config = {}", messagesProperties.getInfo().getConfig());

        LOGGER.info("message.warning.balance = {}", messagesProperties.getWarning().getBalance());
        LOGGER.info("message.warning.debit = {}", messagesProperties.getWarning().getDebit());

        LOGGER.info("message.error.invalid = {}", messagesProperties.getError().getInvalid());
        LOGGER.info("message.error.nullString = {}", messagesProperties.getError().getNullString());

    }
}

