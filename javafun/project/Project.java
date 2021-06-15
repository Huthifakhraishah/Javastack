public class Project{
    private String name;
    private String desc;
    public static void main(String[] args){
    }
    public void Setname(String name){
    this.name=name;
    }
    public String Getname(){
        return name;
    }
    public void Setname(String desc){
        this.desc=desc;
    }
    public String Getdesc(){
        return desc;
    }
    public String ElevatorPitch(){
        return String.format("%s , %s", name, description);
    }
    public Project() {
    }
    public Project(String name) {

    }
    public Project(String name, String description) {

    }

}