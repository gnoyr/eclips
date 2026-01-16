package d0116;

import java.util.Objects;

public class INum {
	private int num;
	
	public INum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		INum x = (INum)obj;
		
		if(this == obj) {
			return true;
		}
		
		if(this.num == x.num) {
			return true;
		}
		
		return super.equals(obj);
	}
	
}
