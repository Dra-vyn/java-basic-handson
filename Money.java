// Money.java

public class Money {
  final int value;

  Money(int value) {
    this.value = value;
  }

  Money add(Money rupee) {
    return new Money(this.value + rupee.value);
  }

  Money minus(Money rupee) {
    return new Money(this.value - rupee.value);
  }
} 