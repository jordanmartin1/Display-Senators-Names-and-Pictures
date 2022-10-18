import java.net.URL;

public class Senator {
    private String firstName;
    private String lastName;
    private String stateFrom;
    private String partyRunning;
    private URL URL;
    
    public Senator(String first, String last, String state, String party, URL photoURL) {
        this.firstName = first;
        this.lastName = last;
        this.stateFrom = state;
        this.partyRunning = party;
        this.URL = photoURL;
    }
    
    public String orderableName() {
        return this.lastName + ", " + this.firstName;
    }
    
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    
    public String getFirst() {
        return this.firstName;
    }
    
    public String getLast() {
        return this.lastName;
    }
    
    public String getState() {
        return this.stateFrom;
    }
    
    public String getParty() {
        return this.partyRunning;
    }
    
    public URL getPhotoURL() {
        return this.URL;
    }

}
