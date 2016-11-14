package io.fdlessard.codebites.configurationexample.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by fdlessard on 16-11-11.
 */
@ConfigurationProperties(locations = "messages.properties", prefix = "message")
@Component
public class MessagesProperties {


    private Info info;

    private Warning warning;

    private Error error;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Warning getWarning() {
        return warning;
    }

    public void setWarning(Warning warning) {
        this.warning = warning;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public static class Info {

        private String user;

        private String config;

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getConfig() {
            return config;
        }

        public void setConfig(String config) {
            this.config = config;
        }
    }

    public static class Warning {

        private String balance;

        private String debit;

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }

        public String getDebit() {
            return debit;
        }

        public void setDebit(String debit) {
            this.debit = debit;
        }
    }

    public static class Error {

        private String invalid;

        private String nullString;

        public String getInvalid() {
            return invalid;
        }

        public void setInvalid(String invalid) {
            this.invalid = invalid;
        }

        public String getNullString() {
            return nullString;
        }

        public void setNullString(String nullString) {
            this.nullString = nullString;
        }
    }
}
