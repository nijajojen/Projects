package overriding;

public class Practise2 {

	public static void main(String[] args) {
		BankA a= new BankA();
		BankB b= new BankB();
		BankC c= new BankC();
		System.out.println(a.getBalance());
		System.out.println(b.getBalance());
		System.out.println(c.getBalance());
		

	}

}
class Bank{
	public int getBalance() {
		return 0;
	}
}
class BankA extends Bank{
	public int getBalance() {
		return 1000;
	}
}

class BankB extends Bank{
	public int getBalance() {
		return 1500;
	}
}

class BankC extends Bank{
	public int getBalance() {
		return 2000;
	}
}