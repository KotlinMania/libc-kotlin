package io.github.kotlinmania.libc.unix.linuxlike.l4re

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias L4UmwordT = CUlong

// Unsigned machine word.
public typealias PthreadT = MutPtr

public typealias DevT = ULong

public typealias SocklenT = UInt

public typealias ModeT = UInt

public typealias Ino64T = ULong

public typealias Off64T = Long

public typealias Blkcnt64T = Long

public typealias Rlim64T = ULong

public typealias NfdsT = CUlong

public typealias NlItem = CInt

public typealias IdtypeT = CUint

public typealias LoffT = CLonglong

public typealias PthreadKeyT = CUint

public typealias PthreadOnceT = CInt

public typealias PthreadSpinlockT = CInt
