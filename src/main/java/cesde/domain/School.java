package cesde.domain;

public class School {

    private int id;
    private String nameSchool;
    private String headMaster;

    public School() {
    }

    public School(int id, String nameSchool, String headMaster) {
        this.id = id;
        this.nameSchool = nameSchool;
        this.headMaster = headMaster;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public String getHeadMaster() {
        return headMaster;
    }

    public void setHeadMaster(String headMaster) {
        this.headMaster = headMaster;
    }
}