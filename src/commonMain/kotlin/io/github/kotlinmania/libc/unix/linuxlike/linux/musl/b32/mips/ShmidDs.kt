// port-lint: source unix/linux_like/linux/musl/b32/mips/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.mips

import io.github.kotlinmania.libc.*

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: Long,
    val shmDtime: Long,
    val shmCtime: Long,
    val shmCpid: Int,
    val shmLpid: Int,
    val shmNattch: ULong,
    val shmAtime2: Long,
    val shmDtime2: Long,
    val shmCtime2: Long,
)
