package io.fdlessard.codebites.configurationexamples.impl;

import io.fdlessard.codebites.configurationexamples.SomeSortOfService;
import io.fdlessard.codebites.configurationexamples.properties.MessagesProperties;
import io.fdlessard.codebites.configurationexamples.properties.SomeProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fdlessard on 16-11-09.
 */
@Service
public class SomeSortOfServiceImplWithPropertyObject implements SomeSortOfService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SomeSortOfServiceImplWithValue.class);

    // SomeSortOfService object specific properties
    @Autowired
    private SomeProperties someProperties;

    // Message specific properties
    @Autowired
    private MessagesProperties messagesProperties;


    public void doSomething() {


        LOGGER.info("SomeSortOfServiceImplWithPropertyObject.doSomething()");
        // SomeSortOfService object specific properties
        LOGGER.info("SomeSortOfService.version = {}", someProperties.getVersion());
        LOGGER.info("SomeSortOfService.scope = {}", someProperties.getScope());
        LOGGER.info("SomeSortOfService.url = {}", someProperties.getUrl());
        LOGGER.info("SomeSortOfService.path = {}", someProperties.getPath());

        // Message specific properties
        LOGGER.info("message.info.user = {}", messagesProperties.getInfo().getUser());
        LOGGER.info("message.info.config = {}", messagesProperties.getInfo().getConfig());

        LOGGER.info("message.warning.balance = {}", messagesProperties.getWarning().getBalance());
        LOGGER.info("message.warning.debit = {}", messagesProperties.getWarning().getDebit());

        LOGGER.info("message.error.invalid = {}", messagesProperties.getError().getInvalid());
        LOGGER.info("message.error.nullString = {}", messagesProperties.getError().getNullString());
    }
}

