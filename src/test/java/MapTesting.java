import org.example.Map;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MapTesting {
    private Map map = new Map(1);

    @Test
    public void testIsInMapWidth(){
        int value = 32;
        int result = map.getWidth();
        Assertions.assertTrue(value < result);
    }
    @Test
    public void testIsAvailable(){
        boolean result = map.isAvailable(15, 3);
        Assertions.assertTrue(result);
    }
    @Test
    public void testIsBlock(){
        boolean result = map.isBlockHitBox(15,3);
        Assertions.assertFalse(result);
    }
}
