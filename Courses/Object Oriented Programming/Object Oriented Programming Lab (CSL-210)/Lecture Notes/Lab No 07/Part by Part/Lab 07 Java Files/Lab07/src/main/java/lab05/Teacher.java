package lab05;

public class Teacher {
    
    private String name;
    private String designation = "Teacher";
    private String uniName = "Bahria";
    
    public String getname(){
        return name;
    }
    protected String getdesignation(){
        return designation;
    }
    protected String getuniName(){
        return uniName;
    }
    public void setname (String name){
        
        this.name = name;
    } 
    public void Does(){
        System.out.println("Teaching");
    }
}
