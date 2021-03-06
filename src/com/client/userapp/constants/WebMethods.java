
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
     * Get all students
     * @return Students list
     */
    public static java.util.List<com.client.service.Student> getStudents() {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getStudents();
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
    public static java.util.List<com.client.service.Student> getStudentsByClass(Clazz classId) {
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

    /**
     * Update teacher's information
     * @param teacher
     * @return 
     */
    public static int updateTeacher(com.client.service.Teacher teacher) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.updateTeacher(teacher);
    }

    /**
     * Archive score to log (and remove current scores)
     * @param studentId
     * @param remark - Teacher's remarks
     * @return 
     */
    public static int archiveToLogByStudent(int studentId, java.lang.String remark) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.archiveToLogByStudent(studentId, remark);
    }

    /**
     * Edit teacher's remark (only affect the latest log record
     * @param studentId
     * @param remark
     * @return 
     */
    public static int editArchiveRemark(int studentId, java.lang.String remark) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.editArchiveRemark(studentId, remark);
    }

    public static java.util.List<com.client.service.Score> getScoresBySubjectAndClass(com.client.service.Subject subject, com.client.service.Clazz clazz) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getScoresBySubjectAndClass(subject, clazz);
    }

    public static java.util.List<com.client.service.Score> getScoresByStudentAndSubject(com.client.service.Student student, com.client.service.Subject subject) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getScoresByStudentAndSubject(student, subject);
    }

    public static int addScore(com.client.service.Score score) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.addScore(score);
    }

    public static java.util.List<com.client.service.Clazz> getClassesByTeacher(com.client.service.Teacher teacher) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getClassesByTeacher(teacher);
    }
    
    /**
     * Get all scores of a subject
     * @param subject
     * @return Scores list
     */
    public static java.util.List<com.client.service.Score> getScoresBySubject(com.client.service.Subject subject) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getScoresBySubject(subject);
    }

    public static int removeScore(java.lang.Long scoreId) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.removeScore(scoreId);
    }

    public static java.util.List<com.client.service.Score> removeScores(java.util.List<java.lang.Long> ids) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.removeScores(ids);
    }

    public static java.util.List<com.client.service.Score> getScoresByStudent(com.client.service.Student student) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getScoresByStudent(student);
    }
}
