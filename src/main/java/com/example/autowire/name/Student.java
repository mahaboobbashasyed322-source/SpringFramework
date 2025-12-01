package com.example.autowire.name;

public class Student {
 private MarksList markslist;

 public void setMarkslist(MarksList markslist) {
     this.markslist = markslist;
 }
     public void displayDetails(){
         System.out.println(markslist.toString());
     }
 }
