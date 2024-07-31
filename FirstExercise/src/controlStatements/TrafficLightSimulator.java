package controlStatements;

//Q: Traffic Light Simulator:
	//• Ask the user for a traffic light color (red, yellow, green).
	//• Display corresponding instructions (e.g., "Stop" for red).

public class TrafficLightSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String trafficLightColor = "Green"; // Example: "red" for Stop

        // Display the corresponding instructions
        switch (trafficLightColor.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Caution");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Error: Invalid traffic light color.");
                break;
        }

	}

}
