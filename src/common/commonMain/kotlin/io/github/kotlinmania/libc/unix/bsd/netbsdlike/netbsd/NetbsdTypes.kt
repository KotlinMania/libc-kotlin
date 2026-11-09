package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.aarch64.CpuSimpleLockNvT

public typealias BlksizeT = Int

public typealias EventfdT = ULong

public typealias FsblkcntT = ULong

public typealias FsfilcntT = ULong

public typealias IdtypeT = CInt

public typealias PthreadSpinT = CpuSimpleLockNvT

public typealias ShmattT = CUint

public typealias CpusetT = Cpuset

// elf.h
public typealias Elf32Addr = UInt

public typealias Elf32Half = UShort

public typealias Elf32Lword = ULong

public typealias Elf32Off = UInt

public typealias Elf32Sword = Int

public typealias Elf32Word = UInt

public typealias Elf64Addr = ULong

public typealias Elf64Half = UShort

public typealias Elf64Lword = ULong

public typealias Elf64Off = ULong

public typealias Elf64Sword = Int

public typealias Elf64Sxword = Long

public typealias Elf64Word = UInt

public typealias Elf64Xword = ULong

public typealias IconvT = COpaquePointer?

public enum class FaeAction(public val value: UInt) {
    FAE_OPEN(0u),
    FAE_DUP2(1u),
    FAE_CLOSE(2u),
}

public class Cpuset(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}

public typealias ElfAddr = Elf64Addr

public typealias ElfHalf = Elf64Half

public typealias ElfPhdr = Elf64Phdr
