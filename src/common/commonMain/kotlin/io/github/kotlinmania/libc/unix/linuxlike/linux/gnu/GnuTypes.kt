package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong

public typealias PthreadT = CUlong

public typealias PriorityWhichT = CUint

public typealias RlimitResourceT = CUint

public typealias LmidT = CLong

public typealias RegoffT = CInt

public typealias KernelRwfT = CInt

// Most `* _SUPER_MAGIC` constants are defined at the `linuxLike` level; the
// following are only available on newer Linux versions than the versions
// currently used in CI in some configurations, so we define them here.
public typealias Ioctl = CUlong
