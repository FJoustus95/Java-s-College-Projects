
package guivideo;

import java.io.*;

public class Job implements Serializable {
    private int salary;
    private String nameOfJob;

    
    public Job(int salary, String nameOfJob) {
        this.salary = salary;
        this.nameOfJob = nameOfJob;
    }
    public boolean equals(Job job) {
        
       return(this.salary == job.salary && this.nameOfJob.equals(job.nameOfJob));
            
    }
    
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getNameOfJob() {
        return nameOfJob;
    }

    public void setNameOfJob(String nameOfJob) {
        this.nameOfJob = nameOfJob;
    }

    
    
}
