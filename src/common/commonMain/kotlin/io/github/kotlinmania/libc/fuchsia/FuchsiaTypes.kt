package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// PUB_TYPE
public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias LocaleT = MutPtr

public typealias SizeT = ULong

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias SsizeT = Long

public typealias PidT = Int

public typealias UidT = UInt

public typealias GidT = UInt

public typealias InAddrT = UInt

public typealias InPortT = UShort

public typealias SighandlerT = SizeT

public typealias CcT = CUchar

public typealias SaFamilyT = UShort

public typealias PthreadKeyT = CUint

public typealias SpeedT = CUint

public typealias TcflagT = CUint

public typealias ClockidT = CInt

public typealias KeyT = CInt

public typealias IdT = CUint

public typealias UsecondsT = UInt

public typealias DevT = ULong

public typealias SocklenT = UInt

public typealias PthreadT = CUlong

public typealias ModeT = UInt

public typealias Ino64T = ULong

public typealias Off64T = Long

public typealias Blkcnt64T = Long

public typealias Rlim64T = ULong

public typealias MqdT = CInt

public typealias NfdsT = CUlong

public typealias NlItem = CInt

public typealias IdtypeT = CUint

public typealias LoffT = CLonglong

public typealias U8 = CUchar

public typealias U16 = CUshort

public typealias S16 = CShort

public typealias U32 = CUint

public typealias S32 = CInt

public typealias Elf32Half = UShort

public typealias Elf32Word = UInt

public typealias Elf32Off = UInt

public typealias Elf32Addr = UInt

public typealias Elf64Half = UShort

public typealias Elf64Word = UInt

public typealias Elf64Off = ULong

public typealias Elf64Addr = ULong

public typealias Elf64Xword = ULong

public typealias ClockT = CLong

public typealias TimeT = CLong

public typealias SusecondsT = CLong

public typealias InoT = ULong

public typealias OffT = Long

public typealias BlkcntT = Long

public typealias ShmattT = CUlong

public typealias MsgqnumT = CUlong

public typealias MsglenT = CUlong

public typealias FsblkcntT = CUlonglong

public typealias FsfilcntT = CUlonglong

public typealias RlimT = CUlonglong

// PUB_STRUCT
// intentionally not public, only used for fdSet
// END_PUB_CONST
public class Timezone(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}

public class DIR(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}

public class Fpos64T(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}

public class FILE(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}

public class FposT(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}
