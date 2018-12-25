package com.tylorcornett.webservices.models;


import java.io.Serializable;

public class UserDto implements Serializable
{
    private Long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String encryptedPassword;
    private String emailVerificationToken;
    private Boolean getEmailVerificationStatus=false;



    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEncryptedPassword()
    {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword)
    {
        this.encryptedPassword = encryptedPassword;
    }

    public String getEmailVerificationToken()
    {
        return emailVerificationToken;
    }

    public void setEmailVerificationToken(String emailVerificationToken)
    {
        this.emailVerificationToken = emailVerificationToken;
    }

    public Boolean getGetEmailVerificationStatus()
    {
        return getEmailVerificationStatus;
    }

    public void setGetEmailVerificationStatus(Boolean getEmailVerificationStatus)
    {
        this.getEmailVerificationStatus = getEmailVerificationStatus;
    }
}
