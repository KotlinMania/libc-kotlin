// port-lint: source new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.SizeT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.sys.CpuSetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.PthreadAttrT

public fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    val __slot_2 = if (cpuset == null) 0L else LibcDynamicFfi.allocScalarSlot(cpuset.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_getaffinity_np", -1, longArrayOf(thread.toLong(), cpusetsize.toLong(), __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt {
    val __slot_1 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_getattr_np", -1, longArrayOf(native.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_getname_np", -1, longArrayOf(thread.toLong(), name?.value ?: 0L, len.toLong())).toInt()
}

public fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    val __slot_2 = if (cpuset == null) 0L else LibcDynamicFfi.allocScalarSlot(cpuset.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_setaffinity_np", -1, longArrayOf(thread.toLong(), cpusetsize.toLong(), __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt {
    val __cstr_1 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("pthread_setname_np", -1, longArrayOf(thread.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}
