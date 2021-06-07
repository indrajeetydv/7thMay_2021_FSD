package p2;
import static p1.StaticImportDemo.*;
import  p1.*;

public class StaticImportDemoTest{
	public static void main(String args[]){
		//accessing static members without classname
		System.out.println("StaticImportDemoTest- a: "+a);
		m1();

		//accessing static members without classname
		System.out.println("StaticImportDemoTest- a: "+StaticImportDemo.a);
		StaticImportDemo.m1();

		//access non-static members
		StaticImportDemo sim=new StaticImportDemo();
		System.out.println("Non-stati memeber- x: "+sim.x);
		sim.m2();
	}
}