public class Volume{
	public static double FindVolumeOfEarth(double radius, double pi){
		//Function to find the volume of the earth using formula 
		return (4.0/3.0) * pi * Math.pow(radius, 3);
		
	}
	public static void main(String[] args){
		double RadiusInKm=6378;
		//Convert km to miles 
		double KmToMiles = RadiusInKm * 0.621371;
		double pi = Math.PI;
		//volume in Kilometers
		double VolumeKm = FindVolumeOfEarth(RadiusInKm, pi);
		//volume in Miles
		double VolumeMiles = FindVolumeOfEarth(KmToMiles, pi);
		System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",VolumeKm,VolumeMiles);
	}
}