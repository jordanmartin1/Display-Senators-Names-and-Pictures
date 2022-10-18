import java.util.Collections;
import java.util.List;

public class AlphabeticalPrinter implements SenatorListPrinter{
    
    public void print(List<Senator> senators) {
        Collections.sort(senators,(s1, s2) -> {
            return s1.orderableName().compareToIgnoreCase(s2.orderableName());
        });
        
        for (int i = 0; i < senators.size(); i++) {
            System.out.printf("%s (%s-%s)\n", senators.get(i).getFullName(), senators.get(i).getParty(), senators.get(i).getState());
        }
        
        
        
    }

}
