import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    public void everyStatementTest() {
        IllegalArgumentException ex;

        ex = assertThrows(IllegalArgumentException.class, ()->SILab2.function(Collections.emptyList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, ()->SILab2.function(createList("0","#","0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        List<String> list=createList("2","#","2","#","4","#","2","#","2");
        assertEquals(list,SILab2.function(createList("0","#","0","#","0","#","0","#","0")));

    }
    @Test
    public void everyBranchTest() {
        IllegalArgumentException ex;

        ex = assertThrows(IllegalArgumentException.class, ()->SILab2.function(Collections.emptyList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, ()->SILab2.function(createList("0","#","0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        List<String> list=createList("2","#","2","#","4","#","2","#","2");
        assertEquals(list,SILab2.function(createList("0","#","0","#","0","#","0","#","0")));

        list=createList("1","1","1","#","#","#","2","#","2");
        assertEquals(list,SILab2.function(createList("0","0","0","#","#","#","0","#","0")));

    }

}