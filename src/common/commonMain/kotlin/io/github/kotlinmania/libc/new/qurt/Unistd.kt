// port-lint: source new/qurt/unistd.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val F_OK: Int = 0
public const val X_OK: Int = 1
public const val W_OK: Int = 2
public const val R_OK: Int = 4
public const val SEEK_SET: Int = 0
public const val SEEK_CUR: Int = 1
public const val SEEK_END: Int = 2
public const val _PC_LINK_MAX: Int = 0
public const val _PC_MAX_CANON: Int = 1
public const val _PC_MAX_INPUT: Int = 2
public const val _PC_NAME_MAX: Int = 3
public const val _PC_PATH_MAX: Int = 4
public const val _PC_PIPE_BUF: Int = 5
public const val _PC_CHOWN_RESTRICTED: Int = 6
public const val _PC_NO_TRUNC: Int = 7
public const val _PC_VDISABLE: Int = 8
public const val _PC_SYNC_IO: Int = 9
public const val _PC_ASYNC_IO: Int = 10
public const val _PC_PRIO_IO: Int = 11
public const val _PC_SOCK_MAXBUF: Int = 12
public const val _PC_FILESIZEBITS: Int = 13
public const val _PC_REC_INCR_XFER_SIZE: Int = 14
public const val _PC_REC_MAX_XFER_SIZE: Int = 15
public const val _PC_REC_MIN_XFER_SIZE: Int = 16
public const val _PC_REC_XFER_ALIGN: Int = 17
public const val _PC_ALLOC_SIZE_MIN: Int = 18
public const val _PC_SYMLINK_MAX: Int = 19
public const val _PC_2_SYMLINKS: Int = 20
public const val _SC_ARG_MAX: Int = 0
public const val _SC_CHILD_MAX: Int = 1
public const val _SC_CLK_TCK: Int = 2
public const val _SC_NGROUPS_MAX: Int = 3
public const val _SC_OPEN_MAX: Int = 4
public const val _SC_STREAM_MAX: Int = 5
public const val _SC_TZNAME_MAX: Int = 6
public const val _SC_JOB_CONTROL: Int = 7
public const val _SC_SAVED_IDS: Int = 8
public const val _SC_REALTIME_SIGNALS: Int = 9
public const val _SC_PRIORITY_SCHEDULING: Int = 10
public const val _SC_TIMERS: Int = 11
public const val _SC_ASYNCHRONOUS_IO: Int = 12
public const val _SC_PRIORITIZED_IO: Int = 13
public const val _SC_SYNCHRONIZED_IO: Int = 14
public const val _SC_FSYNC: Int = 15
public const val _SC_MAPPED_FILES: Int = 16
public const val _SC_MEMLOCK: Int = 17
public const val _SC_MEMLOCK_RANGE: Int = 18
public const val _SC_MEMORY_PROTECTION: Int = 19
public const val _SC_MESSAGE_PASSING: Int = 20
public const val _SC_SEMAPHORES: Int = 21
public const val _SC_SHARED_MEMORY_OBJECTS: Int = 22
public const val _SC_AIO_LISTIO_MAX: Int = 23
public const val _SC_AIO_MAX: Int = 24
public const val _SC_AIO_PRIO_DELTA_MAX: Int = 25
public const val _SC_DELAYTIMER_MAX: Int = 26
public const val _SC_MQ_OPEN_MAX: Int = 27
public const val _SC_MQ_PRIO_MAX: Int = 28
public const val _SC_VERSION: Int = 29
public const val _SC_PAGESIZE: Int = 30
public const val _SC_PAGE_SIZE: Int = _SC_PAGESIZE
public const val _SC_RTSIG_MAX: Int = 31
public const val _SC_SEM_NSEMS_MAX: Int = 32
public const val _SC_SEM_VALUE_MAX: Int = 33
public const val _SC_SIGQUEUE_MAX: Int = 34
public const val _SC_TIMER_MAX: Int = 35
public const val _SC_BC_BASE_MAX: Int = 36
public const val _SC_BC_DIM_MAX: Int = 37
public const val _SC_BC_SCALE_MAX: Int = 38
public const val _SC_BC_STRING_MAX: Int = 39
public const val _SC_COLL_WEIGHTS_MAX: Int = 40
public const val _SC_EQUIV_CLASS_MAX: Int = 41
public const val _SC_EXPR_NEST_MAX: Int = 42
public const val _SC_LINE_MAX: Int = 43
public const val _SC_RE_DUP_MAX: Int = 44
public const val _SC_CHARCLASS_NAME_MAX: Int = 45
public const val _SC_2_VERSION: Int = 46
public const val _SC_2_C_BIND: Int = 47
public const val _SC_2_C_DEV: Int = 48
public const val _SC_2_FORT_DEV: Int = 49
public const val _SC_2_FORT_RUN: Int = 50
public const val _SC_2_SW_DEV: Int = 51
public const val _SC_2_LOCALEDEF: Int = 52
public const val _SC_PII: Int = 53
public const val _SC_PII_XTI: Int = 54
public const val _SC_PII_SOCKET: Int = 55
public const val _SC_PII_INTERNET: Int = 56
public const val _SC_PII_OSI: Int = 57
public const val _SC_POLL: Int = 58
public const val _SC_SELECT: Int = 59
public const val _SC_UIO_MAXIOV: Int = 60
public const val _SC_IOV_MAX: Int = _SC_UIO_MAXIOV
public const val _SC_PII_INTERNET_STREAM: Int = 61
public const val _SC_PII_INTERNET_DGRAM: Int = 62
public const val _SC_PII_OSI_COTS: Int = 63
public const val _SC_PII_OSI_CLTS: Int = 64
public const val _SC_PII_OSI_M: Int = 65
public const val _SC_T_IOV_MAX: Int = 66
public const val _SC_THREADS: Int = 67
public const val _SC_THREAD_SAFE_FUNCTIONS: Int = 68
public const val _SC_GETGR_R_SIZE_MAX: Int = 69
public const val _SC_GETPW_R_SIZE_MAX: Int = 70
public const val _SC_LOGIN_NAME_MAX: Int = 71
public const val _SC_TTY_NAME_MAX: Int = 72
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: Int = 73
public const val _SC_THREAD_KEYS_MAX: Int = 74
public const val _SC_THREAD_STACK_MIN: Int = 75
public const val _SC_THREAD_THREADS_MAX: Int = 76
public const val _SC_THREAD_ATTR_STACKADDR: Int = 77
public const val _SC_THREAD_ATTR_STACKSIZE: Int = 78
public const val _SC_THREAD_PRIORITY_SCHEDULING: Int = 79
public const val _SC_THREAD_PRIO_INHERIT: Int = 80
public const val _SC_THREAD_PRIO_PROTECT: Int = 81
public const val _SC_THREAD_PROCESS_SHARED: Int = 82
public const val _SC_NPROCESSORS_CONF: Int = 83
public const val _SC_NPROCESSORS_ONLN: Int = 84
public const val _SC_PHYS_PAGES: Int = 85
public const val _SC_AVPHYS_PAGES: Int = 86
public const val _SC_ATEXIT_MAX: Int = 87
public const val _SC_PASS_MAX: Int = 88
public const val _SC_XOPEN_VERSION: Int = 89
public const val _SC_XOPEN_XCU_VERSION: Int = 90
public const val _SC_XOPEN_UNIX: Int = 91
public const val _SC_XOPEN_CRYPT: Int = 92
public const val _SC_XOPEN_ENH_I18N: Int = 93
public const val _SC_XOPEN_SHM: Int = 94
public const val _SC_2_CHAR_TERM: Int = 95
public const val _SC_2_C_VERSION: Int = 96
public const val _SC_2_UPE: Int = 97
public const val _SC_XOPEN_XPG2: Int = 98
public const val _SC_XOPEN_XPG3: Int = 99
public const val _SC_XOPEN_XPG4: Int = 100
public const val _SC_CHAR_BIT: Int = 101
public const val _SC_CHAR_MAX: Int = 102
public const val _SC_CHAR_MIN: Int = 103
public const val _SC_INT_MAX: Int = 104
public const val _SC_INT_MIN: Int = 105
public const val _SC_LONG_BIT: Int = 106
public const val _SC_WORD_BIT: Int = 107
public const val _SC_MB_LEN_MAX: Int = 108
public const val _SC_NZERO: Int = 109
public const val _SC_SSIZE_MAX: Int = 110
public const val _SC_SCHAR_MAX: Int = 111
public const val _SC_SCHAR_MIN: Int = 112
public const val _SC_SHRT_MAX: Int = 113
public const val _SC_SHRT_MIN: Int = 114
public const val _SC_UCHAR_MAX: Int = 115
public const val _SC_UINT_MAX: Int = 116
public const val _SC_ULONG_MAX: Int = 117
public const val _SC_USHRT_MAX: Int = 118
public const val _SC_NL_ARGMAX: Int = 119
public const val _SC_NL_LANGMAX: Int = 120
public const val _SC_NL_MSGMAX: Int = 121
public const val _SC_NL_NMAX: Int = 122
public const val _SC_NL_SETMAX: Int = 123
public const val _SC_NL_TEXTMAX: Int = 124
public const val _SC_XBS5_ILP32_OFF32: Int = 125
public const val _SC_XBS5_ILP32_OFFBIG: Int = 126
public const val _SC_XBS5_LP64_OFF64: Int = 127
public const val _SC_XBS5_LPBIG_OFFBIG: Int = 128
public const val _SC_XOPEN_LEGACY: Int = 129
public const val _SC_XOPEN_REALTIME: Int = 130
public const val _SC_XOPEN_REALTIME_THREADS: Int = 131
public const val _SC_ADVISORY_INFO: Int = 132
public const val _SC_BARRIERS: Int = 133
public const val _SC_CLOCK_SELECTION: Int = 137
public const val _SC_CPUTIME: Int = 138
public const val _SC_THREAD_CPUTIME: Int = 139
public const val _SC_MONOTONIC_CLOCK: Int = 149
public const val _SC_READER_WRITER_LOCKS: Int = 153
public const val _SC_SPIN_LOCKS: Int = 154
public const val _SC_REGEXP: Int = 155
public const val _SC_SHELL: Int = 157
public const val _SC_SPAWN: Int = 159
public const val _SC_SPORADIC_SERVER: Int = 160
public const val _SC_THREAD_SPORADIC_SERVER: Int = 161
public const val _SC_TIMEOUTS: Int = 164
public const val _SC_TYPED_MEMORY_OBJECTS: Int = 165
public const val _SC_2_PBS: Int = 168
public const val _SC_2_PBS_ACCOUNTING: Int = 169
public const val _SC_2_PBS_LOCATE: Int = 170
public const val _SC_2_PBS_MESSAGE: Int = 171
public const val _SC_2_PBS_TRACK: Int = 172
public const val _SC_SYMLOOP_MAX: Int = 173
public const val _SC_2_PBS_CHECKPOINT: Int = 175
public const val _SC_V6_ILP32_OFF32: Int = 176
public const val _SC_V6_ILP32_OFFBIG: Int = 177
public const val _SC_V6_LP64_OFF64: Int = 178
public const val _SC_V6_LPBIG_OFFBIG: Int = 179
public const val _SC_HOST_NAME_MAX: Int = 180
public const val _SC_TRACE: Int = 181
public const val _SC_TRACE_EVENT_FILTER: Int = 182
public const val _SC_TRACE_INHERIT: Int = 183
public const val _SC_TRACE_LOG: Int = 184
public const val _SC_IPV6: Int = 235
public const val _SC_RAW_SOCKETS: Int = 236
public const val _SC_V7_ILP32_OFF32: Int = 237
public const val _SC_V7_ILP32_OFFBIG: Int = 238
public const val _SC_V7_LP64_OFF64: Int = 239
public const val _SC_V7_LPBIG_OFFBIG: Int = 240
public const val _SC_SS_REPL_MAX: Int = 241
public const val _SC_TRACE_EVENT_NAME_MAX: Int = 242
public const val _SC_TRACE_NAME_MAX: Int = 243
public const val _SC_TRACE_SYS_MAX: Int = 244
public const val _SC_TRACE_USER_EVENT_MAX: Int = 245
public const val _SC_XOPEN_STREAMS: Int = 246
public const val _SC_THREAD_ROBUST_PRIO_INHERIT: Int = 247
public const val _SC_THREAD_ROBUST_PRIO_PROTECT: Int = 248

public expect fun access(pathname: String?, mode: Int): Int

public expect fun close(fd: Int): Int

public expect fun lseek(fd: Int, offset: Long, whence: Int): Long

public expect fun read(fd: Int, buf: COpaquePointer?, count: ULong): Int

public expect fun write(fd: Int, buf: COpaquePointer?, count: ULong): Int

public expect fun ftruncate(fd: Int, length: Long): Int

public expect fun unlink(pathname: String?): Int

public expect fun getcwd(buf: String?, size: ULong): String?

public expect fun rmdir(pathname: String?): Int

public expect fun getpid(): Int

public fun sleep(seconds: UInt): UInt = 0u

public expect fun sysconf(name: Int): Long
