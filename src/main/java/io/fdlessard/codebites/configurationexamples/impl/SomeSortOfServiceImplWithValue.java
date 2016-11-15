package io.fdlessard.codebites.configurationexamples.impl;

import io.fdlessard.codebites.configurationexamples.SomeSortOfService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by fdlessard on 16-11-09.
 */
@Service
public class SomeSortOfServiceImplWithValue implements SomeSortOfService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SomeSortOfServiceImplWithValue.class);

    // SomeSortOfService object specific properties
    @Value("${SomeSortOfService.version}")
    private String version;

    @Value("${SomeSortOfService.scope}")
    private String scope;

    @Value("${SomeSortOfService.url}")
    private String url;

    @Value("${SomeSortOfService.path}")
    private String path;



    // Message specific properties
    @Value("${message.info.user}")
    private String userInfoMsg;

    @Value("${message.info.config}")
    private String configInfoMsg;

    @Value("${message.warning.balance}")
    private String balanceWarningMsg;

    @Value("${message.warning.debit}")
    private String debitWarningMsg;

    @Value("${message.error.invalid}")
    private String invalidErrorMsg;

    @Value("${message.error.nullString}")
    private String nullStringErrorMsg;


    public void doSomething() {

        LOGGER.info("SomeSortOfServiceImplWithValue.doSomething()");

        // SomeSortOfService object specific properties
        LOGGER.info("SomeSortOfService.version = {}", version);
        LOGGER.info("SomeSortOfService.scope = {}", scope);
        LOGGER.info("SomeSortOfService.url = {}", url);
        LOGGER.info("SomeSortOfService.path = {}", path);


        // Message specific properties

        LOGGER.info("message.info.user = {}", userInfoMsg);
        LOGGER.info("message.info.config = {}", configInfoMsg);

        LOGGER.info("message.warning.balance = {}", balanceWarningMsg);
        LOGGER.info("message.warning.debit = {}", debitWarningMsg);

        LOGGER.info("message.error.invalid = {}", invalidErrorMsg);
        LOGGER.info("message.error.nullString = {}", nullStringErrorMsg);
    }
}

