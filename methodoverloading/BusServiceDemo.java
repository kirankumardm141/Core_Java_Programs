package methodoverloading;

public class BusServiceDemo {

	static Bus obj[]=new Bus[7];
	static {
		obj[0]= new Bus("KA03 9951","Pooja","Sleeper",20,"Bidar","Bengaluru",2000);
		obj[1]= new Bus("KA03 9952","VRL","AC",50,"Raichur","Bengaluru",1000);
		obj[2]= new Bus("KA03 9953","SRS","Semi-Sleeper",60,"Mysuru","Bengaluru",2000);
		obj[3]= new Bus("KA03 9954","Shakuntala","Sleeper",70,"Hyderabad","Bengaluru",5000);
		obj[4]= new Bus("KA03 9955","Volvo","Chair Car",10,"Bidar","Amaravathi",8000);
		obj[5]= new Bus("KA03 9956","Pavit","Sleeper",100,"Bidar","Hubli",2000);
		obj[6]= new Bus("KA03 9957","Orange","Third AC",90,"Bidar","Shimoga",2000);
	}
	
	//Method Overloading
	public Bus[] getBuses(String Bustype)
	{
		int count=0;
		int filteredBuscount=filterBusBasedonCondition(obj,"Sleeper",0);
		Bus filteredBus[]=new Bus[filteredBuscount];
		for (Bus bus : obj) {
			if(bus.getBustype()=="Sleeper") {
				filteredBus[count++]=bus;
			}
		}
		return filteredBus;
	}
	public Bus[] getBuses(int price)
	{
		int count=0;
		int filteredBuscount=filterBusBasedonCondition(obj,"",2000);
		Bus filteredBus[]=new Bus[filteredBuscount];
		for (Bus bus : obj) {
			if(bus.getPrice()==2000) {
				filteredBus[count++]=bus;
			}
		}
		return filteredBus;
	}
	//Method Overloading
	
	public int filterBusBasedonCondition(Bus[] bus,String bustype,int price)
	{
		int count=0;
		if(!bustype.isEmpty())
		{
			for (Bus bus2 : bus) {
				if(bus2.getBustype()==bustype)
					count++;
				
			}
		}
		else if(price>0)
		{
			for (Bus bus2 : bus) {
				if(bus2.getPrice()==price)
					count++;
			}
		}
		return count;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusServiceDemo obj= new BusServiceDemo();
		Bus filteredBusType[]=obj.getBuses("Sleeper");
		System.out.println("Filtered Bus Based on Bus Type");
		for (Bus bus : filteredBusType) {
			System.out.println(bus.getbusno()+" "+bus.getBustype()+" "+bus.getCapacity()+" "+bus.getDest()+" "+bus.getName()+" "+bus.getPrice());
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		Bus filteredBusesPrice[]=obj.getBuses(2000);
		System.out.println("Filtered Bus Based on Price");
		for (Bus bus : filteredBusesPrice) {
			System.out.println(bus.getbusno()+" "+bus.getBustype()+" "+bus.getCapacity()+" "+bus.getDest()+" "+bus.getName()+" "+bus.getPrice());
		}
	}

}
