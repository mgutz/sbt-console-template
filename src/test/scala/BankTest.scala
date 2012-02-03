import org.scalatest.Spec
import org.scalatest.matchers.MustMatchers

import com.example.Bank

class BankSpec extends Spec with MustMatchers {
  describe("simple bank") {
    val bank = new Bank

    it("should start with zero balance") {
      bank.balance must be (0.0)
    }

    it("should allow deposits") {
      bank.deposit(100.0)
      bank.balance must be (100.0)
    }

    it("should allow withdrawals") {
      bank.withdraw(50.0)
      bank.balance must be (50.0)
    }

    it("should not allow account to be overdrawn") {
      evaluating { bank.withdraw(60.0) } must produce [IllegalArgumentException]
    }
  }
}
