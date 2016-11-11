/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.userapp.dto;

import com.client.service.Subject;
import com.client.userapp.constants.WebMethods;
import com.marksmana.info.Information;
import com.marksmana.utils.Json;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giang
 */
public class SubjectDTO{
    protected Integer id;
    protected Information info = new Information();
    protected String name;
    private Subject subject;
    
    public SubjectDTO(Subject s) {
        id = s.getId();
        try {
            this.info = Json.DeserializeObject(s.getInfo(), Information.class);
        } catch (Exception ex) {
            // ignore
        }
        name = s.getName();
        subject = s;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Information getInfo() {
        return info;
    }

    public void setInfo(Information info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Subject toSubject() {
        return subject;
    }
    
    public static List<SubjectDTO> getSubjectDTOList() {
        List<SubjectDTO> list = new java.util.ArrayList<>();
        List<Subject> subjects = WebMethods.getSubjects();
        for (Subject s : subjects) {
            list.add(new SubjectDTO(s));
        }
        return list;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
