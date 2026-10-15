// port-lint: source unix/linux_like/linux/gnu/b64/loongarch64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.loongarch64

import io.github.kotlinmania.libc.*

public data class UserFpStruct(
    val fpr: ULongArray,
    val fcc: ULong,
    val fcsr: UInt,
)
