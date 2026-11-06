// port-lint: source new/apple/libpthread/sys/_pthread/_pthread_types.rs
package io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong

// Header: `sys / _pthread / _pthread_types.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/sys/_pthread/_pthread_types.h>
//
// Note that the actual header defines `_opaque_pthread_ *` structs which are typedefed to
// `__darwin_pthread *` structs, and typedefed again in separate `_pthread_ *.h` files to their final
// `pthread_` name. This isn't useful for us so we simplify a bit and just define everything here.

public val PTHREAD_SIZE: Int = 8176

public val PTHREAD_ATTR_SIZE: Int = 56

public val PTHREAD_MUTEXATTR_SIZE: Int = 8

public val PTHREAD_MUTEX_SIZE: Int = 56

public val PTHREAD_CONDATTR_SIZE: Int = 8

public val PTHREAD_COND_SIZE: Int = 40

public val PTHREAD_ONCE_SIZE: Int = 8

public val PTHREAD_RWLOCK_SIZE: Int = 192

public val PTHREAD_RWLOCKATTR_SIZE: Int = 16

public open class PthreadAttrT(internal var sig: CLong, internal var opaque: List<CChar>)

public open class PthreadCondT(internal var sig: CLong, internal var opaque: List<UByte>)

public open class PthreadCondattrT(internal var sig: CLong, internal var opaque: List<UByte>)

public open class PthreadMutexT(internal var sig: CLong, internal var opaque: List<UByte>)

public open class PthreadMutexattrT(internal var sig: CLong, internal var opaque: List<UByte>)

public open class PthreadOnceT(internal var sig: CLong, internal var opaque: List<CChar>)

public open class PthreadRwlockT(internal var sig: CLong, internal var opaque: List<UByte>)

public open class PthreadRwlockattrT(internal var sig: CLong, internal var opaque: List<UByte>)

public typealias PthreadKeyT = CUlong
