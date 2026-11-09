#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "wasi_p2_wrapper.h"
#include <errno.h>
#ifdef _WIN32
#include <winsock2.h>
#include <ws2tcpip.h>
#endif
#if !defined(_WIN32)
#include <sys/socket.h>
#endif
#ifdef _WIN32
#ifndef WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN
#endif
#include <windows.h>
#else
#include <dlfcn.h>
#ifndef RTLD_DEFAULT
#define RTLD_DEFAULT ((void*)0)
#endif
#endif

int32_t libc_wasi_p2_socket(int32_t domain, int32_t type_, int32_t protocol) {
    return (int32_t)socket(domain, type_, protocol);
}

int32_t libc_wasi_p2_connect(int32_t fd, void* name, uint32_t addrlen) {
    return (int32_t)connect(fd, name, addrlen);
}

int32_t libc_wasi_p2_bind(int32_t arg_0_socket, void* addr, uint32_t addrlen) {
    return (int32_t)bind(arg_0_socket, addr, addrlen);
}

int32_t libc_wasi_p2_listen(int32_t arg_0_socket, int32_t backlog) {
    return (int32_t)listen(arg_0_socket, backlog);
}

int32_t libc_wasi_p2_accept(int32_t arg_0_socket, void* addr, void* addrlen) {
    return (int32_t)accept(arg_0_socket, addr, addrlen);
}

int32_t libc_wasi_p2_accept4(int32_t arg_0_socket, void* addr, void* addrlen, int32_t flags) {
    typedef int32_t (*km_fn_t)(int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "accept4");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "accept4");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "accept4");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_socket, addr, addrlen, flags);
    }
    errno = ENOSYS;
    return -1;
}

int32_t libc_wasi_p2_getsockname(int32_t arg_0_socket, void* addr, void* addrlen) {
    return (int32_t)getsockname(arg_0_socket, addr, addrlen);
}

int32_t libc_wasi_p2_getpeername(int32_t arg_0_socket, void* addr, void* addrlen) {
    return (int32_t)getpeername(arg_0_socket, addr, addrlen);
}

int64_t libc_wasi_p2_sendto(int32_t arg_0_socket, void* buffer, uint64_t length, int32_t flags, void* addr, uint32_t addrlen) {
    return (int64_t)sendto(arg_0_socket, buffer, length, flags, addr, addrlen);
}

int64_t libc_wasi_p2_recvfrom(int32_t arg_0_socket, void* buffer, uint64_t length, int32_t flags, void* addr, void* addrlen) {
    return (int64_t)recvfrom(arg_0_socket, buffer, length, flags, addr, addrlen);
}

int32_t libc_wasi_p2_getsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, void* optlen) {
    return (int32_t)getsockopt(sockfd, level, optname, optval, optlen);
}

int32_t libc_wasi_p2_setsockopt(int32_t sockfd, int32_t level, int32_t optname, void* optval, uint32_t optlen) {
    return (int32_t)setsockopt(sockfd, level, optname, optval, optlen);
}

int32_t libc_wasi_p2_getaddrinfo(const char* host, const char* serv, void* hint, void* res) {
    typedef int32_t (*km_fn_t)(const char*, const char*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "getaddrinfo");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "getaddrinfo");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "getaddrinfo");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(host, serv, hint, res);
    }
    errno = ENOSYS;
    return -1;
}

void libc_wasi_p2_freeaddrinfo(void* p) {
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "freeaddrinfo");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "freeaddrinfo");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "freeaddrinfo");
    }
#endif
    if (km_fn_ptr != NULL) {
        km_fn_ptr(p);
        return;
    }
    errno = ENOSYS;
}

const char* libc_wasi_p2_gaiStrerror(int32_t ecode) {
    typedef const char* (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
#ifdef _WIN32
    if (km_fn_ptr == NULL) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == NULL) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_ucrt, "gai_strerror");
        if (km_fn_ptr == NULL) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == NULL) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_msvcrt, "gai_strerror");
        }
    }
#else
    if (km_fn_ptr == NULL) {
        km_fn_ptr = (km_fn_t)dlsym(RTLD_DEFAULT, "gai_strerror");
    }
#endif
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ecode);
    }
    errno = ENOSYS;
    return NULL;
}

