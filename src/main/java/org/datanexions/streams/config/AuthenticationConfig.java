package org.datanexions.streams.config;

public class AuthenticationConfig {
    private String type;
    private String clientId;
    private String clientSecret;
    private String tokenUrl;

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
    public String getClientId() { return clientId; }
    public void setClientId(String clientId) {this.clientId = clientId;}
    public String getClientSecret() { return clientSecret; }
    public void setClientSecret(String clientSecret) {this.clientSecret = clientSecret;}
    public String getTokenUrl() { return tokenUrl; }
    public void setTokenUrl(String tokenUrl) {this.tokenUrl = tokenUrl;}
}
