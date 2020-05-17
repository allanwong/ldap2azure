package de.traber_info.home.ldap2azure.model.config;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model for all configuration variables used by the Microsoft Graph SDK for communication with the Microsoft Graph API
 *
 * @author Oliver Traber
 */
public class GraphClientConfig {

    /** Authority against which the MSAL4J library authenticates */
    @JsonProperty("msGraphTenantSpecificAuthority")
    private String tenantSpecificAuthority;

    /** Client id generated by Azure AD used to identify the corresponding application in Azure AD */
    @JsonProperty("msGraphClientId")
    private String clientId;

    /** Client secret used to authenticate against Azure AD */
    @JsonProperty("msGraphClientSecret")
    private String clientSecret;

    /** Usage location for new users. Necessary for some Office apps */
    @JsonProperty("usageLocation")
    private String usageLocation;

    /**
     * Get the tenant specific authorisation authority from the config file
     * @return Tenant specific authority
     */
    public String getTenantSpecificAuthority() {
        return tenantSpecificAuthority;
    }

    /**
     * Get the Azure AD client id from the config file
     * @return Azure AD client id
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Get the Azure AD client secret from the config file
     * @return Azure AD client secret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Get the usage location for new users from the config file
     * @return Usage location for new users
     */
    public String getUsageLocation() {
        return usageLocation;
    }

}
