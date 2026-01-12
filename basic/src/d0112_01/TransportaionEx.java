package d0112_01;

public class TransportaionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bus bus = new Bus();
		Train train = new Train();
		
		BusanTravel bt = new BusanTravel();
		
//		bt.busIn(bus);
//		bt.trainIn(train);
		
		bt.goBusan(train);
		
	}

}
