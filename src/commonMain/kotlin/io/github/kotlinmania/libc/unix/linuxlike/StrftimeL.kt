// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun strftimeL(s: String?, max: ULong, format: String?, tm: Tm?, locale: io.github.kotlinmania.libc.COpaquePointer?): ULong
