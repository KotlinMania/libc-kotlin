package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd
import io.github.kotlinmania.libc.new.netbsd.sys.IpcPerm

import io.github.kotlinmania.libc.*

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: Int,
    val shmLpid: Int,
    val shmCpid: Int,
    val shmNattch: Short,
    val shmAtime: Long,
    val shmAtimensec: Long,
    val shmDtime: Long,
    val shmDtimensec: Long,
    val shmCtime: Long,
    val shmCtimensec: Long,
    val shmInternal: COpaquePointer?,
)
