package com.fridaynext.cp2077companion.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    // Properties for each user

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    //@JsonIgnore  -- add this annotation when implementing the REST API
    private String password;

    @Column
    private Date registrationDate;

    @Column
    private Date lastLoginDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Achievement> achievements;

    // 0-arg Constructor
    public User() {}

    // Constructor
    public User(String username, String password, Date registrationDate, Date lastLoginDate, List<Achievement> achievements) {
        this.username = username;
        this.password = password;
        this.registrationDate = registrationDate;
        this.lastLoginDate = lastLoginDate;
        this.achievements = achievements;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }
}
