@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.solid.aarch64.WcharT
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_a64l
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_abort
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_abs
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_access
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_alignedAlloc
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_asctime
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_asctimeR
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_asiprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_atQuickExit
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_atexit
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_atof
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_atoi
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_atol
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_atoll
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_bcmp
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_bcopy
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_bsearch
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_bzero
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_calloc
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_chdir
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_chmod
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_clearerr
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_clock
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_close
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_consttimeMemequal
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_creat
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_ctime
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_ctimeR
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_dehumanizeNumber
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_difftime
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_diprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_drand48
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_dup
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_dup2
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_duplocale
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_erand48
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_exit
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_explicitMemset
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fclose
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fcntl
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fdopen
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_feof
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_ferror
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fflush
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_ffs
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fgetc
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fgetpos
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fgets
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fileno
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fiprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fiscanf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_flockfile
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fopen
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fputc
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fputs
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fread
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_free
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_freelocale
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_freopen
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fscanf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fseek
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fseeko
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fsetpos
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fstat
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_ftell
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_ftello
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_ftrylockfile
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_funlockfile
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_fwrite
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_getStdioFile
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_get_OPTARG
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_get_OPTERR
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_get_OPTIND
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_get_OPTOPT
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_get_OPTRESET
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_get_SUBOPTARG
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_getc
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_getcUnlocked
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_getchar
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_getcharUnlocked
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_getcwd
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_getenv
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_getenvR
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_getopt
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_getpid
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_getprogname
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_gets
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_getsubopt
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_getw
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_getwd
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_gmtime
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_gmtimeR
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_heapsort
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_humanizeNumber
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_initstate
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_iprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_isalnum
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_isalpha
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_isblank
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_iscanf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_iscntrl
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_isdigit
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_isgraph
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_islower
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_isprint
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_ispunct
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_isspace
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_isupper
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_isxdigit
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_itoa
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_jrand48
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_l64a
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_l64aR
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_labs
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_lcong48
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_llabs
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_localeconv
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_localeconvL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_localtime
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_localtimeR
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_lrand48
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_lseek
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_lstat
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_ltoa
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_malloc
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mbCurMaxL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mblen
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mblenL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mbstowcs
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mbstowcsL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mbtowc
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mbtowcL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_memalign
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_memccpy
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_memchr
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_memcmp
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_memcpy
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_memmem
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_memmove
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_memrchr
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_memset
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mergesort
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mkdir
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mkdtemp
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mkostemp
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mkostemps
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mkstemp
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mktemp
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mktime
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_mrand48
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_newlocale
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_nlLanginfo
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_nlLanginfoL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_nrand48
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_open
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_perror
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_popcount
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_popcount32
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_popcount64
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_popcountl
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_popcountll
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_printf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_putc
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_putcUnlocked
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_putchar
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_putcharUnlocked
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_putenv
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_puts
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_putw
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_qabs
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_qsort
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_quickExit
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_radixsort
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_raise
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_rand
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_randR
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_random
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_read
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_realloc
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_remove
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_rename
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_rewind
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_rindex
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_rmdir
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_scanf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_seed48
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_set_OPTARG
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_set_OPTERR
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_set_OPTIND
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_set_OPTOPT
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_set_OPTRESET
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_set_SUBOPTARG
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_setbuf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_setenv
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_setlocale
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_setprogname
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_setstate
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_setvbuf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_signal
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_siprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_siscanf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_sleep
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_sniprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_snprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_sprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_sradixsort
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_srand
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_srand48
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_srandom
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_sscanf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_stat
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_stpcpy
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_stpncpy
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcasecmp
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcasestr
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcat
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strchr
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcmp
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcoll
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcollL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcpy
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcspn
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strdup
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strerror
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strerrorL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strerrorR
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_stresep
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strftime
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strlcat
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strlcpy
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strlen
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strncasecmp
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strncat
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strncmp
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strncpy
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strndup
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strnlen
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strpbrk
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strrchr
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strsep
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strspn
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strstr
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strsuftoll
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strsuftollx
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtod
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtodL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtof
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtofL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtok
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtokR
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtol
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtolL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtold
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoldL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoll
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtollL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoq
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoqL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoul
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoulL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoull
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoullL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtouq
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtouqL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strxfrm
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_strxfrmL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_tell
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_tempnam
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_time
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_tmpfile
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_tmpnam
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_tolower
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_toupper
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_ultoa
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_ungetc
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_unlink
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_unsetenv
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_usleep
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_utime
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_vasiprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_vdiprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_vfiprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_vfiscanf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_vfprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_viprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_viscanf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_vprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_vsiprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_vsiscanf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_vsniprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_vsnprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_vsprintf
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_wcstombs
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_wcstombsL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_wctomb
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_wctombL
import io.github.kotlinmania.libc.solid.cinterop.libc_solid_write
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual var OPTARG: COpaquePointer?
    get() = libc_solid_get_OPTARG()?.let { COpaquePointer(it.toLong()) }
    set(value) {
        libc_solid_set_OPTARG(value?.value?.toCPointer<ByteVar>())
    }

public actual var OPTERR: CInt
    get() = libc_solid_get_OPTERR()
    set(value) {
        libc_solid_set_OPTERR(value)
    }

public actual var OPTIND: CInt
    get() = libc_solid_get_OPTIND()
    set(value) {
        libc_solid_set_OPTIND(value)
    }

public actual var OPTOPT: CInt
    get() = libc_solid_get_OPTOPT()
    set(value) {
        libc_solid_set_OPTOPT(value)
    }

public actual var OPTRESET: CInt
    get() = libc_solid_get_OPTRESET()
    set(value) {
        libc_solid_set_OPTRESET(value)
    }

public actual var SUBOPTARG: COpaquePointer?
    get() = libc_solid_get_SUBOPTARG()?.let { COpaquePointer(it.toLong()) }
    set(value) {
        libc_solid_set_SUBOPTARG(value?.value?.toCPointer<ByteVar>())
    }

public actual fun isalnum(c: CInt): CInt =
    libc_solid_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    libc_solid_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    libc_solid_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    libc_solid_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    libc_solid_isgraph(c)

public actual fun islower(c: CInt): CInt =
    libc_solid_islower(c)

public actual fun isprint(c: CInt): CInt =
    libc_solid_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    libc_solid_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    libc_solid_isspace(c)

public actual fun isupper(c: CInt): CInt =
    libc_solid_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    libc_solid_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    libc_solid_isblank(c)

public actual fun tolower(c: CInt): CInt =
    libc_solid_tolower(c)

public actual fun toupper(c: CInt): CInt =
    libc_solid_toupper(c)

public actual fun getStdioFile(fileno: CInt): FILE? =
    libc_solid_getStdioFile(fileno)?.let { FILE(it.toLong()) }

public actual fun clearerr(arg1: FILE?) {
    libc_solid_clearerr(arg1?.handle?.toCPointer<ByteVar>())
}

public actual fun fclose(arg1: FILE?): CInt =
    libc_solid_fclose(arg1?.handle?.toCPointer<ByteVar>())

public actual fun feof(arg1: FILE?): CInt =
    libc_solid_feof(arg1?.handle?.toCPointer<ByteVar>())

public actual fun ferror(arg1: FILE?): CInt =
    libc_solid_ferror(arg1?.handle?.toCPointer<ByteVar>())

public actual fun fflush(arg1: FILE?): CInt =
    libc_solid_fflush(arg1?.handle?.toCPointer<ByteVar>())

public actual fun fgetc(arg1: FILE?): CInt =
    libc_solid_fgetc(arg1?.handle?.toCPointer<ByteVar>())

public actual fun fgets(arg1: COpaquePointer?, arg2: CInt, arg3: FILE?): COpaquePointer? =
    libc_solid_fgets(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fopen(arg1: String?, arg2: String?): FILE? =
    libc_solid_fopen(arg1, arg2)?.let { FILE(it.toLong()) }

public actual fun fprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    libc_solid_fprintf(arg1?.handle?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fputc(arg1: CInt, arg2: FILE?): CInt =
    libc_solid_fputc(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun fputs(arg1: String?, arg2: FILE?): CInt =
    libc_solid_fputs(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun fread(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    libc_solid_fread(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.handle?.toCPointer<ByteVar>())

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? =
    libc_solid_freopen(arg1, arg2, arg3?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    libc_solid_fscanf(arg1?.handle?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt =
    libc_solid_fseek(arg1?.handle?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun ftell(arg1: FILE?): CLong =
    libc_solid_ftell(arg1?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    libc_solid_fwrite(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.handle?.toCPointer<ByteVar>())

public actual fun getc(arg1: FILE?): CInt =
    libc_solid_getc(arg1?.handle?.toCPointer<ByteVar>())

public actual fun getchar(): CInt =
    libc_solid_getchar()

public actual fun perror(arg1: String?) {
    libc_solid_perror(arg1)
}

public actual fun printf(arg1: String?, vararg variadicArgs: Long): CInt =
    libc_solid_printf(arg1, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun putc(arg1: CInt, arg2: FILE?): CInt =
    libc_solid_putc(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun putchar(arg1: CInt): CInt =
    libc_solid_putchar(arg1)

public actual fun puts(arg1: String?): CInt =
    libc_solid_puts(arg1)

public actual fun remove(arg1: String?): CInt =
    libc_solid_remove(arg1)

public actual fun rewind(arg1: FILE?) {
    libc_solid_rewind(arg1?.handle?.toCPointer<ByteVar>())
}

public actual fun scanf(arg1: String?, vararg variadicArgs: Long): CInt =
    libc_solid_scanf(arg1, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun setbuf(arg1: FILE?, arg2: COpaquePointer?) {
    libc_solid_setbuf(arg1?.handle?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())
}

public actual fun setvbuf(arg1: FILE?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): CInt =
    libc_solid_setvbuf(arg1?.handle?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3, arg4)

public actual fun sscanf(arg1: String?, arg2: String?, vararg variadicArgs: Long): CInt =
    libc_solid_sscanf(arg1, arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun tmpfile(): FILE? =
    libc_solid_tmpfile()?.let { FILE(it.toLong()) }

public actual fun ungetc(arg1: CInt, arg2: FILE?): CInt =
    libc_solid_ungetc(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    libc_solid_vfprintf(arg1?.handle?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vprintf(arg1: String?, arg2: VaList): CInt =
    libc_solid_vprintf(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun gets(arg1: COpaquePointer?): COpaquePointer? =
    libc_solid_gets(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun sprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    libc_solid_sprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun tmpnam(arg1: String?): COpaquePointer? =
    libc_solid_tmpnam(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun vsprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    libc_solid_vsprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun rename(arg1: String?, arg2: String?): CInt =
    libc_solid_rename(arg1, arg2)

public actual fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    libc_solid_asiprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fiprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    libc_solid_fiprintf(arg1?.handle?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fiscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    libc_solid_fiscanf(arg1?.handle?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun iprintf(arg1: String?, vararg variadicArgs: Long): CInt =
    libc_solid_iprintf(arg1, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun iscanf(arg1: String?, vararg variadicArgs: Long): CInt =
    libc_solid_iscanf(arg1, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun siprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    libc_solid_siprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun siscanf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    libc_solid_siscanf(arg1?.value?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt =
    libc_solid_sniprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    libc_solid_vasiprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    libc_solid_vfiprintf(arg1?.handle?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    libc_solid_vfiscanf(arg1?.handle?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun viprintf(arg1: String?, arg2: VaList): CInt =
    libc_solid_viprintf(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun viscanf(arg1: String?, arg2: VaList): CInt =
    libc_solid_viscanf(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun vsiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    libc_solid_vsiprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    libc_solid_vsiscanf(arg1, arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vsniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    libc_solid_vsniprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.value?.toCPointer<ByteVar>())

public actual fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt =
    libc_solid_vdiprintf(arg1, arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun diprintf(arg1: CInt, arg2: String?, vararg variadicArgs: Long): CInt =
    libc_solid_diprintf(arg1, arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fgetpos(arg1: FILE?, arg2: COpaquePointer?): CInt =
    libc_solid_fgetpos(arg1?.handle?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(arg1: FILE?, arg2: COpaquePointer?): CInt =
    libc_solid_fsetpos(arg1?.handle?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())

public actual fun fdopen(arg1: CInt, arg2: String?): FILE? =
    libc_solid_fdopen(arg1, arg2)?.let { FILE(it.toLong()) }

public actual fun fileno(arg1: FILE?): CInt =
    libc_solid_fileno(arg1?.handle?.toCPointer<ByteVar>())

public actual fun flockfile(arg1: FILE?) {
    libc_solid_flockfile(arg1?.handle?.toCPointer<ByteVar>())
}

public actual fun ftrylockfile(arg1: FILE?): CInt =
    libc_solid_ftrylockfile(arg1?.handle?.toCPointer<ByteVar>())

public actual fun funlockfile(arg1: FILE?) {
    libc_solid_funlockfile(arg1?.handle?.toCPointer<ByteVar>())
}

public actual fun getcUnlocked(arg1: FILE?): CInt =
    libc_solid_getcUnlocked(arg1?.handle?.toCPointer<ByteVar>())

public actual fun getcharUnlocked(): CInt =
    libc_solid_getcharUnlocked()

public actual fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt =
    libc_solid_putcUnlocked(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun putcharUnlocked(arg1: CInt): CInt =
    libc_solid_putcharUnlocked(arg1)

public actual fun snprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt =
    libc_solid_snprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vsnprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    libc_solid_vsnprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.value?.toCPointer<ByteVar>())

public actual fun getw(arg1: FILE?): CInt =
    libc_solid_getw(arg1?.handle?.toCPointer<ByteVar>())

public actual fun putw(arg1: CInt, arg2: FILE?): CInt =
    libc_solid_putw(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun tempnam(arg1: String?, arg2: String?): COpaquePointer? =
    libc_solid_tempnam(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    libc_solid_fseeko(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    libc_solid_ftello(stream?.handle?.toCPointer<ByteVar>())

public actual fun atof(arg1: String?): Double =
    libc_solid_atof(arg1)

public actual fun strtod(arg1: String?, arg2: COpaquePointer?): Double =
    libc_solid_strtod(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun drand48(): Double =
    libc_solid_drand48()

public actual fun erand48(arg1: COpaquePointer?): Double =
    libc_solid_erand48(arg1?.value?.toCPointer<ByteVar>())

public actual fun strtof(arg1: String?, arg2: COpaquePointer?): Float =
    libc_solid_strtof(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun strtold(arg1: String?, arg2: COpaquePointer?): Double =
    libc_solid_strtold(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun strtodL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    libc_solid_strtodL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3.toLong().toCPointer<ByteVar>())

public actual fun strtofL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Float =
    libc_solid_strtofL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3.toLong().toCPointer<ByteVar>())

public actual fun strtoldL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    libc_solid_strtoldL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3.toLong().toCPointer<ByteVar>())

public actual fun exit(arg1: CInt): Nothing {
    libc_solid_exit(arg1)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    libc_solid_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun abs(arg1: CInt): CInt =
    libc_solid_abs(arg1)

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    libc_solid_atexit(0L.toCPointer<ByteVar>())

public actual fun atoi(arg1: String?): CInt =
    libc_solid_atoi(arg1)

public actual fun atol(arg1: String?): CLong =
    libc_solid_atol(arg1)

public actual fun itoa(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    libc_solid_itoa(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun ltoa(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    libc_solid_ltoa(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun ultoa(arg1: CUlong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    libc_solid_ultoa(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): COpaquePointer? =
    libc_solid_bsearch(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3, arg4, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun calloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    libc_solid_calloc(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    DivT()

public actual fun free(arg1: COpaquePointer?) {
    libc_solid_free(arg1?.value?.toCPointer<ByteVar>())
}

public actual fun getenv(arg1: String?): COpaquePointer? =
    libc_solid_getenv(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun labs(arg1: CLong): CLong =
    libc_solid_labs(arg1)

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    LdivT()

public actual fun malloc(arg1: SizeT): COpaquePointer? =
    libc_solid_malloc(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun qsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
    libc_solid_qsort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, 0L.toCPointer<ByteVar>())
}

public actual fun rand(): CInt =
    libc_solid_rand()

public actual fun realloc(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    libc_solid_realloc(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun srand(arg1: CUint) {
    libc_solid_srand(arg1)
}

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong =
    libc_solid_strtol(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlong =
    libc_solid_strtoul(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun mblen(arg1: String?, arg2: SizeT): CInt =
    libc_solid_mblen(arg1, arg2)

public actual fun mbstowcs(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    libc_solid_mbstowcs(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun wctomb(arg1: COpaquePointer?, arg2: WcharT): CInt =
    libc_solid_wctomb(arg1?.value?.toCPointer<ByteVar>(), arg2)

public actual fun mbtowc(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): CInt =
    libc_solid_mbtowc(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun wcstombs(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): SizeT =
    libc_solid_wcstombs(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun randR(arg1: COpaquePointer?): CInt =
    libc_solid_randR(arg1?.value?.toCPointer<ByteVar>())

public actual fun jrand48(arg1: COpaquePointer?): CLong =
    libc_solid_jrand48(arg1?.value?.toCPointer<ByteVar>())

public actual fun lcong48(arg1: COpaquePointer?) {
    libc_solid_lcong48(arg1?.value?.toCPointer<ByteVar>())
}

public actual fun lrand48(): CLong =
    libc_solid_lrand48()

public actual fun mrand48(): CLong =
    libc_solid_mrand48()

public actual fun nrand48(arg1: COpaquePointer?): CLong =
    libc_solid_nrand48(arg1?.value?.toCPointer<ByteVar>())

public actual fun seed48(arg1: COpaquePointer?): COpaquePointer? =
    libc_solid_seed48(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun srand48(arg1: CLong) {
    libc_solid_srand48(arg1)
}

public actual fun putenv(arg1: COpaquePointer?): CInt =
    libc_solid_putenv(arg1?.value?.toCPointer<ByteVar>())

public actual fun a64l(arg1: String?): CLong =
    libc_solid_a64l(arg1)

public actual fun l64a(arg1: CLong): COpaquePointer? =
    libc_solid_l64a(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun random(): CLong =
    libc_solid_random()

public actual fun setstate(arg1: COpaquePointer?): COpaquePointer? =
    libc_solid_setstate(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun initstate(arg1: CUint, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    libc_solid_initstate(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun srandom(arg1: CUint) {
    libc_solid_srandom(arg1)
}

public actual fun mkostemp(arg1: COpaquePointer?, arg2: CInt): CInt =
    libc_solid_mkostemp(arg1?.value?.toCPointer<ByteVar>(), arg2)

public actual fun mkostemps(arg1: COpaquePointer?, arg2: CInt, arg3: CInt): CInt =
    libc_solid_mkostemps(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun mkdtemp(arg1: COpaquePointer?): COpaquePointer? =
    libc_solid_mkdtemp(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mkstemp(arg1: COpaquePointer?): CInt =
    libc_solid_mkstemp(arg1?.value?.toCPointer<ByteVar>())

public actual fun mktemp(arg1: COpaquePointer?): COpaquePointer? =
    libc_solid_mktemp(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun atoll(arg1: String?): CLonglong =
    libc_solid_atoll(arg1)

public actual fun llabs(arg1: CLonglong): CLonglong =
    libc_solid_llabs(arg1)

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    LldivT()

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLonglong =
    libc_solid_strtoll(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlonglong =
    libc_solid_strtoull(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    libc_solid_alignedAlloc(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    libc_solid_atQuickExit(0L.toCPointer<ByteVar>())

public actual fun quickExit(arg1: CInt) {
    libc_solid_quickExit(arg1)
}

public actual fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt =
    libc_solid_setenv(arg1, arg2, arg3)

public actual fun unsetenv(arg1: String?): CInt =
    libc_solid_unsetenv(arg1)

public actual fun humanizeNumber(arg1: COpaquePointer?, arg2: SizeT, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt =
    libc_solid_humanizeNumber(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4, arg5, arg6)

public actual fun dehumanizeNumber(arg1: String?, arg2: COpaquePointer?): CInt =
    libc_solid_dehumanizeNumber(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun getenvR(arg1: String?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    libc_solid_getenvR(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun heapsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    libc_solid_heapsort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, 0L.toCPointer<ByteVar>())

public actual fun mergesort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    libc_solid_mergesort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, 0L.toCPointer<ByteVar>())

public actual fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUint): CInt =
    libc_solid_radixsort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>(), arg4)

public actual fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUint): CInt =
    libc_solid_sradixsort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>(), arg4)

public actual fun getprogname(): COpaquePointer? =
    libc_solid_getprogname()?.let { COpaquePointer(it.toLong()) }

public actual fun setprogname(arg1: String?) {
    libc_solid_setprogname(arg1)
}

public actual fun qabs(arg1: QuadT): QuadT =
    libc_solid_qabs(arg1)

public actual fun strtoq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): QuadT =
    libc_solid_strtoq(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strtouq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): UQuadT =
    libc_solid_strtouq(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong): CLonglong =
    libc_solid_strsuftoll(arg1, arg2, arg3, arg4)

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong, arg5: COpaquePointer?, arg6: SizeT): CLonglong =
    libc_solid_strsuftollx(arg1, arg2, arg3, arg4, arg5?.value?.toCPointer<ByteVar>(), arg6)

public actual fun l64aR(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): CInt =
    libc_solid_l64aR(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    QdivT()

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong =
    libc_solid_strtolL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlong =
    libc_solid_strtoulL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLonglong =
    libc_solid_strtollL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlonglong =
    libc_solid_strtoullL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtoqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): QuadT =
    libc_solid_strtoqL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtouqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): UQuadT =
    libc_solid_strtouqL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    libc_solid_mbCurMaxL(arg1.toLong().toCPointer<ByteVar>())

public actual fun mblenL(arg1: String?, arg2: SizeT, arg3: LocaleT): CInt =
    libc_solid_mblenL(arg1, arg2, arg3.toLong().toCPointer<ByteVar>())

public actual fun mbstowcsL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    libc_solid_mbstowcsL(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun wctombL(arg1: COpaquePointer?, arg2: WcharT, arg3: LocaleT): CInt =
    libc_solid_wctombL(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3.toLong().toCPointer<ByteVar>())

public actual fun mbtowcL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): CInt =
    libc_solid_mbtowcL(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun wcstombsL(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: LocaleT): SizeT =
    libc_solid_wcstombsL(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    libc_solid_memchr(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    libc_solid_memcmp(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    libc_solid_memcpy(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    libc_solid_memmove(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    libc_solid_memset(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    libc_solid_strcat(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strchr(arg1: String?, arg2: CInt): COpaquePointer? =
    libc_solid_strchr(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(arg1: String?, arg2: String?): CInt =
    libc_solid_strcmp(arg1, arg2)

public actual fun strcoll(arg1: String?, arg2: String?): CInt =
    libc_solid_strcoll(arg1, arg2)

public actual fun strcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    libc_solid_strcpy(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strcspn(arg1: String?, arg2: String?): SizeT =
    libc_solid_strcspn(arg1, arg2)

public actual fun strerror(arg1: CInt): COpaquePointer? =
    libc_solid_strerror(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun strlen(arg1: String?): SizeT =
    libc_solid_strlen(arg1)

public actual fun strncat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    libc_solid_strncat(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strncmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    libc_solid_strncmp(arg1, arg2, arg3)

public actual fun strncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    libc_solid_strncpy(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strpbrk(arg1: String?, arg2: String?): COpaquePointer? =
    libc_solid_strpbrk(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(arg1: String?, arg2: CInt): COpaquePointer? =
    libc_solid_strrchr(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(arg1: String?, arg2: String?): SizeT =
    libc_solid_strspn(arg1, arg2)

public actual fun strstr(arg1: String?, arg2: String?): COpaquePointer? =
    libc_solid_strstr(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    libc_solid_strtok(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strtokR(arg1: COpaquePointer?, arg2: String?, arg3: COpaquePointer?): COpaquePointer? =
    libc_solid_strtokR(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun strerrorR(arg1: CInt, arg2: COpaquePointer?, arg3: SizeT): CInt =
    libc_solid_strerrorR(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strxfrm(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    libc_solid_strxfrm(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): COpaquePointer? =
    libc_solid_memccpy(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3, arg4)?.let { COpaquePointer(it.toLong()) }

public actual fun strdup(arg1: String?): COpaquePointer? =
    libc_solid_strdup(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun stpcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    libc_solid_stpcpy(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun stpncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    libc_solid_stpncpy(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strnlen(arg1: String?, arg2: SizeT): SizeT =
    libc_solid_strnlen(arg1, arg2)

public actual fun memmem(arg1: COpaquePointer?, arg2: SizeT, arg3: COpaquePointer?, arg4: SizeT): COpaquePointer? =
    libc_solid_memmem(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>(), arg4)?.let { COpaquePointer(it.toLong()) }

public actual fun strcasestr(arg1: String?, arg2: String?): COpaquePointer? =
    libc_solid_strcasestr(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strlcat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    libc_solid_strlcat(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun strlcpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    libc_solid_strlcpy(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun strsep(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    libc_solid_strsep(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): COpaquePointer? =
    libc_solid_stresep(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strndup(arg1: String?, arg2: SizeT): COpaquePointer? =
    libc_solid_strndup(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    libc_solid_memrchr(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    libc_solid_explicitMemset(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    libc_solid_consttimeMemequal(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt =
    libc_solid_strcollL(arg1, arg2, arg3.toLong().toCPointer<ByteVar>())

public actual fun strxfrmL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    libc_solid_strxfrmL(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): COpaquePointer? =
    libc_solid_strerrorL(arg1, arg2.toLong().toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    libc_solid_bcmp(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT) {
    libc_solid_bcopy(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)
}

public actual fun bzero(arg1: COpaquePointer?, arg2: SizeT) {
    libc_solid_bzero(arg1?.value?.toCPointer<ByteVar>(), arg2)
}

public actual fun ffs(arg1: CInt): CInt =
    libc_solid_ffs(arg1)

public actual fun popcount(arg1: CUint): CUint =
    libc_solid_popcount(arg1)

public actual fun popcountl(arg1: CUlong): CUint =
    libc_solid_popcountl(arg1)

public actual fun popcountll(arg1: CUlonglong): CUint =
    libc_solid_popcountll(arg1)

public actual fun popcount32(arg1: UInt): CUint =
    libc_solid_popcount32(arg1)

public actual fun popcount64(arg1: ULong): CUint =
    libc_solid_popcount64(arg1)

public actual fun rindex(arg1: String?, arg2: CInt): COpaquePointer? =
    libc_solid_rindex(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strcasecmp(arg1: String?, arg2: String?): CInt =
    libc_solid_strcasecmp(arg1, arg2)

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    libc_solid_strncasecmp(arg1, arg2, arg3)

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    libc_solid_signal(arg1, arg2)

public actual fun raise(arg1: CInt): CInt =
    libc_solid_raise(arg1)

public actual fun asctime(arg1: COpaquePointer?): COpaquePointer? =
    libc_solid_asctime(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun clock(): ClockT =
    libc_solid_clock()

public actual fun ctime(arg1: COpaquePointer?): COpaquePointer? =
    libc_solid_ctime(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    libc_solid_difftime(arg1, arg2)

public actual fun gmtime(arg1: COpaquePointer?): COpaquePointer? =
    libc_solid_gmtime(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtime(arg1: COpaquePointer?): COpaquePointer? =
    libc_solid_localtime(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun time(arg1: COpaquePointer?): TimeT =
    libc_solid_time(arg1?.value?.toCPointer<ByteVar>())

public actual fun mktime(arg1: COpaquePointer?): TimeT =
    libc_solid_mktime(arg1?.value?.toCPointer<ByteVar>())

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: COpaquePointer?): SizeT =
    libc_solid_strftime(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.value?.toCPointer<ByteVar>())

public actual fun utime(arg1: String?, arg2: COpaquePointer?): CInt =
    libc_solid_utime(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun asctimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    libc_solid_asctimeR(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    libc_solid_ctimeR(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gmtimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    libc_solid_gmtimeR(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    libc_solid_localtimeR(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun stat(arg1: String?, arg2: COpaquePointer?): CInt =
    libc_solid_stat(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun lstat(arg1: String?, arg2: COpaquePointer?): CInt =
    libc_solid_lstat(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun fstat(arg1: CInt, arg2: COpaquePointer?): CInt =
    libc_solid_fstat(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun chmod(arg1: String?, arg2: ModeT): CInt =
    libc_solid_chmod(arg1, arg2)

public actual fun mkdir(arg1: String?, arg2: ModeT): CInt =
    libc_solid_mkdir(arg1, arg2)

public actual fun open(arg1: String?, arg2: CInt, vararg variadicArgs: Long): CInt =
    libc_solid_open(arg1, arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(arg1: String?, arg2: CInt): CInt =
    libc_solid_creat(arg1, arg2)

public actual fun close(arg1: CInt): CInt =
    libc_solid_close(arg1)

public actual fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    libc_solid_read(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    libc_solid_write(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun unlink(arg1: String?): CInt =
    libc_solid_unlink(arg1)

public actual fun tell(arg1: CInt): CLong =
    libc_solid_tell(arg1)

public actual fun dup(arg1: CInt): CInt =
    libc_solid_dup(arg1)

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    libc_solid_dup2(arg1, arg2)

public actual fun access(arg1: String?, arg2: CInt): CInt =
    libc_solid_access(arg1, arg2)

public actual fun rmdir(arg1: String?): CInt =
    libc_solid_rmdir(arg1)

public actual fun chdir(arg1: String?): CInt =
    libc_solid_chdir(arg1)

public actual fun getwd(arg1: COpaquePointer?): COpaquePointer? =
    libc_solid_getwd(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getcwd(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    libc_solid_getcwd(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt =
    libc_solid_getopt(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt =
    libc_solid_getsubopt(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3?.value?.toCPointer<ByteVar>())

public actual fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt =
    libc_solid_fcntl(arg1, arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpid(): PidT =
    libc_solid_getpid()

public actual fun sleep(arg1: CUint): CUint =
    libc_solid_sleep(arg1)

public actual fun usleep(arg1: UsecondsT): CInt =
    libc_solid_usleep(arg1)

public actual fun localeconv(): COpaquePointer? =
    libc_solid_localeconv()?.let { COpaquePointer(it.toLong()) }

public actual fun setlocale(arg1: CInt, arg2: String?): COpaquePointer? =
    libc_solid_setlocale(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun duplocale(arg1: LocaleT): LocaleT =
    (libc_solid_duplocale(arg1.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L).toULong()

public actual fun freelocale(arg1: LocaleT) {
    libc_solid_freelocale(arg1.toLong().toCPointer<ByteVar>())
}

public actual fun localeconvL(arg1: LocaleT): COpaquePointer? =
    libc_solid_localeconvL(arg1.toLong().toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT =
    (libc_solid_newlocale(arg1, arg2, arg3.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L).toULong()

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    libc_solid_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    libc_solid_nlLanginfoL(item, locale.toLong().toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    libc_solid_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    libc_solid_lseek(arg1, arg2, arg3)
