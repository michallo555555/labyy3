
import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Scanner skan = new Scanner(System.in);
      Service1 s = new Service1();
      int x=4;
      String imie;
      int wiek;
      String born;
      System.out.println("Witaj!");
      while(x!=0)
        {
          System.out.println("1-nowy student 2-lista studentow");
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
      
  
    } catch (IOException e) {

    }
  }
}