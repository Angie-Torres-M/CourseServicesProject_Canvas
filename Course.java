package com.generation.courses;

public class Course {
    private String id;
    private String name;
    private int credits;

    public Course(String id, String name, int credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }
    
    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                '}';
    }
}
