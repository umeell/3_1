import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {    
    Service1 s = new Service1();
    Scanner skan = new Scanner(System.in);
    try {
      int x=4;
      String imie;
      int wiek;
      String born;
      System.out.println("Witaj!");
      while(x!=0)
        {
          System.out.println("Wybierz funkcję: \n"+
                        "1 - dodanie nowego studenta \n"+
                        "2 - wyszukanie danego studenta \n"+
                        "3 - wyjście z programu");
          x=skan.nextInt();
          switch(x)
            {
                case 1:
                {
                  Scanner skan1 = new Scanner(System.in);
                  System.out.println("Podaj imie: ");
                  imie=skan1.nextLine();
                  System.out.println("Podaj wiek: ");
                  wiek=skan.nextInt();
                  System.out.println("Podaj datę urodzenia: ");
                  born=skan1.nextLine();
                  s.addStudent(new Student(imie, wiek, born));
                }break;
              case 2:
                {
                   var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
                }break;
              case 3:
                {
                  x=0;
                }break;
            }
            
        }
      
      //s.addStudent(new Student("Krzysztof", 20));
     // s.addStudent(new Student("Janusz", 40));

     // var students = s.getStudents();
     // for(Student current : students) {
      //  System.out.println(current.ToString());
      //}
    } catch (IOException e) {

    }
  }
}