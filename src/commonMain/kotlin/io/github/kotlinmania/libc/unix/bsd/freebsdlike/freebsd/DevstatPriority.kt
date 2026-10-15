// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public enum class DevstatPriority(
    public val value: UInt,
) {
    DEVSTAT_PRIORITY_MIN(0u),
    DEVSTAT_PRIORITY_OTHER(32u),
    DEVSTAT_PRIORITY_PASS(48u),
    DEVSTAT_PRIORITY_FD(64u),
    DEVSTAT_PRIORITY_WFD(80u),
    DEVSTAT_PRIORITY_TAPE(96u),
    DEVSTAT_PRIORITY_CD(144u),
    DEVSTAT_PRIORITY_DISK(272u),
    DEVSTAT_PRIORITY_ARRAY(288u),
    DEVSTAT_PRIORITY_MAX(4095u),
}
