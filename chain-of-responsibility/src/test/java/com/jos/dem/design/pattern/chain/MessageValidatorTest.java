package com.jos.dem.design.pattern.chain;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MessageValidatorTest {

  private MessageValidator validator = new MessageValidator()
  private Message message = new Message();

  @Test
  @DisplayName("should throw an exception message")
  void shouldValidateMessage() {
    assertThrows(BusinessException.class, () -> validator.processMessage(message));
  }

}