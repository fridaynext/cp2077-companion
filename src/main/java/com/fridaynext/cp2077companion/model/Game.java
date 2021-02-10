package com.fridaynext.cp2077companion.model;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {
    // The game details provided by GOG might be way too detailed for this class
    //   see: https://gogapidocs.readthedocs.io/en/latest/account.html#games-movies

    // Also, we might not even need this if all we're tracking is CP2077

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long gogId;

    @Column
    private String title;

    @Column
    private String imageUrl;

    // 0-arg Constructor
    public Game() {}

    // Constructor
    public Game(long gogId, String title, String imageUrl) {
        this.gogId = gogId;
        this.title = title;
        this.imageUrl = imageUrl;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGogId() {
        return gogId;
    }

    public void setGogId(long gogId) {
        this.gogId = gogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
