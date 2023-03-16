class blue{
    private int age;
    private String name;
    public int getage(){
        return age;
    
    }
    public String getname(){
    return name;
    }
    public void setage(int newAge){
    age = newAge;
    
    }
    public void setname(String newname){
        name=newname;
    }
}


public class encapsul {
    public static void main(String[] args) {
        blue v=new blue();
        v.setage(12);
        System.out.print(v.getage());
        v.setname("Tam");
        System.out.print(v.getname());
    }
    
}
