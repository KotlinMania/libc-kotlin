#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <napi.h>
#include <cstdint>
#include <cstddef>
#include <cstdlib>
#include <cstring>
#include <cerrno>
#include <string>
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

struct KmNapiRegistrarNode {
    void (*register_fn)(Napi::Env, Napi::Object);
    KmNapiRegistrarNode* next;
};
#if defined(__GNUC__) || defined(__clang__)
__attribute__((visibility("hidden")))
#endif
extern KmNapiRegistrarNode* km_napi_registrar_head;

namespace {

static int64_t km_napi_arg_i64(const Napi::Value& v) {
    if (v.IsNull() || v.IsUndefined()) return 0;
    if (v.IsString()) {
        std::string s = v.As<Napi::String>().Utf8Value();
        return static_cast<int64_t>(std::strtoll(s.c_str(), nullptr, 10));
    }
    if (v.IsNumber()) return v.As<Napi::Number>().Int64Value();
    return 0;
}

static uint64_t km_napi_arg_u64(const Napi::Value& v) {
    if (v.IsNull() || v.IsUndefined()) return 0;
    if (v.IsString()) {
        std::string s = v.As<Napi::String>().Utf8Value();
        return static_cast<uint64_t>(std::strtoull(s.c_str(), nullptr, 10));
    }
    if (v.IsNumber()) return static_cast<uint64_t>(v.As<Napi::Number>().Int64Value());
    return 0;
}

static Napi::Value libc_unix_nto_get_SYSPAGE_PTR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    static void** km_sym_ptr = nullptr;
#ifdef _WIN32
    if (km_sym_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_sym_ptr = reinterpret_cast<void**>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_syspage_ptr")));
        if (km_sym_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_sym_ptr = reinterpret_cast<void**>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_syspage_ptr")));
        }
    }
#else
    if (km_sym_ptr == nullptr) {
        km_sym_ptr = reinterpret_cast<void**>(dlsym(RTLD_DEFAULT, "_syspage_ptr"));
    }
#endif
    void* km_res = (km_sym_ptr != nullptr) ? *km_sym_ptr : NULL;
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_nto_set_SYSPAGE_PTR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    static void** km_sym_ptr = nullptr;
#ifdef _WIN32
    if (km_sym_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_sym_ptr = reinterpret_cast<void**>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_syspage_ptr")));
        if (km_sym_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_sym_ptr = reinterpret_cast<void**>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_syspage_ptr")));
        }
    }
#else
    if (km_sym_ptr == nullptr) {
        km_sym_ptr = reinterpret_cast<void**>(dlsym(RTLD_DEFAULT, "_syspage_ptr"));
    }
#endif
    if (km_sym_ptr != nullptr) {
        *km_sym_ptr = value;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_nto_sendmmsg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t sockfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* msgvec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t vlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sendmmsg")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sendmmsg")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sendmmsg")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sendmmsg")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sendmmsg"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sockfd, msgvec, vlen, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_recvmmsg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t sockfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* msgvec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t vlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "recvmmsg")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_recvmmsg")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "recvmmsg")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_recvmmsg")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "recvmmsg"));
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sockfd, msgvec, vlen, flags, timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_semDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sem_destroy")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sem_destroy")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sem_destroy")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sem_destroy")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sem_destroy"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sem_destroy"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sem_destroy"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_semInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pshared = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t value = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sem_init")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sem_init")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sem_init")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sem_init")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sem_init"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sem_init"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sem_init"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sem, pshared, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_fdatasync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "fdatasync")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_fdatasync")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "fdatasync")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_fdatasync")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "fdatasync"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "fdatasync"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "fdatasync"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getpriority_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t which = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t who = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getpriority")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getpriority")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getpriority")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getpriority")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getpriority"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getpriority"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getpriority"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(which, who);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_setpriority_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t which = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t who = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t prio = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setpriority")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setpriority")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setpriority")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setpriority")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setpriority"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setpriority"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setpriority"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(which, who, prio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_mkfifoat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t dirfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool pathname_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string pathname_str = pathname_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* pathname = pathname_null ? nullptr : pathname_str.c_str();
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, const char*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mkfifoat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mkfifoat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mkfifoat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mkfifoat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mkfifoat"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mkfifoat"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mkfifoat"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dirfd, pathname, mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_mknodat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t arg_0_fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool pathname_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string pathname_str = pathname_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* pathname = pathname_null ? nullptr : pathname_str.c_str();
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dev = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, const char*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mknodat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mknodat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mknodat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mknodat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mknodat"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mknodat"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mknodat"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_fd, pathname, mode, dev);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_clockGetres_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t clk_id = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* tp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "clock_getres")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_clock_getres")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "clock_getres")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_clock_getres")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "clock_getres"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "clock_getres"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "clock_getres"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clk_id, tp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_clockGettime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t clk_id = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* tp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "clock_gettime")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_clock_gettime")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "clock_gettime")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_clock_gettime")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "clock_gettime"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "clock_gettime"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "clock_gettime"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clk_id, tp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_clockSettime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t clk_id = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* tp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "clock_settime")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_clock_settime")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "clock_settime")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_clock_settime")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "clock_settime"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "clock_settime"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "clock_settime"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clk_id, tp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_clockGetcpuclockid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* clk_id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "clock_getcpuclockid")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_clock_getcpuclockid")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "clock_getcpuclockid")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_clock_getcpuclockid")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "clock_getcpuclockid"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "clock_getcpuclockid"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "clock_getcpuclockid"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid, clk_id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadAttrGetstack_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stackaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* stacksize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_attr_getstack")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_attr_getstack")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_attr_getstack")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_attr_getstack")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_attr_getstack"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_attr_getstack"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_attr_getstack"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, stackaddr, stacksize);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_memalign_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t align = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t size = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef void* (*km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "memalign")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_memalign")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "memalign")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_memalign")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "memalign"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "memalign"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "memalign"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(align, size);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_nto_setgroups_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t ngroups = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setgroups")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setgroups")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setgroups")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setgroups")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setgroups"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setgroups"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setgroups"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ngroups, ptr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixFadvise_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int64_t offset = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t len = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int32_t advise = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_fadvise")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_fadvise")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_fadvise")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_fadvise")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_fadvise"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_fadvise"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_fadvise"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, offset, len, advise);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_futimens_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* times = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "futimens")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_futimens")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "futimens")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_futimens")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "futimens"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "futimens"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "futimens"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, times);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_nlLanginfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t item = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef char* (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "nl_langinfo")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_nl_langinfo")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "nl_langinfo")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_nl_langinfo")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "nl_langinfo"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "nl_langinfo"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "nl_langinfo"));
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(item);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_nto_utimensat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t dirfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool path_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    void* times = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t flag = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, const char*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "utimensat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_utimensat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "utimensat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_utimensat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "utimensat"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "utimensat"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "utimensat"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dirfd, path, times, flag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadCondattrGetclock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clock_id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_condattr_getclock")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_condattr_getclock")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_condattr_getclock")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_condattr_getclock")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_condattr_getclock"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_condattr_getclock"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_condattr_getclock"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, clock_id);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadCondattrSetclock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t clock_id = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_condattr_setclock")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_condattr_setclock")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_condattr_setclock")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_condattr_setclock")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_condattr_setclock"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_condattr_setclock"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_condattr_setclock"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, clock_id);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadCondattrSetpshared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pshared = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_condattr_setpshared")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_condattr_setpshared")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_condattr_setpshared")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_condattr_setpshared")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_condattr_setpshared"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_condattr_setpshared"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_condattr_setpshared"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadMutexattrSetpshared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pshared = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_mutexattr_setpshared")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_mutexattr_setpshared")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_mutexattr_setpshared")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_mutexattr_setpshared")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_mutexattr_setpshared"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_mutexattr_setpshared"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_mutexattr_setpshared"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadRwlockattrGetpshared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* val = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_rwlockattr_getpshared")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_rwlockattr_getpshared")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_rwlockattr_getpshared")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_rwlockattr_getpshared")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_rwlockattr_getpshared"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_rwlockattr_getpshared"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_rwlockattr_getpshared"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, val);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadRwlockattrSetpshared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t val = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_rwlockattr_setpshared")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_rwlockattr_setpshared")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_rwlockattr_setpshared")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_rwlockattr_setpshared")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_rwlockattr_setpshared"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_rwlockattr_setpshared"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_rwlockattr_setpshared"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, val);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_ptsnameR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t buflen = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef char* (*km_fn_t)(int32_t, char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "ptsname_r")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_ptsname_r")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "ptsname_r")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_ptsname_r")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "ptsname_r"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "ptsname_r"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "ptsname_r"));
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, buf, buflen);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_nto_clearenv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "clearenv")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_clearenv")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "clearenv")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_clearenv")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "clearenv"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "clearenv"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "clearenv"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_waitid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t idtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t id = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* infop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t options = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(uint32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "waitid")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_waitid")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "waitid")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_waitid")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "waitid"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "waitid"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "waitid"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(idtype, id, infop, options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_wait4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t options = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rusage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "wait4")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_wait4")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "wait4")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_wait4")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "wait4"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "wait4"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "wait4"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid, status, options, rusage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_execvpe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool file_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string file_str = file_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* file = file_null ? nullptr : file_str.c_str();
    void* argv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* envp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(const char*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "execvpe")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_execvpe")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "execvpe")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_execvpe")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "execvpe"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "execvpe"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "execvpe"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(file, argv, envp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getifaddrs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getifaddrs")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getifaddrs")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getifaddrs")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getifaddrs")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getifaddrs"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getifaddrs"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getifaddrs"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ifap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_freeifaddrs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "freeifaddrs")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_freeifaddrs")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "freeifaddrs")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_freeifaddrs")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "freeifaddrs"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "freeifaddrs"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "freeifaddrs"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ifa);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_nto_bind_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t arg_0_socket = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t address_len = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "bind")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_bind")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "bind")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_bind")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "bind"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "bind"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "bind"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_socket, address, address_len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_writev_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* iov = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t iovcnt = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "writev")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_writev")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "writev")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_writev")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "writev"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "writev"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "writev"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, iov, iovcnt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_nto_readv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* iov = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t iovcnt = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "readv")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_readv")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "readv")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_readv")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "readv"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "readv"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "readv"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, iov, iovcnt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_nto_sendmsg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* msg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sendmsg")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sendmsg")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sendmsg")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sendmsg")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sendmsg"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sendmsg"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sendmsg"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, msg, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_nto_recvmsg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* msg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "recvmsg")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_recvmsg")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "recvmsg")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_recvmsg")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "recvmsg"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "recvmsg"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "recvmsg"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, msg, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_nto_openpty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* amaster = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* aslave = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    char* name = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* termp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* winp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*, char*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "openpty")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_openpty")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "openpty")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_openpty")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "openpty"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "openpty"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "openpty"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(amaster, aslave, name, termp, winp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_forkpty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* amaster = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* name = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* termp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* winp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(void*, char*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "forkpty")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_forkpty")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "forkpty")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_forkpty")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "forkpty"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "forkpty"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "forkpty"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(amaster, name, termp, winp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_loginTty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "login_tty")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_login_tty")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "login_tty")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_login_tty")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "login_tty"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "login_tty"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "login_tty"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_uname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "uname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_uname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "uname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_uname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "uname"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "uname"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "uname"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(buf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getpeereid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t arg_0_socket = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* euid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* egid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getpeereid")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getpeereid")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getpeereid")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getpeereid")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getpeereid"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getpeereid"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getpeereid"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_socket, euid, egid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_strerrorR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t errnum = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t buflen = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    typedef int32_t (*km_fn_t)(int32_t, char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "strerror_r")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_strerror_r")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "strerror_r")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_strerror_r")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "strerror_r"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "strerror_r"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "strerror_r"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(errnum, buf, buflen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_abs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t i = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "abs")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_abs")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "abs")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_abs")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "abs"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "abs"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "abs"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(i);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_labs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t i = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    typedef int64_t (*km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "labs")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_labs")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "labs")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_labs")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "labs"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "labs"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "labs"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(i);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_nto_rand_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "rand")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_rand")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "rand")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_rand")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "rand"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "rand"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "rand"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_srand_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t seed = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef void (*km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "srand")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_srand")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "srand")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_srand")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "srand"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "srand"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "srand"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(seed);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_nto_setpwent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setpwent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setpwent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setpwent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setpwent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setpwent"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setpwent"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setpwent"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_nto_endpwent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "endpwent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_endpwent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "endpwent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_endpwent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "endpwent"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "endpwent"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "endpwent"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_nto_getpwent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getpwent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getpwent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getpwent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getpwent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getpwent"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getpwent"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getpwent"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_nto_setgrent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setgrent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setgrent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setgrent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setgrent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setgrent"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setgrent"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setgrent"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_nto_endgrent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "endgrent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_endgrent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "endgrent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_endgrent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "endgrent"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "endgrent"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "endgrent"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_nto_getgrent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getgrent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getgrent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getgrent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getgrent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getgrent"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getgrent"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getgrent"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_nto_setspent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setspent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setspent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setspent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setspent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setspent"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setspent"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setspent"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_nto_endspent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "endspent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_endspent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "endspent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_endspent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "endspent"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "endspent"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "endspent"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_nto_shmOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    int32_t oflag = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "shm_open")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_shm_open")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "shm_open")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_shm_open")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "shm_open"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "shm_open"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "shm_open"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name, oflag, mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_ftok_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool pathname_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string pathname_str = pathname_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* pathname = pathname_null ? nullptr : pathname_str.c_str();
    int32_t proj_id = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef uint32_t (*km_fn_t)(const char*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "ftok")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_ftok")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "ftok")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_ftok")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "ftok"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "ftok"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "ftok"));
        }
#endif
    }
#endif
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pathname, proj_id);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_mprotect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t prot = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mprotect")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mprotect")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mprotect")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mprotect")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mprotect"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mprotect"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mprotect"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(addr, len, prot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixFallocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int64_t offset = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t len = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    typedef int32_t (*km_fn_t)(int32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_fallocate")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_fallocate")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_fallocate")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_fallocate")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_fallocate"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_fallocate"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_fallocate"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, offset, len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_mkostemp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* arg_0_template = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(char*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mkostemp")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mkostemp")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mkostemp")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mkostemp")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mkostemp"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mkostemp"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mkostemp"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_template, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_mkostemps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* arg_0_template = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t suffixlen = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(char*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mkostemps")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mkostemps")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mkostemps")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mkostemps")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mkostemps"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mkostemps"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mkostemps"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_template, suffixlen, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_sigtimedwait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* set = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* info = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sigtimedwait")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sigtimedwait")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sigtimedwait")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sigtimedwait")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sigtimedwait"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sigtimedwait"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sigtimedwait"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(set, info, timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_sigwaitinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* set = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* info = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sigwaitinfo")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sigwaitinfo")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sigwaitinfo")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sigwaitinfo")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sigwaitinfo"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sigwaitinfo"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sigwaitinfo"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(set, info);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadSetschedprio_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* native = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t priority = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_setschedprio")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_setschedprio")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_setschedprio")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_setschedprio")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_setschedprio"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_setschedprio"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_setschedprio"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(native, priority);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_ifNameindex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "if_nameindex")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_if_nameindex")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "if_nameindex")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_if_nameindex")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "if_nameindex"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "if_nameindex"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "if_nameindex"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_nto_ifFreenameindex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "if_freenameindex")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_if_freenameindex")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "if_freenameindex")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_if_freenameindex")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "if_freenameindex"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "if_freenameindex"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "if_freenameindex"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ptr);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_nto_glob_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool pattern_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string pattern_str = pattern_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* pattern = pattern_null ? nullptr : pattern_str.c_str();
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* errfunc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pglob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(const char*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "glob")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_glob")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "glob")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_glob")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "glob"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "glob"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "glob"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pattern, flags, errfunc, pglob);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_globfree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pglob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "globfree")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_globfree")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "globfree")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_globfree")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "globfree"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "globfree"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "globfree"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pglob);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_nto_posixMadvise_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t advice = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_madvise")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_madvise")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_madvise")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_madvise")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_madvise"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_madvise"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_madvise"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(addr, len, advice);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_shmUnlink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "shm_unlink")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_shm_unlink")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "shm_unlink")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_shm_unlink")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "shm_unlink"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "shm_unlink"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "shm_unlink"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_seekdir_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* dirp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t loc = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    typedef void (*km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "seekdir")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_seekdir")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "seekdir")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_seekdir")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "seekdir"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "seekdir"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "seekdir"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(dirp, loc);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_nto_telldir_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* dirp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int64_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "telldir")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_telldir")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "telldir")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_telldir")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "telldir"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "telldir"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "telldir"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dirp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_nto_msync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "msync")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_msync")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "msync")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_msync")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "msync"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "msync"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "msync"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(addr, len, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_recvfrom_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t arg_0_socket = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t len = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    int32_t flags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* addr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* addrlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    typedef int64_t (*km_fn_t)(int32_t, void*, uint64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "recvfrom")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_recvfrom")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "recvfrom")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_recvfrom")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "recvfrom"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "recvfrom"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "recvfrom"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_socket, buf, len, flags, addr, addrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_nto_mkstemps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* arg_0_template = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t suffixlen = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(char*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mkstemps")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mkstemps")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mkstemps")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mkstemps")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mkstemps"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mkstemps"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mkstemps"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_template, suffixlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getdomainname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* name = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef int32_t (*km_fn_t)(char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getdomainname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getdomainname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getdomainname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getdomainname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getdomainname"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getdomainname"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getdomainname"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name, len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_setdomainname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef int32_t (*km_fn_t)(const char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setdomainname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setdomainname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setdomainname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setdomainname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setdomainname"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setdomainname"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setdomainname"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name, len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_sync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sync")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sync")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sync")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sync")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sync"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sync"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sync"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_nto_pthreadGetschedparam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* native = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_getschedparam")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_getschedparam")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_getschedparam")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_getschedparam")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_getschedparam"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_getschedparam"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_getschedparam"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(native, policy, param);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_umount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool target_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string target_str = target_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* target = target_null ? nullptr : target_str.c_str();
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "umount")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_umount")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "umount")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_umount")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "umount"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "umount"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "umount"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(target, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_schedGetPriorityMax_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t policy = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sched_get_priority_max")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sched_get_priority_max")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sched_get_priority_max")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sched_get_priority_max")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sched_get_priority_max"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sched_get_priority_max"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sched_get_priority_max"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_settimeofday_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* tz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "settimeofday")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_settimeofday")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "settimeofday")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_settimeofday")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "settimeofday"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "settimeofday"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "settimeofday"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(tv, tz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_schedRrGetInterval_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* tp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sched_rr_get_interval")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sched_rr_get_interval")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sched_rr_get_interval")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sched_rr_get_interval")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sched_rr_get_interval"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sched_rr_get_interval"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sched_rr_get_interval"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid, tp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_semTimedwait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* abstime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sem_timedwait")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sem_timedwait")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sem_timedwait")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sem_timedwait")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sem_timedwait"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sem_timedwait"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sem_timedwait"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sem, abstime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_semGetvalue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sem_getvalue")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sem_getvalue")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sem_getvalue")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sem_getvalue")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sem_getvalue"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sem_getvalue"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sem_getvalue"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sem, sval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_schedSetparam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* param = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sched_setparam")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sched_setparam")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sched_setparam")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sched_setparam")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sched_setparam"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sched_setparam"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sched_setparam"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid, param);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_mount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool special_device_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string special_device_str = special_device_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* special_device = special_device_null ? nullptr : special_device_str.c_str();
    bool mount_directory_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string mount_directory_str = mount_directory_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* mount_directory = mount_directory_null ? nullptr : mount_directory_str.c_str();
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool mount_type_null = (km_info.Length() <= 3 || km_info[3].IsNull() || km_info[3].IsUndefined());
    std::string mount_type_str = mount_type_null ? std::string() : km_info[3].ToString().Utf8Value();
    const char* mount_type = mount_type_null ? nullptr : mount_type_str.c_str();
    void* mount_data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t mount_datalen = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, const char*, int32_t, const char*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mount")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mount")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mount")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mount")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mount"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mount"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mount"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(special_device, mount_directory, flags, mount_type, mount_data, mount_datalen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_schedGetparam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* param = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sched_getparam")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sched_getparam")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sched_getparam")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sched_getparam")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sched_getparam"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sched_getparam"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sched_getparam"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid, param);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadMutexConsistent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mutex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_mutex_consistent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_mutex_consistent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_mutex_consistent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_mutex_consistent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_mutex_consistent"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_mutex_consistent"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_mutex_consistent"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mutex);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadMutexTimedlock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* abstime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_mutex_timedlock")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_mutex_timedlock")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_mutex_timedlock")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_mutex_timedlock")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_mutex_timedlock"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_mutex_timedlock"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_mutex_timedlock"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lock, abstime);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadSpinInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pshared = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_spin_init")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_spin_init")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_spin_init")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_spin_init")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_spin_init"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_spin_init"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_spin_init"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lock, pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadSpinDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_spin_destroy")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_spin_destroy")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_spin_destroy")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_spin_destroy")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_spin_destroy"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_spin_destroy"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_spin_destroy"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lock);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadSpinLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_spin_lock")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_spin_lock")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_spin_lock")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_spin_lock")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_spin_lock"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_spin_lock"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_spin_lock"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lock);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadSpinTrylock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_spin_trylock")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_spin_trylock")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_spin_trylock")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_spin_trylock")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_spin_trylock"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_spin_trylock"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_spin_trylock"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lock);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadSpinUnlock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_spin_unlock")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_spin_unlock")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_spin_unlock")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_spin_unlock")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_spin_unlock"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_spin_unlock"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_spin_unlock"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lock);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadBarrierattrInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_barrierattr_init")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_barrierattr_init")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_barrierattr_init")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_barrierattr_init")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_barrierattr_init"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_barrierattr_init"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_barrierattr_init"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_attr);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadBarrierattrDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_barrierattr_destroy")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_barrierattr_destroy")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_barrierattr_destroy")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_barrierattr_destroy")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_barrierattr_destroy"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_barrierattr_destroy"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_barrierattr_destroy"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_attr);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadBarrierattrGetpshared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg_1_pshared = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_barrierattr_getpshared")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_barrierattr_getpshared")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_barrierattr_getpshared")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_barrierattr_getpshared")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_barrierattr_getpshared"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_barrierattr_getpshared"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_barrierattr_getpshared"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_attr, arg_1_pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadBarrierattrSetpshared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t arg_1_pshared = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_barrierattr_setpshared")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_barrierattr_setpshared")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_barrierattr_setpshared")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_barrierattr_setpshared")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_barrierattr_setpshared"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_barrierattr_setpshared"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_barrierattr_setpshared"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_attr, arg_1_pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadBarrierInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_barrier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg_1_attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t arg_2_count = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_barrier_init")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_barrier_init")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_barrier_init")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_barrier_init")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_barrier_init"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_barrier_init"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_barrier_init"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_barrier, arg_1_attr, arg_2_count);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadBarrierDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_barrier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_barrier_destroy")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_barrier_destroy")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_barrier_destroy")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_barrier_destroy")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_barrier_destroy"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_barrier_destroy"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_barrier_destroy"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_barrier);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadBarrierWait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_barrier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_barrier_wait")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_barrier_wait")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_barrier_wait")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_barrier_wait")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_barrier_wait"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_barrier_wait"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_barrier_wait"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_barrier);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_schedGetscheduler_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sched_getscheduler")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sched_getscheduler")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sched_getscheduler")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sched_getscheduler")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sched_getscheduler"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sched_getscheduler"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sched_getscheduler"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_clockNanosleep_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t clk_id = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rqtp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* rmtp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "clock_nanosleep")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_clock_nanosleep")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "clock_nanosleep")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_clock_nanosleep")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "clock_nanosleep"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "clock_nanosleep"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "clock_nanosleep"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clk_id, flags, rqtp, rmtp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadAttrGetguardsize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* guardsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_attr_getguardsize")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_attr_getguardsize")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_attr_getguardsize")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_attr_getguardsize")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_attr_getguardsize"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_attr_getguardsize"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_attr_getguardsize"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, guardsize);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadAttrSetguardsize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t guardsize = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef int32_t (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_attr_setguardsize")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_attr_setguardsize")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_attr_setguardsize")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_attr_setguardsize")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_attr_setguardsize"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_attr_setguardsize"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_attr_setguardsize"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, guardsize);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_sethostname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef int32_t (*km_fn_t)(const char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sethostname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sethostname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sethostname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sethostname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sethostname"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sethostname"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sethostname"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name, len);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_schedGetPriorityMin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t policy = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sched_get_priority_min")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sched_get_priority_min")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sched_get_priority_min")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sched_get_priority_min")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sched_get_priority_min"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sched_get_priority_min"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sched_get_priority_min"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadCondattrGetpshared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pshared = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_condattr_getpshared")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_condattr_getpshared")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_condattr_getpshared")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_condattr_getpshared")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_condattr_getpshared"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_condattr_getpshared"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_condattr_getpshared"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadSetschedparam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* native = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t policy = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_setschedparam")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_setschedparam")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_setschedparam")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_setschedparam")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_setschedparam"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_setschedparam"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_setschedparam"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(native, policy, param);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_schedSetscheduler_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t policy = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sched_setscheduler")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sched_setscheduler")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sched_setscheduler")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sched_setscheduler")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sched_setscheduler"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sched_setscheduler"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sched_setscheduler"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid, policy, param);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_sigsuspend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sigsuspend")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sigsuspend")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sigsuspend")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sigsuspend")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sigsuspend"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sigsuspend"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sigsuspend"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getgrgidR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t gid = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* grp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t buflen = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int32_t (*km_fn_t)(uint16_t, void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getgrgid_r")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getgrgid_r")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getgrgid_r")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getgrgid_r")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getgrgid_r"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getgrgid_r"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getgrgid_r"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(gid, grp, buf, buflen, result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_semClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sem_close")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sem_close")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sem_close")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sem_close")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sem_close"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sem_close"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sem_close"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getdtablesize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getdtablesize")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getdtablesize")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getdtablesize")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getdtablesize")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getdtablesize"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getdtablesize"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getdtablesize"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getgrnamR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    void* grp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t buflen = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int32_t (*km_fn_t)(const char*, void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getgrnam_r")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getgrnam_r")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getgrnam_r")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getgrnam_r")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getgrnam_r"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getgrnam_r"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getgrnam_r"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name, grp, buf, buflen, result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_initgroups_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool user_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string user_str = user_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* user = user_null ? nullptr : user_str.c_str();
    uint16_t group = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(const char*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "initgroups")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_initgroups")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "initgroups")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_initgroups")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "initgroups"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "initgroups"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "initgroups"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(user, group);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadSigmask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t how = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* set = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* oldset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_sigmask")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_sigmask")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_sigmask")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_sigmask")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_sigmask"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_sigmask"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_sigmask"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(how, set, oldset);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_semOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    int32_t oflag = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t km_vac = km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va1 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va2 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va3 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    typedef void* (*km_fn_t)(const char*, int32_t, ...);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sem_open")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sem_open")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sem_open")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sem_open")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sem_open"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sem_open"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sem_open"));
        }
#endif
    }
#endif
    void* km_res = nullptr;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(name, oflag); break;
            case 1: km_res = km_fn_ptr(name, oflag, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(name, oflag, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(name, oflag, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(name, oflag, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    } else {
        errno = ENOSYS;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_nto_getgrnam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    typedef void* (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getgrnam")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getgrnam")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getgrnam")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getgrnam")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getgrnam"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getgrnam"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getgrnam"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_nto_pthreadCancel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_cancel")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_cancel")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_cancel")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_cancel")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_cancel"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_cancel"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_cancel"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadKill_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t sig = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_kill")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_kill")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_kill")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_kill")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_kill"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_kill"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_kill"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread, sig);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_semUnlink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sem_unlink")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sem_unlink")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sem_unlink")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sem_unlink")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sem_unlink"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sem_unlink"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sem_unlink"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_daemon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t nochdir = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t noclose = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "daemon")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_daemon")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "daemon")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_daemon")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "daemon"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "daemon"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "daemon"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(nochdir, noclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getpwnamR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    void* pwd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t buflen = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int32_t (*km_fn_t)(const char*, void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getpwnam_r")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getpwnam_r")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getpwnam_r")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getpwnam_r")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getpwnam_r"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getpwnam_r"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getpwnam_r"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name, pwd, buf, buflen, result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getpwuidR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t uid = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pwd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t buflen = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int32_t (*km_fn_t)(uint16_t, void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getpwuid_r")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getpwuid_r")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getpwuid_r")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getpwuid_r")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getpwuid_r"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getpwuid_r"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getpwuid_r"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(uid, pwd, buf, buflen, result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_sigwait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* set = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sigwait")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sigwait")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sigwait")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sigwait")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sigwait"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sigwait"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sigwait"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(set, sig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadAtfork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prepare = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* parent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* child = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_atfork")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_atfork")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_atfork")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_atfork")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_atfork"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_atfork"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_atfork"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(prepare, parent, child);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getgrgid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t gid = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef void* (*km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getgrgid")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getgrgid")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getgrgid")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getgrgid")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getgrgid"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getgrgid"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getgrgid"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(gid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_nto_getgrouplist_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool user_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string user_str = user_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* user = user_null ? nullptr : user_str.c_str();
    uint16_t group = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* groups = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ngroups = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(const char*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getgrouplist")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getgrouplist")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getgrouplist")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getgrouplist")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getgrouplist"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getgrouplist"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getgrouplist"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(user, group, groups, ngroups);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadMutexattrGetpshared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pshared = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_mutexattr_getpshared")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_mutexattr_getpshared")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_mutexattr_getpshared")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_mutexattr_getpshared")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_mutexattr_getpshared"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_mutexattr_getpshared"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_mutexattr_getpshared"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadMutexattrGetrobust_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* robustness = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_mutexattr_getrobust")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_mutexattr_getrobust")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_mutexattr_getrobust")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_mutexattr_getrobust")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_mutexattr_getrobust"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_mutexattr_getrobust"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_mutexattr_getrobust"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, robustness);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadMutexattrSetrobust_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t robustness = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_mutexattr_setrobust")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_mutexattr_setrobust")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_mutexattr_setrobust")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_mutexattr_setrobust")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_mutexattr_setrobust"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_mutexattr_setrobust"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_mutexattr_setrobust"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, robustness);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* native = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* f = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_create")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_create")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_create")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_create")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_create"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_create"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_create"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(native, attr, f, value);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getitimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t which = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* curr_value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getitimer")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getitimer")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getitimer")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getitimer")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getitimer"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getitimer"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getitimer"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(which, curr_value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_setitimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t which = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ovalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setitimer")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setitimer")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setitimer")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setitimer")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setitimer"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setitimer"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setitimer"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(which, value, ovalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool path_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    void* file_actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* attrp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* argv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* envp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    typedef int32_t (*km_fn_t)(void*, const char*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawn")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawn")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawn")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawn")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawn"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawn"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawn"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid, path, file_actions, attrp, argv, envp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool file_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string file_str = file_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* file = file_null ? nullptr : file_str.c_str();
    void* file_actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* attrp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* argv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* envp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    typedef int32_t (*km_fn_t)(void*, const char*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnp")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnp")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnp")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnp")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnp"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnp"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnp"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pid, file, file_actions, attrp, argv, envp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnattrInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_init")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_init")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_init")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_init")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_init"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_init"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_init"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnattrDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_destroy")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_destroy")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_destroy")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_destroy")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_destroy"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_destroy"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_destroy"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnattrGetsigdefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg_1_default = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_getsigdefault")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_getsigdefault")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_getsigdefault")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getsigdefault")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_getsigdefault"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_getsigdefault"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_getsigdefault"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, arg_1_default);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnattrSetsigdefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg_1_default = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_setsigdefault")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_setsigdefault")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_setsigdefault")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setsigdefault")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_setsigdefault"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_setsigdefault"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_setsigdefault"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, arg_1_default);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnattrGetsigmask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg_1_default = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_getsigmask")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_getsigmask")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_getsigmask")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getsigmask")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_getsigmask"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_getsigmask"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_getsigmask"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, arg_1_default);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnattrSetsigmask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg_1_default = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_setsigmask")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_setsigmask")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_setsigmask")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setsigmask")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_setsigmask"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_setsigmask"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_setsigmask"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, arg_1_default);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnattrGetflags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* flags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_getflags")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_getflags")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_getflags")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getflags")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_getflags"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_getflags"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_getflags"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnattrSetflags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t flags = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_setflags")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_setflags")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_setflags")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setflags")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_setflags"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_setflags"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_setflags"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnattrGetpgroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* flags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_getpgroup")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_getpgroup")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_getpgroup")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getpgroup")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_getpgroup"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_getpgroup"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_getpgroup"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnattrSetpgroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_setpgroup")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_setpgroup")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_setpgroup")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setpgroup")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_setpgroup"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_setpgroup"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_setpgroup"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnattrGetschedpolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* flags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_getschedpolicy")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_getschedpolicy")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_getschedpolicy")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getschedpolicy")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_getschedpolicy"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_getschedpolicy"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_getschedpolicy"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnattrSetschedpolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_setschedpolicy")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_setschedpolicy")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_setschedpolicy")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setschedpolicy")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_setschedpolicy"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_setschedpolicy"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_setschedpolicy"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnattrGetschedparam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_getschedparam")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_getschedparam")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_getschedparam")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_getschedparam")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_getschedparam"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_getschedparam"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_getschedparam"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, param);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnattrSetschedparam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawnattr_setschedparam")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawnattr_setschedparam")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawnattr_setschedparam")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawnattr_setschedparam")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawnattr_setschedparam"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_setschedparam"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawnattr_setschedparam"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(attr, param);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnFileActionsInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_init")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_init")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_init")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_init")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_init"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawn_file_actions_init"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawn_file_actions_init"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(actions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnFileActionsDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_destroy")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_destroy")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_destroy")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_destroy")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_destroy"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawn_file_actions_destroy"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawn_file_actions_destroy"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(actions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnFileActionsAddopen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool path_null = (km_info.Length() <= 2 || km_info[2].IsNull() || km_info[2].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[2].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    int32_t oflag = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t, const char*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_addopen")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_addopen")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_addopen")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_addopen")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_addopen"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawn_file_actions_addopen"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawn_file_actions_addopen"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(actions, fd, path, oflag, mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnFileActionsAddclose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_addclose")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_addclose")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_addclose")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_addclose")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_addclose"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawn_file_actions_addclose"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawn_file_actions_addclose"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(actions, fd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_posixSpawnFileActionsAdddup2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t newfd = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "posix_spawn_file_actions_adddup2")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_posix_spawn_file_actions_adddup2")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "posix_spawn_file_actions_adddup2")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_posix_spawn_file_actions_adddup2")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "posix_spawn_file_actions_adddup2"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawn_file_actions_adddup2"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "posix_spawn_file_actions_adddup2"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(actions, fd, newfd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_popen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool command_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string command_str = command_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* command = command_null ? nullptr : command_str.c_str();
    bool mode_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string mode_str = mode_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* mode = mode_null ? nullptr : mode_str.c_str();
    typedef void* (*km_fn_t)(const char*, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "popen")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_popen")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "popen")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_popen")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "popen"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "popen"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "popen"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(command, mode);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_nto_faccessat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t dirfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool pathname_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string pathname_str = pathname_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* pathname = pathname_null ? nullptr : pathname_str.c_str();
    int32_t mode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, const char*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "faccessat")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_faccessat")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "faccessat")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_faccessat")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "faccessat"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "faccessat"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "faccessat"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dirfd, pathname, mode, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_inotifyRmWatch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t wd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "inotify_rm_watch")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_inotify_rm_watch")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "inotify_rm_watch")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_inotify_rm_watch")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "inotify_rm_watch"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "inotify_rm_watch"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "inotify_rm_watch"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, wd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_inotifyInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "inotify_init")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_inotify_init")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "inotify_init")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_inotify_init")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "inotify_init"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "inotify_init"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "inotify_init"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_inotifyAddWatch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    bool path_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string path_str = path_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* path = path_null ? nullptr : path_str.c_str();
    uint32_t mask = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(int32_t, const char*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "inotify_add_watch")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_inotify_add_watch")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "inotify_add_watch")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_inotify_add_watch")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "inotify_add_watch"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "inotify_add_watch"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "inotify_add_watch"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, path, mask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_gettid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "gettid")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_gettid")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "gettid")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_gettid")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "gettid"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "gettid"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "gettid"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadGetcpuclockid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clk_id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_getcpuclockid")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_getcpuclockid")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_getcpuclockid")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_getcpuclockid")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_getcpuclockid"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_getcpuclockid"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_getcpuclockid"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread, clk_id);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getnameinfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t salen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    char* host = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t hostlen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    char* serv = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t servlen = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, uint32_t, char*, uint32_t, char*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getnameinfo")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getnameinfo")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getnameinfo")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getnameinfo")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getnameinfo"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getnameinfo"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getnameinfo"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sa, salen, host, hostlen, serv, servlen, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_mallopt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t param = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int64_t value = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    typedef int32_t (*km_fn_t)(int32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mallopt")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mallopt")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mallopt")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mallopt")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mallopt"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mallopt"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mallopt"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_gettimeofday_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* tz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "gettimeofday")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_gettimeofday")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "gettimeofday")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_gettimeofday")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "gettimeofday"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "gettimeofday"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "gettimeofday"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(tp, tz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_ctermid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* s = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef char* (*km_fn_t)(char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "ctermid")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_ctermid")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "ctermid")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_ctermid")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "ctermid"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "ctermid"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "ctermid"));
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(s);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_nto_ioctl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t request = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t km_vac = km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va1 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va2 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va3 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    typedef int32_t (*km_fn_t)(int32_t, int32_t, ...);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "ioctl")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_ioctl")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "ioctl")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_ioctl")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "ioctl"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "ioctl"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "ioctl"));
        }
#endif
    }
#endif
    int32_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(fd, request); break;
            case 1: km_res = km_fn_ptr(fd, request, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(fd, request, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(fd, request, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(fd, request, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    } else {
        errno = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getpwentR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t arg_2_bufsize = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* arg_3_result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(void*, char*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getpwent_r")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getpwent_r")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getpwent_r")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getpwent_r")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getpwent_r"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getpwent_r"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getpwent_r"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pwd, buf, arg_2_bufsize, arg_3_result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadGetnameNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* name = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t len = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, char*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_getname_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_getname_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_getname_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_getname_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_getname_np"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_getname_np"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_getname_np"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread, name, len);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_pthreadSetnameNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool name_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string name_str = name_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* name = name_null ? nullptr : name_str.c_str();
    typedef int32_t (*km_fn_t)(void*, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pthread_setname_np")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pthread_setname_np")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pthread_setname_np")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pthread_setname_np")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pthread_setname_np"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_setname_np"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "pthread_setname_np"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(thread, name);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_sysctl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arg1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* arg2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* arg3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* arg4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t arg5 = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    typedef int32_t (*km_fn_t)(void*, uint32_t, void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sysctl")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sysctl")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sysctl")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sysctl")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sysctl"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sysctl"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "sysctl"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg0, arg1, arg2, arg3, arg4, arg5);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getrlimit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t resource = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* rlim = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getrlimit")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getrlimit")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getrlimit")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getrlimit")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getrlimit"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getrlimit"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "getrlimit"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(resource, rlim);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_setrlimit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t resource = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* rlp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setrlimit")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setrlimit")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setrlimit")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setrlimit")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setrlimit"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setrlimit"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "setrlimit"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(resource, rlp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_lioListio_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t arg_0_mode = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* arg_1_list = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t arg_2_nent = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* arg_3_sig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "lio_listio")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_lio_listio")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "lio_listio")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_lio_listio")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "lio_listio"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "lio_listio"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "lio_listio"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_mode, arg_1_list, arg_2_nent, arg_3_sig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_dlIteratePhdr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "dl_iterate_phdr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_dl_iterate_phdr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "dl_iterate_phdr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_dl_iterate_phdr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "dl_iterate_phdr"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "dl_iterate_phdr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "dl_iterate_phdr"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(callback, data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_memsetS_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* s = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t smax = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t c = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t n = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    typedef int32_t (*km_fn_t)(void*, uint64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "memset_s")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_memset_s")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "memset_s")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_memset_s")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "memset_s"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "memset_s"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "memset_s"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(s, smax, c, n);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_regcomp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_preg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool arg_1_pattern_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string arg_1_pattern_str = arg_1_pattern_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* arg_1_pattern = arg_1_pattern_null ? nullptr : arg_1_pattern_str.c_str();
    int32_t arg_2_cflags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, const char*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "regcomp")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_regcomp")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "regcomp")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_regcomp")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "regcomp"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "regcomp"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "regcomp"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_preg, arg_1_pattern, arg_2_cflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_regexec_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_preg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool arg_1_str_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string arg_1_str_str = arg_1_str_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* arg_1_str = arg_1_str_null ? nullptr : arg_1_str_str.c_str();
    uint64_t arg_2_nmatch = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* arg_3_pmatch = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t arg_4_eflags = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, const char*, uint64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "regexec")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_regexec")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "regexec")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_regexec")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "regexec"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "regexec"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "regexec"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_preg, arg_1_str, arg_2_nmatch, arg_3_pmatch, arg_4_eflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_regerror_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t arg_0_errcode = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* arg_1_preg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    char* arg_2_errbuf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t arg_3_errbuf_size = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    typedef uint64_t (*km_fn_t)(int32_t, void*, char*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "regerror")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_regerror")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "regerror")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_regerror")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "regerror"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "regerror"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "regerror"));
        }
#endif
    }
#endif
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_errcode, arg_1_preg, arg_2_errbuf, arg_3_errbuf_size);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libc_unix_nto_regfree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_preg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "regfree")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_regfree")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "regfree")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_regfree")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "regfree"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "regfree"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "regfree"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(arg_0_preg);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_nto_dirfd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_dirp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "dirfd")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_dirfd")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "dirfd")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_dirfd")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "dirfd"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "dirfd"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "dirfd"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_dirp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_dircntl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* dir = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t cmd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t km_vac = km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va1 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va2 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va3 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    typedef int32_t (*km_fn_t)(void*, int32_t, ...);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "dircntl")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_dircntl")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "dircntl")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_dircntl")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "dircntl"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "dircntl"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "dircntl"));
        }
#endif
    }
#endif
    int32_t km_res = -1;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(dir, cmd); break;
            case 1: km_res = km_fn_ptr(dir, cmd, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(dir, cmd, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(dir, cmd, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(dir, cmd, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    } else {
        errno = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_aioCancel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t arg_0_fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* arg_1_aiocbp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "aio_cancel")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_aio_cancel")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "aio_cancel")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_aio_cancel")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "aio_cancel"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "aio_cancel"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "aio_cancel"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_fd, arg_1_aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_aioError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_aiocbp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "aio_error")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_aio_error")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "aio_error")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_aio_error")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "aio_error"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "aio_error"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "aio_error"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_aioFsync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t arg_0_operation = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* arg_1_aiocbp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "aio_fsync")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_aio_fsync")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "aio_fsync")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_aio_fsync")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "aio_fsync"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "aio_fsync"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "aio_fsync"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_operation, arg_1_aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_aioRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_aiocbp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "aio_read")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_aio_read")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "aio_read")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_aio_read")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "aio_read"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "aio_read"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "aio_read"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_aioReturn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_aiocpb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int64_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "aio_return")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_aio_return")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "aio_return")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_aio_return")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "aio_return"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "aio_return"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "aio_return"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_aiocpb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_nto_aioSuspend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_list = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t arg_1_nent = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* arg_2_timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "aio_suspend")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_aio_suspend")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "aio_suspend")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_aio_suspend")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "aio_suspend"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "aio_suspend"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "aio_suspend"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_list, arg_1_nent, arg_2_timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_aioWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_aiocpb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "aio_write")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_aio_write")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "aio_write")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_aio_write")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "aio_write"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "aio_write"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "aio_write"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_aiocpb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_mqClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef int32_t (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_close")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_close")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_close")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_close")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_close"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_close"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_close"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_mqdes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_mqGetattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg_1_mqstat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_getattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_getattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_getattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_getattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_getattr"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_getattr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_getattr"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_mqdes, arg_1_mqstat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_mqNotify_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg_1_notification = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_notify")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_notify")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_notify")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_notify")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_notify"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_notify"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_notify"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_mqdes, arg_1_notification);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_mqOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool arg_0_name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string arg_0_name_str = arg_0_name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* arg_0_name = arg_0_name_null ? nullptr : arg_0_name_str.c_str();
    int32_t arg_1_oflag = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t km_vac = km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t km_va1 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va2 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va3 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    typedef void* (*km_fn_t)(const char*, int32_t, ...);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_open")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_open")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_open")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_open")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_open"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_open"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_open"));
        }
#endif
    }
#endif
    void* km_res = nullptr;
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr(arg_0_name, arg_1_oflag); break;
            case 1: km_res = km_fn_ptr(arg_0_name, arg_1_oflag, static_cast<intptr_t>(km_va0)); break;
            case 2: km_res = km_fn_ptr(arg_0_name, arg_1_oflag, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_res = km_fn_ptr(arg_0_name, arg_1_oflag, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_res = km_fn_ptr(arg_0_name, arg_1_oflag, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
        }
    } else {
        errno = ENOSYS;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_nto_mqReceive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* arg_1_msg_ptr = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t arg_2_msg_len = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* arg_3_msg_prio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int64_t (*km_fn_t)(void*, char*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_receive")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_receive")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_receive")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_receive")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_receive"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_receive"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_receive"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_mqdes, arg_1_msg_ptr, arg_2_msg_len, arg_3_msg_prio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_nto_mqSend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool arg_1_msg_ptr_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string arg_1_msg_ptr_str = arg_1_msg_ptr_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* arg_1_msg_ptr = arg_1_msg_ptr_null ? nullptr : arg_1_msg_ptr_str.c_str();
    uint64_t arg_2_msg_len = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t arg_3_msg_prio = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    typedef int32_t (*km_fn_t)(void*, const char*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_send")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_send")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_send")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_send")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_send"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_send"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_send"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_mqdes, arg_1_msg_ptr, arg_2_msg_len, arg_3_msg_prio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_mqSetattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg_1_mqstat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* arg_2_omqstat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    typedef int32_t (*km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_setattr")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_setattr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_setattr")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_setattr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_setattr"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_setattr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_setattr"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_mqdes, arg_1_mqstat, arg_2_omqstat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_mqTimedreceive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* arg_1_msg_ptr = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t arg_2_msg_len = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* arg_3_msg_prio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* arg_4_abs_timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int64_t (*km_fn_t)(void*, char*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_timedreceive")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_timedreceive")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_timedreceive")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_timedreceive")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_timedreceive"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_timedreceive"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_timedreceive"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_mqdes, arg_1_msg_ptr, arg_2_msg_len, arg_3_msg_prio, arg_4_abs_timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_nto_mqTimedsend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool arg_1_msg_ptr_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string arg_1_msg_ptr_str = arg_1_msg_ptr_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* arg_1_msg_ptr = arg_1_msg_ptr_null ? nullptr : arg_1_msg_ptr_str.c_str();
    uint64_t arg_2_msg_len = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t arg_3_msg_prio = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* arg_4_abs_timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    typedef int32_t (*km_fn_t)(void*, const char*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_timedsend")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_timedsend")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_timedsend")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_timedsend")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_timedsend"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_timedsend"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_timedsend"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_mqdes, arg_1_msg_ptr, arg_2_msg_len, arg_3_msg_prio, arg_4_abs_timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_mqUnlink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool arg_0_name_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string arg_0_name_str = arg_0_name_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* arg_0_name = arg_0_name_null ? nullptr : arg_0_name_str.c_str();
    typedef int32_t (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "mq_unlink")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_mq_unlink")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "mq_unlink")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_mq_unlink")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "mq_unlink"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_unlink"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "mq_unlink"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_nto_getErrnoPtr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__get_errno_ptr")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__get_errno_ptr")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__get_errno_ptr"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "__get_errno_ptr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "__get_errno_ptr"));
        }
#endif
    }
#endif
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_nto_myThreadExit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* value_ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    typedef void (*km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "__my_thread_exit")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "__my_thread_exit")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "__my_thread_exit"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("/usr/lib/libsocket.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "__my_thread_exit"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_socket = nullptr;
            static bool km_h_socket_init = false;
            if (!km_h_socket_init) {
                km_h_socket_init = true;
                km_h_socket = dlopen("libsocket.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_socket != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_socket, "__my_thread_exit"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(value_ptr);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static void register_unix_nto_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("libc_unix_nto_get_SYSPAGE_PTR", Napi::Function::New(env, libc_unix_nto_get_SYSPAGE_PTR_napi));
    exports.Set("libc_unix_nto_set_SYSPAGE_PTR", Napi::Function::New(env, libc_unix_nto_set_SYSPAGE_PTR_napi));
    exports.Set("libc_unix_nto_sendmmsg", Napi::Function::New(env, libc_unix_nto_sendmmsg_napi));
    exports.Set("libc_unix_nto_recvmmsg", Napi::Function::New(env, libc_unix_nto_recvmmsg_napi));
    exports.Set("libc_unix_nto_semDestroy", Napi::Function::New(env, libc_unix_nto_semDestroy_napi));
    exports.Set("libc_unix_nto_semInit", Napi::Function::New(env, libc_unix_nto_semInit_napi));
    exports.Set("libc_unix_nto_fdatasync", Napi::Function::New(env, libc_unix_nto_fdatasync_napi));
    exports.Set("libc_unix_nto_getpriority", Napi::Function::New(env, libc_unix_nto_getpriority_napi));
    exports.Set("libc_unix_nto_setpriority", Napi::Function::New(env, libc_unix_nto_setpriority_napi));
    exports.Set("libc_unix_nto_mkfifoat", Napi::Function::New(env, libc_unix_nto_mkfifoat_napi));
    exports.Set("libc_unix_nto_mknodat", Napi::Function::New(env, libc_unix_nto_mknodat_napi));
    exports.Set("libc_unix_nto_clockGetres", Napi::Function::New(env, libc_unix_nto_clockGetres_napi));
    exports.Set("libc_unix_nto_clockGettime", Napi::Function::New(env, libc_unix_nto_clockGettime_napi));
    exports.Set("libc_unix_nto_clockSettime", Napi::Function::New(env, libc_unix_nto_clockSettime_napi));
    exports.Set("libc_unix_nto_clockGetcpuclockid", Napi::Function::New(env, libc_unix_nto_clockGetcpuclockid_napi));
    exports.Set("libc_unix_nto_pthreadAttrGetstack", Napi::Function::New(env, libc_unix_nto_pthreadAttrGetstack_napi));
    exports.Set("libc_unix_nto_memalign", Napi::Function::New(env, libc_unix_nto_memalign_napi));
    exports.Set("libc_unix_nto_setgroups", Napi::Function::New(env, libc_unix_nto_setgroups_napi));
    exports.Set("libc_unix_nto_posixFadvise", Napi::Function::New(env, libc_unix_nto_posixFadvise_napi));
    exports.Set("libc_unix_nto_futimens", Napi::Function::New(env, libc_unix_nto_futimens_napi));
    exports.Set("libc_unix_nto_nlLanginfo", Napi::Function::New(env, libc_unix_nto_nlLanginfo_napi));
    exports.Set("libc_unix_nto_utimensat", Napi::Function::New(env, libc_unix_nto_utimensat_napi));
    exports.Set("libc_unix_nto_pthreadCondattrGetclock", Napi::Function::New(env, libc_unix_nto_pthreadCondattrGetclock_napi));
    exports.Set("libc_unix_nto_pthreadCondattrSetclock", Napi::Function::New(env, libc_unix_nto_pthreadCondattrSetclock_napi));
    exports.Set("libc_unix_nto_pthreadCondattrSetpshared", Napi::Function::New(env, libc_unix_nto_pthreadCondattrSetpshared_napi));
    exports.Set("libc_unix_nto_pthreadMutexattrSetpshared", Napi::Function::New(env, libc_unix_nto_pthreadMutexattrSetpshared_napi));
    exports.Set("libc_unix_nto_pthreadRwlockattrGetpshared", Napi::Function::New(env, libc_unix_nto_pthreadRwlockattrGetpshared_napi));
    exports.Set("libc_unix_nto_pthreadRwlockattrSetpshared", Napi::Function::New(env, libc_unix_nto_pthreadRwlockattrSetpshared_napi));
    exports.Set("libc_unix_nto_ptsnameR", Napi::Function::New(env, libc_unix_nto_ptsnameR_napi));
    exports.Set("libc_unix_nto_clearenv", Napi::Function::New(env, libc_unix_nto_clearenv_napi));
    exports.Set("libc_unix_nto_waitid", Napi::Function::New(env, libc_unix_nto_waitid_napi));
    exports.Set("libc_unix_nto_wait4", Napi::Function::New(env, libc_unix_nto_wait4_napi));
    exports.Set("libc_unix_nto_execvpe", Napi::Function::New(env, libc_unix_nto_execvpe_napi));
    exports.Set("libc_unix_nto_getifaddrs", Napi::Function::New(env, libc_unix_nto_getifaddrs_napi));
    exports.Set("libc_unix_nto_freeifaddrs", Napi::Function::New(env, libc_unix_nto_freeifaddrs_napi));
    exports.Set("libc_unix_nto_bind", Napi::Function::New(env, libc_unix_nto_bind_napi));
    exports.Set("libc_unix_nto_writev", Napi::Function::New(env, libc_unix_nto_writev_napi));
    exports.Set("libc_unix_nto_readv", Napi::Function::New(env, libc_unix_nto_readv_napi));
    exports.Set("libc_unix_nto_sendmsg", Napi::Function::New(env, libc_unix_nto_sendmsg_napi));
    exports.Set("libc_unix_nto_recvmsg", Napi::Function::New(env, libc_unix_nto_recvmsg_napi));
    exports.Set("libc_unix_nto_openpty", Napi::Function::New(env, libc_unix_nto_openpty_napi));
    exports.Set("libc_unix_nto_forkpty", Napi::Function::New(env, libc_unix_nto_forkpty_napi));
    exports.Set("libc_unix_nto_loginTty", Napi::Function::New(env, libc_unix_nto_loginTty_napi));
    exports.Set("libc_unix_nto_uname", Napi::Function::New(env, libc_unix_nto_uname_napi));
    exports.Set("libc_unix_nto_getpeereid", Napi::Function::New(env, libc_unix_nto_getpeereid_napi));
    exports.Set("libc_unix_nto_strerrorR", Napi::Function::New(env, libc_unix_nto_strerrorR_napi));
    exports.Set("libc_unix_nto_abs", Napi::Function::New(env, libc_unix_nto_abs_napi));
    exports.Set("libc_unix_nto_labs", Napi::Function::New(env, libc_unix_nto_labs_napi));
    exports.Set("libc_unix_nto_rand", Napi::Function::New(env, libc_unix_nto_rand_napi));
    exports.Set("libc_unix_nto_srand", Napi::Function::New(env, libc_unix_nto_srand_napi));
    exports.Set("libc_unix_nto_setpwent", Napi::Function::New(env, libc_unix_nto_setpwent_napi));
    exports.Set("libc_unix_nto_endpwent", Napi::Function::New(env, libc_unix_nto_endpwent_napi));
    exports.Set("libc_unix_nto_getpwent", Napi::Function::New(env, libc_unix_nto_getpwent_napi));
    exports.Set("libc_unix_nto_setgrent", Napi::Function::New(env, libc_unix_nto_setgrent_napi));
    exports.Set("libc_unix_nto_endgrent", Napi::Function::New(env, libc_unix_nto_endgrent_napi));
    exports.Set("libc_unix_nto_getgrent", Napi::Function::New(env, libc_unix_nto_getgrent_napi));
    exports.Set("libc_unix_nto_setspent", Napi::Function::New(env, libc_unix_nto_setspent_napi));
    exports.Set("libc_unix_nto_endspent", Napi::Function::New(env, libc_unix_nto_endspent_napi));
    exports.Set("libc_unix_nto_shmOpen", Napi::Function::New(env, libc_unix_nto_shmOpen_napi));
    exports.Set("libc_unix_nto_ftok", Napi::Function::New(env, libc_unix_nto_ftok_napi));
    exports.Set("libc_unix_nto_mprotect", Napi::Function::New(env, libc_unix_nto_mprotect_napi));
    exports.Set("libc_unix_nto_posixFallocate", Napi::Function::New(env, libc_unix_nto_posixFallocate_napi));
    exports.Set("libc_unix_nto_mkostemp", Napi::Function::New(env, libc_unix_nto_mkostemp_napi));
    exports.Set("libc_unix_nto_mkostemps", Napi::Function::New(env, libc_unix_nto_mkostemps_napi));
    exports.Set("libc_unix_nto_sigtimedwait", Napi::Function::New(env, libc_unix_nto_sigtimedwait_napi));
    exports.Set("libc_unix_nto_sigwaitinfo", Napi::Function::New(env, libc_unix_nto_sigwaitinfo_napi));
    exports.Set("libc_unix_nto_pthreadSetschedprio", Napi::Function::New(env, libc_unix_nto_pthreadSetschedprio_napi));
    exports.Set("libc_unix_nto_ifNameindex", Napi::Function::New(env, libc_unix_nto_ifNameindex_napi));
    exports.Set("libc_unix_nto_ifFreenameindex", Napi::Function::New(env, libc_unix_nto_ifFreenameindex_napi));
    exports.Set("libc_unix_nto_glob", Napi::Function::New(env, libc_unix_nto_glob_napi));
    exports.Set("libc_unix_nto_globfree", Napi::Function::New(env, libc_unix_nto_globfree_napi));
    exports.Set("libc_unix_nto_posixMadvise", Napi::Function::New(env, libc_unix_nto_posixMadvise_napi));
    exports.Set("libc_unix_nto_shmUnlink", Napi::Function::New(env, libc_unix_nto_shmUnlink_napi));
    exports.Set("libc_unix_nto_seekdir", Napi::Function::New(env, libc_unix_nto_seekdir_napi));
    exports.Set("libc_unix_nto_telldir", Napi::Function::New(env, libc_unix_nto_telldir_napi));
    exports.Set("libc_unix_nto_msync", Napi::Function::New(env, libc_unix_nto_msync_napi));
    exports.Set("libc_unix_nto_recvfrom", Napi::Function::New(env, libc_unix_nto_recvfrom_napi));
    exports.Set("libc_unix_nto_mkstemps", Napi::Function::New(env, libc_unix_nto_mkstemps_napi));
    exports.Set("libc_unix_nto_getdomainname", Napi::Function::New(env, libc_unix_nto_getdomainname_napi));
    exports.Set("libc_unix_nto_setdomainname", Napi::Function::New(env, libc_unix_nto_setdomainname_napi));
    exports.Set("libc_unix_nto_sync", Napi::Function::New(env, libc_unix_nto_sync_napi));
    exports.Set("libc_unix_nto_pthreadGetschedparam", Napi::Function::New(env, libc_unix_nto_pthreadGetschedparam_napi));
    exports.Set("libc_unix_nto_umount", Napi::Function::New(env, libc_unix_nto_umount_napi));
    exports.Set("libc_unix_nto_schedGetPriorityMax", Napi::Function::New(env, libc_unix_nto_schedGetPriorityMax_napi));
    exports.Set("libc_unix_nto_settimeofday", Napi::Function::New(env, libc_unix_nto_settimeofday_napi));
    exports.Set("libc_unix_nto_schedRrGetInterval", Napi::Function::New(env, libc_unix_nto_schedRrGetInterval_napi));
    exports.Set("libc_unix_nto_semTimedwait", Napi::Function::New(env, libc_unix_nto_semTimedwait_napi));
    exports.Set("libc_unix_nto_semGetvalue", Napi::Function::New(env, libc_unix_nto_semGetvalue_napi));
    exports.Set("libc_unix_nto_schedSetparam", Napi::Function::New(env, libc_unix_nto_schedSetparam_napi));
    exports.Set("libc_unix_nto_mount", Napi::Function::New(env, libc_unix_nto_mount_napi));
    exports.Set("libc_unix_nto_schedGetparam", Napi::Function::New(env, libc_unix_nto_schedGetparam_napi));
    exports.Set("libc_unix_nto_pthreadMutexConsistent", Napi::Function::New(env, libc_unix_nto_pthreadMutexConsistent_napi));
    exports.Set("libc_unix_nto_pthreadMutexTimedlock", Napi::Function::New(env, libc_unix_nto_pthreadMutexTimedlock_napi));
    exports.Set("libc_unix_nto_pthreadSpinInit", Napi::Function::New(env, libc_unix_nto_pthreadSpinInit_napi));
    exports.Set("libc_unix_nto_pthreadSpinDestroy", Napi::Function::New(env, libc_unix_nto_pthreadSpinDestroy_napi));
    exports.Set("libc_unix_nto_pthreadSpinLock", Napi::Function::New(env, libc_unix_nto_pthreadSpinLock_napi));
    exports.Set("libc_unix_nto_pthreadSpinTrylock", Napi::Function::New(env, libc_unix_nto_pthreadSpinTrylock_napi));
    exports.Set("libc_unix_nto_pthreadSpinUnlock", Napi::Function::New(env, libc_unix_nto_pthreadSpinUnlock_napi));
    exports.Set("libc_unix_nto_pthreadBarrierattrInit", Napi::Function::New(env, libc_unix_nto_pthreadBarrierattrInit_napi));
    exports.Set("libc_unix_nto_pthreadBarrierattrDestroy", Napi::Function::New(env, libc_unix_nto_pthreadBarrierattrDestroy_napi));
    exports.Set("libc_unix_nto_pthreadBarrierattrGetpshared", Napi::Function::New(env, libc_unix_nto_pthreadBarrierattrGetpshared_napi));
    exports.Set("libc_unix_nto_pthreadBarrierattrSetpshared", Napi::Function::New(env, libc_unix_nto_pthreadBarrierattrSetpshared_napi));
    exports.Set("libc_unix_nto_pthreadBarrierInit", Napi::Function::New(env, libc_unix_nto_pthreadBarrierInit_napi));
    exports.Set("libc_unix_nto_pthreadBarrierDestroy", Napi::Function::New(env, libc_unix_nto_pthreadBarrierDestroy_napi));
    exports.Set("libc_unix_nto_pthreadBarrierWait", Napi::Function::New(env, libc_unix_nto_pthreadBarrierWait_napi));
    exports.Set("libc_unix_nto_schedGetscheduler", Napi::Function::New(env, libc_unix_nto_schedGetscheduler_napi));
    exports.Set("libc_unix_nto_clockNanosleep", Napi::Function::New(env, libc_unix_nto_clockNanosleep_napi));
    exports.Set("libc_unix_nto_pthreadAttrGetguardsize", Napi::Function::New(env, libc_unix_nto_pthreadAttrGetguardsize_napi));
    exports.Set("libc_unix_nto_pthreadAttrSetguardsize", Napi::Function::New(env, libc_unix_nto_pthreadAttrSetguardsize_napi));
    exports.Set("libc_unix_nto_sethostname", Napi::Function::New(env, libc_unix_nto_sethostname_napi));
    exports.Set("libc_unix_nto_schedGetPriorityMin", Napi::Function::New(env, libc_unix_nto_schedGetPriorityMin_napi));
    exports.Set("libc_unix_nto_pthreadCondattrGetpshared", Napi::Function::New(env, libc_unix_nto_pthreadCondattrGetpshared_napi));
    exports.Set("libc_unix_nto_pthreadSetschedparam", Napi::Function::New(env, libc_unix_nto_pthreadSetschedparam_napi));
    exports.Set("libc_unix_nto_schedSetscheduler", Napi::Function::New(env, libc_unix_nto_schedSetscheduler_napi));
    exports.Set("libc_unix_nto_sigsuspend", Napi::Function::New(env, libc_unix_nto_sigsuspend_napi));
    exports.Set("libc_unix_nto_getgrgidR", Napi::Function::New(env, libc_unix_nto_getgrgidR_napi));
    exports.Set("libc_unix_nto_semClose", Napi::Function::New(env, libc_unix_nto_semClose_napi));
    exports.Set("libc_unix_nto_getdtablesize", Napi::Function::New(env, libc_unix_nto_getdtablesize_napi));
    exports.Set("libc_unix_nto_getgrnamR", Napi::Function::New(env, libc_unix_nto_getgrnamR_napi));
    exports.Set("libc_unix_nto_initgroups", Napi::Function::New(env, libc_unix_nto_initgroups_napi));
    exports.Set("libc_unix_nto_pthreadSigmask", Napi::Function::New(env, libc_unix_nto_pthreadSigmask_napi));
    exports.Set("libc_unix_nto_semOpen", Napi::Function::New(env, libc_unix_nto_semOpen_napi));
    exports.Set("libc_unix_nto_getgrnam", Napi::Function::New(env, libc_unix_nto_getgrnam_napi));
    exports.Set("libc_unix_nto_pthreadCancel", Napi::Function::New(env, libc_unix_nto_pthreadCancel_napi));
    exports.Set("libc_unix_nto_pthreadKill", Napi::Function::New(env, libc_unix_nto_pthreadKill_napi));
    exports.Set("libc_unix_nto_semUnlink", Napi::Function::New(env, libc_unix_nto_semUnlink_napi));
    exports.Set("libc_unix_nto_daemon", Napi::Function::New(env, libc_unix_nto_daemon_napi));
    exports.Set("libc_unix_nto_getpwnamR", Napi::Function::New(env, libc_unix_nto_getpwnamR_napi));
    exports.Set("libc_unix_nto_getpwuidR", Napi::Function::New(env, libc_unix_nto_getpwuidR_napi));
    exports.Set("libc_unix_nto_sigwait", Napi::Function::New(env, libc_unix_nto_sigwait_napi));
    exports.Set("libc_unix_nto_pthreadAtfork", Napi::Function::New(env, libc_unix_nto_pthreadAtfork_napi));
    exports.Set("libc_unix_nto_getgrgid", Napi::Function::New(env, libc_unix_nto_getgrgid_napi));
    exports.Set("libc_unix_nto_getgrouplist", Napi::Function::New(env, libc_unix_nto_getgrouplist_napi));
    exports.Set("libc_unix_nto_pthreadMutexattrGetpshared", Napi::Function::New(env, libc_unix_nto_pthreadMutexattrGetpshared_napi));
    exports.Set("libc_unix_nto_pthreadMutexattrGetrobust", Napi::Function::New(env, libc_unix_nto_pthreadMutexattrGetrobust_napi));
    exports.Set("libc_unix_nto_pthreadMutexattrSetrobust", Napi::Function::New(env, libc_unix_nto_pthreadMutexattrSetrobust_napi));
    exports.Set("libc_unix_nto_pthreadCreate", Napi::Function::New(env, libc_unix_nto_pthreadCreate_napi));
    exports.Set("libc_unix_nto_getitimer", Napi::Function::New(env, libc_unix_nto_getitimer_napi));
    exports.Set("libc_unix_nto_setitimer", Napi::Function::New(env, libc_unix_nto_setitimer_napi));
    exports.Set("libc_unix_nto_posixSpawn", Napi::Function::New(env, libc_unix_nto_posixSpawn_napi));
    exports.Set("libc_unix_nto_posixSpawnp", Napi::Function::New(env, libc_unix_nto_posixSpawnp_napi));
    exports.Set("libc_unix_nto_posixSpawnattrInit", Napi::Function::New(env, libc_unix_nto_posixSpawnattrInit_napi));
    exports.Set("libc_unix_nto_posixSpawnattrDestroy", Napi::Function::New(env, libc_unix_nto_posixSpawnattrDestroy_napi));
    exports.Set("libc_unix_nto_posixSpawnattrGetsigdefault", Napi::Function::New(env, libc_unix_nto_posixSpawnattrGetsigdefault_napi));
    exports.Set("libc_unix_nto_posixSpawnattrSetsigdefault", Napi::Function::New(env, libc_unix_nto_posixSpawnattrSetsigdefault_napi));
    exports.Set("libc_unix_nto_posixSpawnattrGetsigmask", Napi::Function::New(env, libc_unix_nto_posixSpawnattrGetsigmask_napi));
    exports.Set("libc_unix_nto_posixSpawnattrSetsigmask", Napi::Function::New(env, libc_unix_nto_posixSpawnattrSetsigmask_napi));
    exports.Set("libc_unix_nto_posixSpawnattrGetflags", Napi::Function::New(env, libc_unix_nto_posixSpawnattrGetflags_napi));
    exports.Set("libc_unix_nto_posixSpawnattrSetflags", Napi::Function::New(env, libc_unix_nto_posixSpawnattrSetflags_napi));
    exports.Set("libc_unix_nto_posixSpawnattrGetpgroup", Napi::Function::New(env, libc_unix_nto_posixSpawnattrGetpgroup_napi));
    exports.Set("libc_unix_nto_posixSpawnattrSetpgroup", Napi::Function::New(env, libc_unix_nto_posixSpawnattrSetpgroup_napi));
    exports.Set("libc_unix_nto_posixSpawnattrGetschedpolicy", Napi::Function::New(env, libc_unix_nto_posixSpawnattrGetschedpolicy_napi));
    exports.Set("libc_unix_nto_posixSpawnattrSetschedpolicy", Napi::Function::New(env, libc_unix_nto_posixSpawnattrSetschedpolicy_napi));
    exports.Set("libc_unix_nto_posixSpawnattrGetschedparam", Napi::Function::New(env, libc_unix_nto_posixSpawnattrGetschedparam_napi));
    exports.Set("libc_unix_nto_posixSpawnattrSetschedparam", Napi::Function::New(env, libc_unix_nto_posixSpawnattrSetschedparam_napi));
    exports.Set("libc_unix_nto_posixSpawnFileActionsInit", Napi::Function::New(env, libc_unix_nto_posixSpawnFileActionsInit_napi));
    exports.Set("libc_unix_nto_posixSpawnFileActionsDestroy", Napi::Function::New(env, libc_unix_nto_posixSpawnFileActionsDestroy_napi));
    exports.Set("libc_unix_nto_posixSpawnFileActionsAddopen", Napi::Function::New(env, libc_unix_nto_posixSpawnFileActionsAddopen_napi));
    exports.Set("libc_unix_nto_posixSpawnFileActionsAddclose", Napi::Function::New(env, libc_unix_nto_posixSpawnFileActionsAddclose_napi));
    exports.Set("libc_unix_nto_posixSpawnFileActionsAdddup2", Napi::Function::New(env, libc_unix_nto_posixSpawnFileActionsAdddup2_napi));
    exports.Set("libc_unix_nto_popen", Napi::Function::New(env, libc_unix_nto_popen_napi));
    exports.Set("libc_unix_nto_faccessat", Napi::Function::New(env, libc_unix_nto_faccessat_napi));
    exports.Set("libc_unix_nto_inotifyRmWatch", Napi::Function::New(env, libc_unix_nto_inotifyRmWatch_napi));
    exports.Set("libc_unix_nto_inotifyInit", Napi::Function::New(env, libc_unix_nto_inotifyInit_napi));
    exports.Set("libc_unix_nto_inotifyAddWatch", Napi::Function::New(env, libc_unix_nto_inotifyAddWatch_napi));
    exports.Set("libc_unix_nto_gettid", Napi::Function::New(env, libc_unix_nto_gettid_napi));
    exports.Set("libc_unix_nto_pthreadGetcpuclockid", Napi::Function::New(env, libc_unix_nto_pthreadGetcpuclockid_napi));
    exports.Set("libc_unix_nto_getnameinfo", Napi::Function::New(env, libc_unix_nto_getnameinfo_napi));
    exports.Set("libc_unix_nto_mallopt", Napi::Function::New(env, libc_unix_nto_mallopt_napi));
    exports.Set("libc_unix_nto_gettimeofday", Napi::Function::New(env, libc_unix_nto_gettimeofday_napi));
    exports.Set("libc_unix_nto_ctermid", Napi::Function::New(env, libc_unix_nto_ctermid_napi));
    exports.Set("libc_unix_nto_ioctl", Napi::Function::New(env, libc_unix_nto_ioctl_napi));
    exports.Set("libc_unix_nto_getpwentR", Napi::Function::New(env, libc_unix_nto_getpwentR_napi));
    exports.Set("libc_unix_nto_pthreadGetnameNp", Napi::Function::New(env, libc_unix_nto_pthreadGetnameNp_napi));
    exports.Set("libc_unix_nto_pthreadSetnameNp", Napi::Function::New(env, libc_unix_nto_pthreadSetnameNp_napi));
    exports.Set("libc_unix_nto_sysctl", Napi::Function::New(env, libc_unix_nto_sysctl_napi));
    exports.Set("libc_unix_nto_getrlimit", Napi::Function::New(env, libc_unix_nto_getrlimit_napi));
    exports.Set("libc_unix_nto_setrlimit", Napi::Function::New(env, libc_unix_nto_setrlimit_napi));
    exports.Set("libc_unix_nto_lioListio", Napi::Function::New(env, libc_unix_nto_lioListio_napi));
    exports.Set("libc_unix_nto_dlIteratePhdr", Napi::Function::New(env, libc_unix_nto_dlIteratePhdr_napi));
    exports.Set("libc_unix_nto_memsetS", Napi::Function::New(env, libc_unix_nto_memsetS_napi));
    exports.Set("libc_unix_nto_regcomp", Napi::Function::New(env, libc_unix_nto_regcomp_napi));
    exports.Set("libc_unix_nto_regexec", Napi::Function::New(env, libc_unix_nto_regexec_napi));
    exports.Set("libc_unix_nto_regerror", Napi::Function::New(env, libc_unix_nto_regerror_napi));
    exports.Set("libc_unix_nto_regfree", Napi::Function::New(env, libc_unix_nto_regfree_napi));
    exports.Set("libc_unix_nto_dirfd", Napi::Function::New(env, libc_unix_nto_dirfd_napi));
    exports.Set("libc_unix_nto_dircntl", Napi::Function::New(env, libc_unix_nto_dircntl_napi));
    exports.Set("libc_unix_nto_aioCancel", Napi::Function::New(env, libc_unix_nto_aioCancel_napi));
    exports.Set("libc_unix_nto_aioError", Napi::Function::New(env, libc_unix_nto_aioError_napi));
    exports.Set("libc_unix_nto_aioFsync", Napi::Function::New(env, libc_unix_nto_aioFsync_napi));
    exports.Set("libc_unix_nto_aioRead", Napi::Function::New(env, libc_unix_nto_aioRead_napi));
    exports.Set("libc_unix_nto_aioReturn", Napi::Function::New(env, libc_unix_nto_aioReturn_napi));
    exports.Set("libc_unix_nto_aioSuspend", Napi::Function::New(env, libc_unix_nto_aioSuspend_napi));
    exports.Set("libc_unix_nto_aioWrite", Napi::Function::New(env, libc_unix_nto_aioWrite_napi));
    exports.Set("libc_unix_nto_mqClose", Napi::Function::New(env, libc_unix_nto_mqClose_napi));
    exports.Set("libc_unix_nto_mqGetattr", Napi::Function::New(env, libc_unix_nto_mqGetattr_napi));
    exports.Set("libc_unix_nto_mqNotify", Napi::Function::New(env, libc_unix_nto_mqNotify_napi));
    exports.Set("libc_unix_nto_mqOpen", Napi::Function::New(env, libc_unix_nto_mqOpen_napi));
    exports.Set("libc_unix_nto_mqReceive", Napi::Function::New(env, libc_unix_nto_mqReceive_napi));
    exports.Set("libc_unix_nto_mqSend", Napi::Function::New(env, libc_unix_nto_mqSend_napi));
    exports.Set("libc_unix_nto_mqSetattr", Napi::Function::New(env, libc_unix_nto_mqSetattr_napi));
    exports.Set("libc_unix_nto_mqTimedreceive", Napi::Function::New(env, libc_unix_nto_mqTimedreceive_napi));
    exports.Set("libc_unix_nto_mqTimedsend", Napi::Function::New(env, libc_unix_nto_mqTimedsend_napi));
    exports.Set("libc_unix_nto_mqUnlink", Napi::Function::New(env, libc_unix_nto_mqUnlink_napi));
    exports.Set("libc_unix_nto_getErrnoPtr", Napi::Function::New(env, libc_unix_nto_getErrnoPtr_napi));
    exports.Set("libc_unix_nto_myThreadExit", Napi::Function::New(env, libc_unix_nto_myThreadExit_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_unix_nto_napi, nullptr };
struct KmNapiAutoRegister {
    KmNapiAutoRegister() {
        registrar_node.next = km_napi_registrar_head;
        km_napi_registrar_head = &registrar_node;
    }
};
static KmNapiAutoRegister auto_register_instance;

} // namespace

#ifdef KM_NAPI_STANDALONE_MODULE
#if defined(__GNUC__) || defined(__clang__)
__attribute__((visibility("hidden")))
#endif
KmNapiRegistrarNode* km_napi_registrar_head = nullptr;
static Napi::Object KmNapiStandaloneInit(Napi::Env env, Napi::Object exports) {
    for (KmNapiRegistrarNode* cur = km_napi_registrar_head; cur != nullptr; cur = cur->next) {
        cur->register_fn(env, exports);
    }
    return exports;
}
NODE_API_MODULE(NODE_GYP_MODULE_NAME, KmNapiStandaloneInit)
#endif
