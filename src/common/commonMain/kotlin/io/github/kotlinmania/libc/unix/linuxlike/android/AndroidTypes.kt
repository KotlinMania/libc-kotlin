package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE

public fun interface FnCallback {
    public operator fun invoke(arg0: COpaquePointer?): CInt
}

public fun interface FnCallback1 {
    public operator fun invoke(pi: COpaquePointer?, cookie: COpaquePointer?)
}

public fun interface FnCallback2 {
    public operator fun invoke(info: COpaquePointer?, size: ULong, data: COpaquePointer?): CInt
}

// Most `* _SUPER_MAGIC` constants are defined at the `linuxLike` level; the
// following are only available on newer Linux versions than the versions
// currently used in CI in some configurations, so we define them here.
public typealias Ioctl = CInt

public typealias ClockT = CLong

public typealias TimeT = CLong

public typealias SusecondsT = CLong

public typealias OffT = CLong

public typealias BlkcntT = CUlong

public typealias BlksizeT = CUlong

public typealias NlinkT = UInt

public typealias PthreadT = CLong

public typealias PthreadMutexattrT = CLong

public typealias PthreadRwlockattrT = CLong

public typealias PthreadBarrierattrT = CInt

public typealias PthreadCondattrT = CLong

public typealias PthreadKeyT = CInt

public typealias FsfilcntT = CUlong

public typealias FsblkcntT = CUlong

public typealias NfdsT = CUint

public typealias RlimT = CUlong

public typealias DevT = CUlong

public typealias InoT = CUlong

public typealias Ino64T = ULong

public typealias CpuBittype = CUlong

public typealias IdtypeT = CInt

public typealias LoffT = CLonglong

public typealias KernelLoffT = CLonglong

public typealias KernelPidT = CInt

public typealias U8 = CUchar

public typealias U16 = CUshort

public typealias S16 = CShort

public typealias U32 = CUint

public typealias S32 = CInt

// linux/elf.h
public typealias Elf32Addr = UInt

public typealias Elf32Half = UShort

public typealias Elf32Off = UInt

public typealias Elf32Word = UInt

public typealias Elf64Addr = ULong

public typealias Elf64Half = UShort

public typealias Elf64Off = ULong

public typealias Elf64Word = UInt

public typealias Elf64Xword = ULong

public typealias EventfdT = ULong

// these structs sit behind a heap allocation on Android
public typealias PosixSpawnFileActionsT = COpaquePointer?

public typealias PosixSpawnattrT = COpaquePointer?
