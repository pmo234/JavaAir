public enum PlaneType {
    BOEING747(3,53),
    BOEING737(1,43),
    AIRBUSA320(5,10),
    AIRBUSA220(7,1430);
    private final int capacity;
    private final int weightInTonnes;

    PlaneType(int capacity, int weightInTonnes) {
        this.capacity = capacity;
        this.weightInTonnes = weightInTonnes;
    }

    public int getPlaneTypeWeight() {
        return this.weightInTonnes;
    }

    public int getPlaneTypeCapacity() {
        return this.capacity;
    }
}
