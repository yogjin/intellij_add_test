import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AccountTest {

    private Account account;

    @Before
    public void setup(){
        this.account = new Account();
    }

    @Test
    public void NewAccountMakingTest(){//첫 잔액은 0원.
        Account account = new Account();
        account.getBalance();
        assertThat(account.getBalance(),is(0));
    }
    @Test
    public void DepositTest(){//예금테스트
        Account account = new Account();

        account.deposit(10000);
        assertThat(account.getBalance(),is(10000));
    }
    @Test
    public void WithdrawTest(){
        Account account = new Account();
        account.deposit(2000);
        assertThat(account.getBalance(),is(2000));
        account.withdraw(1000);
        assertThat(account.getBalance(),is(1000));
    }
    @Test(expected = IllegalArgumentException.class)
    public void CanNotWithdrawWhenBalanceIsLack(){
        Account account = new Account();
        account.deposit(500);
        account.withdraw(1000);
        
    }
}
