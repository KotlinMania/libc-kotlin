// port-lint: source unix/bsd/freebsdlike/dragonfly/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public enum class Lwpstat(
    public val value: UInt,
) {
    LSRUN(1u),
    LSSTOP(2u),
    LSSLEEP(3u),
}
