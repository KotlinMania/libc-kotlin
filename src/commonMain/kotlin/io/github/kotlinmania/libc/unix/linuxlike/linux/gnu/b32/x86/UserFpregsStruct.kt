// port-lint: source unix/linux_like/linux/gnu/b32/x86/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*

public data class UserFpregsStruct(
    val cwd: Long,
    val swd: Long,
    val twd: Long,
    val fip: Long,
    val fcs: Long,
    val foo: Long,
    val fos: Long,
    val stSpace: LongArray,
)
