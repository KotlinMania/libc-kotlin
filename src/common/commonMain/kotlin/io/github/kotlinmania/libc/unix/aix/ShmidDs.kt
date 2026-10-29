package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmLpid: Int,
    val shmCpid: Int,
    val shmNattch: ULong,
    val shmCnattch: ULong,
    val shmAtime: Long,
    val shmDtime: Long,
    val shmCtime: Long,
    val shmHandle: UInt,
    val shmExtshm: Int,
    val shmPagesize: Long,
    val shmLba: ULong,
)
