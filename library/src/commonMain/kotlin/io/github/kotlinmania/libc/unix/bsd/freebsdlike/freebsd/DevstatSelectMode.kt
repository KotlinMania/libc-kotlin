package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public enum class DevstatSelectMode(
    public val value: UInt,
) {
    DS_SELECT_ADD(0u),
    DS_SELECT_ONLY(1u),
    DS_SELECT_REMOVE(2u),
    DS_SELECT_ADDONLY(3u),
}
