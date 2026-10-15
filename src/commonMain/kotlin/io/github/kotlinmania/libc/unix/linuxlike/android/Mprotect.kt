// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int
