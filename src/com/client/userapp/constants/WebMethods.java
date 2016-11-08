
package com.client.userapp.constants;

import com.client.service.Bulk;
import com.client.service.Clazz;
import com.client.service.Student;
import com.client.service.Subject;
import com.client.service.Teacher;
import com.client.userapp.Application;
import java.io.Serializable;

/**
 * Web Service methods implementation
 * @author Giang
 */
public class WebMethods implements Serializable{
    private WebMethods(){};

    /**
     * Add new Score of one subject for one student
     * @param scores Score objects
     * @return Scores that have been failed when manipulating
     */
    public static java.util.List<com.client.service.Score> addScores(java.util.List<com.client.service.Score> scores) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.addScores(scores);
    }

    /**
     * Archive scores of the whole class
     * @param classId 
     */
    public static void archiveToLog(int classId) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        port.archiveToLog(classId);
    }

    /**
     * Archive score of one student
     * @param studentId
     * @return 1 if success
     */
    public static int archiveToLogByStudent(int studentId) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.archiveToLogByStudent(studentId);
    }

    /**
     * Get bulk by ID
     * @param id
     * @return 
     */
    public static Bulk getBulkById(int id) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getBulkById(id);
    }

    /**
     * Get all bulk
     * @return Bulks list
     */
    public static java.util.List<com.client.service.Bulk> getBulks() {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getBulks();
    }

    /**
     * Get class information of 1 class
     * @param id
     * @return 
     */
    public static Clazz getClassById(int id) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getClassById(id);
    }

    /**
     * Get all classes
     * @return Classes list
     */
    public static java.util.List<com.client.service.Clazz> getClasses() {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getClasses();
    }

    /**
     * Get system properties
     * @return 
     */
    public static java.util.List<com.client.service.Properties> getProperties() {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getProperties();
    }

    /**
     * Get system property
     * @param propertyKey - Key
     * @return 
     */
    public static String getPropertyValueByKey(java.lang.String propertyKey) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getPropertyValueByKey(propertyKey);
    }

    /**
     * Get all scores of a class
     * @param classId
     * @return Scores list
     */
    public static java.util.List<com.client.service.Score> getScoresByClass(int classId) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getScoresByClass(classId);
    }

    /**
     * Get all scores of a subject
     * @param subjectId
     * @return Scores list
     */
    public static java.util.List<com.client.service.Score> getScoresBySubject(int subjectId) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getScoresBySubject(subjectId);
    }

    /**
     * Get all students
     * @return Students list
     */
    public static java.util.List<com.client.service.Student> getStudent() {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getStudent();
    }

    /**
     * Get student info by ID
     * @param id
     * @return Student object
     */
    public static Student getStudentById(int id) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getStudentById(id);
    }

    /**
     * Get all students in a class
     * @param classId
     * @return Students list
     */
    public static java.util.List<com.client.service.Student> getStudentsByClass(int classId) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getStudentsByClass(classId);
    }

    /**
     * Student search (Support Full-Text search)
     * @param name
     * @return Students result list
     */
    public static java.util.List<com.client.service.Student> getStudentsByName(java.lang.String name) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getStudentsByName(name);
    }

    /**
     * Get subject information by ID
     * @param id
     * @return Subject object
     */
    public static Subject getSubjectById(int id) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getSubjectById(id);
    }

    /**
     * Get all subjects
     * @return Subjects list
     */
    public static java.util.List<com.client.service.Subject> getSubjects() {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getSubjects();
    }

    /**
     * Get all subjects of a bulk
     * @param bulkId - Bulk ID
     * @return Subjects list
     */
    public static java.util.List<com.client.service.Subject> getSubjectsByBulk(int bulkId) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getSubjectsByBulk(bulkId);
    }

    @Deprecated
    public static java.util.List<com.client.service.Subject> getSubjectsByTeacher(int teacherId) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getSubjectsByTeacher(teacherId);
    }

    /**
     * Get teacher info by ID
     * @param id
     * @return Teacher object
     */
    public static Teacher getTeacherById(int id) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getTeacherById(id);
    }

    /**
     * Get all teacher
     * @return Teachers list
     */
    public static java.util.List<com.client.service.Teacher> getTeachers() {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getTeachers();
    }

    /**
     * Batch update scores
     * @param scores
     * @return 
     */
    public static java.util.List<com.client.service.Score> updateScores(java.util.List<com.client.service.Score> scores) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.updateScores(scores);
    }

    /**
     * Teacher account verification
     * @param userId - User's login ID
     * @param password - Password (raw password)
     * @return Teacher object or null if failed
     */
    public static Teacher teacherLogin(java.lang.String userId, java.lang.String password) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.teacherLogin(userId, password);
    }

    /**
     * Update password
     * @param newPassword
     * @return 1 = success
     */
    public static int updateTeacherPassword(String newPassword) {
        com.client.service.Teacher teacher = Application.TEACHER;
        teacher.setPass(newPassword);
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.updateTeacher(teacher);
    }
}
