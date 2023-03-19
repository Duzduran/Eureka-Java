
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LC1472_Test {

    @Test
    public void testVisit() {
        LC1472_DesignBrowserHistory history = new LC1472_DesignBrowserHistory("google.com");
        history.visit("yahoo.com");
        history.visit("google.com");
        assertEquals("yahoo.com", history.back(1));
    }

    @Test
    public void testBack() {
        LC1472_DesignBrowserHistory history = new LC1472_DesignBrowserHistory("google.com");
        history.visit("yahoo.com");
        history.visit("amazon.com");
        assertEquals("yahoo.com", history.back(1));
        assertEquals("google.com", history.back(1));
    }

    @Test
    public void testForward() {
        LC1472_DesignBrowserHistory history = new LC1472_DesignBrowserHistory("google.com");
        history.visit("yahoo.com");
        history.visit("amazon.com");
        history.back(2);
        assertEquals("yahoo.com", history.forward(1));
    }
}
