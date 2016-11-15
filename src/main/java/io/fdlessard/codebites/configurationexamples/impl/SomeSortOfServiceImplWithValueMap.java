package io.fdlessard.codebites.configurationexamples.impl;

import io.fdlessard.codebites.configurationexamples.SomeSortOfService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by fdlessard on 16-11-09.
 */
@Service
public class SomeSortOfServiceImplWithValueMap implements SomeSortOfService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SomeSortOfServiceImplWithValueMap.class);

    // Hacking with SPEL

    // SomeSortOfService object specific properties
    @Value("#{${SomeSortOfService}}")
    private Map<String, String> propertiesMap;

    // Message specific properties
    @Value("#{${message}}")
    private Map<String, Object> messages;

    public void doSomething() {

        LOGGER.info("SomeSortOfServiceImplWithValueMap.doSomething()");

        // SomeSortOfService object specific properties
        LOGGER.info("SomeSortOfService[version] = {}", propertiesMap.get("version"));
        LOGGER.info("SomeSortOfService[scope] = {}",  propertiesMap.get("scope"));
        LOGGER.info("SomeSortOfService[url] = {}",  propertiesMap.get("url"));
        LOGGER.info("SomeSortOfService[path] = {}",  propertiesMap.get("path"));

        // Message specific properties
        LOGGER.info("message.info.user = {}", ((Map) messages.get("info")).get("user"));
        LOGGER.info("message.info.user = {}", ((Map) messages.get("info")).get("config"));

        LOGGER.info("message.warning.balance = {}", ((Map) messages.get("warning")).get("balance"));
        LOGGER.info("message.warning.debit = {}", ((Map) messages.get("warning")).get("debit"));

        LOGGER.info("message.error.invalid = {}", ((Map) messages.get("error")).get("invalid"));
        LOGGER.info("message.error.nullString = {}", ((Map) messages.get("error")).get("nullString"));

    }
}

