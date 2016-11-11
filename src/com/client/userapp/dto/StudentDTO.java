/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.userapp.dto;

import com.client.service.Clazz;
import com.client.service.Student;
import com.marksmana.info.Information;
import com.marksmana.utils.Json;
import java.util.List;

/**
 *
 * @author Giang
 */
public class StudentDTO {
    protected Clazz classId;
    protected Integer id;
    protected String info;
    protected String name;
    private Student student;
    
    public StudentDTO(Student s) {
        classId = s.getClassId();
        id = s.getId();
        info = s.getInfo();
        name = s.getName();
        this.student = s;
    }

    public Clazz getClassId() {
        return classId;
    }

    public void setClassId(Clazz classId) {
        this.classId = classId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public Information getInformation() throws Exception {
        return Json.DeserializeObject(info, Information.class);
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Student toStudent() {
        if (student!=null) {
            return student;
        }
        Student s = new Student();
        s.setClassId(classId);
        s.setId(id);
        s.setInfo(info);
        s.setName(name);
        return s;
    }
    
    public static List<StudentDTO> getStudentDTOList(List<Student> list) {
        List<StudentDTO> dto = new java.util.ArrayList<>();
        for (Student s : list) {
            dto.add(new StudentDTO(s));
        }
        return dto;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
