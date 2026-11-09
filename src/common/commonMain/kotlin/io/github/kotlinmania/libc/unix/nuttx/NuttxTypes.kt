package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.DIR

public fun interface FnCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public typealias NlinkT = UShort

public typealias InoT = UShort

public typealias BlkcntT = ULong

public typealias BlksizeT = Short

public typealias CcT = UByte

public typealias ClockT = Long

public typealias DevT = Int

public typealias FsblkcntT = ULong

public typealias LocaleT = COpaquePointer?

public typealias ModeT = UInt

public typealias NfdsT = UInt

public typealias OffT = Long

public typealias PthreadKeyT = Int

public typealias PthreadMutexattrT = UByte

public typealias PthreadRwlockattrT = Int

public typealias PthreadT = Int

public typealias RlimT = Long

public typealias SaFamilyT = UShort

public typealias SocklenT = UInt

public typealias SpeedT = ULong

public typealias SusecondsT = Int

public typealias TcflagT = UInt

public typealias ClockidT = Int

public typealias TimeT = Long

public typealias WcharT = Int
