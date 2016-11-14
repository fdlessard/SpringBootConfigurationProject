package io.fdlessard.codebites.configurationexample.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by fdlessard on 16-11-09.
 */

@ConfigurationProperties(locations = "application.properties", prefix = "SomeSortOfService")
@Component
public class SomeProperties {

    private String version;

    private String scope;

    private String url;

    private String path;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
