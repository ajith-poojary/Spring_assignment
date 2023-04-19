package com.ajith.task.CRUD.Entity;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "Group_tb")
public class Group {
    @Id
    @GeneratedValue
    private int id;


    @Column(length = 30)
    private String groupName;

    @Column(length = 500)
    private String groupDesc;

    @Column(length = 100)
    private String groupRule;


    private String[] industry;
    @Column(length = 100)
    private String location;
    @Column(length = 100)
    private String Discoverability;
    @Column(length = 100)
    private boolean permision;

//   @ManyToOne()
//   @Embedded
//   private Image[] image;
//
//    public void setImage(Image[] image) {
//        this.image = image;
//    }
//
//    public Image[] getImage() {
//        return image;
//    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }



    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public String getGroupRule() {
        return groupRule;
    }

    public void setGroupRule(String groupRule) {
        this.groupRule = groupRule;
    }

    public String[] getIndustry() {
        return industry;
    }

    public void setIndustry(String[] industry) {
        this.industry = industry;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDiscoverability() {
        return Discoverability;
    }

    public void setDiscoverability(String discoverability) {
        Discoverability = discoverability;
    }

    public boolean isPermision() {
        return permision;
    }

    public void setPermision(boolean permision) {
        this.permision = permision;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", groupDesc='" + groupDesc + '\'' +
                ", groupRule='" + groupRule + '\'' +
                ", industry=" + Arrays.toString(industry) +
                ", location='" + location + '\'' +
                ", Discoverability='" + Discoverability + '\'' +
                ", permision=" + permision +
                '}';
    }

    public Group() {
    }
}
