package d0112;

public class TransportationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus();
		Train train = new Train();
		
		BusanTravel bt = new BusanTravel();
		
//		bt.busIn(bus);
//		bt.trainIn(train);
		
		bt.goBusan(bus);
		bt.goBusan(train);
		
	}

}
