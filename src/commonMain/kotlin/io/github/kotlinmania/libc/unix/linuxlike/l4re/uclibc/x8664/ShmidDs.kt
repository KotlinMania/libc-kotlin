package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.x8664
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.IpcPerm

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
    val unused4: ULong,
    val unused5: ULong,
)
