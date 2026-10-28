package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public enum class DevstatMatchFlags(
    public val value: UInt,
) {
    DEVSTAT_MATCH_NONE(0u),
    DEVSTAT_MATCH_TYPE(1u),
    DEVSTAT_MATCH_IF(2u),
    DEVSTAT_MATCH_PASS(4u),
}
