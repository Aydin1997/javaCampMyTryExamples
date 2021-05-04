
public class CustomerManager {
	
	public void add(Logger logger) {
		System.out.println("Müþteri Eklendi!");
		logger.log(); //Logger parametresi verilerek hangi Logger istersek o log çaðýrýlýr!
					  //Bunun da bize faydasý baðýmlýlýktan kurtulduk!!!!!!!!!
	}

}
