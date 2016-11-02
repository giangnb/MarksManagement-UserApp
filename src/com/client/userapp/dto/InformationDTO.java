/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.userapp.dto;

import com.marksmana.info.Information;
import com.marksmana.utils.Json;
import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author Giang
 */
public class InformationDTO {

    private InformationDTO() {
    }
    
    public static Information toInfo(String json) throws Exception {
        return Json.DeserializeObject(json, Information.class);
    }
    
    public static Dictionary<String, String> toInfoDictionary(String json) throws Exception {
        return toInfo(json).toDictionary();
    }
    
    public static String toJson(Information i) throws Exception {
        return Json.SerializeObject(i);
    }
    
    public static String toJson(Hashtable<String, String> d) throws Exception {
        Information i = new Information();
        for (String str : d.keySet()) {
            i.put(str, d.get(str));
        }
        return toJson(i);
    }
}
