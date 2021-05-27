package apartment;

import java.util.Scanner;
import java.util.*;

public class main {

  public static void main(String[] args) {

    boolean swi = true; 
		while(swi){
    System.out.println("-------------------------------------");
	System.out.println("1. 입력하기");
	System.out.println("2. 조회하기");

    System.out.println("7. 나가기");
			
      
		Scanner scan = new Scanner(System.in); 
		System.out.print("> ");
		int choice = scan.nextInt();
		
        switch(choice){
                case 1:
                	break;
          
		        case 2:
		        	break;
          
				case 3: 
					break;

				case 4:
					break;
          
				case 5:
					break;

				case 6: 
					break;

				case 7 : // 나가기
					swi = false;
					break;
				default :
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
    }
  }
}
