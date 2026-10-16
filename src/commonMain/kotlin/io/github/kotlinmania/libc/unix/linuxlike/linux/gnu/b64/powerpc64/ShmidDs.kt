package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.*

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmAtime: Long,
    val shmDtime: Long,
    val shmCtime: Long,
    val shmSegsz: ULong,
    val shmCpid: Int,
    val shmLpid: Int,
    val shmNattch: UShort,
)
