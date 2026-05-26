// port-lint: source new/common/posix/pthread.rs
package io.github.kotlinmania.libc.new.common.posix.pthread

import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.ExperimentalForeignApi

@OptIn(ExperimentalForeignApi::class)
public actual class PthreadT internal constructor(internal val rawValue: COpaquePointer)

@OptIn(ExperimentalForeignApi::class)
public actual class PthreadAttrT internal constructor(internal val rawValue: COpaquePointer)

@OptIn(ExperimentalForeignApi::class)
public actual class PthreadMutexT internal constructor(internal val rawValue: COpaquePointer)

@OptIn(ExperimentalForeignApi::class)
public actual class PthreadMutexattrT internal constructor(internal val rawValue: COpaquePointer)

@OptIn(ExperimentalForeignApi::class)
public actual class PthreadCondT internal constructor(internal val rawValue: COpaquePointer)

@OptIn(ExperimentalForeignApi::class)
public actual class PthreadCondattrT internal constructor(internal val rawValue: COpaquePointer)

@OptIn(ExperimentalForeignApi::class)
public actual class PthreadRwlockT internal constructor(internal val rawValue: COpaquePointer)

@OptIn(ExperimentalForeignApi::class)
public actual class PthreadRwlockattrT internal constructor(internal val rawValue: COpaquePointer)

@OptIn(ExperimentalForeignApi::class)
public actual class PthreadBarrierT internal constructor(internal val rawValue: COpaquePointer)

@OptIn(ExperimentalForeignApi::class)
public actual class PthreadBarrierattrT internal constructor(internal val rawValue: COpaquePointer)

@OptIn(ExperimentalForeignApi::class)
public actual class PthreadSpinlockT internal constructor(internal val rawValue: COpaquePointer)

@OptIn(ExperimentalForeignApi::class)
public actual class PthreadOnceT internal constructor(internal val rawValue: COpaquePointer)
