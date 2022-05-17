public class Student {

  private String Name;
  private String foreName;
  private int Age;
  private String Born;

  public Student(String name, String forename, int age, String born) {
    Name = name;
    foreName=forename;
    Age = age;
    Born = born;
  }

  public String GetName() {return Name;}
  public String GetforeName() {return foreName;}
  public int GetAge() {return Age;}
   public String GetBorn() {return Born;}

  public String ToString() {
    return Name + " " +foreName+" "+ Integer.toString(Age)+" "+Born;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error","Parse Error", -1,"Parse Error");
    return new Student(data[0],data[1], Integer.parseInt(data[2]),data[3]);
  }
}