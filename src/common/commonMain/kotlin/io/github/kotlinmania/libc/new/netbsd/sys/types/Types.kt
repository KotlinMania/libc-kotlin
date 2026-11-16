// port-lint: source new/netbsd/sys/types.rs
package io.github.kotlinmania.libc.new.netbsd.sys.types

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong

// Header: `sys / types.h`
//
// <https://github.com/NetBSD/src/blob/trunk/sys/sys/types.h>

public typealias DevT = ULong

public typealias LwpidT = Int

public typealias MqdT = CInt

public typealias CpuidT = CUlong

public typealias ClockT = CUint

public typealias TimerT = CInt

public typealias SusecondsT = CInt
