package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT

// spawn.h
public val POSIX_SPAWN_USEVFORK: CInt = 64

public val POSIX_SPAWN_SETSID: CInt = 128

// sys/syslog.h
public val LOG_CRON: CInt = 9 shl 3

public val LOG_AUTHPRIV: CInt = 10 shl 3

public val LOG_FTP: CInt = 11 shl 3

public val LOG_PERROR: CInt = 0x20

// net/if.h
public val IFF_UP: CInt = 0x1

public val IFF_BROADCAST: CInt = 0x2

public val IFF_DEBUG: CInt = 0x4

public val IFF_LOOPBACK: CInt = 0x8

public val IFF_POINTOPOINT: CInt = 0x10

public val IFF_NOTRAILERS: CInt = 0x20

public val IFF_RUNNING: CInt = 0x40

public val IFF_NOARP: CInt = 0x80

public val IFF_PROMISC: CInt = 0x100

public val IFF_ALLMULTI: CInt = 0x200

public val IFF_MASTER: CInt = 0x400

public val IFF_SLAVE: CInt = 0x800

public val IFF_MULTICAST: CInt = 0x1000

public val IFF_PORTSEL: CInt = 0x2000

public val IFF_AUTOMEDIA: CInt = 0x4000

public val IFF_DYNAMIC: CInt = 0x8000

// random.h
public val GRND_NONBLOCK: CUint = 1u

public val GRND_RANDOM: CUint = 2u

public val GRND_INSECURE: CUint = 4u

public val PC_LINK_MAX: CInt = 0

public val PC_MAX_CANON: CInt = 1

public val PC_MAX_INPUT: CInt = 2

public val PC_NAME_MAX: CInt = 3

public val PC_PATH_MAX: CInt = 4

public val PC_PIPE_BUF: CInt = 5

public val PC_CHOWN_RESTRICTED: CInt = 6

public val PC_NO_TRUNC: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_SYNC_IO: CInt = 9

public val PC_ASYNC_IO: CInt = 10

public val PC_PRIO_IO: CInt = 11

public val PC_SOCK_MAXBUF: CInt = 12

public val PC_FILESIZEBITS: CInt = 13

public val PC_REC_INCR_XFER_SIZE: CInt = 14

public val PC_REC_MAX_XFER_SIZE: CInt = 15

public val PC_REC_MIN_XFER_SIZE: CInt = 16

public val PC_REC_XFER_ALIGN: CInt = 17

public val PC_ALLOC_SIZE_MIN: CInt = 18

public val PC_SYMLINK_MAX: CInt = 19

public val PC_2_SYMLINKS: CInt = 20

public val SC_ARG_MAX: CInt = 0

public val SC_CHILD_MAX: CInt = 1

public val SC_CLK_TCK: CInt = 2

public val SC_NGROUPS_MAX: CInt = 3

public val SC_OPEN_MAX: CInt = 4

public val SC_STREAM_MAX: CInt = 5

public val SC_TZNAME_MAX: CInt = 6

public val SC_JOB_CONTROL: CInt = 7

public val SC_SAVED_IDS: CInt = 8

public val SC_REALTIME_SIGNALS: CInt = 9

public val SC_PRIORITY_SCHEDULING: CInt = 10

public val SC_TIMERS: CInt = 11

public val SC_ASYNCHRONOUS_IO: CInt = 12

public val SC_PRIORITIZED_IO: CInt = 13

public val SC_SYNCHRONIZED_IO: CInt = 14

public val SC_FSYNC: CInt = 15

public val SC_MAPPED_FILES: CInt = 16

public val SC_MEMLOCK: CInt = 17

public val SC_MEMLOCK_RANGE: CInt = 18

public val SC_MEMORY_PROTECTION: CInt = 19

public val SC_MESSAGE_PASSING: CInt = 20

public val SC_SEMAPHORES: CInt = 21

public val SC_SHARED_MEMORY_OBJECTS: CInt = 22

public val SC_AIO_LISTIO_MAX: CInt = 23

public val SC_AIO_MAX: CInt = 24

public val SC_AIO_PRIO_DELTA_MAX: CInt = 25

public val SC_DELAYTIMER_MAX: CInt = 26

public val SC_MQ_OPEN_MAX: CInt = 27

public val SC_MQ_PRIO_MAX: CInt = 28

public val SC_VERSION: CInt = 29

public val SC_PAGESIZE: CInt = 30

public val SC_PAGE_SIZE: CInt = 30

public val SC_RTSIG_MAX: CInt = 31

public val SC_SEM_NSEMS_MAX: CInt = 32

public val SC_SEM_VALUE_MAX: CInt = 33

public val SC_SIGQUEUE_MAX: CInt = 34

public val SC_TIMER_MAX: CInt = 35

public val SC_BC_BASE_MAX: CInt = 36

public val SC_BC_DIM_MAX: CInt = 37

public val SC_BC_SCALE_MAX: CInt = 38

public val SC_BC_STRING_MAX: CInt = 39

public val SC_COLL_WEIGHTS_MAX: CInt = 40

public val SC_EQUIV_CLASS_MAX: CInt = 41

public val SC_EXPR_NEST_MAX: CInt = 42

public val SC_LINE_MAX: CInt = 43

public val SC_RE_DUP_MAX: CInt = 44

public val SC_CHARCLASS_NAME_MAX: CInt = 45

public val SC_2_VERSION: CInt = 46

public val SC_2_C_BIND: CInt = 47

public val SC_2_C_DEV: CInt = 48

public val SC_2_FORT_DEV: CInt = 49

public val SC_2_FORT_RUN: CInt = 50

public val SC_2_SW_DEV: CInt = 51

public val SC_2_LOCALEDEF: CInt = 52

public val SC_PII: CInt = 53

public val SC_PII_XTI: CInt = 54

public val SC_PII_SOCKET: CInt = 55

public val SC_PII_INTERNET: CInt = 56

public val SC_PII_OSI: CInt = 57

public val SC_POLL: CInt = 58

public val SC_SELECT: CInt = 59

public val SC_UIO_MAXIOV: CInt = 60

public val SC_IOV_MAX: CInt = 60

public val SC_PII_INTERNET_STREAM: CInt = 61

public val SC_PII_INTERNET_DGRAM: CInt = 62

public val SC_PII_OSI_COTS: CInt = 63

public val SC_PII_OSI_CLTS: CInt = 64

public val SC_PII_OSI_M: CInt = 65

public val SC_T_IOV_MAX: CInt = 66

public val SC_THREADS: CInt = 67

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 68

public val SC_GETGR_R_SIZE_MAX: CInt = 69

public val SC_GETPW_R_SIZE_MAX: CInt = 70

public val SC_LOGIN_NAME_MAX: CInt = 71

public val SC_TTY_NAME_MAX: CInt = 72

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 73

public val SC_THREAD_KEYS_MAX: CInt = 74

public val SC_THREAD_STACK_MIN: CInt = 75

public val SC_THREAD_THREADS_MAX: CInt = 76

public val SC_THREAD_ATTR_STACKADDR: CInt = 77

public val SC_THREAD_ATTR_STACKSIZE: CInt = 78

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 79

public val SC_THREAD_PRIO_INHERIT: CInt = 80

public val SC_THREAD_PRIO_PROTECT: CInt = 81

public val SC_THREAD_PROCESS_SHARED: CInt = 82

public val SC_NPROCESSORS_CONF: CInt = 83

public val SC_NPROCESSORS_ONLN: CInt = 84

public val SC_PHYS_PAGES: CInt = 85

public val SC_AVPHYS_PAGES: CInt = 86

public val SC_ATEXIT_MAX: CInt = 87

public val SC_PASS_MAX: CInt = 88

public val SC_XOPEN_VERSION: CInt = 89

public val SC_XOPEN_XCU_VERSION: CInt = 90

public val SC_XOPEN_UNIX: CInt = 91

public val SC_XOPEN_CRYPT: CInt = 92

public val SC_XOPEN_ENH_I18N: CInt = 93

public val SC_XOPEN_SHM: CInt = 94

public val SC_2_CHAR_TERM: CInt = 95

public val SC_2_C_VERSION: CInt = 96

public val SC_2_UPE: CInt = 97

public val SC_XOPEN_XPG2: CInt = 98

public val SC_XOPEN_XPG3: CInt = 99

public val SC_XOPEN_XPG4: CInt = 100

public val SC_CHAR_BIT: CInt = 101

public val SC_CHAR_MAX: CInt = 102

public val SC_CHAR_MIN: CInt = 103

public val SC_INT_MAX: CInt = 104

public val SC_INT_MIN: CInt = 105

public val SC_LONG_BIT: CInt = 106

public val SC_WORD_BIT: CInt = 107

public val SC_MB_LEN_MAX: CInt = 108

public val SC_NZERO: CInt = 109

public val SC_SSIZE_MAX: CInt = 110

public val SC_SCHAR_MAX: CInt = 111

public val SC_SCHAR_MIN: CInt = 112

public val SC_SHRT_MAX: CInt = 113

public val SC_SHRT_MIN: CInt = 114

public val SC_UCHAR_MAX: CInt = 115

public val SC_UINT_MAX: CInt = 116

public val SC_ULONG_MAX: CInt = 117

public val SC_USHRT_MAX: CInt = 118

public val SC_NL_ARGMAX: CInt = 119

public val SC_NL_LANGMAX: CInt = 120

public val SC_NL_MSGMAX: CInt = 121

public val SC_NL_NMAX: CInt = 122

public val SC_NL_SETMAX: CInt = 123

public val SC_NL_TEXTMAX: CInt = 124

public val SC_XBS5_ILP32_OFF32: CInt = 125

public val SC_XBS5_ILP32_OFFBIG: CInt = 126

public val SC_XBS5_LP64_OFF64: CInt = 127

public val SC_XBS5_LPBIG_OFFBIG: CInt = 128

public val SC_XOPEN_LEGACY: CInt = 129

public val SC_XOPEN_REALTIME: CInt = 130

public val SC_XOPEN_REALTIME_THREADS: CInt = 131

public val SC_ADVISORY_INFO: CInt = 132

public val SC_BARRIERS: CInt = 133

public val SC_BASE: CInt = 134

public val SC_C_LANG_SUPPORT: CInt = 135

public val SC_C_LANG_SUPPORT_R: CInt = 136

public val SC_CLOCK_SELECTION: CInt = 137

public val SC_CPUTIME: CInt = 138

public val SC_THREAD_CPUTIME: CInt = 139

public val SC_DEVICE_IO: CInt = 140

public val SC_DEVICE_SPECIFIC: CInt = 141

public val SC_DEVICE_SPECIFIC_R: CInt = 142

public val SC_FD_MGMT: CInt = 143

public val SC_FIFO: CInt = 144

public val SC_PIPE: CInt = 145

public val SC_FILE_ATTRIBUTES: CInt = 146

public val SC_FILE_LOCKING: CInt = 147

public val SC_FILE_SYSTEM: CInt = 148

public val SC_MONOTONIC_CLOCK: CInt = 149

public val SC_MULTI_PROCESS: CInt = 150

public val SC_SINGLE_PROCESS: CInt = 151

public val SC_NETWORKING: CInt = 152

public val SC_READER_WRITER_LOCKS: CInt = 153

public val SC_SPIN_LOCKS: CInt = 154

public val SC_REGEXP: CInt = 155

public val SC_REGEX_VERSION: CInt = 156

public val SC_SHELL: CInt = 157

public val SC_SIGNALS: CInt = 158

public val SC_SPAWN: CInt = 159

public val SC_SPORADIC_SERVER: CInt = 160

public val SC_THREAD_SPORADIC_SERVER: CInt = 161

public val SC_SYSTEM_DATABASE: CInt = 162

public val SC_SYSTEM_DATABASE_R: CInt = 163

public val SC_TIMEOUTS: CInt = 164

public val SC_TYPED_MEMORY_OBJECTS: CInt = 165

public val SC_USER_GROUPS: CInt = 166

public val SC_USER_GROUPS_R: CInt = 167

public val SC_2_PBS: CInt = 168

public val SC_2_PBS_ACCOUNTING: CInt = 169

public val SC_2_PBS_LOCATE: CInt = 170

public val SC_2_PBS_MESSAGE: CInt = 171

public val SC_2_PBS_TRACK: CInt = 172

public val SC_SYMLOOP_MAX: CInt = 173

public val SC_STREAMS: CInt = 174

public val SC_2_PBS_CHECKPOINT: CInt = 175

public val SC_V6_ILP32_OFF32: CInt = 176

public val SC_V6_ILP32_OFFBIG: CInt = 177

public val SC_V6_LP64_OFF64: CInt = 178

public val SC_V6_LPBIG_OFFBIG: CInt = 179

public val SC_HOST_NAME_MAX: CInt = 180

public val SC_TRACE: CInt = 181

public val SC_TRACE_EVENT_FILTER: CInt = 182

public val SC_TRACE_INHERIT: CInt = 183

public val SC_TRACE_LOG: CInt = 184

public val SC_LEVEL1_ICACHE_SIZE: CInt = 185

public val SC_LEVEL1_ICACHE_ASSOC: CInt = 186

public val SC_LEVEL1_ICACHE_LINESIZE: CInt = 187

public val SC_LEVEL1_DCACHE_SIZE: CInt = 188

public val SC_LEVEL1_DCACHE_ASSOC: CInt = 189

public val SC_LEVEL1_DCACHE_LINESIZE: CInt = 190

public val SC_LEVEL2_CACHE_SIZE: CInt = 191

public val SC_LEVEL2_CACHE_ASSOC: CInt = 192

public val SC_LEVEL2_CACHE_LINESIZE: CInt = 193

public val SC_LEVEL3_CACHE_SIZE: CInt = 194

public val SC_LEVEL3_CACHE_ASSOC: CInt = 195

public val SC_LEVEL3_CACHE_LINESIZE: CInt = 196

public val SC_LEVEL4_CACHE_SIZE: CInt = 197

public val SC_LEVEL4_CACHE_ASSOC: CInt = 198

public val SC_LEVEL4_CACHE_LINESIZE: CInt = 199

public val SC_IPV6: CInt = 235

public val SC_RAW_SOCKETS: CInt = 236

public val SC_V7_ILP32_OFF32: CInt = 237

public val SC_V7_ILP32_OFFBIG: CInt = 238

public val SC_V7_LP64_OFF64: CInt = 239

public val SC_V7_LPBIG_OFFBIG: CInt = 240

public val SC_SS_REPL_MAX: CInt = 241

public val SC_TRACE_EVENT_NAME_MAX: CInt = 242

public val SC_TRACE_NAME_MAX: CInt = 243

public val SC_TRACE_SYS_MAX: CInt = 244

public val SC_TRACE_USER_EVENT_MAX: CInt = 245

public val SC_XOPEN_STREAMS: CInt = 246

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 247

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 248

public val SC_MINSIGSTKSZ: CInt = 249

public val SC_SIGSTKSZ: CInt = 250

public val CS_PATH: CInt = 0

public val CS_V6_WIDTH_RESTRICTED_ENVS: CInt = 1

public val CS_GNU_LIBC_VERSION: CInt = 2

public val CS_GNU_LIBPTHREAD_VERSION: CInt = 3

public val CS_V5_WIDTH_RESTRICTED_ENVS: CInt = 4

public val CS_V7_WIDTH_RESTRICTED_ENVS: CInt = 5

public val CS_LFS_CFLAGS: CInt = 1000

public val CS_LFS_LDFLAGS: CInt = 1001

public val CS_LFS_LIBS: CInt = 1002

public val CS_LFS_LINTFLAGS: CInt = 1003

public val CS_LFS64_CFLAGS: CInt = 1004

public val CS_LFS64_LDFLAGS: CInt = 1005

public val CS_LFS64_LIBS: CInt = 1006

public val CS_LFS64_LINTFLAGS: CInt = 1007

public val CS_XBS5_ILP32_OFF32_CFLAGS: CInt = 1100

public val CS_XBS5_ILP32_OFF32_LDFLAGS: CInt = 1101

public val CS_XBS5_ILP32_OFF32_LIBS: CInt = 1102

public val CS_XBS5_ILP32_OFF32_LINTFLAGS: CInt = 1103

public val CS_XBS5_ILP32_OFFBIG_CFLAGS: CInt = 1104

public val CS_XBS5_ILP32_OFFBIG_LDFLAGS: CInt = 1105

public val CS_XBS5_ILP32_OFFBIG_LIBS: CInt = 1106

public val CS_XBS5_ILP32_OFFBIG_LINTFLAGS: CInt = 1107

public val CS_XBS5_LP64_OFF64_CFLAGS: CInt = 1108

public val CS_XBS5_LP64_OFF64_LDFLAGS: CInt = 1109

public val CS_XBS5_LP64_OFF64_LIBS: CInt = 1110

public val CS_XBS5_LP64_OFF64_LINTFLAGS: CInt = 1111

public val CS_XBS5_LPBIG_OFFBIG_CFLAGS: CInt = 1112

public val CS_XBS5_LPBIG_OFFBIG_LDFLAGS: CInt = 1113

public val CS_XBS5_LPBIG_OFFBIG_LIBS: CInt = 1114

public val CS_XBS5_LPBIG_OFFBIG_LINTFLAGS: CInt = 1115

public val CS_POSIX_V6_ILP32_OFF32_CFLAGS: CInt = 1116

public val CS_POSIX_V6_ILP32_OFF32_LDFLAGS: CInt = 1117

public val CS_POSIX_V6_ILP32_OFF32_LIBS: CInt = 1118

public val CS_POSIX_V6_ILP32_OFF32_LINTFLAGS: CInt = 1119

public val CS_POSIX_V6_ILP32_OFFBIG_CFLAGS: CInt = 1120

public val CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS: CInt = 1121

public val CS_POSIX_V6_ILP32_OFFBIG_LIBS: CInt = 1122

public val CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS: CInt = 1123

public val CS_POSIX_V6_LP64_OFF64_CFLAGS: CInt = 1124

public val CS_POSIX_V6_LP64_OFF64_LDFLAGS: CInt = 1125

public val CS_POSIX_V6_LP64_OFF64_LIBS: CInt = 1126

public val CS_POSIX_V6_LP64_OFF64_LINTFLAGS: CInt = 1127

public val CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS: CInt = 1128

public val CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS: CInt = 1129

public val CS_POSIX_V6_LPBIG_OFFBIG_LIBS: CInt = 1130

public val CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS: CInt = 1131

public val CS_POSIX_V7_ILP32_OFF32_CFLAGS: CInt = 1132

public val CS_POSIX_V7_ILP32_OFF32_LDFLAGS: CInt = 1133

public val CS_POSIX_V7_ILP32_OFF32_LIBS: CInt = 1134

public val CS_POSIX_V7_ILP32_OFF32_LINTFLAGS: CInt = 1135

public val CS_POSIX_V7_ILP32_OFFBIG_CFLAGS: CInt = 1136

public val CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS: CInt = 1137

public val CS_POSIX_V7_ILP32_OFFBIG_LIBS: CInt = 1138

public val CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS: CInt = 1139

public val CS_POSIX_V7_LP64_OFF64_CFLAGS: CInt = 1140

public val CS_POSIX_V7_LP64_OFF64_LDFLAGS: CInt = 1141

public val CS_POSIX_V7_LP64_OFF64_LIBS: CInt = 1142

public val CS_POSIX_V7_LP64_OFF64_LINTFLAGS: CInt = 1143

public val CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS: CInt = 1144

public val CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS: CInt = 1145

public val CS_POSIX_V7_LPBIG_OFFBIG_LIBS: CInt = 1146

public val CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS: CInt = 1147

public val CS_V6_ENV: CInt = 1148

public val CS_V7_ENV: CInt = 1149

public val PTHREAD_PROCESS_PRIVATE: PthreadProcessShared = 0u

public val PTHREAD_PROCESS_SHARED: PthreadProcessShared = 1u

public val PTHREAD_EXPLICIT_SCHED: PthreadInheritsched = 0u

public val PTHREAD_INHERIT_SCHED: PthreadInheritsched = 1u

public val PTHREAD_SCOPE_SYSTEM: PthreadContentionscope = 0u

public val PTHREAD_SCOPE_PROCESS: PthreadContentionscope = 1u

public val PTHREAD_CREATE_JOINABLE: PthreadDetachstate = 0u

public val PTHREAD_CREATE_DETACHED: PthreadDetachstate = 1u

public val PTHREAD_PRIO_NONE: PthreadMutexProtocol = 0u

public val PTHREAD_PRIO_INHERIT: PthreadMutexProtocol = 1u

public val PTHREAD_PRIO_PROTECT: PthreadMutexProtocol = 2u

public val PTHREAD_MUTEX_TIMED: PthreadMutexType = 0u

public val PTHREAD_MUTEX_ERRORCHECK: PthreadMutexType = 1u

public val PTHREAD_MUTEX_RECURSIVE: PthreadMutexType = 2u

public val PTHREAD_MUTEX_STALLED: PthreadMutexRobustness = 0u

public val PTHREAD_MUTEX_ROBUST: PthreadMutexRobustness = 256u

public val RLIMIT_CPU: RlimitResourceT = 0u

public val RLIMIT_FSIZE: RlimitResourceT = 1u

public val RLIMIT_DATA: RlimitResourceT = 2u

public val RLIMIT_STACK: RlimitResourceT = 3u

public val RLIMIT_CORE: RlimitResourceT = 4u

public val RLIMIT_RSS: RlimitResourceT = 5u

public val RLIMIT_MEMLOCK: RlimitResourceT = 6u

public val RLIMIT_NPROC: RlimitResourceT = 7u

public val RLIMIT_OFILE: RlimitResourceT = 8u

public val RLIMIT_NOFILE: RlimitResourceT = 8u

public val RLIMIT_SBSIZE: RlimitResourceT = 9u

public val RLIMIT_AS: RlimitResourceT = 10u

public val RLIMIT_VMEM: RlimitResourceT = 10u

public val RLIMIT_NLIMITS: RlimitResourceT = 11u

public val RLIM_NLIMITS: RlimitResourceT = 11u

public val RUSAGE_SELF: RusageWho = 0

public val RUSAGE_CHILDREN: RusageWho = -1

public val PRIO_PROCESS: PriorityWhich = 0u

public val PRIO_PGRP: PriorityWhich = 1u

public val PRIO_USER: PriorityWhich = 2u

public val UT_LINESIZE: Int = 32

public val UT_NAMESIZE: Int = 32

public val UT_HOSTSIZE: Int = 256

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_CLOEXEC: CInt = 4194304

public val SOCK_NONBLOCK: CInt = 2048

public val MSG_OOB: CInt = 1

public val MSG_PEEK: CInt = 2

public val MSG_DONTROUTE: CInt = 4

public val MSG_EOR: CInt = 8

public val MSG_TRUNC: CInt = 16

public val MSG_CTRUNC: CInt = 32

public val MSG_WAITALL: CInt = 64

public val MSG_DONTWAIT: CInt = 128

public val MSG_NOSIGNAL: CInt = 1024

public val MSG_CMSG_CLOEXEC: CInt = 0x40000000

public val SCM_RIGHTS: CInt = 1

public val SCM_TIMESTAMP: CInt = 2

public val SCM_CREDS: CInt = 3

public val SO_DEBUG: CInt = 1

public val SO_ACCEPTCONN: CInt = 2

public val SO_REUSEADDR: CInt = 4

public val SO_KEEPALIVE: CInt = 8

public val SO_DONTROUTE: CInt = 16

public val SO_BROADCAST: CInt = 32

public val SO_USELOOPBACK: CInt = 64

public val SO_LINGER: CInt = 128

public val SO_OOBINLINE: CInt = 256

public val SO_REUSEPORT: CInt = 512

public val SO_SNDBUF: CInt = 4097

public val SO_RCVBUF: CInt = 4098

public val SO_SNDLOWAT: CInt = 4099

public val SO_RCVLOWAT: CInt = 4100

public val SO_SNDTIMEO: CInt = 4101

public val SO_RCVTIMEO: CInt = 4102

public val SO_ERROR: CInt = 4103

public val SO_STYLE: CInt = 4104

public val SO_TYPE: CInt = 4104

public val IPPROTO_IP: CInt = 0

public val IPPROTO_ICMP: CInt = 1

public val IPPROTO_IGMP: CInt = 2

public val IPPROTO_IPIP: CInt = 4

public val IPPROTO_TCP: CInt = 6

public val IPPROTO_EGP: CInt = 8

public val IPPROTO_PUP: CInt = 12

public val IPPROTO_UDP: CInt = 17

public val IPPROTO_IDP: CInt = 22

public val IPPROTO_TP: CInt = 29

public val IPPROTO_DCCP: CInt = 33

public val IPPROTO_IPV6: CInt = 41

public val IPPROTO_RSVP: CInt = 46

public val IPPROTO_GRE: CInt = 47

public val IPPROTO_ESP: CInt = 50

public val IPPROTO_AH: CInt = 51

public val IPPROTO_MTP: CInt = 92

public val IPPROTO_BEETPH: CInt = 94

public val IPPROTO_ENCAP: CInt = 98

public val IPPROTO_PIM: CInt = 103

public val IPPROTO_COMP: CInt = 108

public val IPPROTO_L2TP: CInt = 115

public val IPPROTO_SCTP: CInt = 132

public val IPPROTO_UDPLITE: CInt = 136

public val IPPROTO_MPLS: CInt = 137

public val IPPROTO_ETHERNET: CInt = 143

public val IPPROTO_RAW: CInt = 255

public val IPPROTO_MPTCP: CInt = 262

public val IPPROTO_MAX: CInt = 263

public val IPPROTO_HOPOPTS: CInt = 0

public val IPPROTO_ROUTING: CInt = 43

public val IPPROTO_FRAGMENT: CInt = 44

public val IPPROTO_ICMPV6: CInt = 58

public val IPPROTO_NONE: CInt = 59

public val IPPROTO_DSTOPTS: CInt = 60

public val IPPROTO_MH: CInt = 135

public val IPPORT_ECHO: InPortT = 7u

public val IPPORT_DISCARD: InPortT = 9u

public val IPPORT_SYSTAT: InPortT = 11u

public val IPPORT_DAYTIME: InPortT = 13u

public val IPPORT_NETSTAT: InPortT = 15u

public val IPPORT_FTP: InPortT = 21u

public val IPPORT_TELNET: InPortT = 23u

public val IPPORT_SMTP: InPortT = 25u

public val IPPORT_TIMESERVER: InPortT = 37u

public val IPPORT_NAMESERVER: InPortT = 42u

public val IPPORT_WHOIS: InPortT = 43u

public val IPPORT_MTP: InPortT = 57u

public val IPPORT_TFTP: InPortT = 69u

public val IPPORT_RJE: InPortT = 77u

public val IPPORT_FINGER: InPortT = 79u

public val IPPORT_TTYLINK: InPortT = 87u

public val IPPORT_SUPDUP: InPortT = 95u

public val IPPORT_EXECSERVER: InPortT = 512u

public val IPPORT_LOGINSERVER: InPortT = 513u

public val IPPORT_CMDSERVER: InPortT = 514u

public val IPPORT_EFSSERVER: InPortT = 520u

public val IPPORT_BIFFUDP: InPortT = 512u

public val IPPORT_WHOSERVER: InPortT = 513u

public val IPPORT_ROUTESERVER: InPortT = 520u

public val IPPORT_USERRESERVED: InPortT = 5000u

public val DT_UNKNOWN: CUchar = 0u

public val DT_FIFO: CUchar = 1u

public val DT_CHR: CUchar = 2u

public val DT_DIR: CUchar = 4u

public val DT_BLK: CUchar = 6u

public val DT_REG: CUchar = 8u

public val DT_LNK: CUchar = 10u

public val DT_SOCK: CUchar = 12u

public val DT_WHT: CUchar = 14u

public val ST_RDONLY: CUlong = 1uL

public val ST_NOSUID: CUlong = 2uL

public val ST_NOEXEC: CUlong = 8uL

public val ST_SYNCHRONOUS: CUlong = 16uL

public val ST_NOATIME: CUlong = 32uL

public val ST_RELATIME: CUlong = 64uL

public val RTLD_DI_LMID: CInt = 1

public val RTLD_DI_LINKMAP: CInt = 2

public val RTLD_DI_CONFIGADDR: CInt = 3

public val RTLD_DI_SERINFO: CInt = 4

public val RTLD_DI_SERINFOSIZE: CInt = 5

public val RTLD_DI_ORIGIN: CInt = 6

public val RTLD_DI_PROFILENAME: CInt = 7

public val RTLD_DI_PROFILEOUT: CInt = 8

public val RTLD_DI_TLS_MODID: CInt = 9

public val RTLD_DI_TLS_DATA: CInt = 10

public val RTLD_DI_PHDR: CInt = 11

public val RTLD_DI_MAX: CInt = 11

public val SI_ASYNCIO: CInt = -4

public val SI_MESGQ: CInt = -3

public val SI_TIMER: CInt = -2

public val SI_QUEUE: CInt = -1

public val SI_USER: CInt = 0

public val ILL_ILLOPC: CInt = 1

public val ILL_ILLOPN: CInt = 2

public val ILL_ILLADR: CInt = 3

public val ILL_ILLTRP: CInt = 4

public val ILL_PRVOPC: CInt = 5

public val ILL_PRVREG: CInt = 6

public val ILL_COPROC: CInt = 7

public val ILL_BADSTK: CInt = 8

public val FPE_INTDIV: CInt = 1

public val FPE_INTOVF: CInt = 2

public val FPE_FLTDIV: CInt = 3

public val FPE_FLTOVF: CInt = 4

public val FPE_FLTUND: CInt = 5

public val FPE_FLTRES: CInt = 6

public val FPE_FLTINV: CInt = 7

public val FPE_FLTSUB: CInt = 8

public val SEGV_MAPERR: CInt = 1

public val SEGV_ACCERR: CInt = 2

public val BUS_ADRALN: CInt = 1

public val BUS_ADRERR: CInt = 2

public val BUS_OBJERR: CInt = 3

public val TRAP_BRKPT: CInt = 1

public val TRAP_TRACE: CInt = 2

public val CLD_EXITED: CInt = 1

public val CLD_KILLED: CInt = 2

public val CLD_DUMPED: CInt = 3

public val CLD_TRAPPED: CInt = 4

public val CLD_STOPPED: CInt = 5

public val CLD_CONTINUED: CInt = 6

public val POLL_IN: CInt = 1

public val POLL_OUT: CInt = 2

public val POLL_MSG: CInt = 3

public val POLL_ERR: CInt = 4

public val POLL_PRI: CInt = 5

public val POLL_HUP: CInt = 6

public val SIGEV_SIGNAL: CInt = 0

public val SIGEV_NONE: CInt = 1

public val SIGEV_THREAD: CInt = 2

public val REG_GS: CUint = 0u

public val REG_FS: CUint = 1u

public val REG_ES: CUint = 2u

public val REG_DS: CUint = 3u

public val REG_EDI: CUint = 4u

public val REG_ESI: CUint = 5u

public val REG_EBP: CUint = 6u

public val REG_ESP: CUint = 7u

public val REG_EBX: CUint = 8u

public val REG_EDX: CUint = 9u

public val REG_ECX: CUint = 10u

public val REG_EAX: CUint = 11u

public val REG_TRAPNO: CUint = 12u

public val REG_ERR: CUint = 13u

public val REG_EIP: CUint = 14u

public val REG_CS: CUint = 15u

public val REG_EFL: CUint = 16u

public val REG_UESP: CUint = 17u

public val REG_SS: CUint = 18u

public val IOC_VOID: IoctlDir = 0u

public val IOC_OUT: IoctlDir = 1u

public val IOC_IN: IoctlDir = 2u

public val IOC_INOUT: IoctlDir = 3u

public val IOC_8: IoctlDatum = 0u

public val IOC_16: IoctlDatum = 1u

public val IOC_32: IoctlDatum = 2u

public val IOC_64: IoctlDatum = 3u

public val TCP_ESTABLISHED: CUint = 1u

public val TCP_SYN_SENT: CUint = 2u

public val TCP_SYN_RECV: CUint = 3u

public val TCP_FIN_WAIT1: CUint = 4u

public val TCP_FIN_WAIT2: CUint = 5u

public val TCP_TIME_WAIT: CUint = 6u

public val TCP_CLOSE: CUint = 7u

public val TCP_CLOSE_WAIT: CUint = 8u

public val TCP_LAST_ACK: CUint = 9u

public val TCP_LISTEN: CUint = 10u

public val TCP_CLOSING: CUint = 11u

public val TCP_CA_OPEN: TcpCaState = 0u

public val TCP_CA_DISORDER: TcpCaState = 1u

public val TCP_CA_CWR: TcpCaState = 2u

public val TCP_CA_RECOVERY: TcpCaState = 3u

public val TCP_CA_LOSS: TcpCaState = 4u

public val TCP_NO_QUEUE: CUint = 0u

public val TCP_RECV_QUEUE: CUint = 1u

public val TCP_SEND_QUEUE: CUint = 2u

public val TCP_QUEUES_NR: CUint = 3u

public val P_ALL: IdtypeT = 0u

public val P_PID: IdtypeT = 1u

public val P_PGID: IdtypeT = 2u

public val SS_ONSTACK: CInt = 1

public val SS_DISABLE: CInt = 4

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(lock = PTHREAD_SPIN_LOCK_INITIALIZER, queue = null, attr = null, wrefs = 0u, data = null)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(held = PTHREAD_SPIN_LOCK_INITIALIZER, lock = PTHREAD_SPIN_LOCK_INITIALIZER, readers = 0, readerqueue = null, writerqueue = null, attr = null, data = null)

public val PTHREAD_STACK_MIN: SizeT = 0uL

// Non-public helper constants
public val UTSNAME_LENGTH: Int = 1024

public val SEM_FAILED: SemT? = null

// dlfcn.h
public val RTLD_DEFAULT: COpaquePointer? = null

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(lock = 0u, ownerId = 0u, cnt = 0u, shpid = 0, type = PTHREAD_MUTEX_TIMED.toInt(), flags = 0, reserved1 = 0u, reserved2 = 0u)
