public class Room {
    private final double temperatureMinLevel = 18;
    private double ambientTemperatureC;        // Celsius
    private double height;              // m
    private double surfaceArea;         // m^2
    private boolean isAirConditioner;   // true -> yes; false -> no

    public Room(double ambientTemperatureC, double height, double surfaceArea, boolean isAirConditioner) {
        this.ambientTemperatureC = ambientTemperatureC;
        this.height = height;
        this.surfaceArea = surfaceArea;
        this.isAirConditioner = isAirConditioner;
    }

    public boolean oneDegreeDown() {
        if (isAirConditioner) {
            ambientTemperatureC --;
            if (ambientTemperatureC > temperatureMinLevel) {
                return true;
            } else{
                ambientTemperatureC = temperatureMinLevel;
                return false;
            }
        } else {
            return false;
        }
    }

//    public boolean oneDegreeDown() {
//        if (isAirConditioner && ambientTemperatureC > temperatureMinLevel) {
//            ambientTemperatureC--;
//            return false;
//        } else {
//            return false;
//        }
//    }

    public double volume() {
        return getHeight() * getSurfaceArea();
    }

    private double getTemperatureMinLevel() {
        return temperatureMinLevel;
    }

    public double getAmbientTemperatureC() {
        return ambientTemperatureC;
    }

    private void setAmbientTemperatureC(double ambientTemperatureC) {
        this.ambientTemperatureC = ambientTemperatureC;
    }

    private double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private double getSurfaceArea() {
        return surfaceArea;
    }

    private void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    private boolean isAirConditioner() {
        return isAirConditioner;
    }

    private void setAirConditioner(boolean airConditioner) {
        isAirConditioner = airConditioner;
    }
}
