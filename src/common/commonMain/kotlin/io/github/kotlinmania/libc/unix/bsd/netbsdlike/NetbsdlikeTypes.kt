package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint

public typealias WcharT = Int

public typealias TimeT = Long

public typealias ModeT = UInt

public typealias NlinkT = UInt

public typealias InoT = ULong

public typealias PthreadKeyT = CInt

public typealias RlimT = ULong

public typealias SpeedT = CUint

public typealias TcflagT = CUint

public typealias NlItem = CLong

public typealias ClockidT = CInt

public typealias IdT = UInt

public typealias SemT = COpaquePointer?

public typealias KeyT = CLong

public sealed class Timezone {
}

public sealed class Sem {
}
