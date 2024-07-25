import java.util.Scanner;

public class Main {
  static void ConvertToBinary(int number) {
    int n = number; 
    int n2_8, n2_7, n2_6, n2_5, n2_4, n2_3, n2_2, n2_1, n2_0; 
    n2_8 = n2_7 = n2_6 = n2_5 = n2_4 = n2_3 = n2_2 = n2_1 = n2_0 = 0;

    if (n>= 256) {
      n -= 256; 
      n2_8 += 1;
    }

    if (n >= 128) {
      n -= 128;
      n2_7 += 1;
    }

    if (n >= 64) {
      n -= 64; 
      n2_6 += 1;
    } 

    if (n >= 32) {
      n -= 32;
      n2_5 += 1;
    }

    if (n >= 16) {
      n -= 16;
      n2_4 += 1;
    }

    if (n >= 8) {
      n -= 8;
      n2_3 += 1;
    }

    if (n >= 4) {
      n -= 4;
      n2_2 += 1;
    }

    if (n >= 2) {
      n -= 2;
      n2_1 += 1;
    }

    if (n >= 1) {
      n -= 1;
      n2_0 += 1;
    }


    System.out.print(n2_8);
    System.out.print(n2_7);
    System.out.print(n2_6);
    System.out.print(n2_5);
    System.out.print(n2_4);
    System.out.print(n2_3);
    System.out.print(n2_2);
    System.out.print(n2_1);
    System.out.print(n2_0);
  }
  public static void main(String[] args) {
    Scanner javin = new Scanner(System.in);
    int number; 
    int continueCounter; 

    while (true) {
      System.out.println("Type 1 to start new operation, 0 to exit. ");
      continueCounter = javin.nextInt();

      if (continueCounter != 0) {
        System.out.println("Enter a value between 0 to 511 for \"number\" variable. ");
        number = javin.nextInt();
        
        if (number > 511) {
            System.out.println("This program only support numbers from 0 - 511.\nNumbers exceed this range will be invalid.\nPlease try again. \n ");
            continue;
        }

        System.out.print("Output : ");  
        ConvertToBinary(number);

        System.out.println("\n\n------------------------------------------\n"); 
      }
      else {
        break;
      }

      
    }

    System.out.println("=============================================");
    System.out.println("Bye Bye ~"); 

    
  }
}