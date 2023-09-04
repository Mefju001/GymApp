package com.mefju.springboot.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "username")
    private String Username;
    @Column(name = "password")
    private String Password;
    @Column(name = "enabled")
    private int Enabled;

    public User() {
    }
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getEnabled() {
        return Enabled;
    }

    public void setEnabled(int enabled) {
        this.Enabled = enabled;
    }


}
