package Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void testCreateAccountAndDeposit() {
        Account acc = new Account("John", "Doe", "1234");
        assertTrue(acc.deposit(1000));
        assertEquals(1000, acc.getBalance("1234"));
    }

    @Test
    public void testWithdrawSuccess() {
        Account acc = new Account("Jane", "Doe", "4321");
        acc.deposit(500);
        assertTrue(acc.withdraw(200, "4321"));
        assertEquals(300, acc.getBalance("4321"));
    }

    @Test
    public void testWithdrawInvalidPin() {
        Account acc = new Account("Jane", "Doe", "4321");
        acc.deposit(500);
        assertFalse(acc.withdraw(200, "1111"));
    }

    @Test
    public void testTransferSuccess() {
        Account sender = new Account("A", "B", "1234");
        Account receiver = new Account("C", "D", "5678");
        sender.deposit(500);
        assertTrue(sender.transfer(receiver, 200, "1234"));
        assertEquals(300, sender.getBalance("1234"));
        assertEquals(200, receiver.getBalance("5678"));
    }

    @Test
    public void testChangePin() {
        Account acc = new Account("User", "X", "9999");
        assertTrue(acc.changePin("9999", "0000"));
        assertEquals(0, acc.getBalance("0000"));
    }

    @Test
    public void testCloseAccount() {
        Account acc = new Account("User", "Y", "1234");
        assertTrue(acc.closeAccount("1234"));
        assertFalse(acc.isActive());
    }

    @Test
    public void testGetBalanceWithInvalidPinThrowsException() {
        Account acc = new Account("User", "Z", "2468");
        acc.deposit(100);
        assertThrows(SecurityException.class, () -> acc.getBalance("0000"));
    }
}

