package liskov_substitution.good;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

class BankingAppWithdrawalServiceTest {

    @Test
    public void itShouldForwardCallToAccount() {
        final var currentAccountMock = mock(CurrentAccount.class);
        final var bankingAppWithdrawalService = new BankingAppWithdrawalService(currentAccountMock);
        bankingAppWithdrawalService.withdraw(BigDecimal.TEN);
        verify(currentAccountMock).withdraw(BigDecimal.TEN);
        verifyNoMoreInteractions(currentAccountMock);
    }

}