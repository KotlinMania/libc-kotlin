// port-lint: source unix/linux_like/android/b64/aarch64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b64.aarch64

import io.github.kotlinmania.libc.*

public data class UserFpsimdStruct(
    val vregs: List<ByteArray>,
    val fpsr: UInt,
    val fpcr: UInt,
)
