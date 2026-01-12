package d0112;

class Mouse{
	
	public void clickLeft() {
		System.out.println("왼쪽클릭..");
	}

	public void clickright() {
		System.out.println("오른쪽클릭..");
	}
	
}

class WheelMouse extends Mouse{
	
	public void scroll() {
		System.out.println("스크롤..");
	}
	@Override
	public void clickLeft() {
		System.out.println("휠마우스 왼쪽클릭..");
	}
	@Override
	public void clickright() {
		System.out.println("휠마우스 오른쪽클릭..");
	}
}

class OpticalMouse extends Mouse{

	public void clickLeft() {
		System.out.println("광마우스 왼쪽클릭..");
	}

	public void clickright() {
		System.out.println("광마우스 오른쪽클릭..");
	
	}
}

public class MouseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Mouse[] A = new Mouse[3];
		A[0] = new Mouse();
		A[1] = new WheelMouse();
		A[2] = new OpticalMouse();
		
		
//		for(int i = 0 ; i < 3; i++) {
//			A[i].clickLeft();
//			A[i].clickright();
//		}
		
//		Mouse m9 = new wheelMouse();
//		System.out.println(m9 instanceof Mouse);
//		System.out.println(m9 instanceof wheelMouse);
//		System.out.println(A[0] instanceof wheelMouse);
		
		//.getClass().equals(Mouse.class) =/ instanceof(타입의 포용성을 생각해서 순서 잡기)		
		for(int i = 0 ; i < A.length; i++) {
			if(A[i].getClass().equals(Mouse.class)) {
				System.out.println("마우스");
			}else if(A[i].getClass().equals(WheelMouse.class)){
				System.out.println("휠마우스");
			}else {
				System.out.println("광마우스");
			}	
		}
				
		
	}

}
