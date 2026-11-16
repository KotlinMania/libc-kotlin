package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias UintptrT = ULong

public typealias IntptrT = Long

public typealias PtrdiffT = Long

public typealias SizeT = UintptrT

public typealias SsizeT = IntptrT

public typealias ClockT = CUint

public typealias TimeT = Long

public typealias ClockidT = CInt

public typealias TimerT = CInt

public typealias SusecondsT = CInt

public typealias UsecondsT = CUint

public typealias SighandlerT = SizeT

// sys/ansi.h
public typealias CaddrT = MutPtr

public typealias GidT = UInt

public typealias InAddrT = UInt

public typealias InPortT = UShort

public typealias ModeT = UInt

public typealias OffT = Long

public typealias PidT = Int

public typealias SaFamilyT = UByte

public typealias SocklenT = CUint

public typealias UidT = UInt

public typealias FsblkcntT = ULong

public typealias FsfilcntT = ULong

// locale.h
public typealias LocaleT = ULong

// nlTypes.h
public typealias NlItem = CLong

// sys/types.h
public typealias VaList = MutPtr

public typealias UInt8T = UByte

public typealias UInt16T = UShort

public typealias UInt32T = UInt

public typealias UInt64T = ULong

public typealias UChar = CUchar

public typealias UShort = CUshort

public typealias UInt = CUint

public typealias ULong = CUlong

public typealias Unchar = CUchar

public typealias Ushort = CUshort

public typealias Uint = CUint

public typealias Ulong = CUlong

public typealias UQuadT = ULong

public typealias QuadT = Long

public typealias QaddrT = MutPtr

public typealias LonglongT = Long

public typealias ULonglongT = ULong

public typealias BlkcntT = Long

public typealias BlksizeT = Int

public typealias DaddrT = Long

public typealias DevT = ULong

public typealias FixptT = UInt

public typealias IdtypeT = CInt

public typealias IdT = UInt

public typealias InoT = ULong

public typealias KeyT = CLong

public typealias NlinkT = UInt

public typealias LwpidT = Int

public typealias RlimT = ULong

public typealias SegszT = Int

public typealias SwblkT = Int

public typealias MqdT = CInt

public typealias CpuidT = CUlong

public typealias PsetidT = CInt

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
