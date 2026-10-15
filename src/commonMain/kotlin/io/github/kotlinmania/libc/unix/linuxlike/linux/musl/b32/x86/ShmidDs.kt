package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.x86

import io.github.kotlinmania.libc.*

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtimeLo: ULong,
    val shmAtimeHi: ULong,
    val shmDtimeLo: ULong,
    val shmDtimeHi: ULong,
    val msgCtimeLo: ULong,
    val msgCtimeHi: ULong,
    val shmAtime: Long,
    val shmDtime: Long,
    val shmCtime: Long,
    val shmCpid: Int,
    val shmLpid: Int,
    val shmNattch: ULong,
    val pad3: ULong,
    val shmAtime2: Long,
    val shmDtime2: Long,
    val shmCtime2: Long,
)
