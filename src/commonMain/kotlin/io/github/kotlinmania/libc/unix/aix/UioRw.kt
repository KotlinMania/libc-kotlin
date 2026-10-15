// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public enum class UioRw(
    public val value: UInt,
) {
    UIO_READ(0u),
    UIO_WRITE(1u),
    UIO_READ_NO_MOVE(2u),
    UIO_WRITE_NO_MOVE(3u),
    UIO_PWRITE(4u),
}
