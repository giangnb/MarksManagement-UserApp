/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.userapp.dto;

import com.client.service.Bulk;
import com.client.service.Clazz;
import com.client.service.Teacher;
import com.client.userapp.constants.WebMethods;
import com.marksmana.info.Information;
import com.marksmana.utils.Json;
import java.util.List;

/**
 *
 * @author Giang
 */
public class ClazzDTO {

    protected Bulk bulkId;
    protected Integer id;
    protected Information info = new Information();
    protected String name;
    protected Teacher teacherId;
    protected Clazz clazz;

    public ClazzDTO(Clazz clazz) {
        bulkId = clazz.getBulkId();
        id = clazz.getId();
        try {
            info = Json.DeserializeObject(clazz.getInfo(), Information.class);
        } catch (Exception ex) {
        }
        name = clazz.getName();
        teacherId = clazz.getTeacherId();
        this.clazz = clazz;
    }

    public Bulk getBulkId() {
        return bulkId;
    }

    public void setBulkId(Bulk bulkId) {
        this.bulkId = bulkId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Information getInfo() {
        return info;
    }

    public void setInfo(Information info) {
        this.info = info;
    }

    public Teacher getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Teacher teacherId) {
        this.teacherId = teacherId;
    }

    public Clazz toClazz() {
        return clazz;
    }

    public static List<ClazzDTO> getClazzDTOList() {
        List<ClazzDTO> list = new java.util.ArrayList<>();
        List<Clazz> classes = WebMethods.getClasses();
        for (Clazz c : classes) {
            // if (c.getId()>1) //Comment for testing
                list.add(new ClazzDTO(c));
        }
        return list;
    }

    @Override
    public String toString() {
        return name;
    }

}
