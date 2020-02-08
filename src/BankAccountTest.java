import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void test() {
        BankAccount checking = new BankAccount("checking", "150.00");
        assertEquals("checking: $150.00", checking.getAccountDetails());
    }

}