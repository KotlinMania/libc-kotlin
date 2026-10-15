// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public enum class TpacketVersions(
    public val value: UInt,
) {
    TPACKET_V1(0u),
    TPACKET_V2(1u),
    TPACKET_V3(2u),
}
