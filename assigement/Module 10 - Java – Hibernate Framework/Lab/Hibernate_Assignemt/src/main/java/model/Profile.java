package model;

import javax.persistence.*;

@Entity
@Table(name = "profile_details")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bio;

    public Profile() {}
    public Profile(String bio) {
        this.bio = bio;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }
}
