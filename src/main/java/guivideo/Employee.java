
package guivideo;

import java.io.*;



public class Employee implements Serializable {
    private String name;
    private String surname;
    private Job job;
    private int staffNum;

    public Employee(String name, String surname, Job job, int staffNum) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.staffNum = staffNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(int staffNum) {
        this.staffNum = staffNum;
    }
    
    
    
    
}
