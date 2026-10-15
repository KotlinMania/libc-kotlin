// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun mount(src: String?, target: String?, flags: Int, data: COpaquePointer?): Int
