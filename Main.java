import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {    
    try {
      Service1 s = new Service1();
      boolean dziala = true;
      String imie;
      String nazwisko;
      int wiek;
      String data;
      System.out.println("Witaj!");
      while(dziala)
        {
          Scanner skan = new Scanner(System.in);
          System.out.println("Wybierz funkcję: \n"+
                        "1 - dodanie nowego studenta \n"+
                        "2 - wyszukanie danego studenta \n"+
                        "3 - wyszukiwanie po imieniu\n"+
                        "4 - wyjście z programu");
          int x=skan.nextInt();
          switch(x)
            {
                case 1:
                {
                  Scanner skan1 = new Scanner(System.in);
                  System.out.println("Podaj imie: ");
                  imie=skan1.nextLine();
                  System.out.println("Podaj nazwisko: ");
                  nazwisko=skan1.nextLine();
                  System.out.println("Podaj wiek: ");
                  wiek=skan1.nextInt();
                  skan1.nextLine();
                  System.out.println("Podaj date urodzenia: ");
                  data=skan1.nextLine();
                  s.addStudent(new Student(imie,nazwisko, wiek,data));
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
                  Scanner skan1 = new Scanner(System.in);
                  System.out.println("Podaj imie: ");
                  imie=skan1.nextLine();
                  s.findStudentByName(imie);
                  
                };
              case 4:
                {
                  dziala = false;
                }break;
            }
            
        }
    } catch (IOException e) {

    }
  }
}