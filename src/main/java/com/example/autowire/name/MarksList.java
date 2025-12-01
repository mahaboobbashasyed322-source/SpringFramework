package com.example.autowire.name;

public class MarksList {
    private String name;
    private double grade;
    private String expert;
    private int rank;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade(double grade) {
        return grade;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    public String getExpert(String expert) {
        return expert;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getRank(int rank) {
        return rank;
    }

    @Override
    public String toString() {
        return "MarksList{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", expert='" + expert + '\'' +
                ", rank=" + rank +
                '}';
    }
}