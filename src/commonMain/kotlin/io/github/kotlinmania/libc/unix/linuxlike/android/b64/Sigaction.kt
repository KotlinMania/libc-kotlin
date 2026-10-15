// port-lint: source unix/linux_like/android/b64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saFlags: Int,
    val saSigaction: ULong,
    val saMask: SigsetT,
    val saRestorer: (() -> Unit)?,
)
