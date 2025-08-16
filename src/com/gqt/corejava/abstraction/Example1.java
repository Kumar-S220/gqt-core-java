package com.gqt.corejava.abstraction;

abstract class Plane{
	abstract void takeOff();
	abstract void fly();
	void land() {
		System.out.println("Plane Lands");
	}
}
class CargoPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("CargoPlane require a long runway to take off");
	}
	@Override
	void fly() {
		System.out.println("CargoPlane flys at low heights");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry goods");
	}
}

class PassengerPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("PassengerPlane require a medium length runway to take off");
	}
	@Override
	void fly() {
		System.out.println("PassengerPlane flys at medium heights");
	}
	void carryHumans() {
		System.out.println("PassengerPlane carry Humans");
	}
}

class FighterPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("FighterPlane require a short runway to take off");
	}
	@Override
	void fly() {
		System.out.println("FighterPlane flys at greater heights");
	}
	void carryWeapons() {
		System.out.println("FighterPlane carry Weapons");
	}
}
class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class Example1 {
	public static void main(String args[]) {
		CargoPlane cp =new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Airport ap = new Airport();
		ap.permit(cp);
		cp.carryGoods();
		System.out.println("-----------");
		
		ap.permit(pp);
		pp.carryHumans();
		System.out.println("-----------");
		
		ap.permit(fp);
		fp.carryWeapons();
		System.out.println("-----------");
		
		Plane p2 = new Plane() {
			@Override
			void takeOff() {
				System.out.println("TakeOff");
			}
			@Override
			void fly() {
				System.out.println("Fly");
			}
		};
		
		p2.takeOff();
		p2.fly();
		p2.land();
	}
}
