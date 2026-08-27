// port-lint: tests libc/src/new/common/posix/unistd.rs
package io.github.kotlinmania.libc.new.common.posix

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Tests for the POSIX `unistd.h` file-descriptor constants ported from
 * `tmp/libc/src/new/common/posix/unistd.rs`. The upstream Rust file is
 * three `pub const` declarations and has no `#[cfg(test)]` module, so
 * these tests are Kotlin-side smoke checks that the constants compile
 * to the values defined by POSIX (which is the only invariant the
 * upstream `unistd.h` headers expose).
 */
class UnistdTest {
    @Test
    fun stdinFilenoIsZero() {
        assertEquals(0, STDIN_FILENO)
    }

    @Test
    fun stdoutFilenoIsOne() {
        assertEquals(1, STDOUT_FILENO)
    }

    @Test
    fun stderrFilenoIsTwo() {
        assertEquals(2, STDERR_FILENO)
    }
}
