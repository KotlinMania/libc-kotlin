package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.FILE

public fun interface FnCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public fun interface FnCallback1 {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

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
