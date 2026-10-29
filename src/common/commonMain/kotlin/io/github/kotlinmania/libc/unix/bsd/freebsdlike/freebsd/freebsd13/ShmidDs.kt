package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IpcPerm

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmLpid: Int,
    val shmCpid: Int,
    val shmNattch: UInt,
    val shmAtime: Long,
    val shmDtime: Long,
    val shmCtime: Long,
)
