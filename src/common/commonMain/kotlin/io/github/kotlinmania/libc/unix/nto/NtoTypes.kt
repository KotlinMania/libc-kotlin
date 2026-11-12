package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias ClockT = UInt

public typealias SaFamilyT = UByte

public typealias SpeedT = CUint

public typealias TcflagT = CUint

public typealias ClockidT = CInt

public typealias TimerT = CInt

public typealias KeyT = CUint

public typealias IdT = CInt

public typealias UsecondsT = UInt

public typealias DevT = UInt

public typealias SocklenT = UInt

public typealias ModeT = UInt

public typealias Rlim64T = ULong

public typealias MqdT = CInt

public typealias NfdsT = CUint

public typealias IdtypeT = CUint

public typealias ErrnoT = CInt

public typealias RsizeT = CUlong

public typealias Elf32Half = UShort

public typealias Elf32Word = UInt

public typealias Elf32Off = UInt

public typealias Elf32Addr = UInt

public typealias Elf32Lword = ULong

public typealias Elf32Sword = Int

public typealias Elf64Half = UShort

public typealias Elf64Word = UInt

public typealias Elf64Off = ULong

public typealias Elf64Addr = ULong

public typealias Elf64Xword = ULong

public typealias Elf64Sxword = Long

public typealias Elf64Lword = ULong

public typealias Elf64Sword = Int

public typealias Elf32Section = UShort

public typealias Elf64Section = UShort

public typealias Time32t = UInt

public typealias PthreadT = CInt

public typealias RegoffT = SsizeT

public typealias NlinkT = UInt

public typealias BlksizeT = UInt

public typealias SusecondsT = Int

public typealias InoT = ULong

public typealias OffT = Long

public typealias BlkcntT = ULong

public typealias MsgqnumT = ULong

public typealias MsglenT = ULong

public typealias FsblkcntT = ULong

public typealias FsfilcntT = ULong

public typealias RlimT = ULong

public typealias PosixSpawnFileActionsT = MutPtr<CVoid>

public typealias PosixSpawnattrT = UintptrT

public typealias PthreadMutexT = SyncT

public typealias PthreadMutexattrT = SyncAttr

public typealias PthreadCondT = SyncT

public typealias PthreadCondattrT = SyncAttr

public typealias PthreadRwlockattrT = SyncAttr

public typealias PthreadKeyT = CInt

public typealias PthreadSpinlockT = SyncT

public typealias PthreadBarrierattrT = SyncAttr

public typealias SemT = SyncT

public typealias NlItem = CInt

// intentionally not public, only used for fdSet
// QNX Network Stack Versioning:
//
// The `if` block targets the legacy `io - pkt` stack.
// - targetEnv = "nto70": QNX 7.0
// - targetEnv = "nto71": Standard QNX 7.1 (default legacy stack)
//
// The `else` block targets the modern `io - sock` stack.
// - targetEnv = "nto71Iosock": QNX 7.1 with the optional new stack
// - targetEnv = "nto80": QNX 8.0
public class Timezone(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}
