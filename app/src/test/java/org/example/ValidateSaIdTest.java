package org.example;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class ValidateSaIdTest {

    @Test
    void shouldReturnTrueForValidIdNumber() {
        assertTrue(ValidateSaId.isValidIdNumber("8001015009087"));
    }

    @Test
    void shouldReturnFalseForNullInput() {
        assertFalse(ValidateSaId.isValidIdNumber(null));
    }

    @Test
    void shouldReturnFalseForShortIdNumber() {
        assertFalse(ValidateSaId.isValidIdNumber("200101480008"));
    }

    @Test
    void shouldReturnFalseForLongIdNumber() {
        assertFalse(ValidateSaId.isValidIdNumber("20010148000867"));
    }

    @Test
    void shouldReturnFalseForNonNumericCharacters() {
        assertFalse(ValidateSaId.isValidIdNumber("20010A4800086"));
    }

    @Test
    void shouldReturnFalseForInvalidDate() {
        assertFalse(ValidateSaId.isValidIdNumber("0013014800086"));
    }

    @Test
    void shouldReturnFalseForInvalidCitizenshipDigit() {
        assertFalse(ValidateSaId.isValidIdNumber("2001014800286"));
    }

    @Test
    void shouldReturnFalseForInvalidChecksum() {
        assertFalse(ValidateSaId.isValidIdNumber("2001014800087"));
    }

    @Test
    void shouldReturnMaleForGenderDigits5000AndAbove() {
        assertEquals("Male", ValidateSaId.determineGender("8001015009087"));
    }

    @Test
    void shouldReturnFemaleForGenderDigitsBelow5000() {
        assertEquals("Female", ValidateSaId.determineGender("8001010009086"));
    }
}