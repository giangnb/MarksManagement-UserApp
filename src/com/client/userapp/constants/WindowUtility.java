/*
 * The MIT License
 *
 * Copyright 2016 Giang.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.client.userapp.constants;

import com.client.userapp.Application;
import com.client.userapp.views.LoadingScreen;
import java.awt.Component;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Giang
 */
public final class WindowUtility {
    
    public static final int DEFAULT=0, WARNING=1, ERROR=2;
    
    public static final JDialog showModalDialog(JFrame owner, String title, JFrame dialogFrame) {
        JDialog dialog = new JDialog(owner, title, true);
        dialog.add(dialogFrame.getContentPane());
        dialog.setMinimumSize(dialogFrame.getSize());
        dialog.setLocationRelativeTo(owner);
        dialog.setVisible(true);
        return dialog;
    }
    
    public static final void showLoadingFrame(String title1, String title2, Callable<?> funct) {
        SwingWorker<?, ?> worker = new SwingWorker() {
            private final LoadingScreen scr = new LoadingScreen(title1, title2);
            
            @Override
            protected Object doInBackground() throws Exception {
                funct.call();
                return null;
            }

            @Override
            protected void done() {
                super.done(); 
                scr.dispose();
            }
        };
        worker.execute();
    }
    
    public static final void showLoadingFrame(String title, Callable<?> funct) {
        showLoadingFrame(title, "", funct);
    }
    
    public static final Future showMessage(Component parent, String title, String message, int type) {
        switch(type) {
            case DEFAULT:
                JOptionPane.showMessageDialog(parent, message, title, JOptionPane.DEFAULT_OPTION);
                break;
            case WARNING:
                JOptionPane.showMessageDialog(parent, message, title, JOptionPane.WARNING_MESSAGE);
                break;
            case ERROR:
                JOptionPane.showMessageDialog(parent, message, title, JOptionPane.ERROR_MESSAGE);
                break;
        }
        return null;
    }
    
    public static final String showInputPrompt(Component parent, String title, String message)
        throws NullPointerException {
        return JOptionPane.showInputDialog(parent, message, title, JOptionPane.DEFAULT_OPTION);
    }
    
    public static final int showConfirm(Component parent, String title, String message, String[] options)
        throws NullPointerException {
        return JOptionPane.showOptionDialog(
                parent, message, title, 0, JOptionPane.DEFAULT_OPTION, 
                null, options, null);
    }
    
    public static final ConfirmOption showConfirm(Component parent, String title, String message)
        throws NullPointerException {
        String[] options = new String[] {"Có", "Không"};
        
        // 0 = YES; 1 = NO
        int choose = JOptionPane.showOptionDialog(
                parent, message, title, 0, JOptionPane.DEFAULT_OPTION, 
                null, options, null);
        return choose==0?ConfirmOption.YES:ConfirmOption.NO;
    }
    
    public static final Future backGroundTask(Callable<Object> task) throws InterruptedException, ExecutionException {
        SwingWorker<?, ?> worker = new SwingWorker() {
            
            @Override
            protected Object doInBackground() throws Exception {
                return task.call();
            }

            @Override
            protected void done() {
                super.done();
            }
        };
        worker.execute();
        return null;
    }
    
//    public static final void backGroundTask(Callable<String> task, JTextField txt) throws InterruptedException, ExecutionException {
//        SwingWorker<?, ?> worker = new SwingWorker() {
//            
//            @Override
//            protected Object doInBackground() throws Exception {
//                return task.call();
//            }
//
//            @Override
//            protected void done() {
//                super.done();
//            }
//        };
//        worker.execute();
//    }
}