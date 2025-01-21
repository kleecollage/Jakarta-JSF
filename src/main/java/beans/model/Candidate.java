package beans.model;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class Candidate {
    private String name;
    private String surname;
    private String desiredSalary;

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

    public String getDesiredSalary() {
        return desiredSalary;
    }

    public void setDesiredSalary(String desiredSalary) {
        this.desiredSalary = desiredSalary;
        log.info("Modify desired salary property: " + this.desiredSalary);
    }
}
