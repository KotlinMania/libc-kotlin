package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public enum class Dot3Vendors(
    public val value: UInt,
) {
    DOT3_VENDOR_AMD(1u),
    DOT3_VENDOR_INTEL(2u),
    DOT3_VENDOR_NATIONAL(4u),
    DOT3_VENDOR_FUJITSU(5u),
    DOT3_VENDOR_DIGITAL(6u),
    DOT3_VENDOR_WESTERN_DIGITAL(7u),
}
