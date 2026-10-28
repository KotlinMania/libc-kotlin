package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public enum class DevstatSupportFlags(
    public val value: UInt,
) {
    DEVSTAT_ALL_SUPPORTED(0u),
    DEVSTAT_NO_BLOCKSIZE(1u),
    DEVSTAT_NO_ORDERED_TAGS(2u),
    DEVSTAT_BS_UNAVAILABLE(4u),
}
