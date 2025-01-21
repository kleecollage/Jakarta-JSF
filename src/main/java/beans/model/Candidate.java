package beans.model;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class Candidate {
    private String name = "Enter your name";

    Logger log = LogManager.getRootLogger();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        log.info("Modify name property: " + this.name);
    }
}
