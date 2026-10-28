package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public enum class DevstatTagType(
    public val value: UInt,
) {
    DEVSTAT_TAG_SIMPLE(0u),
    DEVSTAT_TAG_HEAD(1u),
    DEVSTAT_TAG_ORDERED(2u),
    DEVSTAT_TAG_NONE(3u),
}
