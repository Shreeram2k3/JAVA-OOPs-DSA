package OOPS;
import java.util.*;
class Session
{
  String topic;
  String time;
  boolean completed;

  Session(String topic, String time)
  {
    this.topic=topic;
    this.time = time;
    this.completed=false;
  }

  void markDone()
  {
    this.completed=true;
  }

  public String toString()
  {
    return "Topic: "+topic+  " Time: "+time+" | "+completed;
  }

}

class Student
{
  String name;
  List<Session> cls = new ArrayList<>();

  Student(String name)
  {
    this.name = name;
  }
  
  void addSession(Session s)
  {
    cls.add(s);
  }

  void viewClasses()
  {
    System.out.println("Classes for "+ name);

    for(Session i : cls)
    {
      System.out.println("* "+i);
    }
  }

}

public class Tutor {
  public static void main(String[] args) {
    
    Student s1 = new Student("Sankaran");
    Session cls1 = new Session("OOP", "9.15AM");

    s1.addSession(cls1);

    s1.viewClasses();
    cls1.markDone();
    s1.viewClasses();
  }
}
