import java.util.*;

public class UpperBoundWildCardExample{
	public static void wildCard(List<? extends Canvas> L){
		for(Canvas ref:L){
			ref.draw();
		}
	}

	public static void main(String[] args) {
		List<Triangle> triangleList=new ArrayList<>();
		triangleList.add(new Triangle());

		List<Circle> circleList=new ArrayList<>();
		circleList.add(new Circle());
		circleList.add(new Circle());

		List<Square> squareList=new ArrayList<>();
		squareList.add(new Square());
		squareList.add(new Square());

		wildCard(triangleList);
		wildCard(circleList);
		wildCard(squareList);

		/*List<String> strList=new ArrayList<>();

		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		wildCard(strList);*/
	}
}