/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.userapp.dto;

import com.client.service.Score;
import com.client.service.Student;
import com.client.service.Subject;
import com.client.service.Teacher;

/**
 *
 * @author Giang
 */
public class ScoreDTO {
    private long id = 0;
    private String score;
    private String coefficient;
    private int studentId;
    private int subjectId;
    private int teacherId;

    public ScoreDTO() {
    }

    public ScoreDTO(String score, String coefficient, int studentId, int subjectId, int teacherId) {
        this.score = score;
        this.coefficient = coefficient;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.teacherId = teacherId;
    }

    public ScoreDTO(long id, String score, String coefficient, int studentId, int subjectId, int teacherId) {
        this.id = id;
        this.score = score;
        this.coefficient = coefficient;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.teacherId = teacherId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(String coefficient) {
        this.coefficient = coefficient;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public Score toEntity() throws Exception {
        Score s = new Score();
        Student stu = new Student();
        stu.setId(studentId);
        Teacher t = new Teacher();
        t.setId(teacherId);
        Subject sub = new Subject();
        sub.setId(subjectId);
        if (id != 0) {
            s.setId(id);
        }
        s.setCoefficient(Short.parseShort(coefficient));
        s.setScore(Double.parseDouble(score));
        s.setStudentId(stu);
        s.setTeacherId(t);
        s.setSubjectId(sub);
        return s;
    }

    public static Score parseScore(String score, String coefficient, int studentId, int subjectId, int teacherId) throws Exception {
        return new ScoreDTO(score, coefficient, studentId, subjectId, teacherId).toEntity();
    }

    public static Score parseScore(long id, String score, String coefficient, int studentId, int subjectId, int teacherId) throws Exception {
        return new ScoreDTO(id, score, coefficient, studentId, subjectId, teacherId).toEntity();
    }
}
