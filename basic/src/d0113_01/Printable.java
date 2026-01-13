package d0113_01;

public interface Printable {
	void printing();
	void scan();	
	void copy();
	void fax();
	default void showEndMSG() {
		System.out.println("끝");
	};
}
