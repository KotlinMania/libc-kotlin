// port-lint: source unix/linux_like/android/b32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*

public data class Rlimit64(
    val handle: Long = 0L,
    val rlimCur: ULong,
    val rlimMax: ULong,
)
