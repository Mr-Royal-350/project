package multilevel_Inheritance;
public class FactoryDetails extends WholeSalers{
	private void facrotyName() {
		// TODO Auto-generated method stub
System.out.println("Factory name:Lays");
	}
private void factoryAddress() {
	// TODO Auto-generated method stub
System.out.println("Factory address:Chennai");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FactoryDetails factory=new FactoryDetails();
factory.coustomerName();
factory.coustomerAddress();
factory.shopName();
factory.shopAddress();
factory.facrotyName();
factory.factoryAddress();
	}
}
