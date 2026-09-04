// port-lint: source Stdio.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen not available on Android host — use androidNative target for FFI")

public actual fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? =
    throw UnsupportedOperationException("freopen not available on Android host — use androidNative target for FFI")

public actual fun fclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("fclose not available on Android host — use androidNative target for FFI")

public actual fun fflush(stream: FILE?): CInt =
    throw UnsupportedOperationException("fflush not available on Android host — use androidNative target for FFI")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread not available on Android host — use androidNative target for FFI")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite not available on Android host — use androidNative target for FFI")

public actual fun fgetc(stream: FILE?): CInt =
    throw UnsupportedOperationException("fgetc not available on Android host — use androidNative target for FFI")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputc not available on Android host — use androidNative target for FFI")

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar not available on Android host — use androidNative target for FFI")

public actual fun putchar(c: CInt): CInt =
    throw UnsupportedOperationException("putchar not available on Android host — use androidNative target for FFI")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("ungetc not available on Android host — use androidNative target for FFI")

public actual fun fgets(s: String?, size: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets not available on Android host — use androidNative target for FFI")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputs not available on Android host — use androidNative target for FFI")

public actual fun gets(s: String?): String? =
    throw UnsupportedOperationException("gets not available on Android host — use androidNative target for FFI")

public actual fun puts(s: String?): CInt =
    throw UnsupportedOperationException("puts not available on Android host — use androidNative target for FFI")

public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf not available on Android host — use androidNative target for FFI")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf not available on Android host — use androidNative target for FFI")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf not available on Android host — use androidNative target for FFI")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf not available on Android host — use androidNative target for FFI")

public actual fun vprintf(format: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("vprintf not available on Android host — use androidNative target for FFI")

public actual fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("vfprintf not available on Android host — use androidNative target for FFI")

public actual fun vsprintf(s: String?, format: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("vsprintf not available on Android host — use androidNative target for FFI")

public actual fun vsnprintf(s: String?, n: ULong, format: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("vsnprintf not available on Android host — use androidNative target for FFI")

public actual fun scanf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf not available on Android host — use androidNative target for FFI")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf not available on Android host — use androidNative target for FFI")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf not available on Android host — use androidNative target for FFI")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("fseek not available on Android host — use androidNative target for FFI")

public actual fun ftell(stream: FILE?): CLong =
    throw UnsupportedOperationException("ftell not available on Android host — use androidNative target for FFI")

public actual fun rewind(stream: FILE?) {
    throw UnsupportedOperationException("rewind not available on Android host — use androidNative target for FFI")
}

public actual fun fgetpos(stream: FILE?, pos: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos not available on Android host — use androidNative target for FFI")

public actual fun fsetpos(stream: FILE?, pos: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos not available on Android host — use androidNative target for FFI")

public actual fun clearerr(stream: FILE?) {
    throw UnsupportedOperationException("clearerr not available on Android host — use androidNative target for FFI")
}

public actual fun feof(stream: FILE?): CInt =
    throw UnsupportedOperationException("feof not available on Android host — use androidNative target for FFI")

public actual fun ferror(stream: FILE?): CInt =
    throw UnsupportedOperationException("ferror not available on Android host — use androidNative target for FFI")

public actual fun perror(s: String?) {
    throw UnsupportedOperationException("perror not available on Android host — use androidNative target for FFI")
}

public actual fun remove(filename: String?): CInt =
    throw UnsupportedOperationException("remove not available on Android host — use androidNative target for FFI")

public actual fun rename(old: String?, new: String?): CInt =
    throw UnsupportedOperationException("rename not available on Android host — use androidNative target for FFI")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile not available on Android host — use androidNative target for FFI")

public actual fun tmpnam(s: String?): String? =
    throw UnsupportedOperationException("tmpnam not available on Android host — use androidNative target for FFI")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf not available on Android host — use androidNative target for FFI")

public actual fun setbuf(stream: FILE?, buffer: String?) {
    throw UnsupportedOperationException("setbuf not available on Android host — use androidNative target for FFI")
}

