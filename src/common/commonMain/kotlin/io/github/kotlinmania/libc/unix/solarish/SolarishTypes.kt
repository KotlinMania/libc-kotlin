package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.UintptrT

public fun interface FnCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface FnCallback1 {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public fun interface FnCallback2 {
    public operator fun invoke()
}

public fun interface FnCallback3 {
    public operator fun invoke(info: COpaquePointer?, size: ULong, data: COpaquePointer?): CInt
}

public typealias CaddrT = COpaquePointer?

public typealias ClockidT = CInt

public typealias BlkcntT = CLong

public typealias ClockT = CLong

public typealias DaddrT = CLong

public typealias DevT = CUlong

public typealias FsblkcntT = CUlong

public typealias FsfilcntT = CUlong

public typealias InoT = CUlong

public typealias KeyT = CInt

public typealias MajorT = CUint

public typealias MinorT = CUint

public typealias ModeT = CUint

public typealias NlinkT = CUint

public typealias RlimT = CUlong

public typealias SpeedT = CUint

public typealias TcflagT = CUint

public typealias TimeT = CLong

public typealias TimerT = CInt

public typealias WcharT = CInt

public typealias NfdsT = CUlong

public typealias ProjidT = CInt

public typealias ZoneidT = CInt

public typealias PsetidT = CInt

public typealias ProcessoridT = CInt

public typealias ChipidT = CInt

public typealias CtidT = IdT

public typealias SusecondsT = CLong

public typealias OffT = CLong

public typealias UsecondsT = CUint

public typealias SocklenT = CUint

public typealias SaFamilyT = UShort

public typealias PthreadT = CUint

public typealias PthreadKeyT = CUint

public typealias ThreadT = CUint

public typealias BlksizeT = CInt

public typealias NlItem = CInt

public typealias MqdT = COpaquePointer?

public typealias IdT = CInt

public typealias IdtypeT = CUint

public typealias ShmattT = CUlong

public typealias LgrpIdT = IdT

public typealias LgrpMemSizeT = CLonglong

public typealias LgrpCookieT = UintptrT

public typealias LgrpContentT = CUint

public typealias LgrpLatBetweenT = CUint

public typealias LgrpMemSizeFlagT = CUint

public typealias LgrpViewT = CUint

public typealias PosixSpawnattrT = COpaquePointer?

public typealias PosixSpawnFileActionsT = COpaquePointer?

public class Timezone(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}

public class UcredT(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}
