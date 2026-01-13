package d0113;

public class Tvfactory {
	String brandName;	//삼성 엘지
	//브랜드 네임을 받아서 초기화하는 생성자
	
	Tvfactory(String name){
		this.brandName = name;
	}

	Tvable getBrand() { // 브랜드 네임이 삼성이면 stv 반환, 엘지면 ltv반환, 이도저도 아니면 NUll 반환
		if(brandName == "삼성") {
			return new STv();
		}else if(brandName == "삼성") {
			return new LTv();
		}else {
			return null;
		}
		
	}
}
