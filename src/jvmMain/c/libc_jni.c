#include <jni.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>

#ifndef _WIN32
#include <unistd.h>
#include <limits.h>
#include <pwd.h>
#include <sys/types.h>
#include <sys/utsname.h>
#include <sys/socket.h>
#include <sys/select.h>
#include <sys/ioctl.h>
#include <sys/mman.h>
#include <termios.h>
#include <poll.h>
#include <signal.h>
#include <netdb.h>
#include <netinet/in.h>
#include <dlfcn.h>
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
#include <sys/ucred.h>
#endif
#include <sys/syscall.h>
#else
#define WIN32_LEAN_AND_MEAN
#include <windows.h>
#include <winsock2.h>
#include <ws2tcpip.h>
#include <io.h>
#include <wchar.h>
#endif

/* --- Sockets --- */

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_socket(
    JNIEnv* env, jclass clazz, jint domain, jint type, jint protocol) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return socket((int)domain, (int)type, (int)protocol);
#else
    return (jint)socket((int)domain, (int)type, (int)protocol);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_bind(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray addr, jint addrlen) {
    (void)clazz;
    if (!addr) return -1;
    jbyte buf[128];
    if (addrlen > (jint)sizeof(buf)) return -1;
    (*env)->GetByteArrayRegion(env, addr, 0, addrlen, buf);
#ifndef _WIN32
    return bind((int)fd, (struct sockaddr*)buf, (socklen_t)addrlen);
#else
    return bind((SOCKET)fd, (struct sockaddr*)buf, (int)addrlen);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_connect(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray addr, jint addrlen) {
    (void)clazz;
    if (!addr) return -1;
    jbyte buf[128];
    if (addrlen > (jint)sizeof(buf)) return -1;
    (*env)->GetByteArrayRegion(env, addr, 0, addrlen, buf);
#ifndef _WIN32
    return connect((int)fd, (struct sockaddr*)buf, (socklen_t)addrlen);
#else
    return connect((SOCKET)fd, (struct sockaddr*)buf, (int)addrlen);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_listen(
    JNIEnv* env, jclass clazz, jint fd, jint backlog) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return listen((int)fd, (int)backlog);
#else
    return listen((SOCKET)fd, (int)backlog);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_accept(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray addr, jintArray addrlen) {
    (void)clazz;
    jbyte buf[128];
    jint lenVal = (jint)sizeof(buf);
    if (addrlen) {
        (*env)->GetIntArrayRegion(env, addrlen, 0, 1, &lenVal);
    }
#ifndef _WIN32
    socklen_t slen = (socklen_t)lenVal;
    int res = accept((int)fd, addr ? (struct sockaddr*)buf : NULL, addr ? &slen : NULL);
    if (res >= 0) {
        if (addr) {
            (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, buf);
        }
        if (addrlen) {
            jint outLen = (jint)slen;
            (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
        }
    }
    return res;
#else
    int slen = (int)lenVal;
    SOCKET res = accept((SOCKET)fd, addr ? (struct sockaddr*)buf : NULL, addr ? &slen : NULL);
    if (res != INVALID_SOCKET) {
        if (addr) {
            (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, buf);
        }
        if (addrlen) {
            jint outLen = (jint)slen;
            (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
        }
    }
    return (jint)res;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getsockopt(
    JNIEnv* env, jclass clazz, jint fd, jint level, jint optname, jbyteArray optval, jintArray optlen) {
    (void)clazz;
    if (!optval || !optlen) return -1;
    jint lenVal = 0;
    (*env)->GetIntArrayRegion(env, optlen, 0, 1, &lenVal);
    if (lenVal <= 0 || lenVal > 512) return -1;
    jbyte buf[512];
#ifndef _WIN32
    socklen_t slen = (socklen_t)lenVal;
    int res = getsockopt((int)fd, (int)level, (int)optname, buf, &slen);
    if (res == 0) {
        (*env)->SetByteArrayRegion(env, optval, 0, (jsize)slen, buf);
        jint outLen = (jint)slen;
        (*env)->SetIntArrayRegion(env, optlen, 0, 1, &outLen);
    }
    return res;
#else
    int slen = (int)lenVal;
    int res = getsockopt((SOCKET)fd, (int)level, (int)optname, (char*)buf, &slen);
    if (res == 0) {
        (*env)->SetByteArrayRegion(env, optval, 0, (jsize)slen, buf);
        jint outLen = (jint)slen;
        (*env)->SetIntArrayRegion(env, optlen, 0, 1, &outLen);
    }
    return res;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_setsockopt(
    JNIEnv* env, jclass clazz, jint fd, jint level, jint optname, jbyteArray optval, jint optlen) {
    (void)clazz;
    if (!optval || optlen <= 0 || optlen > 512) return -1;
    jbyte buf[512];
    (*env)->GetByteArrayRegion(env, optval, 0, optlen, buf);
#ifndef _WIN32
    return setsockopt((int)fd, (int)level, (int)optname, buf, (socklen_t)optlen);
#else
    return setsockopt((SOCKET)fd, (int)level, (int)optname, (const char*)buf, (int)optlen);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getsockname(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray addr, jintArray addrlen) {
    (void)clazz;
    if (!addr || !addrlen) return -1;
    jbyte buf[128];
    jint lenVal = 0;
    (*env)->GetIntArrayRegion(env, addrlen, 0, 1, &lenVal);
    if (lenVal <= 0 || lenVal > (jint)sizeof(buf)) lenVal = sizeof(buf);
#ifndef _WIN32
    socklen_t slen = (socklen_t)lenVal;
    int res = getsockname((int)fd, (struct sockaddr*)buf, &slen);
    if (res == 0) {
        (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, buf);
        jint outLen = (jint)slen;
        (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
    }
    return res;
#else
    int slen = (int)lenVal;
    int res = getsockname((SOCKET)fd, (struct sockaddr*)buf, &slen);
    if (res == 0) {
        (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, buf);
        jint outLen = (jint)slen;
        (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
    }
    return res;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getpeername(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray addr, jintArray addrlen) {
    (void)clazz;
    if (!addr || !addrlen) return -1;
    jbyte buf[128];
    jint lenVal = 0;
    (*env)->GetIntArrayRegion(env, addrlen, 0, 1, &lenVal);
    if (lenVal <= 0 || lenVal > (jint)sizeof(buf)) lenVal = sizeof(buf);
#ifndef _WIN32
    socklen_t slen = (socklen_t)lenVal;
    int res = getpeername((int)fd, (struct sockaddr*)buf, &slen);
    if (res == 0) {
        (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, buf);
        jint outLen = (jint)slen;
        (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
    }
    return res;
#else
    int slen = (int)lenVal;
    int res = getpeername((SOCKET)fd, (struct sockaddr*)buf, &slen);
    if (res == 0) {
        (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, buf);
        jint outLen = (jint)slen;
        (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
    }
    return res;
#endif
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_send(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray buf, jint offset, jint len, jint flags) {
    (void)clazz;
    if (!buf || len < 0) return -1;
    jbyte* bytes = (*env)->GetByteArrayElements(env, buf, NULL);
    if (!bytes) return -1;
#ifndef _WIN32
    ssize_t res = send((int)fd, bytes + offset, (size_t)len, (int)flags);
#else
    int res = send((SOCKET)fd, (const char*)(bytes + offset), (int)len, (int)flags);
#endif
    (*env)->ReleaseByteArrayElements(env, buf, bytes, JNI_ABORT);
    return (jlong)res;
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_recv(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray buf, jint offset, jint len, jint flags) {
    (void)clazz;
    if (!buf || len < 0) return -1;
    jbyte* bytes = (*env)->GetByteArrayElements(env, buf, NULL);
    if (!bytes) return -1;
#ifndef _WIN32
    ssize_t res = recv((int)fd, bytes + offset, (size_t)len, (int)flags);
#else
    int res = recv((SOCKET)fd, (char*)(bytes + offset), (int)len, (int)flags);
#endif
    (*env)->ReleaseByteArrayElements(env, buf, bytes, res > 0 ? 0 : JNI_ABORT);
    return (jlong)res;
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_sendto(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray buf, jint offset, jint len, jint flags, jbyteArray addr, jint addrlen) {
    (void)clazz;
    if (!buf || len < 0) return -1;
    jbyte* bytes = (*env)->GetByteArrayElements(env, buf, NULL);
    if (!bytes) return -1;
    jbyte addrBuf[128];
    if (addr && addrlen > 0 && addrlen <= (jint)sizeof(addrBuf)) {
        (*env)->GetByteArrayRegion(env, addr, 0, addrlen, addrBuf);
    }
#ifndef _WIN32
    ssize_t res = sendto((int)fd, bytes + offset, (size_t)len, (int)flags,
                         addr ? (struct sockaddr*)addrBuf : NULL, (socklen_t)addrlen);
#else
    int res = sendto((SOCKET)fd, (const char*)(bytes + offset), (int)len, (int)flags,
                     addr ? (struct sockaddr*)addrBuf : NULL, (int)addrlen);
#endif
    (*env)->ReleaseByteArrayElements(env, buf, bytes, JNI_ABORT);
    return (jlong)res;
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_recvfrom(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray buf, jint offset, jint len, jint flags, jbyteArray addr, jintArray addrlen) {
    (void)clazz;
    if (!buf || len < 0) return -1;
    jbyte* bytes = (*env)->GetByteArrayElements(env, buf, NULL);
    if (!bytes) return -1;
    jbyte addrBuf[128];
    jint lenVal = sizeof(addrBuf);
    if (addrlen) {
        (*env)->GetIntArrayRegion(env, addrlen, 0, 1, &lenVal);
    }
#ifndef _WIN32
    socklen_t slen = (socklen_t)lenVal;
    ssize_t res = recvfrom((int)fd, bytes + offset, (size_t)len, (int)flags,
                           addr ? (struct sockaddr*)addrBuf : NULL, addr ? &slen : NULL);
    if (res >= 0 && addr) {
        (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, addrBuf);
        if (addrlen) {
            jint outLen = (jint)slen;
            (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
        }
    }
#else
    int slen = (int)lenVal;
    int res = recvfrom((SOCKET)fd, (char*)(bytes + offset), (int)len, (int)flags,
                       addr ? (struct sockaddr*)addrBuf : NULL, addr ? &slen : NULL);
    if (res >= 0 && addr) {
        (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, addrBuf);
        if (addrlen) {
            jint outLen = (jint)slen;
            (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
        }
    }
#endif
    (*env)->ReleaseByteArrayElements(env, buf, bytes, res > 0 ? 0 : JNI_ABORT);
    return (jlong)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_shutdown(
    JNIEnv* env, jclass clazz, jint fd, jint how) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return shutdown((int)fd, (int)how);
#else
    return shutdown((SOCKET)fd, (int)how);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_socketpair(
    JNIEnv* env, jclass clazz, jint domain, jint type, jint protocol, jintArray sv) {
    (void)clazz;
#ifndef _WIN32
    if (!sv) return -1;
    int fds[2];
    int res = socketpair((int)domain, (int)type, (int)protocol, fds);
    if (res == 0) {
        jint out[2] = { fds[0], fds[1] };
        (*env)->SetIntArrayRegion(env, sv, 0, 2, out);
    }
    return res;
#else
    (void)env; (void)domain; (void)type; (void)protocol; (void)sv;
    errno = ENOSYS;
    return -1;
#endif
}

/* --- Polling & Select --- */

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_poll(
    JNIEnv* env, jclass clazz, jintArray fds, jshortArray events, jshortArray revents, jint nfds, jint timeout) {
    (void)clazz;
#ifndef _WIN32
    if (nfds < 0) { errno = EINVAL; return -1; }
    if (nfds == 0) return poll(NULL, 0, timeout);
    if (!fds || !events || !revents) { errno = EFAULT; return -1; }
    if ((*env)->GetArrayLength(env, fds) < nfds ||
        (*env)->GetArrayLength(env, events) < nfds ||
        (*env)->GetArrayLength(env, revents) < nfds) { errno = EINVAL; return -1; }
    struct pollfd* pfds = (struct pollfd*)malloc(sizeof(struct pollfd) * nfds);
    if (!pfds) return -1;

    jint* fdsArr = (*env)->GetIntArrayElements(env, fds, NULL);
    jshort* eventsArr = (*env)->GetShortArrayElements(env, events, NULL);

    for (int i = 0; i < nfds; i++) {
        pfds[i].fd = fdsArr[i];
        pfds[i].events = eventsArr[i];
        pfds[i].revents = 0;
    }

    int res = poll(pfds, (nfds_t)nfds, (int)timeout);

    if (res >= 0) {
        jshort* reventsArr = (*env)->GetShortArrayElements(env, revents, NULL);
        for (int i = 0; i < nfds; i++) {
            reventsArr[i] = pfds[i].revents;
        }
        (*env)->ReleaseShortArrayElements(env, revents, reventsArr, 0);
    }

    (*env)->ReleaseIntArrayElements(env, fds, fdsArr, JNI_ABORT);
    (*env)->ReleaseShortArrayElements(env, events, eventsArr, JNI_ABORT);
    free(pfds);
    return res;
#else
    (void)env; (void)fds; (void)events; (void)revents; (void)nfds; (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_select(
    JNIEnv* env, jclass clazz, jint nfds, jintArray readfds, jintArray writefds, jintArray exceptfds, jlong timeoutSec, jlong timeoutUsec) {
    (void)clazz;
#ifndef _WIN32
    fd_set rfds, wfds, efds;
    FD_ZERO(&rfds);
    FD_ZERO(&wfds);
    FD_ZERO(&efds);

    int maxfd = 0;
    if (readfds) {
        jsize count = (*env)->GetArrayLength(env, readfds);
        jint* arr = (*env)->GetIntArrayElements(env, readfds, NULL);
        for (int i = 0; i < count; i++) {
            FD_SET(arr[i], &rfds);
            if (arr[i] > maxfd) maxfd = arr[i];
        }
        (*env)->ReleaseIntArrayElements(env, readfds, arr, JNI_ABORT);
    }
    if (writefds) {
        jsize count = (*env)->GetArrayLength(env, writefds);
        jint* arr = (*env)->GetIntArrayElements(env, writefds, NULL);
        for (int i = 0; i < count; i++) {
            FD_SET(arr[i], &wfds);
            if (arr[i] > maxfd) maxfd = arr[i];
        }
        (*env)->ReleaseIntArrayElements(env, writefds, arr, JNI_ABORT);
    }
    if (exceptfds) {
        jsize count = (*env)->GetArrayLength(env, exceptfds);
        jint* arr = (*env)->GetIntArrayElements(env, exceptfds, NULL);
        for (int i = 0; i < count; i++) {
            FD_SET(arr[i], &efds);
            if (arr[i] > maxfd) maxfd = arr[i];
        }
        (*env)->ReleaseIntArrayElements(env, exceptfds, arr, JNI_ABORT);
    }

    struct timeval tv;
    struct timeval* ptv = NULL;
    if (timeoutSec >= 0 && timeoutUsec >= 0) {
        tv.tv_sec = (time_t)timeoutSec;
        tv.tv_usec = (suseconds_t)timeoutUsec;
        ptv = &tv;
    }

    int res = select(nfds > 0 ? nfds : (maxfd + 1),
                     readfds ? &rfds : NULL,
                     writefds ? &wfds : NULL,
                     exceptfds ? &efds : NULL,
                     ptv);
    return res;
#else
    (void)env; (void)nfds; (void)readfds; (void)writefds; (void)exceptfds; (void)timeoutSec; (void)timeoutUsec;
    errno = ENOSYS;
    return -1;
#endif
}

/* --- Terminal Control & Window Sizing --- */

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_ioctl(
    JNIEnv* env, jclass clazz, jint fd, jlong request, jbyteArray argp) {
    (void)clazz;
#ifndef _WIN32
    if (!argp) {
        return ioctl((int)fd, (unsigned long)request, NULL);
    }
    jbyte* bytes = (*env)->GetByteArrayElements(env, argp, NULL);
    int res = ioctl((int)fd, (unsigned long)request, bytes);
    (*env)->ReleaseByteArrayElements(env, argp, bytes, 0);
    return res;
#else
    (void)env; (void)fd; (void)request; (void)argp;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_ioctlTiocgwinsz(
    JNIEnv* env, jclass clazz, jint fd, jshortArray winsize) {
    (void)clazz;
#if !defined(_WIN32) && defined(TIOCGWINSZ)
    if (!winsize) return -1;
    struct winsize ws;
    memset(&ws, 0, sizeof(ws));
    int res = ioctl((int)fd, TIOCGWINSZ, &ws);
    if (res == 0) {
        jshort out[4] = { (jshort)ws.ws_row, (jshort)ws.ws_col, (jshort)ws.ws_xpixel, (jshort)ws.ws_ypixel };
        (*env)->SetShortArrayRegion(env, winsize, 0, 4, out);
    }
    return res;
#else
    (void)env; (void)fd; (void)winsize;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_tcgetattr(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray termiosBytes) {
    (void)clazz;
#ifndef _WIN32
    if (!termiosBytes) return -1;
    struct termios t;
    int res = tcgetattr((int)fd, &t);
    if (res == 0) {
        jsize len = (*env)->GetArrayLength(env, termiosBytes);
        jsize copyLen = len < (jsize)sizeof(t) ? len : (jsize)sizeof(t);
        (*env)->SetByteArrayRegion(env, termiosBytes, 0, copyLen, (const jbyte*)&t);
    }
    return res;
#else
    (void)env; (void)fd; (void)termiosBytes;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_tcsetattr(
    JNIEnv* env, jclass clazz, jint fd, jint optional_actions, jbyteArray termiosBytes) {
    (void)clazz;
#ifndef _WIN32
    if (!termiosBytes) return -1;
    struct termios t;
    memset(&t, 0, sizeof(t));
    jsize len = (*env)->GetArrayLength(env, termiosBytes);
    jsize copyLen = len < (jsize)sizeof(t) ? len : (jsize)sizeof(t);
    (*env)->GetByteArrayRegion(env, termiosBytes, 0, copyLen, (jbyte*)&t);
    return tcsetattr((int)fd, (int)optional_actions, &t);
#else
    (void)env; (void)fd; (void)optional_actions; (void)termiosBytes;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT void JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_cfmakeraw(
    JNIEnv* env, jclass clazz, jbyteArray termiosBytes) {
    (void)clazz;
#ifndef _WIN32
    if (!termiosBytes) return;
    struct termios t;
    memset(&t, 0, sizeof(t));
    jsize len = (*env)->GetArrayLength(env, termiosBytes);
    jsize copyLen = len < (jsize)sizeof(t) ? len : (jsize)sizeof(t);
    (*env)->GetByteArrayRegion(env, termiosBytes, 0, copyLen, (jbyte*)&t);
    cfmakeraw(&t);
    (*env)->SetByteArrayRegion(env, termiosBytes, 0, copyLen, (const jbyte*)&t);
#else
    (void)env; (void)termiosBytes;
#endif
}

/* --- UDS, Memory Locking & Process Syscalls --- */

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getpeereid(
    JNIEnv* env, jclass clazz, jint sockfd, jintArray creds) {
    (void)clazz;
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    if (!creds) return -1;
    uid_t u = 0;
    gid_t g = 0;
    int res = getpeereid((int)sockfd, &u, &g);
    if (res == 0) {
        jint out[2] = { (jint)u, (jint)g };
        (*env)->SetIntArrayRegion(env, creds, 0, 2, out);
    }
    return res;
#elif defined(__linux__) && defined(SO_PEERCRED)
    if (!creds) return -1;
    struct ucred cr;
    memset(&cr, 0, sizeof(cr));
    socklen_t len = sizeof(cr);
    int res = getsockopt((int)sockfd, SOL_SOCKET, SO_PEERCRED, &cr, &len);
    if (res == 0) {
        jint out[2] = { (jint)cr.uid, (jint)cr.gid };
        (*env)->SetIntArrayRegion(env, creds, 0, 2, out);
    }
    return res;
#else
    (void)env; (void)sockfd; (void)creds;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_mlock(
    JNIEnv* env, jclass clazz, jlong addr, jlong len) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return mlock((const void*)(uintptr_t)addr, (size_t)len);
#else
    return VirtualLock((LPVOID)(uintptr_t)addr, (SIZE_T)len) ? 0 : -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_munlock(
    JNIEnv* env, jclass clazz, jlong addr, jlong len) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return munlock((const void*)(uintptr_t)addr, (size_t)len);
#else
    return VirtualUnlock((LPVOID)(uintptr_t)addr, (SIZE_T)len) ? 0 : -1;
#endif
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_sysconf(
    JNIEnv* env, jclass clazz, jint name) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jlong)sysconf((int)name);
#else
    SYSTEM_INFO si;
    GetSystemInfo(&si);
    return (jlong)si.dwPageSize;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getpid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getpid();
#else
    return (jint)GetCurrentProcessId();
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getppid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getppid();
#else
    return -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_geteuid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)geteuid();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getegid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getegid();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getuid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getuid();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getgid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getgid();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_kill(
    JNIEnv* env, jclass clazz, jint pid, jint sig) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return kill((pid_t)pid, (int)sig);
#else
    (void)pid; (void)sig; errno = ENOSYS; return -1;
#endif
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_sendmsg(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray name, jbyteArray iov, jbyteArray control, jint flags) {
    (void)clazz;
#ifndef _WIN32
    struct msghdr msg;
    memset(&msg, 0, sizeof(msg));
    jbyte* nameBytes = name ? (*env)->GetByteArrayElements(env, name, NULL) : NULL;
    jsize nameLen = name ? (*env)->GetArrayLength(env, name) : 0;
    jbyte* iovBytes = iov ? (*env)->GetByteArrayElements(env, iov, NULL) : NULL;
    jsize iovLen = iov ? (*env)->GetArrayLength(env, iov) : 0;
    jbyte* ctlBytes = control ? (*env)->GetByteArrayElements(env, control, NULL) : NULL;
    jsize ctlLen = control ? (*env)->GetArrayLength(env, control) : 0;

    struct iovec io;
    if (iovBytes) {
        io.iov_base = iovBytes;
        io.iov_len = (size_t)iovLen;
        msg.msg_iov = &io;
        msg.msg_iovlen = 1;
    }
    if (nameBytes) {
        msg.msg_name = nameBytes;
        msg.msg_namelen = (socklen_t)nameLen;
    }
    if (ctlBytes) {
        msg.msg_control = ctlBytes;
        msg.msg_controllen = (socklen_t)ctlLen;
    }

    ssize_t res = sendmsg((int)fd, &msg, (int)flags);

    if (nameBytes) (*env)->ReleaseByteArrayElements(env, name, nameBytes, JNI_ABORT);
    if (iovBytes) (*env)->ReleaseByteArrayElements(env, iov, iovBytes, JNI_ABORT);
    if (ctlBytes) (*env)->ReleaseByteArrayElements(env, control, ctlBytes, JNI_ABORT);
    return (jlong)res;
#else
    (void)env; (void)fd; (void)name; (void)iov; (void)control; (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_recvmsg(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray name, jintArray nameLenOut, jbyteArray iov, jbyteArray control, jintArray controlLenOut, jintArray flagsOut, jint flags) {
    (void)clazz;
#ifndef _WIN32
    struct msghdr msg;
    memset(&msg, 0, sizeof(msg));
    jbyte* nameBytes = name ? (*env)->GetByteArrayElements(env, name, NULL) : NULL;
    jsize nameCap = name ? (*env)->GetArrayLength(env, name) : 0;
    jbyte* iovBytes = iov ? (*env)->GetByteArrayElements(env, iov, NULL) : NULL;
    jsize iovLen = iov ? (*env)->GetArrayLength(env, iov) : 0;
    jbyte* ctlBytes = control ? (*env)->GetByteArrayElements(env, control, NULL) : NULL;
    jsize ctlCap = control ? (*env)->GetArrayLength(env, control) : 0;

    struct iovec io;
    if (iovBytes) {
        io.iov_base = iovBytes;
        io.iov_len = (size_t)iovLen;
        msg.msg_iov = &io;
        msg.msg_iovlen = 1;
    }
    if (nameBytes) {
        msg.msg_name = nameBytes;
        msg.msg_namelen = (socklen_t)nameCap;
    }
    if (ctlBytes) {
        msg.msg_control = ctlBytes;
        msg.msg_controllen = (socklen_t)ctlCap;
    }

    ssize_t res = recvmsg((int)fd, &msg, (int)flags);

    if (nameBytes) {
        (*env)->ReleaseByteArrayElements(env, name, nameBytes, 0);
        if (nameLenOut) {
            jint nl = (jint)msg.msg_namelen;
            (*env)->SetIntArrayRegion(env, nameLenOut, 0, 1, &nl);
        }
    }
    if (iovBytes) (*env)->ReleaseByteArrayElements(env, iov, iovBytes, 0);
    if (ctlBytes) {
        (*env)->ReleaseByteArrayElements(env, control, ctlBytes, 0);
        if (controlLenOut) {
            jint cl = (jint)msg.msg_controllen;
            (*env)->SetIntArrayRegion(env, controlLenOut, 0, 1, &cl);
        }
    }
    if (flagsOut) {
        jint fl = (jint)msg.msg_flags;
        (*env)->SetIntArrayRegion(env, flagsOut, 0, 1, &fl);
    }
    return (jlong)res;
#else
    (void)env; (void)fd; (void)name; (void)nameLenOut; (void)iov; (void)control; (void)controlLenOut; (void)flagsOut; (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_syscall(
    JNIEnv* env, jclass clazz, jlong num, jlong a1, jlong a2, jlong a3, jlong a4, jlong a5, jlong a6) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jlong)syscall((long)num, (long)a1, (long)a2, (long)a3, (long)a4, (long)a5, (long)a6);
#else
    (void)num; (void)a1; (void)a2; (void)a3; (void)a4; (void)a5; (void)a6;
    return -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_pidfdOpen(
    JNIEnv* env, jclass clazz, jint pid, jint flags) {
    (void)env; (void)clazz;
#if defined(__linux__) && defined(SYS_pidfd_open)
    return (jint)syscall(SYS_pidfd_open, (int)pid, (unsigned int)flags);
#else
    (void)pid; (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getenv(
    JNIEnv* env, jclass clazz, jstring name) {
    (void)clazz;
    if (!name) return NULL;
    const char* cname = (*env)->GetStringUTFChars(env, name, NULL);
    if (!cname) return NULL;
    const char* val = getenv(cname);
    jstring result = val ? (*env)->NewStringUTF(env, val) : NULL;
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return result;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_setenv(
    JNIEnv* env, jclass clazz, jstring name, jstring value, jint overwrite) {
    (void)clazz;
    if (!name || !value) {
        errno = EINVAL;
        return -1;
    }
    const char* cname = (*env)->GetStringUTFChars(env, name, NULL);
    if (!cname) return -1;
    const char* cval = (*env)->GetStringUTFChars(env, value, NULL);
    if (!cval) {
        (*env)->ReleaseStringUTFChars(env, name, cname);
        return -1;
    }
#ifndef _WIN32
    int res = setenv(cname, cval, (int)overwrite);
#else
    int res = -1;
    if (!*cname || strchr(cname, '=') != NULL) {
        errno = EINVAL;
    } else if (!overwrite && getenv(cname) != NULL) {
        res = 0;
    } else {
        res = _putenv_s(cname, cval) == 0 ? 0 : -1;
    }
#endif
    (*env)->ReleaseStringUTFChars(env, value, cval);
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_unsetenv(
    JNIEnv* env, jclass clazz, jstring name) {
    (void)clazz;
    if (!name) {
        errno = EINVAL;
        return -1;
    }
    const char* cname = (*env)->GetStringUTFChars(env, name, NULL);
    if (!cname) return -1;
#ifndef _WIN32
    int res = unsetenv(cname);
#else
    int res = -1;
    if (!*cname || strchr(cname, '=') != NULL) {
        errno = EINVAL;
    } else {
        res = _putenv_s(cname, "") == 0 ? 0 : -1;
    }
#endif
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_putenv(
    JNIEnv* env, jclass clazz, jstring string) {
    (void)clazz;
    if (!string) {
        errno = EINVAL;
        return -1;
    }
    const char* cstr = (*env)->GetStringUTFChars(env, string, NULL);
    if (!cstr) return -1;
#ifndef _WIN32
    int res = putenv(strdup(cstr));
#else
    int res = _putenv(_strdup(cstr));
#endif
    (*env)->ReleaseStringUTFChars(env, string, cstr);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_putenvS(
    JNIEnv* env, jclass clazz, jstring name, jstring value) {
    (void)clazz;
    if (!name || !value) {
        errno = EINVAL;
        return EINVAL;
    }
    const char* cname = (*env)->GetStringUTFChars(env, name, NULL);
    if (!cname) return EINVAL;
    const char* cval = (*env)->GetStringUTFChars(env, value, NULL);
    if (!cval) {
        (*env)->ReleaseStringUTFChars(env, name, cname);
        return EINVAL;
    }
#ifdef _WIN32
    int res = (int)_putenv_s(cname, cval);
#else
    int res;
    if (cval[0] == '\0') {
        res = unsetenv(cname) == 0 ? 0 : errno;
    } else {
        res = setenv(cname, cval, 1) == 0 ? 0 : errno;
    }
#endif
    (*env)->ReleaseStringUTFChars(env, value, cval);
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_clearenv(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#if defined(_WIN32)
    LPWCH envBlock = GetEnvironmentStringsW();
    if (!envBlock) return -1;
    LPWCH p = envBlock;
    while (*p) {
        size_t len = wcslen(p);
        if (p[0] != L'=') {
            wchar_t* eq = wcschr(p, L'=');
            if (eq) {
                size_t namelen = (size_t)(eq - p);
                wchar_t* name = (wchar_t*)malloc((namelen + 1) * sizeof(wchar_t));
                if (name) {
                    memcpy(name, p, namelen * sizeof(wchar_t));
                    name[namelen] = L'\0';
                    _wputenv_s(name, L"");
                    free(name);
                }
            }
        }
        p += len + 1;
    }
    FreeEnvironmentStringsW(envBlock);
    return 0;
#elif defined(__linux__) && !defined(__ANDROID__)
    return clearenv();
#else
    extern char **environ;
    if (!environ) return 0;
    while (environ[0] != NULL) {
        const char* entry = environ[0];
        const char* eq = strchr(entry, '=');
        if (eq != NULL && eq > entry) {
            size_t len = (size_t)(eq - entry);
            char* name = (char*)malloc(len + 1);
            if (!name) return -1;
            memcpy(name, entry, len);
            name[len] = '\0';
            unsetenv(name);
            free(name);
        } else {
            environ[0] = NULL;
            break;
        }
    }
    return 0;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_isatty(
    JNIEnv* env, jclass clazz, jint fd) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)isatty((int)fd);
#else
    return (jint)_isatty((int)fd);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getErrno(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
    return (jint)errno;
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_strerror(
    JNIEnv* env, jclass clazz, jint errnum) {
    (void)clazz;
    const char* s = strerror((int)errnum);
    return s ? (*env)->NewStringUTF(env, s) : NULL;
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_realpath(
    JNIEnv* env, jclass clazz, jstring pathname) {
    (void)clazz;
    if (!pathname) {
        errno = EINVAL;
        return NULL;
    }
    const char* cpath = (*env)->GetStringUTFChars(env, pathname, NULL);
    if (!cpath) return NULL;
#ifndef _WIN32
    char buf[4096];
    char* res = realpath(cpath, buf);
#else
    char buf[4096];
    char* res = _fullpath(buf, cpath, sizeof(buf));
#endif
    jstring out = res ? (*env)->NewStringUTF(env, res) : NULL;
    (*env)->ReleaseStringUTFChars(env, pathname, cpath);
    return out;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_access(
    JNIEnv* env, jclass clazz, jstring path, jint mode) {
    (void)clazz;
    if (!path) {
        errno = EINVAL;
        return -1;
    }
    const char* cpath = (*env)->GetStringUTFChars(env, path, NULL);
    if (!cpath) return -1;
#ifndef _WIN32
    int res = access(cpath, (int)mode);
#else
    int res = _access(cpath, (int)mode);
#endif
    (*env)->ReleaseStringUTFChars(env, path, cpath);
    return (jint)res;
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_unameFields(
    JNIEnv* env, jclass clazz) {
    (void)clazz;
    char out[2048];
#ifndef _WIN32
    struct utsname u;
    memset(&u, 0, sizeof(u));
    if (uname(&u) != 0) return NULL;
    snprintf(out, sizeof(out), "%s\n%s\n%s\n%s\n%s",
             u.sysname, u.nodename, u.release, u.version, u.machine);
#else
    char nodename[256] = "localhost";
    DWORD sz = (DWORD)sizeof(nodename);
    GetComputerNameA(nodename, &sz);
    snprintf(out, sizeof(out), "Windows_NT\n%s\n10.0\nWindows\nx86_64", nodename);
#endif
    return (*env)->NewStringUTF(env, out);
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getpwuidRStr(
    JNIEnv* env, jclass clazz, jint uid, jlong buflen) {
    (void)clazz;
    char out[4096];
    if (buflen < 64) {
        snprintf(out, sizeof(out), "%d\n0", ERANGE);
        return (*env)->NewStringUTF(env, out);
    }
#if !defined(_WIN32)
    struct passwd pwd;
    struct passwd* result = NULL;
    size_t blen = (size_t)buflen;
    if (blen > 16384) blen = 16384;
    char* buf = (char*)malloc(blen);
    if (!buf) {
        snprintf(out, sizeof(out), "%d\n0", ENOMEM);
        return (*env)->NewStringUTF(env, out);
    }
    int rc = getpwuid_r((uid_t)uid, &pwd, buf, blen, &result);
    if (rc == 0 && result != NULL) {
        snprintf(out, sizeof(out), "0\n1\n%s\n%s\n%u\n%u\n%s\n%s\n%s",
                 result->pw_name ? result->pw_name : "",
                 result->pw_passwd ? result->pw_passwd : "",
                 (unsigned int)result->pw_uid,
                 (unsigned int)result->pw_gid,
                 result->pw_gecos ? result->pw_gecos : "",
                 result->pw_dir ? result->pw_dir : "",
                 result->pw_shell ? result->pw_shell : "");
    } else {
        snprintf(out, sizeof(out), "%d\n0", rc);
    }
    free(buf);
#else
    (void)uid;
    const char* user = getenv("USERNAME");
    const char* home = getenv("USERPROFILE");
    snprintf(out, sizeof(out), "0\n1\n%s\n\n0\n0\n\n%s\n",
             user ? user : "user", home ? home : "C:\\Users\\Default");
#endif
    return (*env)->NewStringUTF(env, out);
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getpwnamRStr(
    JNIEnv* env, jclass clazz, jstring name, jlong buflen) {
    (void)clazz;
    char out[4096];
    if (!name) {
        snprintf(out, sizeof(out), "%d\n0", EINVAL);
        return (*env)->NewStringUTF(env, out);
    }
    if (buflen < 64) {
        snprintf(out, sizeof(out), "%d\n0", ERANGE);
        return (*env)->NewStringUTF(env, out);
    }
    const char* cname = (*env)->GetStringUTFChars(env, name, NULL);
    if (!cname) {
        snprintf(out, sizeof(out), "%d\n0", ENOMEM);
        return (*env)->NewStringUTF(env, out);
    }
#if !defined(_WIN32)
    struct passwd pwd;
    struct passwd* result = NULL;
    size_t blen = (size_t)buflen;
    if (blen > 16384) blen = 16384;
    char* buf = (char*)malloc(blen);
    if (!buf) {
        (*env)->ReleaseStringUTFChars(env, name, cname);
        snprintf(out, sizeof(out), "%d\n0", ENOMEM);
        return (*env)->NewStringUTF(env, out);
    }
    int rc = getpwnam_r(cname, &pwd, buf, blen, &result);
    if (rc == 0 && result != NULL) {
        snprintf(out, sizeof(out), "0\n1\n%s\n%s\n%u\n%u\n%s\n%s\n%s",
                 result->pw_name ? result->pw_name : "",
                 result->pw_passwd ? result->pw_passwd : "",
                 (unsigned int)result->pw_uid,
                 (unsigned int)result->pw_gid,
                 result->pw_gecos ? result->pw_gecos : "",
                 result->pw_dir ? result->pw_dir : "",
                 result->pw_shell ? result->pw_shell : "");
    } else {
        snprintf(out, sizeof(out), "%d\n0", rc);
    }
    free(buf);
#else
    const char* user = getenv("USERNAME");
    const char* home = getenv("USERPROFILE");
    if (user && strcmp(cname, user) == 0) {
        snprintf(out, sizeof(out), "0\n1\n%s\n\n0\n0\n\n%s\n",
                 user, home ? home : "C:\\Users\\Default");
    } else {
        snprintf(out, sizeof(out), "0\n0");
    }
#endif
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return (*env)->NewStringUTF(env, out);
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_fopen(
    JNIEnv* env, jclass clazz, jstring path, jstring mode) {
    (void)clazz;
    if (!path || !mode) return 0;
    const char* cpath = (*env)->GetStringUTFChars(env, path, NULL);
    if (!cpath) return 0;
    const char* cmode = (*env)->GetStringUTFChars(env, mode, NULL);
    if (!cmode) {
        (*env)->ReleaseStringUTFChars(env, path, cpath);
        return 0;
    }
    FILE* fp = fopen(cpath, cmode);
    (*env)->ReleaseStringUTFChars(env, mode, cmode);
    (*env)->ReleaseStringUTFChars(env, path, cpath);
    return (jlong)(uintptr_t)fp;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_fclose(
    JNIEnv* env, jclass clazz, jlong fp) {
    (void)env; (void)clazz;
    if (fp == 0 || fp == -1) return EOF;
    return (jint)fclose((FILE*)(uintptr_t)fp);
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_fflush(
    JNIEnv* env, jclass clazz, jlong fp) {
    (void)env; (void)clazz;
    if (fp == -1) return EOF;
    return (jint)fflush((FILE*)(uintptr_t)fp);
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_fgetc(
    JNIEnv* env, jclass clazz, jlong fp) {
    (void)env; (void)clazz;
    if (fp == 0 || fp == -1) return EOF;
    return (jint)fgetc((FILE*)(uintptr_t)fp);
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_fputc(
    JNIEnv* env, jclass clazz, jint c, jlong fp) {
    (void)env; (void)clazz;
    if (fp == 0 || fp == -1) return EOF;
    return (jint)fputc((int)c, (FILE*)(uintptr_t)fp);
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_fgets(
    JNIEnv* env, jclass clazz, jint n, jlong fp) {
    (void)clazz;
    if (fp == 0 || fp == -1 || n <= 0) return NULL;
    size_t cap = (size_t)n;
    if (cap > 65536) cap = 65536;
    char* buf = (char*)malloc(cap);
    if (!buf) return NULL;
    char* res = fgets(buf, (int)cap, (FILE*)(uintptr_t)fp);
    jstring out = res ? (*env)->NewStringUTF(env, res) : NULL;
    free(buf);
    return out;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_fputs(
    JNIEnv* env, jclass clazz, jstring s, jlong fp) {
    (void)clazz;
    if (!s || fp == 0 || fp == -1) return EOF;
    const char* cs = (*env)->GetStringUTFChars(env, s, NULL);
    if (!cs) return EOF;
    int res = fputs(cs, (FILE*)(uintptr_t)fp);
    (*env)->ReleaseStringUTFChars(env, s, cs);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_feof(
    JNIEnv* env, jclass clazz, jlong fp) {
    (void)env; (void)clazz;
    if (fp == 0 || fp == -1) return 1;
    return (jint)feof((FILE*)(uintptr_t)fp);
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_ferror(
    JNIEnv* env, jclass clazz, jlong fp) {
    (void)env; (void)clazz;
    if (fp == 0 || fp == -1) return 1;
    return (jint)ferror((FILE*)(uintptr_t)fp);
}

JNIEXPORT void JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_clearerr(
    JNIEnv* env, jclass clazz, jlong fp) {
    (void)env; (void)clazz;
    if (fp == 0 || fp == -1) return;
    clearerr((FILE*)(uintptr_t)fp);
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_popen(
    JNIEnv* env, jclass clazz, jstring command, jstring mode) {
    (void)clazz;
    if (!command || !mode) return 0;
    const char* ccmd = (*env)->GetStringUTFChars(env, command, NULL);
    if (!ccmd) return 0;
    const char* cmode = (*env)->GetStringUTFChars(env, mode, NULL);
    if (!cmode) {
        (*env)->ReleaseStringUTFChars(env, command, ccmd);
        return 0;
    }
#ifndef _WIN32
    FILE* fp = popen(ccmd, cmode);
#else
    FILE* fp = _popen(ccmd, cmode);
#endif
    (*env)->ReleaseStringUTFChars(env, mode, cmode);
    (*env)->ReleaseStringUTFChars(env, command, ccmd);
    return (jlong)(uintptr_t)fp;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_pclose(
    JNIEnv* env, jclass clazz, jlong fp) {
    (void)env; (void)clazz;
    if (fp == 0 || fp == -1) return -1;
#ifndef _WIN32
    return (jint)pclose((FILE*)(uintptr_t)fp);
#else
    return (jint)_pclose((FILE*)(uintptr_t)fp);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_remove(
    JNIEnv* env, jclass clazz, jstring filename) {
    (void)clazz;
    if (!filename) return -1;
    const char* cfile = (*env)->GetStringUTFChars(env, filename, NULL);
    if (!cfile) return -1;
    int res = remove(cfile);
    (*env)->ReleaseStringUTFChars(env, filename, cfile);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_rename(
    JNIEnv* env, jclass clazz, jstring oldname, jstring newname) {
    (void)clazz;
    if (!oldname || !newname) return -1;
    const char* cold = (*env)->GetStringUTFChars(env, oldname, NULL);
    if (!cold) return -1;
    const char* cnew = (*env)->GetStringUTFChars(env, newname, NULL);
    if (!cnew) {
        (*env)->ReleaseStringUTFChars(env, oldname, cold);
        return -1;
    }
    int res = rename(cold, cnew);
    (*env)->ReleaseStringUTFChars(env, newname, cnew);
    (*env)->ReleaseStringUTFChars(env, oldname, cold);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_unlink(
    JNIEnv* env, jclass clazz, jstring path) {
    (void)clazz;
    if (!path) return -1;
    const char* cpath = (*env)->GetStringUTFChars(env, path, NULL);
    if (!cpath) return -1;
#ifndef _WIN32
    int res = unlink(cpath);
#else
    int res = _unlink(cpath);
#endif
    (*env)->ReleaseStringUTFChars(env, path, cpath);
    return (jint)res;
}

static unsigned int jni_hex_nibble(char c) {
    if (c >= '0' && c <= '9') return (unsigned int)(c - '0');
    if (c >= 'a' && c <= 'f') return (unsigned int)(c - 'a' + 10);
    if (c >= 'A' && c <= 'F') return (unsigned int)(c - 'A' + 10);
    return 0;
}

static void jni_ensure_wsa(void) {
#ifdef _WIN32
    static int inited = 0;
    if (!inited) {
        WSADATA wsa;
        if (WSAStartup(MAKEWORD(2, 2), &wsa) == 0) {
            inited = 1;
        }
    }
#endif
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getaddrinfoStr(
    JNIEnv* env, jclass clazz,
    jstring node, jstring service,
    jint hasHints, jint aiFlags, jint aiFamily, jint aiSocktype, jint aiProtocol) {
    (void)clazz;
    jni_ensure_wsa();
    const char* cnode = node ? (*env)->GetStringUTFChars(env, node, NULL) : NULL;
    const char* cserv = service ? (*env)->GetStringUTFChars(env, service, NULL) : NULL;
    struct addrinfo hints;
    memset(&hints, 0, sizeof(hints));
    if (hasHints) {
        hints.ai_flags = (int)aiFlags;
        int fam = (int)aiFamily;
        if (fam == 10 || fam == 23 || fam == 24 || fam == 28 || fam == 30) {
            fam = AF_INET6;
        }
        hints.ai_family = fam;
        hints.ai_socktype = (int)aiSocktype;
        hints.ai_protocol = (int)aiProtocol;
    }
    struct addrinfo* res = NULL;
    int rc = getaddrinfo(cnode, cserv, hasHints ? &hints : NULL, &res);
    if (cnode) (*env)->ReleaseStringUTFChars(env, node, cnode);
    if (cserv) (*env)->ReleaseStringUTFChars(env, service, cserv);
    char out[16384];
    if (rc != 0) {
        snprintf(out, sizeof(out), "%d\n0", rc);
        return (*env)->NewStringUTF(env, out);
    }
    int count = 0;
    for (struct addrinfo* p = res; p != NULL && count < 64; p = p->ai_next) {
        count++;
    }
    size_t pos = (size_t)snprintf(out, sizeof(out), "0\n%d\n", count);
    static const char hex_digits[] = "0123456789abcdef";
    int idx = 0;
    for (struct addrinfo* p = res; p != NULL && idx < count; p = p->ai_next, idx++) {
        char hex[256];
        size_t hex_pos = 0;
        unsigned int sa_fam = (unsigned int)p->ai_family;
        if (p->ai_addr && p->ai_addrlen >= 2) {
            sa_fam = (unsigned int)p->ai_addr->sa_family;
            const unsigned char* raw = ((const unsigned char*)p->ai_addr) + 2;
            size_t raw_len = (size_t)p->ai_addrlen - 2;
            if (raw_len > 120) raw_len = 120;
            for (size_t b = 0; b < raw_len; b++) {
                hex[hex_pos++] = hex_digits[(raw[b] >> 4) & 0x0F];
                hex[hex_pos++] = hex_digits[raw[b] & 0x0F];
            }
        }
        hex[hex_pos] = '\0';
        const char* canon = p->ai_canonname ? p->ai_canonname : "";
        if (pos < sizeof(out)) {
            int n = snprintf(
                out + pos,
                sizeof(out) - pos,
                "%d\t%d\t%d\t%d\t%u\t%u\t%s\t%s\n",
                p->ai_flags,
                p->ai_family,
                p->ai_socktype,
                p->ai_protocol,
                (unsigned int)p->ai_addrlen,
                sa_fam,
                hex,
                canon
            );
            if (n > 0) pos += (size_t)n;
        }
    }
    freeaddrinfo(res);
    return (*env)->NewStringUTF(env, out);
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getnameinfoStr(
    JNIEnv* env, jclass clazz,
    jint saFamily, jstring saDataHex, jint salen, jint hostlen, jint servlen, jint flags) {
    (void)clazz;
    char out[2048];
    if (saFamily < 0) {
        snprintf(out, sizeof(out), "%d\n\n", EAI_FAIL);
        return (*env)->NewStringUTF(env, out);
    }
    jni_ensure_wsa();
    const char* chex = saDataHex ? (*env)->GetStringUTFChars(env, saDataHex, NULL) : "";
    struct sockaddr_storage ss;
    memset(&ss, 0, sizeof(ss));
    size_t hex_len = chex ? strlen(chex) : 0;
    size_t data_len = hex_len / 2;
    if (data_len > sizeof(ss) - 2) data_len = sizeof(ss) - 2;
    unsigned char* dst = ((unsigned char*)&ss) + 2;
    for (size_t i = 0; i < data_len; i++) {
        unsigned int hi = jni_hex_nibble(chex[i * 2]);
        unsigned int lo = jni_hex_nibble(chex[i * 2 + 1]);
        dst[i] = (unsigned char)((hi << 4) | lo);
    }
    if (saDataHex && chex) (*env)->ReleaseStringUTFChars(env, saDataHex, chex);
    int fam = (int)saFamily;
    if (fam == 10 || fam == 23 || fam == 24 || fam == 28 || fam == 30) {
        fam = AF_INET6;
    }
    socklen_t total_len = (socklen_t)(2 + data_len);
    if ((socklen_t)salen > total_len && (size_t)salen <= sizeof(ss)) {
        total_len = (socklen_t)salen;
    }
    if (fam == AF_INET && total_len < (socklen_t)sizeof(struct sockaddr_in)) {
        total_len = (socklen_t)sizeof(struct sockaddr_in);
    } else if (fam == AF_INET6 && total_len < (socklen_t)sizeof(struct sockaddr_in6)) {
        total_len = (socklen_t)sizeof(struct sockaddr_in6);
    }
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    ss.ss_len = (uint8_t)total_len;
    ss.ss_family = (sa_family_t)fam;
#else
    ss.ss_family = (unsigned short)fam;
#endif
    char hbuf[1025];
    char sbuf[64];
    memset(hbuf, 0, sizeof(hbuf));
    memset(sbuf, 0, sizeof(sbuf));
    socklen_t hlen = hostlen > 0 ? ((size_t)hostlen < sizeof(hbuf) ? (socklen_t)hostlen : (socklen_t)(sizeof(hbuf) - 1)) : 0;
    socklen_t slen = servlen > 0 ? ((size_t)servlen < sizeof(sbuf) ? (socklen_t)servlen : (socklen_t)(sizeof(sbuf) - 1)) : 0;
    int rc = getnameinfo(
        (const struct sockaddr*)&ss,
        total_len,
        hlen > 0 ? hbuf : NULL,
        hlen,
        slen > 0 ? sbuf : NULL,
        slen,
        (int)flags
    );
    snprintf(out, sizeof(out), "%d\n%s\n%s", rc, rc == 0 ? hbuf : "", rc == 0 ? sbuf : "");
    return (*env)->NewStringUTF(env, out);
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_gaiStrerror(
    JNIEnv* env, jclass clazz, jint errcode) {
    (void)clazz;
#ifndef _WIN32
    const char* s = gai_strerror((int)errcode);
#else
    const char* s = gai_strerrorA((int)errcode);
#endif
    return s ? (*env)->NewStringUTF(env, s) : NULL;
}

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_hstrerror(
    JNIEnv* env, jclass clazz, jint errcode) {
    (void)clazz;
#if !defined(_WIN32) && !defined(__ANDROID__)
    const char* s = hstrerror((int)errcode);
#else
    const char* s;
    switch ((int)errcode) {
        case 0: s = "Resolver Error 0 (no error)"; break;
        case 1: s = "Unknown host"; break;
        case 2: s = "Host name lookup failure"; break;
        case 3: s = "Unknown server error"; break;
        case 4: s = "No address associated with name"; break;
        default: s = "Unknown resolver error"; break;
    }
#endif
    return s ? (*env)->NewStringUTF(env, s) : NULL;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_resInit(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    typedef int (*res_init_fn)(void);
    res_init_fn fn = (res_init_fn)dlsym(RTLD_DEFAULT, "res_init");
    if (!fn) fn = (res_init_fn)dlsym(RTLD_DEFAULT, "__res_init");
    if (fn) return (jint)fn();
#endif
    return 0;
}


