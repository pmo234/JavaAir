public class Pilot {
    private String name;
    private Rank rank;
    private String pilotLicenceNumber;

    public Pilot(String name, Rank rank, String pilotLicenceNumber) {
        this.name = name;
        this.rank = rank;
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getName() {
        return this.name;
    }

    public Rank getRank() {
        return this.rank;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }

    public String canFlyPlane() {
        if(this.rank == Rank.Captain){
            return "You can fly";
        }
        return "You can not fly";
    }
}
