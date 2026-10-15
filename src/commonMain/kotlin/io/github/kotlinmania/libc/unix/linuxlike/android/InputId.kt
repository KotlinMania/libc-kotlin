// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class InputId(
    val bustype: UShort,
    val vendor: UShort,
    val product: UShort,
    val version: UShort,
)
