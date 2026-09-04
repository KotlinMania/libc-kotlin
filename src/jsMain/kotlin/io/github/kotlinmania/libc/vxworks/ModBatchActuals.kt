// port-lint: source Mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval



public actual fun atexit(cb: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atexit requires N-API addon")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork requires N-API addon")

public actual fun pthreadKeyCreate(key: PthreadKeyT?, dtor: ((COpaquePointer?) -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadKeyCreate requires N-API addon")

public actual fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("sigqueue requires N-API addon")

public actual fun sigqueue(rtpId: RTPID, signo: CInt, pValue: Sigval?, sigCode: CInt): CInt =
    throw UnsupportedOperationException("sigqueue (rtpId overload) requires N-API addon")
