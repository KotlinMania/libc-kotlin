package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.COpaquePointer

internal object HorizonModRawLibc {
    external fun pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int
    external fun pthreadAttrGetschedparam(attr: Long, param: Long): Int
    external fun pthreadAttrSetschedparam(attr: Long, param: Long): Int
    external fun pthreadAttrGetprocessoridNp(attr: Long, processorId: Long): Int
    external fun pthreadAttrSetprocessoridNp(attr: Long, processorId: Int): Int
    external fun pthreadGetschedparam(native: Long, policy: Long, param: Long): Int
    external fun pthreadSetschedparam(native: Long, policy: Int, param: Long): Int
    external fun pthreadCondattrGetclock(attr: Long, clockId: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Int): Int
    external fun pthreadGetprocessoridNp(): Int
    external fun getrandom(buf: Long, buflen: Long, flags: Int): Long
    external fun gethostid(): Long
}

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    HorizonModRawLibc.pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt =
    HorizonModRawLibc.pthreadAttrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt =
    HorizonModRawLibc.pthreadAttrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadAttrGetprocessoridNp(attr: PthreadAttrT?, processorId: CInt?): CInt =
    HorizonModRawLibc.pthreadAttrGetprocessoridNp(attr?.toLong() ?: 0L, processorId?.toLong() ?: 0L)

public actual fun pthreadAttrSetprocessoridNp(attr: PthreadAttrT?, processorId: CInt): CInt =
    HorizonModRawLibc.pthreadAttrSetprocessoridNp(attr?.toLong() ?: 0L, processorId)

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    HorizonModRawLibc.pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    HorizonModRawLibc.pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    HorizonModRawLibc.pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    HorizonModRawLibc.pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)

public actual fun pthreadGetprocessoridNp(): CInt =
    HorizonModRawLibc.pthreadGetprocessoridNp()

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    HorizonModRawLibc.getrandom(buf?.value ?: 0L, buflen, flags)

public actual fun gethostid(): CLong =
    HorizonModRawLibc.gethostid()
