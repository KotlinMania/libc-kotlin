// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong
