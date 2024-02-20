package com.lowagie.text.pdf;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LayoutProcessorTest {

    @Test
    void testEnable() {
        LayoutProcessor.enable();
        assertTrue(LayoutProcessor.isEnabled());
    }

    @Test
    void testDisable() {
        LayoutProcessor.disable();
        assertFalse(LayoutProcessor.isEnabled());
        assertThat(LayoutProcessor.getFlags()).isEqualTo(-1);
    }

}
