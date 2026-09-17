// port-lint: source vxworks/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toKString
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.cstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.write
import kotlinx.cinterop.nativeHeap
import libc.cinterop.libc_strchr
import libc.cinterop.libc_strpbrk
import libc.cinterop.libc_strrchr
import libc.cinterop.libc_strstr
import libc.cinterop.libc_strcat
import libc.cinterop.libc_strncat
import libc.cinterop.libc_strncpy
import libc.cinterop.libc_strcpy
import libc.cinterop.libc_strtok
import libc.cinterop.libc_getcwd
import libc.cinterop.libc_realpath
import libc.cinterop.libc_tmpnam
import libc.cinterop.libc_mkdtemp

public actual fun strchr(cs: String?, c: CInt): String? {
    if (cs == null) return null
    return memScoped {
        val cstr = cs.cstr.ptr
        val result = libc.cinterop.libc_strchr(cstr, c)
        result?.toKString()
    }
}

public actual fun strrchr(cs: String?, c: CInt): String? {
    if (cs == null) return null
    return memScoped {
        val cstr = cs.cstr.ptr
        val result = libc.cinterop.libc_strrchr(cstr, c)
        result?.toKString()
    }
}

public actual fun strpbrk(cs: String?, ct: String?): String? {
    if (cs == null) return null
    if (ct == null) return null
    return memScoped {
        val cstr = cs.cstr.ptr
        val caccept = ct.cstr.ptr
        val result = libc.cinterop.libc_strpbrk(cstr, caccept)
        result?.toKString()
    }
}

public actual fun strstr(cs: String?, ct: String?): String? {
    if (cs == null) return null
    if (ct == null) return null
    return memScoped {
        val cstr = cs.cstr.ptr
        val nstr = ct.cstr.ptr
        val result = libc.cinterop.libc_strstr(cstr, nstr)
        result?.toKString()
    }
}

// String mutation functions: Kotlin String is immutable, so we allocate
// a mutable C buffer, call the C function, and return the result as a new
// Kotlin String (Option b — preserves the String? API at the cost of allocation).
public actual fun strtok(s: String?, t: String?): String? {
    if (t == null) return null
    val sBuf: CPointer<ByteVar>? = if (s != null) {
        val len = s.length + 1
        val buf = nativeHeap.allocArray<ByteVar>(len)
        s.cstr.write(buf)
        buf
    } else {
        null
    }
    return memScoped {
        val tBuf = t.cstr.ptr
        val result = libc_strtok(sBuf, tBuf)
        result?.toKString()
    }
}

public actual fun strcpy(dst: String?, src: String?): String? {
    if (src == null) return null
    return memScoped {
        val srcBuf = src.cstr.ptr
        val len = src.length + 1
        val dstBuf = allocArray<ByteVar>(len)
        libc_strcpy(dstBuf, srcBuf)
        dstBuf.toKString()
    }
}
public actual fun strncpy(dst: String?, src: String?, n: ULong): String? {
    if (src == null) return null
    return memScoped {
        val srcBuf = src.cstr.ptr
        val len = maxOf(src.length + 1, n.toInt())
        val dstBuf = allocArray<ByteVar>(len)
        libc_strncpy(dstBuf, srcBuf, n)
        dstBuf.toKString()
    }
}
public actual fun strcat(s: String?, ct: String?): String? {
    if (s == null) return null
    if (ct == null) return s
    return memScoped {
        val totalLen = s.length + ct.length + 1
        val buf = allocArray<ByteVar>(totalLen)
        s.cstr.write(buf)
        val ctBuf = ct.cstr.ptr
        libc_strcat(buf, ctBuf)
        buf.toKString()
    }
}
public actual fun strncat(s: String?, ct: String?, n: ULong): String? {
    if (s == null) return null
    if (ct == null) return s
    return memScoped {
        val totalLen = s.length + minOf(ct.length, n.toInt()) + 1
        val buf = allocArray<ByteVar>(totalLen)
        s.cstr.write(buf)
        val ctBuf = ct.cstr.ptr
        libc_strncat(buf, ctBuf, n)
        buf.toKString()
    }
}
public actual fun getcwd(buf: String?, size: ULong): String? {
    val bufSize = if (size > 0uL) size.toInt() else 4096
    return memScoped {
        val bufPtr = allocArray<ByteVar>(bufSize)
        val result = libc_getcwd(bufPtr, bufSize.toULong())
        result?.toKString()
    }
}

public actual fun realpath(fileName: String?, resolvedName: String?): String? {
    if (fileName == null) return null
    return memScoped {
        val pathBuf = fileName.cstr.ptr
        val resolvedBuf = allocArray<ByteVar>(4096)
        val result = libc_realpath(pathBuf, resolvedBuf)
        result?.toKString()
    }
}

public actual fun tmpnam(ptr: String?): String? {
    return memScoped {
        val buf = allocArray<ByteVar>(1024)
        val result = libc_tmpnam(buf)
        result?.toKString()
    }
}

public actual fun mkdtemp(template: String?): String? {
    if (template == null) return null
    return memScoped {
        val len = template.length + 1
        val buf = allocArray<ByteVar>(len)
        template.cstr.write(buf)
        val result = libc_mkdtemp(buf)
        result?.toKString()
    }
}
