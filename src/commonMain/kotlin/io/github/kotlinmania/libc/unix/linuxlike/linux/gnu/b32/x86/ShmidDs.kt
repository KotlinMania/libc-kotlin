// port-lint: source unix/linux_like/linux/gnu/b32/x86/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: Long,
    val shmDtime: Long,
    val shmCtime: Long,
    val shmCpid: Int,
    val shmLpid: Int,
    val shmNattch: UShort,
)
