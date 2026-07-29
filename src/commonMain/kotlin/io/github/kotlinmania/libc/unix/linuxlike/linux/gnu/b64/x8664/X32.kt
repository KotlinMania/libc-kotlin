// port-lint: source unix/linux_like/linux/gnu/b64/x86_64/x32.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*

public data class Statvfs(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFavail: FsfilcntT,
    val fFsid: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fSpare: IntArray,
)

public const val __X32_SYSCALL_BIT: CLong = 0x40000000
