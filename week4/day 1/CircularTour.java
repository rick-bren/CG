
public class CircularTour {

    public static int canCompleteCircuit(int[] petrol, int[] distance) {
        int totalPetrol = 0;
        int totalDistance = 0;
        int start = 0;
        int currentSurplus = 0;

        for (int i = 0; i < petrol.length; i++) {
            totalPetrol += petrol[i];
            totalDistance += distance[i];

            currentSurplus += petrol[i] - distance[i];

            // If we run out of fuel, reset the start point to the next pump
            if (currentSurplus < 0) {
                start = i + 1;
                currentSurplus = 0;
            }
        }

        return (totalPetrol >= totalDistance) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol =   {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = canCompleteCircuit(petrol, distance);
        if (start == -1) {
            System.out.println("No possible starting point.");
        } else {
            System.out.println("Start at petrol pump index: " + start);
        }
    }
}

