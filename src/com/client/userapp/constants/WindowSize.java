/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.userapp.constants;

import com.client.userapp.Application;
import java.awt.Dimension;

/**
 * Specified window size
 * @author Giang
 */
public enum WindowSize {
    
    /**
     * 
     */
    NORMAL_WINDOW(new Dimension((int) Math.round(Application.SCREEN_SIZE.width / 2.25), (int) Math.round(Application.SCREEN_SIZE.height / 1.65))),
    NARROW_WINDOW(new Dimension((int) Math.round(Application.SCREEN_SIZE.width / 2.45), (int) Math.round(Application.SCREEN_SIZE.height / 1.65))),
    WIDE_WINDOW(new Dimension((int) Math.round(Application.SCREEN_SIZE.width / 1.5), (int) Math.round(Application.SCREEN_SIZE.height / 1.5))),
    LARGE_WINDOW(new Dimension((int) Math.round(Application.SCREEN_SIZE.width / 1.25), (int) Math.round(Application.SCREEN_SIZE.height / 1.25))),
    SMALL_WINDOW(new Dimension((int) Math.round(Application.SCREEN_SIZE.width / 3), (int) Math.round(Application.SCREEN_SIZE.height / 2.65))),
    TINY_WINDOW(new Dimension((int) Math.round(Application.SCREEN_SIZE.width / 3.65), (int) Math.round(Application.SCREEN_SIZE.height / 3)));
    
    private final Dimension d;

    WindowSize(Dimension d) {
        this.d = d;
    }
    
    public Dimension getDimension() {
        return d;
    }
}
