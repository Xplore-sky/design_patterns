package main.java.com.itheima.homework.Simplefactory.first;

public class Nvwa {
    public static Person makePerson(char arg){
        Person person=null;
        switch (arg){
            case'M':
                person=new Man();
            break;
            case 'W':
                person=new Woman();
                break;
            case 'R':
                person=new Robot();
                break;
        }
        return person;
    }
}
