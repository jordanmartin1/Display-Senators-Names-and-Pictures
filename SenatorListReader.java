import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SenatorListReader {
    static List<Senator> readSenatorList(InputStream input) throws IOException {      
        //this method must read a JSON-formatted list of senators
        //from the given stream and return it as a list
        

        List<Senator> senators = new ArrayList<Senator>();
        Senator currentSenator;
        String first;
        String last;
        String state;
        String party;
        String URL;
        
        ObjectMapper mapper = new ObjectMapper();
        JsonNode tree = mapper.readTree(input);
        
        
        int i = 0;
        while (tree.has(i)) {
            first = tree.get(i).get("first").asText();
            last = tree.get(i).get("last").asText();
            state = tree.get(i).get("state").asText();
            party = tree.get(i).get("party").asText();
            
            if (tree.get(i).has("photo_url")) {
                URL = tree.get(i).get("photo_url").asText();
                URL newURL = new URL(URL);
                currentSenator = new Senator(first, last, state, party, newURL);
                
            } else {
                currentSenator = new Senator(first, last, state, party, null);
                
            }

            senators.add(currentSenator);
            i++;
        }
        
        return senators;
    }
}
