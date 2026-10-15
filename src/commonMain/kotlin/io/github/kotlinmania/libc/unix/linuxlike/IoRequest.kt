// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

internal fun ioRequest(ty: UInt, nr: UInt): Int = (
    (_IOC_NONE.toInt() shl _IOC_DIRSHIFT) or
        (ty.toInt() shl _IOC_TYPESHIFT) or
        (nr.toInt() shl _IOC_NRSHIFT)
)
