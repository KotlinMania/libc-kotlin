// port-lint: source unix/linux_like/linux/gnu/b64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64

import io.github.kotlinmania.libc.*

public data class SemidDs(
    val semPerm: IpcPerm,
    val semOtime: Int,
    val semCtime: Int,
    val semNsems: ULong,
)
