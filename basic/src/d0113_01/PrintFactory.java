package d0113_01;

public class PrintFactory {
	String printName;
	
	PrintFactory(String printName){
		this.printName = printName;
	}
	
	Printable getName() {
		if(printName.equals("hp")) {
			return new HpPrinter();
		}else if(printName == "캐논") {
			return new CanonPrinter();
		}else {
			return null;
		}		
	}
}
