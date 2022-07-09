package ss00_test;

public class LangguageComputer {
    public static void main(String[] args) {
        if("en".equals(System.getProperty("user.language"))){

            System.out.println("eng");
        } else {
            System.out.println("No eng");
        }
        //  System.out.println(System.getProperty("user.language"));
    }
    }

