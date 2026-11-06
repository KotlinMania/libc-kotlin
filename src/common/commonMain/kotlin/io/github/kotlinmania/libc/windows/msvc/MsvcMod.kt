package io.github.kotlinmania.libc.windows.msvc

// POSIX Supplement (from errno.h)
// This particular error code is only currently available in msvc toolchain
public val EOTHER: CInt = 131

public fun stricmp(s1: String?, s2: String?): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("_stricmp", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strnicmp(s1: String?, s2: String?, n: SizeT): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("_strnicmp", -1, longArrayOf(__cstr_0, __cstr_1, n.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, count: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("_memccpy", -1, longArrayOf(dest?.value ?: 0L, src?.value ?: 0L, c.toLong(), count.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}
