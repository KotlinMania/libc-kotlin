package io.github.kotlinmania.libc.windows.gnu

// stdio file descriptor numbers
public val STDIN_FILENO: CInt = 0

public val STDOUT_FILENO: CInt = 1

public val STDERR_FILENO: CInt = 2

public fun strcasecmp(s1: String?, s2: String?): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("strcasecmp", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt {
    val __cstr_0 = if (s1 == null) 0L else LibcDynamicFfi.allocUtf8CString(s1)
    val __cstr_1 = if (s2 == null) 0L else LibcDynamicFfi.allocUtf8CString(s2)
    try {
        return LibcDynamicFfi.invoke("strncasecmp", -1, longArrayOf(__cstr_0, __cstr_1, n.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// NOTE: For MSVC target, `wmemchr` is only a inline function in `<wchar.h>`
// header file. We cannot find a way to link to that symbol from Rust.
public fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT? {
    val __slot_0 = if (cx == null) 0L else LibcDynamicFfi.allocScalarSlot(cx.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("wmemchr", -1, longArrayOf(__slot_0, c.toLong(), n.toLong()))
        return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}
