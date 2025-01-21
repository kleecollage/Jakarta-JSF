package beans.model;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class Candidate {
    private String name = "Enter your name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
