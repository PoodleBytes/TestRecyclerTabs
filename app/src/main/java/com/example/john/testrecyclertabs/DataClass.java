package com.example.john.testrecyclertabs;

public class DataClass {

    private String Name;
    private String Project;
    private int Id;

    public DataClass (String Name, String Project, int Id) {
        this.Name = Name;
        this.Project = Project;
        this.Id = Id;
    }

    //These are your GETTERS to return the selected items
    public String getName() {
        return Name;
    }
    public String getProject() {
        return Project;
    }
    public int getId() {
        return Id;
    }
}
