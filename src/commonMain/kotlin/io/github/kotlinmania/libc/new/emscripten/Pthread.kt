// port-lint: source libc/src/new/emscripten/pthread.rs
package io.github.kotlinmania.libc.new.emscripten

/**
 * Re-export wiring for `new/emscripten/pthread.rs` (no definitions of its own).
 *
 * Header: `pthread.h`
 *
 * Re-exports (resolved by callers in the wiring pass):
 * - crate::new::common::linux_like::pthread::pthread_getattr_np
 * - crate::new::common::posix::pthread::{ pthread_attr_getstack, pthread_attr_setstack, pthread_condattr_getclock, pthread_condattr_setclock, pthread_condattr_setpshared, pthread_create, pthread_mutexattr_setpshared, pthread_rwlockattr_getpshared, pthread_rwlockattr_setpshared, }
 */
