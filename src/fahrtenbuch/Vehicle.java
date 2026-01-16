package fahrtenbuch;

public abstract class Vehicle {
    private final int vehicleId;
    private final VehicleType vehicleType;
    private final String licensePlate;
    private final String manufacturer;
    private final String model;

    public Vehicle(int vehicleId, VehicleType vehicleType, String licensePlate, String manufacturer, String model) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

}
