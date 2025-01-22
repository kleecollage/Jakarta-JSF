package beans.model;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Date;

@Named
@RequestScoped
public class Candidate {
    private String name;
    private String surname;
    private int desiredSalary;
    private Date dateOfBirth;
    private String zipCode;
    private String city;
    private String comment;
    private int suburbId;

    Logger log = LogManager.getRootLogger();

    public Candidate() {
        log.info("Object Candidate created");
        this.setName("Enter your name");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        log.info("Modify name property: " + this.name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        log.info("Modify surname property: " + this.surname);
    }

    public int getDesiredSalary() {
        return desiredSalary;
    }

    public void setDesiredSalary(int desiredSalary) {
        this.desiredSalary = desiredSalary;
        log.info("Modify desired salary property: " + this.desiredSalary);
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getSuburbId() {
        return suburbId;
    }

    public void setSuburbId(int suburbId) {
        this.suburbId = suburbId;
    }
}
