package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class EuclidTest {
  @Test
  void gcdInt() {
    assertAll(
        () -> assertEquals(6791, Euclid.gcd(38593253, 53777929)),
        () -> assertEquals(6791, Euclid.gcd(53777929, 38593253)),
        () -> assertEquals(53777929, Euclid.gcd(0, 53777929)),
        () -> assertEquals(6791, Euclid.gcd(-38593253, 53777929)),
        () -> assertEquals(38593253, Euclid.gcd(38593253, 0)),
        () -> assertEquals(1, Euclid.gcd(38593253, 1)),
        () -> assertEquals(1, Euclid.gcd(1, 53777929)),
        () -> assertNotEquals(5, Euclid.gcd(7, 9))
    );

    assertEquals(6791, Euclid.gcd(38593253, 53777929));
    assertEquals(6791, Euclid.gcd(-38593253, 53777929));
    assertEquals(6791, Euclid.gcd(53777929, 38593253));
    assertEquals(53777929, Euclid.gcd(53777929, 0));
    assertEquals(38593253, Euclid.gcd(38593253, 0));

  }

  @Test
  void gcdLong() {
    assertAll(
        () -> assertEquals(6791, Euclid.gcd(38593253, 53777929)),
        () -> assertEquals(6791, Euclid.gcd(53777929, 38593253)),
        () -> assertEquals(53777929, Euclid.gcd(0, 53777929)),
        () -> assertEquals(6791, Euclid.gcd(-38593253, 53777929)),
        () -> assertEquals(38593253, Euclid.gcd(38593253, 0)),
        () -> assertEquals(1, Euclid.gcd(38593253, 1)),
        () -> assertEquals(1, Euclid.gcd(1, 53777929))
    );

    assertEquals(6791, Euclid.gcd(38593253, 53777929));
    assertEquals(6791, Euclid.gcd(-38593253, 53777929));
    assertEquals(6791, Euclid.gcd(53777929, 38593253));
    assertEquals(53777929, Euclid.gcd(53777929, 0));
    assertEquals(38593253, Euclid.gcd(38593253, 0));
  }
}