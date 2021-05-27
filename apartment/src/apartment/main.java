package apartment;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
                	System.out.println("추가할 집 호수 , 이름 , 연락처 , 어떤 타입의 집인지 알려주세요");
                	JSONArray jsonArray = new JSONArray();
                	for (int i = 0;i < array.size() ; i++) {
                        JSONObject obj = new JSONObject();
                        JSONObject objItem =  new JSONObject();
                        objItem.put("id", array.get(i).getId());
                        objItem.put("name",  array.get(i).getName());
                        objItem.put("address",  array.get(i).getAddress());
                        obj.put("employee", objItem);
                        jsonArray.put(obj);
                    }
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
