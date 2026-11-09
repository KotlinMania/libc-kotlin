package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.UintptrT

// This module contains bindings to the native Haiku API. The Haiku API
// originates from BeOS, and it was the original way to perform low level
// system and IO operations. The POSIX API was in that era was like a
// compatibility layer. In current Haiku development, both the POSIX API and
// the Haiku API are considered to be co-equal status. However, they are not
// integrated like they are on other UNIX platforms, which means that for many
// low level concepts there are two versions, like processes (POSIX) and
// teams (Haiku), or pthreads and native threads.
//
// Both the POSIX API and the Haiku API live in libroot.so, the library that is
// linked to any binary by default. Additionally, Haiku supports several
// non-POSIX APIs from BSD and GNU, which live in libbsd.so and libgnu.so. These
// modules are also supported.
//
// The module is comprised of the following files:
// - `mod.rs` (this file) implements the C11 and POSIX API found in
// `headers / posix`
// - `b32.rs`, `b64.rs` and `x8664.rs` contain platform-specific definitions
// of the C11 and POSIX APIs
// - `native.rs` defines the native Haiku API that is implemented in
// `libroot.so` and that are found in `headers / os`.
// - `bsd.rs` defines the BSD customizations available on Haiku found in
// `headers / compatibility / bsd`
public typealias RlimT = UintptrT

public typealias SaFamilyT = UByte

public typealias PthreadKeyT = CInt

public typealias NfdsT = CUlong

public typealias TcflagT = CUint

public typealias SpeedT = CUchar

public typealias ClockT = Int

public typealias ClockidT = Int

public typealias SusecondsT = Int

public typealias WcharT = Int

public typealias OffT = Long

public typealias InoT = Long

public typealias BlkcntT = Long

public typealias BlksizeT = Int

public typealias DevT = Int

public typealias ModeT = UInt

public typealias NlinkT = Int

public typealias UsecondsT = UInt

public typealias SocklenT = UInt

public typealias PthreadT = UintptrT

public typealias PthreadCondattrT = UintptrT

public typealias PthreadMutexattrT = UintptrT

public typealias PthreadRwlockattrT = UintptrT

public typealias SigsetT = ULong

public typealias FsblkcntT = Long

public typealias FsfilcntT = Long

public typealias PthreadAttrT = COpaquePointer?

public typealias NlItem = CInt

public typealias IdT = Int

public typealias IdtypeT = CInt

public typealias FdMask = UInt

public typealias RegoffT = CInt

public typealias KeyT = Int

public typealias MsgqnumT = UInt

public typealias MsglenT = UInt

public typealias Elf32Addr = UInt

public typealias Elf32Half = UShort

public typealias Elf32Off = UInt

public typealias Elf32Sword = Int

public typealias Elf32Word = UInt

public typealias Elf64Addr = ULong

public typealias Elf64Half = UShort

public typealias Elf64Off = ULong

public typealias Elf64Sword = Int

public typealias Elf64Sxword = Long

public typealias Elf64Word = UInt

public typealias Elf64Xword = ULong

public typealias Action = CInt

public typealias PosixSpawnattrT = COpaquePointer?

public typealias PosixSpawnFileActionsT = COpaquePointer?

public sealed class Timezone {
}
