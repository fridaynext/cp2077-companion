package com.fridaynext.cp2077companion.model;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="achievements")
public class Achievement {

    // The achievement data model will contain the following:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long gogId; // i.e. 48497841707623054

    @Column
    private String key; // i.e. ACHIEVEMENT_NODEATH1

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String imageUrlUnlocked;

    @Column
    private String imageUrlLocked;

    @Column
    private boolean completed;

    @Column
    private Date dateUnlocked;  // can be null until unlocked

    @Column
    private String mapLocation; // Might need to change this data type - this will be custom for this app

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="achievements_categories",
            joinColumns={@JoinColumn(name="achievement_id")},
            inverseJoinColumns={@JoinColumn(name="category_id")}
    )
    private List<Category> categories;  // This will be a custom value - not currently provided by GOG
    // if this should only be able to have one category, then we can change it from a list back to a single value

    // 0-arg Constructor
    public Achievement() {
    }

    // Constructor
    public Achievement(long gogId, String key, String name, String description, String imageUrlUnlocked, String imageUrlLocked, boolean completed, String mapLocation, List<Category> categories) {
        this.gogId = gogId;
        this.key = key;
        this.name = name;
        this.description = description;
        this.imageUrlUnlocked = imageUrlUnlocked;
        this.imageUrlLocked = imageUrlLocked;
        this.completed = completed;
        this.mapLocation = mapLocation;
        this.categories = categories;
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrlUnlocked() {
        return imageUrlUnlocked;
    }

    public void setImageUrlUnlocked(String imageUrlUnlocked) {
        this.imageUrlUnlocked = imageUrlUnlocked;
    }

    public String getImageUrlLocked() {
        return imageUrlLocked;
    }

    public void setImageUrlLocked(String imageUrlLocked) {
        this.imageUrlLocked = imageUrlLocked;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Date getDateUnlocked() {
        return dateUnlocked;
    }

    public void setDateUnlocked(Date dateUnlocked) {
        this.dateUnlocked = dateUnlocked;
    }

    public String getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(String mapLocation) {
        this.mapLocation = mapLocation;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

}
