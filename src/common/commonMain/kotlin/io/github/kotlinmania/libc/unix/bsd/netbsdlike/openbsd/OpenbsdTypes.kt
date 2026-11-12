package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias ClockT = Long

public typealias SusecondsT = CLong

public typealias DevT = Int

public typealias SigsetT = CUint

public typealias BlksizeT = Int

public typealias FsblkcntT = ULong

public typealias FsfilcntT = ULong

public typealias IdtypeT = CUint

public typealias PthreadAttrT = MutPtr<CVoid>

public typealias PthreadMutexT = MutPtr<CVoid>

public typealias PthreadMutexattrT = MutPtr<CVoid>

public typealias PthreadCondT = MutPtr<CVoid>

public typealias PthreadCondattrT = MutPtr<CVoid>

public typealias PthreadRwlockT = MutPtr<CVoid>

public typealias PthreadRwlockattrT = MutPtr<CVoid>

public typealias PthreadSpinlockT = UintptrT

public typealias CaddrT = MutPtr<CChar>

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

public typealias Action = CUint

// spawn.h
public typealias PosixSpawnattrT = MutPtr<CVoid>

public typealias PosixSpawnFileActionsT = MutPtr<CVoid>

public typealias ElfAddr = Elf64Addr

public typealias ElfHalf = Elf64Half

public typealias ElfPhdr = Elf64Phdr
