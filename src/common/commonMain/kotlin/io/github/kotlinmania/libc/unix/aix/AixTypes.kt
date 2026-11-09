package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE

public fun interface FnCallback {
    public operator fun invoke()
}

public fun interface FnCallback1 {
    public operator fun invoke(arg0: COpaquePointer?)
}

public fun interface FnCallback2 {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface FnCallback3 {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public fun interface FnCallback4 {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?): CInt
}

public typealias CaddrT = COpaquePointer?

public typealias ClockidT = CLonglong

public typealias BlkcntT = CLong

public typealias ClockT = CInt

public typealias DaddrT = CLong

public typealias DevT = CUlong

public typealias Fpos64T = CLonglong

public typealias FsblkcntT = CUlong

public typealias FsfilcntT = CUlong

public typealias InoT = CUlong

public typealias KeyT = CInt

public typealias ModeT = CUint

public typealias NlinkT = CShort

public typealias RlimT = CUlong

public typealias SpeedT = CUint

public typealias TcflagT = CUint

public typealias TimeT = CLong

public typealias Time64T = Long

public typealias TimerT = CLong

public typealias WcharT = CUint

public typealias NfdsT = CUint

public typealias ProjidT = CInt

public typealias IdT = CUint

public typealias Blksize64T = CUlonglong

public typealias Blkcnt64T = CUlonglong

public typealias SusecondsT = CInt

public typealias UsecondsT = CUint

public typealias OffT = CLong

public typealias OffsetT = CLonglong

public typealias Off64T = CLonglong

public typealias IdtypeT = CUint

public typealias SocklenT = CUint

public typealias SaFamilyT = CUchar

public typealias SignalT = CInt

public typealias PthreadT = CUint

public typealias PthreadKeyT = CUint

public typealias ThreadT = PthreadT

public typealias BlksizeT = CLong

public typealias NlItem = CInt

public typealias MqdT = CInt

public typealias ShmattT = CUlong

public typealias RegoffT = CLong

public typealias Rlim64T = CUlonglong

public typealias SemT = CInt

public typealias PollsetT = CInt

public typealias SctpAssocT = CUint

public typealias PthreadRwlockattrT = COpaquePointer?

public typealias PthreadCondattrT = COpaquePointer?

public typealias PthreadMutexattrT = COpaquePointer?

public typealias PthreadAttrT = COpaquePointer?

public typealias PthreadBarrierattrT = COpaquePointer?

public typealias PosixSpawnFileActionsT = COpaquePointer?

public typealias IconvT = COpaquePointer?

public enum class UioRw(public val value: UInt) {
    UIO_READ(0u),
    UIO_WRITE(((0u) + 1u)),
    UIO_READ_NO_MOVE(((0u) + 2u)),
    UIO_WRITE_NO_MOVE(((0u) + 3u)),
    UIO_PWRITE(((0u) + 4u)),
}

public enum class Action(public val value: UInt) {
    FIND(0u),
    ENTER(((0u) + 1u)),
}
