// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class InputKeymapEntry(
    val flags: UByte,
    val len: UByte,
    val index: UShort,
    val keycode: UInt,
    val scancode: List<UByte>,
)
