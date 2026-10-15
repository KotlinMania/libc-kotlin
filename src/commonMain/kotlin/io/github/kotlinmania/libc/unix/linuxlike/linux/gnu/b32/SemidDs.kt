// port-lint: source unix/linux_like/linux/gnu/b32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32

import io.github.kotlinmania.libc.*

public data class SemidDs(
    val semPerm: IpcPerm,
    val semOtime: Long,
    val semCtime: Long,
    val semNsems: ULong,
)
