// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun mount(src: String?, target: String?, flags: Int, data: COpaquePointer?, size: ULong): Int
