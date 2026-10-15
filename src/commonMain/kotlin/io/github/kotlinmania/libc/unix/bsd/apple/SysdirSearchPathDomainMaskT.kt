// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public enum class SysdirSearchPathDomainMaskT(
    public val value: UInt,
) {
    SYSDIR_DOMAIN_MASK_USER(1u),
    SYSDIR_DOMAIN_MASK_LOCAL(2u),
    SYSDIR_DOMAIN_MASK_NETWORK(4u),
    SYSDIR_DOMAIN_MASK_SYSTEM(8u),
    SYSDIR_DOMAIN_MASK_ALL(65535u),
}
