package inheritance;

class Appliance {
    void powerOn() {
        System.out.println("Appliance is powered on.");
    }
}

class WashingMachine extends Appliance {
    void washClothes() {
        System.out.println("Washing clothes...");
    }
}

class SmartWashingMachine extends WashingMachine {
    void connectToWiFi() {
        System.out.println("Smart machine connected to WiFi.");
    }
}


public class MiltiLevelInheritence2 {

	public static void main(String[] args) {

		 SmartWashingMachine sm = new SmartWashingMachine();
	        sm.powerOn();         // from Appliance
	        sm.washClothes();     // from WashingMachine
	        sm.connectToWiFi();   // from SmartWashingMachine

	}

}
