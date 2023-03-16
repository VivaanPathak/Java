class Student{  
    int id;  
    String name;  
    void infor(int r,String p){
      id=r;
     name=p;
       
    }
    void display(){System.out.println(id+" "+name);}
   }  
   class TestStudent2{ 
    public static void main(String args[]){  
     Student s1=new Student(); 
     Student s2=new Student(); 
     s1.infor(12, "ewar");
     s2.infor(34, "deask");
    s1.display();
    s2.display();
   
    }  
   }  
  