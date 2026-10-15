// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public enum class FaeAction(
    public val value: Int,
) {
    FAE_OPEN(0),
    FAE_DUP2(1),
    FAE_CLOSE(2),
}
