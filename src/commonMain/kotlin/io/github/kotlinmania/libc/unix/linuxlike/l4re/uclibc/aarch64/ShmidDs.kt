// port-lint: source unix/linux_like/l4re/uclibc/aarch64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64

import io.github.kotlinmania.libc.*

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: Long,
    val unused1: ULong,
    val shmDtime: Long,
    val unused2: ULong,
    val shmCtime: Long,
    val unused3: ULong,
    val shmCpid: Int,
    val shmLpid: Int,
    val shmNattch: UShort,
    val unused4: ULong,
    val unused5: ULong,
)
