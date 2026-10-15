// port-lint: source unix/bsd/freebsdlike/dragonfly/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public enum class Procstat(
    public val value: UInt,
) {
    SIDL(1u),
    SACTIVE(2u),
    SSTOP(3u),
    SZOMB(4u),
    SCORE(5u),
}
