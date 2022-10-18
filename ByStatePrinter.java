import java.util.Collections;
import java.util.List;

public class ByStatePrinter implements SenatorListPrinter{
    public void print(List<Senator> senators) {
        
        Collections.sort(senators,(s1, s2) -> {
            return s1.orderableName().compareToIgnoreCase(s2.orderableName());
        });
        
        Collections.sort(senators,(s1, s2) -> {
            return s1.getState().compareToIgnoreCase(s2.getState());
        });
        
        
            
        
        String current = senators.get(0).getState();
        System.out.printf("%s:\n", senators.get(0).getState());
        for (int i = 0; i < senators.size(); i++) {
            if (!senators.get(i).getState().equals(current)) {
                System.out.printf("%s:\n", senators.get(i).getState());
                current  = senators.get(i).getState();
            }
 
            System.out.printf("   %s (%s)\n", senators.get(i).getFullName(), senators.get(i).getParty());
        }
        
        

    }
}

            
            
          

