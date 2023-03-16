import java.io.*;
public class test {
    public static void main(String[] args) {
      try{
        FileWriter obj=new FileWriter("D:\\hellofile.txt");
    
       /*   try {
            if (obj.createNewFile()) {
                System.out.println(obj.getName());
                
             } else {
                System.out.println("file already exist");
             }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("error");
            e.printStackTrace();
        }*/
        // if (obj.exists()) {
        //     System.out.println(obj.getAbsolutePath());
        //     System.out.println(obj.canWrite());
        //     System.out.println(obj.canRead());
        //     System.out.println(obj.length());
            
        // }
       
        obj.write("hello");
        obj.close();
       
        }
        catch (Exception e) {
            // TODO: handle exception
        }
      }
    }
}
