package overriding;

public class Practise1 {

	public static void main(String[] args) {
		Degree d= new Degree();
		underGraduate u= new underGraduate();
		postGraduate p= new postGraduate();
		d.getDegree();
		u.getDegree();
		p.getDegree();

	}

}
class Degree{
	public void getDegree(){
		System.out.println("I got a degree");
	}
}
class underGraduate extends Degree{
	public void getDegree() {
		System.out.println("I got a underGraduate");
	}
}

class postGraduate extends Degree{
	public void getDegree() {
		System.out.println("I got a postGraduate");
	}
}
