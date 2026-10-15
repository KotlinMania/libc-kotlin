// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*

public actual fun pthreadAttrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrGetschedparam requires N-API addon")

public actual fun pthreadAttrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedparam requires N-API addon")

public actual fun pthreadAttrGetprocessoridNp(attr: io.github.kotlinmania.libc.COpaquePointer?, processorId: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetprocessoridNp requires N-API addon")

public actual fun pthreadAttrSetprocessoridNp(attr: io.github.kotlinmania.libc.COpaquePointer?, processorId: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetprocessoridNp requires N-API addon")

public actual fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam requires N-API addon")

public actual fun pthreadSetschedparam(native: ULong, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam requires N-API addon")

public actual fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun pthreadGetprocessoridNp(): Int =
    throw UnsupportedOperationException("pthreadGetprocessoridNp requires N-API addon")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom requires N-API addon")

public actual fun gethostid(): Long =
    throw UnsupportedOperationException("gethostid requires N-API addon")

public actual fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires N-API addon")
