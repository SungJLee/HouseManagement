package apartment;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class main {

  public static void main(String[] args) throws IOException, ParseException {

	int count = 0;
  	JSONArray jsonArray = new JSONArray();
    boolean swi = true; 
		while(swi){
    System.out.println("-------------------------------------");
	System.out.println("1. 입력하기");
	System.out.println("2. 전체 조회하기");
	System.out.println("3. 호수로 조회하기");
	System.out.println("4. json으로 정보보기");
	System.out.println("5. json으로 내보내기");
	System.out.println("6. json파일 불러오기");
    System.out.println("7. 나가기");
			
      
		Scanner scan = new Scanner(System.in); 
		Scanner scanf = new Scanner(System.in); 
		
		System.out.print("> ");
		int choice = scan.nextInt();
		
        switch(choice){
                case 1:
                	
                	System.out.println("추가할 집 호수 , 이름 , 연락처 , 어떤 타입의 집인지 알려주세요");
                	
                	String temp_houseNumber = scanf.nextLine();
                	String temp_houseName = scanf.nextLine(); 
                	String temp_phoneNumber = scanf.nextLine();
                	String temp_houseType = scanf.nextLine();
                	
                	House house = new House(temp_houseNumber,temp_houseName,temp_phoneNumber,temp_houseType);
                	
                	JSONObject obj1 = new JSONObject();
                	obj1.put("houseNumber",temp_houseNumber);
                	obj1.put("houseName",temp_houseName);
                	obj1.put("phoneNumber",temp_phoneNumber);
                	obj1.put("houseType",temp_houseType);
                	jsonArray.add(obj1);
                	
                	
                	break;
          
		        case 2:
		        	Iterator it = jsonArray.iterator();
		        	while(it.hasNext()) {
		        		JSONObject o = (JSONObject)it.next();
		        		String jsonHouse=o.get("houseNumber").toString();
		        		String jsonName=o.get("houseName").toString();
		        		String jsonPhone=o.get("phoneNumber").toString();
		        		String jsonHouseType=o.get("houseType").toString();
		        		
		        		System.out.println("집호수는 : " + jsonHouse);
		        		System.out.println("이름 : " + jsonName + " 전화번호 : " + jsonPhone + " 집 정보 : " + jsonHouseType);

		        	}
		        	break;
          
				case 3: 
					System.out.println("호수를 입력해주세요 : ");
					boolean checkHouseNum = false;
					String checkHouseNumber = scanf.nextLine();
					Iterator it2 = jsonArray.iterator();
		        	while(it2.hasNext()) {
		        		
		        		JSONObject o = (JSONObject)it2.next();
		        		if(o.get("houseNumber").equals(checkHouseNumber)) {
		        			checkHouseNum = true;
		        			String jsonHouse = o.get("houseNumber").toString();
			        		String jsonName = o.get("houseName").toString();
			        		String jsonPhone = o.get("phoneNumber").toString();
			        		String jsonHouseType = o.get("houseType").toString();
			        		System.out.println("집호수는 : " + jsonHouse);
			        		System.out.println("이름 : " + jsonName + " 전화번호 : " + jsonPhone + " 집 정보 : " + jsonHouseType);
			        		break;
		        		}	        		
		        	}
		        	if(checkHouseNum == false) {
			        	System.out.println("잘못된 house Number입니다.");
		        	}
					break;

				case 4:
					System.out.println(jsonArray);
					break;
          
				case 5:
					JSONObject jObj = new JSONObject();
					jObj.put("Apartment", jsonArray);
					FileWriter writer = new FileWriter("src/json/mydata.json");
			  		writer.write(jObj.toJSONString());
			  		writer.flush();
			  		writer.close();
					break;

				case 6: 
					JSONParser parser = new JSONParser();
					Object obj = parser.parse(new FileReader("src/json/mydata.json"));
					System.out.println(obj);
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
