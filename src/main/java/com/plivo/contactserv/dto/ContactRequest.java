package com.plivo.contactserv.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "first_name",
        "last_name",
        "primary_mobile",
        "primary_email",
        "linkedin_link",
        "facebook_link",
        "twitter_link",
        "email",
        "mobile"
})
public class ContactRequest {

    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("primary_mobile")
    private String primaryMobile;
    @JsonProperty("primary_email")
    private String primaryEmail;
    @JsonProperty("linkedin_link")
    private String linkedinLink;
    @JsonProperty("facebook_link")
    private String facebookLink;
    @JsonProperty("twitter_link")
    private String twitterLink;
    @JsonProperty("email")
    private List<Object> email = null;
    @JsonProperty("mobile")
    private List<Object> mobile = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("primary_mobile")
    public String getPrimaryMobile() {
        return primaryMobile;
    }

    @JsonProperty("primary_mobile")
    public void setPrimaryMobile(String primaryMobile) {
        this.primaryMobile = primaryMobile;
    }

    @JsonProperty("primary_email")
    public String getPrimaryEmail() {
        return primaryEmail;
    }

    @JsonProperty("primary_email")
    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    @JsonProperty("linkedin_link")
    public String getLinkedinLink() {
        return linkedinLink;
    }

    @JsonProperty("linkedin_link")
    public void setLinkedinLink(String linkedinLink) {
        this.linkedinLink = linkedinLink;
    }

    @JsonProperty("facebook_link")
    public String getFacebookLink() {
        return facebookLink;
    }

    @JsonProperty("facebook_link")
    public void setFacebookLink(String facebookLink) {
        this.facebookLink = facebookLink;
    }

    @JsonProperty("twitter_link")
    public String getTwitterLink() {
        return twitterLink;
    }

    @JsonProperty("twitter_link")
    public void setTwitterLink(String twitterLink) {
        this.twitterLink = twitterLink;
    }

    @JsonProperty("email")
    public List<Object> getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(List<Object> email) {
        this.email = email;
    }

    @JsonProperty("mobile")
    public List<Object> getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(List<Object> mobile) {
        this.mobile = mobile;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}