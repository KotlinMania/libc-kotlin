// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun creat64(path: String?, mode: UInt): Int
