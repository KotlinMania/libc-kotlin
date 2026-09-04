// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetschedparam not available on WASI — no C library access")

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedparam not available on WASI — no C library access")

public actual fun pthreadAttrGetprocessoridNp(attr: PthreadAttrT, processorId: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetprocessoridNp not available on WASI — no C library access")

public actual fun pthreadAttrSetprocessoridNp(attr: PthreadAttrT, processorId: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetprocessoridNp not available on WASI — no C library access")

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam not available on WASI — no C library access")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam not available on WASI — no C library access")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on WASI — no C library access")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on WASI — no C library access")

public actual fun pthreadGetprocessoridNp(): CInt =
    throw UnsupportedOperationException("pthreadGetprocessoridNp not available on WASI — no C library access")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom not available on WASI — no C library access")

public actual fun gethostid(): CLong =
    throw UnsupportedOperationException("gethostid not available on WASI — no C library access")

