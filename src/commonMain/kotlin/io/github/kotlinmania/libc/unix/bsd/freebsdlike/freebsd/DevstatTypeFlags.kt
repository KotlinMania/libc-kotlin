// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public enum class DevstatTypeFlags(
    public val value: UInt,
) {
    DEVSTAT_TYPE_DIRECT(0u),
    DEVSTAT_TYPE_SEQUENTIAL(1u),
    DEVSTAT_TYPE_PRINTER(2u),
    DEVSTAT_TYPE_PROCESSOR(3u),
    DEVSTAT_TYPE_WORM(4u),
    DEVSTAT_TYPE_CDROM(5u),
    DEVSTAT_TYPE_SCANNER(6u),
    DEVSTAT_TYPE_OPTICAL(7u),
    DEVSTAT_TYPE_CHANGER(8u),
    DEVSTAT_TYPE_COMM(9u),
    DEVSTAT_TYPE_ASC0(10u),
    DEVSTAT_TYPE_ASC1(11u),
    DEVSTAT_TYPE_STORARRAY(12u),
    DEVSTAT_TYPE_ENCLOSURE(13u),
    DEVSTAT_TYPE_FLOPPY(14u),
    DEVSTAT_TYPE_MASK(15u),
    DEVSTAT_TYPE_IF_SCSI(16u),
    DEVSTAT_TYPE_IF_IDE(32u),
    DEVSTAT_TYPE_IF_OTHER(48u),
    DEVSTAT_TYPE_IF_MASK(240u),
    DEVSTAT_TYPE_PASS(256u),
}
