package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias ModeT = UShort

public typealias PthreadAttrT = MutPtr<CVoid>

public typealias RlimT = Long

public typealias PthreadMutexT = MutPtr<CVoid>

public typealias PthreadMutexattrT = MutPtr<CVoid>

public typealias PthreadCondT = MutPtr<CVoid>

public typealias PthreadCondattrT = MutPtr<CVoid>

public typealias PthreadRwlockT = MutPtr<CVoid>

public typealias PthreadRwlockattrT = MutPtr<CVoid>

public typealias PthreadKeyT = CInt

public typealias TcflagT = CUint

public typealias SpeedT = CUint

public typealias NlItem = CInt

public typealias IdT = Long

public typealias VmSizeT = UintptrT

public typealias KeyT = CLong

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

public typealias IconvT = MutPtr<CVoid>

// It's an alias over "struct __kvm_t". However, its fields aren't supposed to be used directly,
// making the type definition system dependent. Better not bind it exactly.
public typealias KvmT = CVoid

public typealias PosixSpawnattrT = MutPtr<CVoid>

public typealias PosixSpawnFileActionsT = MutPtr<CVoid>

// link.h
public typealias ElfAddr = Elf64Addr

public typealias ElfHalf = Elf64Half

public typealias ElfPhdr = Elf64Phdr

public class Timezone(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}
