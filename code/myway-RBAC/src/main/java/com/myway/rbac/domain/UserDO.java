package com.myway.rbac.domain;

import java.util.Date;

public class UserDO {
    private Long id;
    private String acct;
    private String name;
    private String mobile;
    private String email;
    private String description;
    private String status;
    private String password;
    private Date createTime;
    private Date lastLoginTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAcct() {
        return acct;
    }

    public void setAcct(String acct) {
        this.acct = acct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", acct='" + acct + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", lastLoginTime=" + lastLoginTime +
                '}';
    }
}
