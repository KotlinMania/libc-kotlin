// port-lint: source new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadAttrT
import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadT

/**
 * Linux-like `<pthread.h>` extensions (`*_np` non-portable APIs).
 *
 * Surface per upstream cfg:
 *   pthread_getaffinity_np   target_os = linux | l4re
 *   pthread_getattr_np       all linux-like (linux, l4re, android, emscripten)
 *   pthread_getname_np       target_os = linux
 *   pthread_setaffinity_np   target_os = linux | l4re
 *   pthread_setname_np       target_os = linux | android
 *
 * Apple, BSD, Windows, WASM expose ENOSYS for these. Bionic exposes the name_np
 * pair (set always, get at API 26+) but not the affinity pair — see ANDROID.md
 * for the bucket classification.
 */

/** `cpu_set_t` — opaque CPU affinity bitset. */
public expect class CpuSetT

public expect fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int

public expect fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT): Int

public expect fun pthreadGetnameNp(thread: PthreadT, name: ByteArray, len: ULong): Int

public expect fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int

public expect fun pthreadSetnameNp(thread: PthreadT, name: String): Int
