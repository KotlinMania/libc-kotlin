// port-lint: source unix/linux_like/linux/gnu/b32/sparc/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.sparc

import io.github.kotlinmania.libc.*

public const val VEOF: ULong = 4uL

public const val RTLD_DEEPBIND: Int = 0x8

public const val RTLD_GLOBAL: Int = 0x100

public const val RTLD_NOLOAD: Int = 0x4

public const val O_APPEND: Int = 0x8

public const val O_CREAT: Int = 0x200

public const val O_EXCL: Int = 0x800

public const val O_NOCTTY: Int = 0x8000

public const val O_NONBLOCK: Int = 0x4000

public const val O_SYNC: Int = 0x802000

public const val O_RSYNC: Int = 0x802000

public const val O_DSYNC: Int = 0x2000

public const val O_FSYNC: Int = 0x802000

public const val MADV_SOFT_OFFLINE: Int = 101

public const val MAP_GROWSDOWN: Int = 0x0200

public const val MAP_ANON: Int = 0x0020

public const val MAP_ANONYMOUS: Int = 0x0020

public const val MAP_DENYWRITE: Int = 0x0800

public const val MAP_EXECUTABLE: Int = 0x01000

public const val MAP_POPULATE: Int = 0x08000

public const val MAP_NONBLOCK: Int = 0x010000

public const val MAP_STACK: Int = 0x020000

public const val MAP_HUGETLB: Int = 0x040000

public const val MAP_SYNC: Int = 0x080000

public const val EDEADLK: Int = 78

public const val ENAMETOOLONG: Int = 63

public const val ENOLCK: Int = 79

public const val ENOSYS: Int = 90

public const val ENOTEMPTY: Int = 66

public const val ELOOP: Int = 62

public const val ENOMSG: Int = 75

public const val EIDRM: Int = 77

public const val ECHRNG: Int = 94

public const val EL2NSYNC: Int = 95

public const val EL3HLT: Int = 96

public const val EL3RST: Int = 97

public const val ELNRNG: Int = 98

public const val EUNATCH: Int = 99

public const val ENOCSI: Int = 100

public const val EL2HLT: Int = 101

public const val EBADE: Int = 102

public const val EBADR: Int = 103

public const val EXFULL: Int = 104

public const val ENOANO: Int = 105

public const val EBADRQC: Int = 106

public const val EBADSLT: Int = 107

public const val EMULTIHOP: Int = 87

public const val EOVERFLOW: Int = 92

public const val ENOTUNIQ: Int = 115

public const val EBADFD: Int = 93

public const val EBADMSG: Int = 76

public const val EREMCHG: Int = 89

public const val ELIBACC: Int = 114

public const val ELIBBAD: Int = 112

public const val ELIBSCN: Int = 124

public const val ELIBMAX: Int = 123

public const val ELIBEXEC: Int = 110

public const val EILSEQ: Int = 122

public const val ERESTART: Int = 116

public const val ESTRPIPE: Int = 91

public const val EUSERS: Int = 68

public const val ENOTSOCK: Int = 38

public const val EDESTADDRREQ: Int = 39

public const val EMSGSIZE: Int = 40

public const val EPROTOTYPE: Int = 41

public const val ENOPROTOOPT: Int = 42

public const val EPROTONOSUPPORT: Int = 43

public const val ESOCKTNOSUPPORT: Int = 44

public const val EOPNOTSUPP: Int = 45

public const val EPFNOSUPPORT: Int = 46

public const val EAFNOSUPPORT: Int = 47

public const val EADDRINUSE: Int = 48

public const val EADDRNOTAVAIL: Int = 49

public const val ENETDOWN: Int = 50

public const val ENETUNREACH: Int = 51

public const val ENETRESET: Int = 52

public const val ECONNABORTED: Int = 53

public const val ECONNRESET: Int = 54

public const val ENOBUFS: Int = 55

public const val EISCONN: Int = 56

public const val ENOTCONN: Int = 57

public const val ESHUTDOWN: Int = 58

public const val ETOOMANYREFS: Int = 59

public const val ETIMEDOUT: Int = 60

public const val ECONNREFUSED: Int = 61

public const val EHOSTDOWN: Int = 64

public const val EHOSTUNREACH: Int = 65

public const val EALREADY: Int = 37

public const val EINPROGRESS: Int = 36

public const val ESTALE: Int = 70

public const val EDQUOT: Int = 69

public const val ENOMEDIUM: Int = 125

public const val EMEDIUMTYPE: Int = 126

public const val ECANCELED: Int = 127

public const val ENOKEY: Int = 128

public const val EKEYEXPIRED: Int = 129

public const val EKEYREVOKED: Int = 130

public const val EKEYREJECTED: Int = 131

public const val EOWNERDEAD: Int = 132

public const val ENOTRECOVERABLE: Int = 133

public const val EHWPOISON: Int = 135

public const val ERFKILL: Int = 134

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SA_SIGINFO: Int = 0x200

public const val SA_NOCLDWAIT: Int = 0x100

public const val SIGEMT: Int = 7

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGXCPU: Int = 24

public const val SIGXFSZ: Int = 25

public const val SIGVTALRM: Int = 26

public const val SIGPROF: Int = 27

public const val SIGWINCH: Int = 28

public const val SIGCHLD: Int = 20

public const val SIGBUS: Int = 10

public const val SIGUSR1: Int = 30

public const val SIGUSR2: Int = 31

public const val SIGCONT: Int = 19

public const val SIGSTOP: Int = 17

public const val SIGTSTP: Int = 18

public const val SIGURG: Int = 16

public const val SIGIO: Int = 23

public const val SIGSYS: Int = 12

public const val SIGPOLL: Int = 23

public const val SIGPWR: Int = 29

public const val SIG_SETMASK: Int = 4

public const val SIG_BLOCK: Int = 1

public const val SIG_UNBLOCK: Int = 2

public const val POLLWRNORM: Short = 4

public const val POLLWRBAND: Short = 0x100

public const val O_ASYNC: Int = 0x40

public const val O_NDELAY: Int = 0x4004

public const val EFD_NONBLOCK: Int = 0x4000

public const val F_GETLK: Int = 7

public const val F_GETOWN: Int = 5

public const val F_SETOWN: Int = 6

public const val SFD_NONBLOCK: Int = 0x4000

public const val TCSANOW: Int = 0

public const val TCSADRAIN: Int = 1

public const val TCSAFLUSH: Int = 2

public const val O_DIRECTORY: Int = 65536

public const val O_NOFOLLOW: Int = 131072

public const val O_LARGEFILE: Int = 0x40000

public const val O_DIRECT: Int = 0x100000

public const val MAP_LOCKED: Int = 0x0100

public const val MAP_NORESERVE: Int = 0x00040

public const val EDEADLOCK: Int = 108

public const val EUCLEAN: Int = 117

public const val ENOTNAM: Int = 118

public const val ENAVAIL: Int = 119

public const val EISNAM: Int = 120

public const val EREMOTEIO: Int = 121

public const val MCL_CURRENT: Int = 0x2000

public const val MCL_FUTURE: Int = 0x4000

public const val MCL_ONFAULT: Int = 0x8000

public const val SIGSTKSZ: ULong = 16384uL

public const val MINSIGSTKSZ: ULong = 4096uL

public const val CBAUD: UInt = 0x0000100fu

public const val TAB1: UInt = 0x800u

public const val TAB2: UInt = 0x1000u

public const val TAB3: UInt = 0x1800u

public const val CR1: UInt = 0x200u

public const val CR2: UInt = 0x400u

public const val CR3: UInt = 0x600u

public const val FF1: UInt = 0x8000u

public const val BS1: UInt = 0x2000u

public const val VT1: UInt = 0x4000u

public const val VWERASE: ULong = 0xeuL

public const val VREPRINT: ULong = 0xcuL

public const val VSUSP: ULong = 0xauL

public const val VSTART: ULong = 0x8uL

public const val VSTOP: ULong = 0x9uL

public const val VDISCARD: ULong = 0xduL

public const val VTIME: ULong = 0x5uL

public const val IXON: UInt = 0x400u

public const val IXOFF: UInt = 0x1000u

public const val ONLCR: UInt = 0x4u

public const val CSIZE: UInt = 0x30u

public const val CS6: UInt = 0x10u

public const val CS7: UInt = 0x20u

public const val CS8: UInt = 0x30u

public const val CSTOPB: UInt = 0x40u

public const val CREAD: UInt = 0x80u

public const val PARENB: UInt = 0x100u

public const val PARODD: UInt = 0x200u

public const val HUPCL: UInt = 0x400u

public const val CLOCAL: UInt = 0x800u

public const val ECHOKE: UInt = 0x800u

public const val ECHOE: UInt = 0x10u

public const val ECHOK: UInt = 0x20u

public const val ECHONL: UInt = 0x40u

public const val ECHOPRT: UInt = 0x400u

public const val ECHOCTL: UInt = 0x200u

public const val ISIG: UInt = 0x1u

public const val ICANON: UInt = 0x2u

public const val PENDIN: UInt = 0x4000u

public const val NOFLSH: UInt = 0x80u

public const val CIBAUD: UInt = 269418496u

public const val CBAUDEX: UInt = 0x00001000u

public const val VSWTC: ULong = 7uL

public const val OLCUC: UInt = 2u

public const val NLDLY: UInt = 256u

public const val CRDLY: UInt = 1536u

public const val TABDLY: UInt = 6144u

public const val BSDLY: UInt = 8192u

public const val FFDLY: UInt = 32768u

public const val VTDLY: UInt = 16384u

public const val XTABS: UInt = 6144u

public const val B0: UInt = 0u

public const val B50: UInt = 1u

public const val B75: UInt = 2u

public const val B110: UInt = 3u

public const val B134: UInt = 4u

public const val B150: UInt = 5u

public const val B200: UInt = 6u

public const val B300: UInt = 7u

public const val B600: UInt = 8u

public const val B1200: UInt = 9u

public const val B1800: UInt = 10u

public const val B2400: UInt = 11u

public const val B4800: UInt = 12u

public const val B9600: UInt = 13u

public const val B19200: UInt = 14u

public const val B38400: UInt = 15u

public const val EXTA: UInt = B19200

public const val EXTB: UInt = B38400

public const val B57600: UInt = 0x1001u

public const val B115200: UInt = 0x1002u

public const val B230400: UInt = 0x1003u

public const val B460800: UInt = 0x1004u

public const val B76800: UInt = 0x1005u

public const val B153600: UInt = 0x1006u

public const val B307200: UInt = 0x1007u

public const val B614400: UInt = 0x1008u

public const val B921600: UInt = 0x1009u

public const val B500000: UInt = 0x100au

public const val B576000: UInt = 0x100bu

public const val B1000000: UInt = 0x100cu

public const val B1152000: UInt = 0x100du

public const val B1500000: UInt = 0x100eu

public const val B2000000: UInt = 0x100fu

public const val VEOL: ULong = 5uL

public const val VEOL2: ULong = 6uL

public const val VMIN: ULong = 4uL

public const val IEXTEN: UInt = 0x8000u

public const val TOSTOP: UInt = 0x100u

public const val FLUSHO: UInt = 0x1000u

public const val EXTPROC: UInt = 0x10000u

public const val SYS_restart_syscall: Long = 0

public const val SYS_exit: Long = 1

public const val SYS_fork: Long = 2

public const val SYS_read: Long = 3

public const val SYS_write: Long = 4

public const val SYS_open: Long = 5

public const val SYS_close: Long = 6

public const val SYS_wait4: Long = 7

public const val SYS_creat: Long = 8

public const val SYS_link: Long = 9

public const val SYS_unlink: Long = 10

public const val SYS_execv: Long = 11

public const val SYS_chdir: Long = 12

public const val SYS_chown: Long = 13

public const val SYS_mknod: Long = 14

public const val SYS_chmod: Long = 15

public const val SYS_lchown: Long = 16

public const val SYS_brk: Long = 17

public const val SYS_perfctr: Long = 18

public const val SYS_lseek: Long = 19

public const val SYS_getpid: Long = 20

public const val SYS_capget: Long = 21

public const val SYS_capset: Long = 22

public const val SYS_setuid: Long = 23

public const val SYS_getuid: Long = 24

public const val SYS_vmsplice: Long = 25

public const val SYS_ptrace: Long = 26

public const val SYS_alarm: Long = 27

public const val SYS_sigaltstack: Long = 28

public const val SYS_pause: Long = 29

public const val SYS_utime: Long = 30

public const val SYS_lchown32: Long = 31

public const val SYS_fchown32: Long = 32

public const val SYS_access: Long = 33

public const val SYS_nice: Long = 34

public const val SYS_chown32: Long = 35

public const val SYS_sync: Long = 36

public const val SYS_kill: Long = 37

public const val SYS_stat: Long = 38

public const val SYS_sendfile: Long = 39

public const val SYS_lstat: Long = 40

public const val SYS_dup: Long = 41

public const val SYS_pipe: Long = 42

public const val SYS_times: Long = 43

public const val SYS_getuid32: Long = 44

public const val SYS_umount2: Long = 45

public const val SYS_setgid: Long = 46

public const val SYS_getgid: Long = 47

public const val SYS_signal: Long = 48

public const val SYS_geteuid: Long = 49

public const val SYS_getegid: Long = 50

public const val SYS_acct: Long = 51

public const val SYS_getgid32: Long = 53

public const val SYS_ioctl: Long = 54

public const val SYS_reboot: Long = 55

public const val SYS_mmap2: Long = 56

public const val SYS_symlink: Long = 57

public const val SYS_readlink: Long = 58

public const val SYS_execve: Long = 59

public const val SYS_umask: Long = 60

public const val SYS_chroot: Long = 61

public const val SYS_fstat: Long = 62

public const val SYS_fstat64: Long = 63

public const val SYS_getpagesize: Long = 64

public const val SYS_msync: Long = 65

public const val SYS_vfork: Long = 66

public const val SYS_pread64: Long = 67

public const val SYS_pwrite64: Long = 68

public const val SYS_geteuid32: Long = 69

public const val SYS_getegid32: Long = 70

public const val SYS_mmap: Long = 71

public const val SYS_setreuid32: Long = 72

public const val SYS_munmap: Long = 73

public const val SYS_mprotect: Long = 74

public const val SYS_madvise: Long = 75

public const val SYS_vhangup: Long = 76

public const val SYS_truncate64: Long = 77

public const val SYS_mincore: Long = 78

public const val SYS_getgroups: Long = 79

public const val SYS_setgroups: Long = 80

public const val SYS_getpgrp: Long = 81

public const val SYS_setgroups32: Long = 82

public const val SYS_setitimer: Long = 83

public const val SYS_ftruncate64: Long = 84

public const val SYS_swapon: Long = 85

public const val SYS_getitimer: Long = 86

public const val SYS_setuid32: Long = 87

public const val SYS_sethostname: Long = 88

public const val SYS_setgid32: Long = 89

public const val SYS_dup2: Long = 90

public const val SYS_setfsuid32: Long = 91

public const val SYS_fcntl: Long = 92

public const val SYS_select: Long = 93

public const val SYS_setfsgid32: Long = 94

public const val SYS_fsync: Long = 95

public const val SYS_setpriority: Long = 96

public const val SYS_socket: Long = 97

public const val SYS_connect: Long = 98

public const val SYS_accept: Long = 99

public const val SYS_getpriority: Long = 100

public const val SYS_rt_sigreturn: Long = 101

public const val SYS_rt_sigaction: Long = 102

public const val SYS_rt_sigprocmask: Long = 103

public const val SYS_rt_sigpending: Long = 104

public const val SYS_rt_sigtimedwait: Long = 105

public const val SYS_rt_sigqueueinfo: Long = 106

public const val SYS_rt_sigsuspend: Long = 107

public const val SYS_setresuid32: Long = 108

public const val SYS_getresuid32: Long = 109

public const val SYS_setresgid32: Long = 110

public const val SYS_getresgid32: Long = 111

public const val SYS_setregid32: Long = 112

public const val SYS_recvmsg: Long = 113

public const val SYS_sendmsg: Long = 114

public const val SYS_getgroups32: Long = 115

public const val SYS_gettimeofday: Long = 116

public const val SYS_getrusage: Long = 117

public const val SYS_getsockopt: Long = 118

public const val SYS_getcwd: Long = 119

public const val SYS_readv: Long = 120

public const val SYS_writev: Long = 121

public const val SYS_settimeofday: Long = 122

public const val SYS_fchown: Long = 123

public const val SYS_fchmod: Long = 124

public const val SYS_recvfrom: Long = 125

public const val SYS_setreuid: Long = 126

public const val SYS_setregid: Long = 127

public const val SYS_rename: Long = 128

public const val SYS_truncate: Long = 129

public const val SYS_ftruncate: Long = 130

public const val SYS_flock: Long = 131

public const val SYS_lstat64: Long = 132

public const val SYS_sendto: Long = 133

public const val SYS_shutdown: Long = 134

public const val SYS_socketpair: Long = 135

public const val SYS_mkdir: Long = 136

public const val SYS_rmdir: Long = 137

public const val SYS_utimes: Long = 138

public const val SYS_stat64: Long = 139

public const val SYS_sendfile64: Long = 140

public const val SYS_getpeername: Long = 141

public const val SYS_futex: Long = 142

public const val SYS_gettid: Long = 143

public const val SYS_getrlimit: Long = 144

public const val SYS_setrlimit: Long = 145

public const val SYS_pivot_root: Long = 146

public const val SYS_prctl: Long = 147

public const val SYS_pciconfig_read: Long = 148

public const val SYS_pciconfig_write: Long = 149

public const val SYS_getsockname: Long = 150

public const val SYS_inotify_init: Long = 151

public const val SYS_inotify_add_watch: Long = 152

public const val SYS_poll: Long = 153

public const val SYS_getdents64: Long = 154

public const val SYS_fcntl64: Long = 155

public const val SYS_inotify_rm_watch: Long = 156

public const val SYS_statfs: Long = 157

public const val SYS_fstatfs: Long = 158

public const val SYS_umount: Long = 159

public const val SYS_sched_set_affinity: Long = 160

public const val SYS_sched_get_affinity: Long = 161

public const val SYS_getdomainname: Long = 162

public const val SYS_setdomainname: Long = 163

public const val SYS_quotactl: Long = 165

public const val SYS_set_tid_address: Long = 166

public const val SYS_mount: Long = 167

public const val SYS_ustat: Long = 168

public const val SYS_setxattr: Long = 169

public const val SYS_lsetxattr: Long = 170

public const val SYS_fsetxattr: Long = 171

public const val SYS_getxattr: Long = 172

public const val SYS_lgetxattr: Long = 173

public const val SYS_getdents: Long = 174

public const val SYS_setsid: Long = 175

public const val SYS_fchdir: Long = 176

public const val SYS_fgetxattr: Long = 177

public const val SYS_listxattr: Long = 178

public const val SYS_llistxattr: Long = 179

public const val SYS_flistxattr: Long = 180

public const val SYS_removexattr: Long = 181

public const val SYS_lremovexattr: Long = 182

public const val SYS_sigpending: Long = 183

public const val SYS_query_module: Long = 184

public const val SYS_setpgid: Long = 185

public const val SYS_fremovexattr: Long = 186

public const val SYS_tkill: Long = 187

public const val SYS_exit_group: Long = 188

public const val SYS_uname: Long = 189

public const val SYS_init_module: Long = 190

public const val SYS_personality: Long = 191

public const val SYS_remap_file_pages: Long = 192

public const val SYS_epoll_create: Long = 193

public const val SYS_epoll_ctl: Long = 194

public const val SYS_epoll_wait: Long = 195

public const val SYS_ioprio_set: Long = 196

public const val SYS_getppid: Long = 197

public const val SYS_sigaction: Long = 198

public const val SYS_sgetmask: Long = 199

public const val SYS_ssetmask: Long = 200

public const val SYS_sigsuspend: Long = 201

public const val SYS_oldlstat: Long = 202

public const val SYS_uselib: Long = 203

public const val SYS_readdir: Long = 204

public const val SYS_readahead: Long = 205

public const val SYS_socketcall: Long = 206

public const val SYS_syslog: Long = 207

public const val SYS_lookup_dcookie: Long = 208

public const val SYS_fadvise64: Long = 209

public const val SYS_fadvise64_64: Long = 210

public const val SYS_tgkill: Long = 211

public const val SYS_waitpid: Long = 212

public const val SYS_swapoff: Long = 213

public const val SYS_sysinfo: Long = 214

public const val SYS_ipc: Long = 215

public const val SYS_sigreturn: Long = 216

public const val SYS_clone: Long = 217

public const val SYS_ioprio_get: Long = 218

public const val SYS_adjtimex: Long = 219

public const val SYS_sigprocmask: Long = 220

public const val SYS_create_module: Long = 221

public const val SYS_delete_module: Long = 222

public const val SYS_get_kernel_syms: Long = 223

public const val SYS_getpgid: Long = 224

public const val SYS_bdflush: Long = 225

public const val SYS_sysfs: Long = 226

public const val SYS_afs_syscall: Long = 227

public const val SYS_setfsuid: Long = 228

public const val SYS_setfsgid: Long = 229

public const val SYS__newselect: Long = 230

public const val SYS_time: Long = 231

public const val SYS_splice: Long = 232

public const val SYS_stime: Long = 233

public const val SYS_statfs64: Long = 234

public const val SYS_fstatfs64: Long = 235

public const val SYS__llseek: Long = 236

public const val SYS_mlock: Long = 237

public const val SYS_munlock: Long = 238

public const val SYS_mlockall: Long = 239

public const val SYS_munlockall: Long = 240

public const val SYS_sched_setparam: Long = 241

public const val SYS_sched_getparam: Long = 242

public const val SYS_sched_setscheduler: Long = 243

public const val SYS_sched_getscheduler: Long = 244

public const val SYS_sched_yield: Long = 245

public const val SYS_sched_get_priority_max: Long = 246

public const val SYS_sched_get_priority_min: Long = 247

public const val SYS_sched_rr_get_interval: Long = 248

public const val SYS_nanosleep: Long = 249

public const val SYS_mremap: Long = 250

public const val SYS__sysctl: Long = 251

public const val SYS_getsid: Long = 252

public const val SYS_fdatasync: Long = 253

public const val SYS_nfsservctl: Long = 254

public const val SYS_sync_file_range: Long = 255

public const val SYS_clock_settime: Long = 256

public const val SYS_clock_gettime: Long = 257

public const val SYS_clock_getres: Long = 258

public const val SYS_clock_nanosleep: Long = 259

public const val SYS_sched_getaffinity: Long = 260

public const val SYS_sched_setaffinity: Long = 261

public const val SYS_timer_settime: Long = 262

public const val SYS_timer_gettime: Long = 263

public const val SYS_timer_getoverrun: Long = 264

public const val SYS_timer_delete: Long = 265

public const val SYS_timer_create: Long = 266

public const val SYS_io_setup: Long = 268

public const val SYS_io_destroy: Long = 269

public const val SYS_io_submit: Long = 270

public const val SYS_io_cancel: Long = 271

public const val SYS_io_getevents: Long = 272

public const val SYS_mq_open: Long = 273

public const val SYS_mq_unlink: Long = 274

public const val SYS_mq_timedsend: Long = 275

public const val SYS_mq_timedreceive: Long = 276

public const val SYS_mq_notify: Long = 277

public const val SYS_mq_getsetattr: Long = 278

public const val SYS_waitid: Long = 279

public const val SYS_tee: Long = 280

public const val SYS_add_key: Long = 281

public const val SYS_request_key: Long = 282

public const val SYS_keyctl: Long = 283

public const val SYS_openat: Long = 284

public const val SYS_mkdirat: Long = 285

public const val SYS_mknodat: Long = 286

public const val SYS_fchownat: Long = 287

public const val SYS_futimesat: Long = 288

public const val SYS_fstatat64: Long = 289

public const val SYS_unlinkat: Long = 290

public const val SYS_renameat: Long = 291

public const val SYS_linkat: Long = 292

public const val SYS_symlinkat: Long = 293

public const val SYS_readlinkat: Long = 294

public const val SYS_fchmodat: Long = 295

public const val SYS_faccessat: Long = 296

public const val SYS_pselect6: Long = 297

public const val SYS_ppoll: Long = 298

public const val SYS_unshare: Long = 299

public const val SYS_set_robust_list: Long = 300

public const val SYS_get_robust_list: Long = 301

public const val SYS_migrate_pages: Long = 302

public const val SYS_mbind: Long = 303

public const val SYS_get_mempolicy: Long = 304

public const val SYS_set_mempolicy: Long = 305

public const val SYS_kexec_load: Long = 306

public const val SYS_move_pages: Long = 307

public const val SYS_getcpu: Long = 308

public const val SYS_epoll_pwait: Long = 309

public const val SYS_utimensat: Long = 310

public const val SYS_signalfd: Long = 311

public const val SYS_timerfd_create: Long = 312

public const val SYS_eventfd: Long = 313

public const val SYS_fallocate: Long = 314

public const val SYS_timerfd_settime: Long = 315

public const val SYS_timerfd_gettime: Long = 316

public const val SYS_signalfd4: Long = 317

public const val SYS_eventfd2: Long = 318

public const val SYS_epoll_create1: Long = 319

public const val SYS_dup3: Long = 320

public const val SYS_pipe2: Long = 321

public const val SYS_inotify_init1: Long = 322

public const val SYS_accept4: Long = 323

public const val SYS_preadv: Long = 324

public const val SYS_pwritev: Long = 325

public const val SYS_rt_tgsigqueueinfo: Long = 326

public const val SYS_perf_event_open: Long = 327

public const val SYS_recvmmsg: Long = 328

public const val SYS_fanotify_init: Long = 329

public const val SYS_fanotify_mark: Long = 330

public const val SYS_prlimit64: Long = 331

public const val SYS_name_to_handle_at: Long = 332

public const val SYS_open_by_handle_at: Long = 333

public const val SYS_clock_adjtime: Long = 334

public const val SYS_syncfs: Long = 335

public const val SYS_sendmmsg: Long = 336

public const val SYS_setns: Long = 337

public const val SYS_process_vm_readv: Long = 338

public const val SYS_process_vm_writev: Long = 339

public const val SYS_kern_features: Long = 340

public const val SYS_kcmp: Long = 341

public const val SYS_finit_module: Long = 342

public const val SYS_sched_setattr: Long = 343

public const val SYS_sched_getattr: Long = 344

public const val SYS_renameat2: Long = 345

public const val SYS_seccomp: Long = 346

public const val SYS_getrandom: Long = 347

public const val SYS_memfd_create: Long = 348

public const val SYS_bpf: Long = 349

public const val SYS_execveat: Long = 350

public const val SYS_membarrier: Long = 351

public const val SYS_userfaultfd: Long = 352

public const val SYS_bind: Long = 353

public const val SYS_listen: Long = 354

public const val SYS_setsockopt: Long = 355

public const val SYS_mlock2: Long = 356

public const val SYS_copy_file_range: Long = 357

public const val SYS_preadv2: Long = 358

public const val SYS_pwritev2: Long = 359

public const val SYS_statx: Long = 360

public const val SYS_rseq: Long = 365

public const val SYS_pidfd_send_signal: Long = 424

public const val SYS_io_uring_setup: Long = 425

public const val SYS_io_uring_enter: Long = 426

public const val SYS_io_uring_register: Long = 427

public const val SYS_open_tree: Long = 428

public const val SYS_move_mount: Long = 429

public const val SYS_fsopen: Long = 430

public const val SYS_fsconfig: Long = 431

public const val SYS_fsmount: Long = 432

public const val SYS_fspick: Long = 433

public const val SYS_pidfd_open: Long = 434

public const val SYS_clone3: Long = 435

public const val SYS_close_range: Long = 436

public const val SYS_openat2: Long = 437

public const val SYS_pidfd_getfd: Long = 438

public const val SYS_faccessat2: Long = 439

public const val SYS_process_madvise: Long = 440

public const val SYS_epoll_pwait2: Long = 441

public const val SYS_mount_setattr: Long = 442

public const val SYS_quotactl_fd: Long = 443

public const val SYS_landlock_create_ruleset: Long = 444

public const val SYS_landlock_add_rule: Long = 445

public const val SYS_landlock_restrict_self: Long = 446

public const val SYS_memfd_secret: Long = 447

public const val SYS_process_mrelease: Long = 448

public const val SYS_futex_waitv: Long = 449

public const val SYS_set_mempolicy_home_node: Long = 450
