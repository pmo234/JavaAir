public class Plane {
    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getPlaneWeight() {
        return planeType.getPlaneTypeWeight();
    }

    public int getPlaneCapacity() {
        return planeType.getPlaneTypeCapacity();
    }
}
