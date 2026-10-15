// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public enum class DevstatTransFlags(
    public val value: UInt,
) {
    DEVSTAT_NO_DATA(0u),
    DEVSTAT_READ(1u),
    DEVSTAT_WRITE(2u),
    DEVSTAT_FREE(3u),
}
