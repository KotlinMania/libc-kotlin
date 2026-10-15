// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public enum class ACTION(
    public val value: UInt,
) {
    FIND(0u),
    ENTER(1u),
}
