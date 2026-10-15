// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmLpid: Int,
    val shmCpid: Int,
    val shmNattch: UShort,
    val shmAtime: Long,
    val shmDtime: Long,
    val shmCtime: Long,
    val shmInternal: COpaquePointer?,
)
