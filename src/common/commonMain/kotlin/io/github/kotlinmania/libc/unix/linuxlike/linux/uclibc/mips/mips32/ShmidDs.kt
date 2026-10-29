package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: Int,
    val shmDtime: Int,
    val shmCtime: Int,
    val shmCpid: Int,
    val shmLpid: Int,
    val shmNattch: UShort,
)
