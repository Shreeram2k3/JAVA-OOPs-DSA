package OOPS;
import java.util.*;

class Tasks
{
  String description;
  String time;
  boolean completed;

  Tasks(String description, String time)
  {
    this.description=description;
    this.time=time;
    this.completed=false;
  }

  void markDone()
  {
    this.completed=true;
  }

  public String toString()
  {
    return description+" at "+time+"|"+completed;
  }


}

class Patient
{
  String Name;
  String Medicine;
  String dosage;
  List<Tasks> Tasks = new ArrayList<>();
  
  Patient(String name, String medicine , String dosage)
  {
    this.Name = name;
    this.Medicine= medicine;
    this.dosage = dosage;

  }

  void addTask(Tasks t)
  {
    Tasks.add(t);
  }

  void showChecklist()
  {
    System.out.println("PATIENT NAME: "+ Name );
    System.out.println("Medicine: "+Medicine);
    System.out.println("DOSAGE: "+dosage);

    for(Tasks i : Tasks)
    {
      System.out.println("* "+i);
    }
  }

}

class Nurse
{
  String name;
  List<Tasks> assignedTasks = new ArrayList<>();

  Nurse(String name)
  {
    this.name=name;
  }

  void addTask(Tasks t)
  {
    assignedTasks.add(t);
  }

  void showTasks()
  {
    System.out.println("Nurse Name: "+name);

    System.out.println("Assigned Tasks: ");

    for(Tasks i : assignedTasks)
    {
      System.out.println("* "+i);
    }
  }
}

public class OOP {
  public static void main(String[] args) {
    Patient p1 = new Patient("sankar", "paracetamol", "650mg");
    Tasks t1 = new Tasks("injection ","10am");
    Nurse n1 = new Nurse("siva");

    p1.addTask(t1);
    n1.addTask(t1);

    p1.showChecklist();
    n1.showTasks();

  }
}
