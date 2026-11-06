// port-lint: source new/qurt/semaphore.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.LibcDynamicFfi

// Header: `semaphore.h`

public fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt {
    val __slot_0 = if (sem == null) 0L else LibcDynamicFfi.allocScalarSlot(sem.toLong())
    try {
        return LibcDynamicFfi.invoke("sem_init", -1, longArrayOf(__slot_0, pshared.toLong(), value.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun semDestroy(sem: SemT?): CInt {
    val __slot_0 = if (sem == null) 0L else LibcDynamicFfi.allocScalarSlot(sem.toLong())
    try {
        return LibcDynamicFfi.invoke("sem_destroy", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun semWait(sem: SemT?): CInt {
    val __slot_0 = if (sem == null) 0L else LibcDynamicFfi.allocScalarSlot(sem.toLong())
    try {
        return LibcDynamicFfi.invoke("sem_wait", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun semTrywait(sem: SemT?): CInt {
    val __slot_0 = if (sem == null) 0L else LibcDynamicFfi.allocScalarSlot(sem.toLong())
    try {
        return LibcDynamicFfi.invoke("sem_trywait", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun semPost(sem: SemT?): CInt {
    val __slot_0 = if (sem == null) 0L else LibcDynamicFfi.allocScalarSlot(sem.toLong())
    try {
        return LibcDynamicFfi.invoke("sem_post", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun semGetvalue(sem: SemT?, sval: CInt?): CInt {
    val __slot_0 = if (sem == null) 0L else LibcDynamicFfi.allocScalarSlot(sem.toLong())
    val __slot_1 = if (sval == null) 0L else LibcDynamicFfi.allocScalarSlot(sval.toLong())
    try {
        return LibcDynamicFfi.invoke("sem_getvalue", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}
