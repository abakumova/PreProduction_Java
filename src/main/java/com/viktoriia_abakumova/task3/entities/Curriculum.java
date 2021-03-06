package com.viktoriia_abakumova.task3.entities;

public class Curriculum {

    private String nameCurriculum;
    private Course[] coursesInCurriculum;
    private int sumHours;

    public Curriculum(String nameCurriculum, Course... courses) {
        this.nameCurriculum = nameCurriculum;
        this.coursesInCurriculum = courses;
        calculateSum(courses);
    }

    public int getSumHours() {
        return sumHours;
    }

    public String getNameCurriculum() {
        return nameCurriculum;
    }

    public Course[] getCoursesInCurriculum() {
        return coursesInCurriculum;
    }

    private void calculateSum(Course[] courses) {
        for (Course cours : courses) {
            this.sumHours = this.sumHours + cours.getDurationHours();
        }
    }
}
