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

static Napi::Value libcUnixNtoGetSYSPAGEPTR_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSetSYSPAGEPTR_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSendmmsg_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoRecvmmsg_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSemDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSemInit_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoFdatasync_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGetpriority_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSetpriority_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoMkfifoat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t dirfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    const char* pathname = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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

static Napi::Value libcUnixNtoMknodat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    const char* pathname = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
        km_res = km_fn_ptr(fd, pathname, mode, dev);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoClockGetres_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t clkId = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(clkId, tp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoClockGettime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t clkId = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(clkId, tp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoClockSettime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t clkId = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(clkId, tp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoClockGetcpuclockid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* clkId = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
        km_res = km_fn_ptr(pid, clkId);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPthreadAttrGetstack_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoMemalign_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSetgroups_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixFadvise_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoFutimens_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoNlLanginfo_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoUtimensat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t dirfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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

static Napi::Value libcUnixNtoPthreadCondattrGetclock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clockId = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
        km_res = km_fn_ptr(attr, clockId);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPthreadCondattrSetclock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t clockId = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(attr, clockId);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPthreadCondattrSetpshared_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadMutexattrSetpshared_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadRwlockattrGetpshared_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadRwlockattrSetpshared_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPtsnameR_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoClearenv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoWaitid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoWait4_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoExecvpe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* file = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoGetifaddrs_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoFreeifaddrs_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoBind_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t arg0Socket = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t addressLen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(arg0Socket, address, addressLen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoWritev_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoReadv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSendmsg_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoRecvmsg_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoOpenpty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoForkpty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoLoginTty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoUname_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGetpeereid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t arg0Socket = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(arg0Socket, euid, egid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoStrerrorR_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoAbs_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoLabs_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoRand_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSrand_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSetpwent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoEndpwent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGetpwent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSetgrent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoEndgrent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGetgrent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSetspent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoEndspent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoShmOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoFtok_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* pathname = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t projId = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(pathname, projId);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoMprotect_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixFallocate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoMkostemp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* arg0Template = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_res = km_fn_ptr(arg0Template, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoMkostemps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* arg0Template = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_res = km_fn_ptr(arg0Template, suffixlen, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoSigtimedwait_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSigwaitinfo_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadSetschedprio_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoIfNameindex_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoIfFreenameindex_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGlob_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* pattern = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoGlobfree_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixMadvise_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoShmUnlink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoSeekdir_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoTelldir_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoMsync_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoRecvfrom_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t arg0Socket = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(arg0Socket, buf, len, flags, addr, addrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixNtoMkstemps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    char* arg0Template = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_res = km_fn_ptr(arg0Template, suffixlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoGetdomainname_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSetdomainname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoSync_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadGetschedparam_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoUmount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* target = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoSchedGetPriorityMax_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSettimeofday_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSchedRrGetInterval_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSemTimedwait_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSemGetvalue_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSchedSetparam_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoMount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* specialDevice = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* mountDirectory = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    const char* mountType = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* mountData = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t mountDatalen = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(specialDevice, mountDirectory, flags, mountType, mountData, mountDatalen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoSchedGetparam_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadMutexConsistent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadMutexTimedlock_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadSpinInit_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadSpinDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadSpinLock_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadSpinTrylock_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadSpinUnlock_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadBarrierattrInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_res = km_fn_ptr(attr);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPthreadBarrierattrDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_res = km_fn_ptr(attr);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPthreadBarrierattrGetpshared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pshared = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
        km_res = km_fn_ptr(attr, pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPthreadBarrierattrSetpshared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pshared = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(attr, pshared);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPthreadBarrierInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* barrier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t count = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(barrier, attr, count);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPthreadBarrierDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* barrier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_res = km_fn_ptr(barrier);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPthreadBarrierWait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* barrier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_res = km_fn_ptr(barrier);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoSchedGetscheduler_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoClockNanosleep_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t clkId = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(clkId, flags, rqtp, rmtp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPthreadAttrGetguardsize_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadAttrSetguardsize_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSethostname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoSchedGetPriorityMin_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadCondattrGetpshared_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadSetschedparam_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSchedSetscheduler_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSigsuspend_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGetgrgidR_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSemClose_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGetdtablesize_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGetgrnamR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoInitgroups_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* user = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoPthreadSigmask_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSemOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoGetgrnam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoPthreadCancel_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadKill_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSemUnlink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoDaemon_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGetpwnamR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoGetpwuidR_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSigwait_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadAtfork_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGetgrgid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGetgrouplist_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* user = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoPthreadMutexattrGetpshared_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadMutexattrGetrobust_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadMutexattrSetrobust_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadCreate_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGetitimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t which = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* currValue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
        km_res = km_fn_ptr(which, currValue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoSetitimer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixSpawn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileActions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
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
        km_res = km_fn_ptr(pid, path, fileActions, attrp, argv, envp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPosixSpawnp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* file = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileActions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
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
        km_res = km_fn_ptr(pid, file, fileActions, attrp, argv, envp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPosixSpawnattrInit_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixSpawnattrDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixSpawnattrGetsigdefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg1Default = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
        km_res = km_fn_ptr(attr, arg1Default);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPosixSpawnattrSetsigdefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg1Default = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
        km_res = km_fn_ptr(attr, arg1Default);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPosixSpawnattrGetsigmask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg1Default = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
        km_res = km_fn_ptr(attr, arg1Default);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPosixSpawnattrSetsigmask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* attr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg1Default = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
        km_res = km_fn_ptr(attr, arg1Default);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPosixSpawnattrGetflags_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixSpawnattrSetflags_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixSpawnattrGetpgroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixSpawnattrSetpgroup_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixSpawnattrGetschedpolicy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixSpawnattrSetschedpolicy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixSpawnattrGetschedparam_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixSpawnattrSetschedparam_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixSpawnFileActionsInit_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixSpawnFileActionsDestroy_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixSpawnFileActionsAddopen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* actions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fd = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
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

static Napi::Value libcUnixNtoPosixSpawnFileActionsAddclose_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPosixSpawnFileActionsAdddup2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPopen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* command = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* mode = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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

static Napi::Value libcUnixNtoFaccessat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t dirfd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    const char* pathname = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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

static Napi::Value libcUnixNtoInotifyRmWatch_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoInotifyInit_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoInotifyAddWatch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    const char* path = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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

static Napi::Value libcUnixNtoGettid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadGetcpuclockid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clkId = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
        km_res = km_fn_ptr(thread, clkId);
    } else {
        errno = ENOSYS;
        km_res = ENOSYS;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoGetnameinfo_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoMallopt_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGettimeofday_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoCtermid_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoIoctl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGetpwentR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* buf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t bufsize = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
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
        km_res = km_fn_ptr(pwd, buf, bufsize, result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoPthreadGetnameNp_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoPthreadSetnameNp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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

static Napi::Value libcUnixNtoSysctl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoGetrlimit_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoSetrlimit_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoLioListio_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t mode = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* list = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t nent = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
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
        km_res = km_fn_ptr(mode, list, nent, sig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoDlIteratePhdr_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoMemsetS_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoRegcomp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* preg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* pattern = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cflags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(preg, pattern, cflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoRegexec_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* preg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* str = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t nmatch = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* pmatch = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t eflags = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(preg, str, nmatch, pmatch, eflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoRegerror_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t errcode = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* preg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    char* errbuf = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t errbufSize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
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
        km_res = km_fn_ptr(errcode, preg, errbuf, errbufSize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value libcUnixNtoRegfree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* preg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_fn_ptr(preg);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libcUnixNtoDirfd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* dirp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_res = km_fn_ptr(dirp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoDircntl_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoAioCancel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* aiocbp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
        km_res = km_fn_ptr(fd, aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoAioError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* aiocbp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_res = km_fn_ptr(aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoAioFsync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t operation = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* aiocbp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
        km_res = km_fn_ptr(operation, aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoAioRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* aiocbp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_res = km_fn_ptr(aiocbp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoAioReturn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* aiocpb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_res = km_fn_ptr(aiocpb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixNtoAioSuspend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* list = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nent = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
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
        km_res = km_fn_ptr(list, nent, timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoAioWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* aiocpb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_res = km_fn_ptr(aiocpb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoMqClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_res = km_fn_ptr(mqdes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoMqGetattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mqstat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
        km_res = km_fn_ptr(mqdes, mqstat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoMqNotify_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* notification = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
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
        km_res = km_fn_ptr(mqdes, notification);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoMqOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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

static Napi::Value libcUnixNtoMqReceive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* msgPtr = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t msgLen = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* msgPrio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
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
        km_res = km_fn_ptr(mqdes, msgPtr, msgLen, msgPrio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixNtoMqSend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* msgPtr = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t msgLen = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t msgPrio = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
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
        km_res = km_fn_ptr(mqdes, msgPtr, msgLen, msgPrio);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoMqSetattr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mqstat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* omqstat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
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
        km_res = km_fn_ptr(mqdes, mqstat, omqstat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoMqTimedreceive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* msgPtr = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t msgLen = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* msgPrio = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* absTimeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
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
        km_res = km_fn_ptr(mqdes, msgPtr, msgLen, msgPrio, absTimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libcUnixNtoMqTimedsend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mqdes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    const char* msgPtr = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t msgLen = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t msgPrio = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* absTimeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
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
        km_res = km_fn_ptr(mqdes, msgPtr, msgLen, msgPrio, absTimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoMqUnlink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    const char* name = reinterpret_cast<const char*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_res = km_fn_ptr(name);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libcUnixNtoGetErrnoPtr_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value libcUnixNtoMyThreadExit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* valuePtr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
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
        km_fn_ptr(valuePtr);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static void register_unix_nto_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("libcUnixNtoGetSYSPAGEPTR", Napi::Function::New(env, libcUnixNtoGetSYSPAGEPTR_napi));
    exports.Set("libcUnixNtoSetSYSPAGEPTR", Napi::Function::New(env, libcUnixNtoSetSYSPAGEPTR_napi));
    exports.Set("libcUnixNtoSendmmsg", Napi::Function::New(env, libcUnixNtoSendmmsg_napi));
    exports.Set("libcUnixNtoRecvmmsg", Napi::Function::New(env, libcUnixNtoRecvmmsg_napi));
    exports.Set("libcUnixNtoSemDestroy", Napi::Function::New(env, libcUnixNtoSemDestroy_napi));
    exports.Set("libcUnixNtoSemInit", Napi::Function::New(env, libcUnixNtoSemInit_napi));
    exports.Set("libcUnixNtoFdatasync", Napi::Function::New(env, libcUnixNtoFdatasync_napi));
    exports.Set("libcUnixNtoGetpriority", Napi::Function::New(env, libcUnixNtoGetpriority_napi));
    exports.Set("libcUnixNtoSetpriority", Napi::Function::New(env, libcUnixNtoSetpriority_napi));
    exports.Set("libcUnixNtoMkfifoat", Napi::Function::New(env, libcUnixNtoMkfifoat_napi));
    exports.Set("libcUnixNtoMknodat", Napi::Function::New(env, libcUnixNtoMknodat_napi));
    exports.Set("libcUnixNtoClockGetres", Napi::Function::New(env, libcUnixNtoClockGetres_napi));
    exports.Set("libcUnixNtoClockGettime", Napi::Function::New(env, libcUnixNtoClockGettime_napi));
    exports.Set("libcUnixNtoClockSettime", Napi::Function::New(env, libcUnixNtoClockSettime_napi));
    exports.Set("libcUnixNtoClockGetcpuclockid", Napi::Function::New(env, libcUnixNtoClockGetcpuclockid_napi));
    exports.Set("libcUnixNtoPthreadAttrGetstack", Napi::Function::New(env, libcUnixNtoPthreadAttrGetstack_napi));
    exports.Set("libcUnixNtoMemalign", Napi::Function::New(env, libcUnixNtoMemalign_napi));
    exports.Set("libcUnixNtoSetgroups", Napi::Function::New(env, libcUnixNtoSetgroups_napi));
    exports.Set("libcUnixNtoPosixFadvise", Napi::Function::New(env, libcUnixNtoPosixFadvise_napi));
    exports.Set("libcUnixNtoFutimens", Napi::Function::New(env, libcUnixNtoFutimens_napi));
    exports.Set("libcUnixNtoNlLanginfo", Napi::Function::New(env, libcUnixNtoNlLanginfo_napi));
    exports.Set("libcUnixNtoUtimensat", Napi::Function::New(env, libcUnixNtoUtimensat_napi));
    exports.Set("libcUnixNtoPthreadCondattrGetclock", Napi::Function::New(env, libcUnixNtoPthreadCondattrGetclock_napi));
    exports.Set("libcUnixNtoPthreadCondattrSetclock", Napi::Function::New(env, libcUnixNtoPthreadCondattrSetclock_napi));
    exports.Set("libcUnixNtoPthreadCondattrSetpshared", Napi::Function::New(env, libcUnixNtoPthreadCondattrSetpshared_napi));
    exports.Set("libcUnixNtoPthreadMutexattrSetpshared", Napi::Function::New(env, libcUnixNtoPthreadMutexattrSetpshared_napi));
    exports.Set("libcUnixNtoPthreadRwlockattrGetpshared", Napi::Function::New(env, libcUnixNtoPthreadRwlockattrGetpshared_napi));
    exports.Set("libcUnixNtoPthreadRwlockattrSetpshared", Napi::Function::New(env, libcUnixNtoPthreadRwlockattrSetpshared_napi));
    exports.Set("libcUnixNtoPtsnameR", Napi::Function::New(env, libcUnixNtoPtsnameR_napi));
    exports.Set("libcUnixNtoClearenv", Napi::Function::New(env, libcUnixNtoClearenv_napi));
    exports.Set("libcUnixNtoWaitid", Napi::Function::New(env, libcUnixNtoWaitid_napi));
    exports.Set("libcUnixNtoWait4", Napi::Function::New(env, libcUnixNtoWait4_napi));
    exports.Set("libcUnixNtoExecvpe", Napi::Function::New(env, libcUnixNtoExecvpe_napi));
    exports.Set("libcUnixNtoGetifaddrs", Napi::Function::New(env, libcUnixNtoGetifaddrs_napi));
    exports.Set("libcUnixNtoFreeifaddrs", Napi::Function::New(env, libcUnixNtoFreeifaddrs_napi));
    exports.Set("libcUnixNtoBind", Napi::Function::New(env, libcUnixNtoBind_napi));
    exports.Set("libcUnixNtoWritev", Napi::Function::New(env, libcUnixNtoWritev_napi));
    exports.Set("libcUnixNtoReadv", Napi::Function::New(env, libcUnixNtoReadv_napi));
    exports.Set("libcUnixNtoSendmsg", Napi::Function::New(env, libcUnixNtoSendmsg_napi));
    exports.Set("libcUnixNtoRecvmsg", Napi::Function::New(env, libcUnixNtoRecvmsg_napi));
    exports.Set("libcUnixNtoOpenpty", Napi::Function::New(env, libcUnixNtoOpenpty_napi));
    exports.Set("libcUnixNtoForkpty", Napi::Function::New(env, libcUnixNtoForkpty_napi));
    exports.Set("libcUnixNtoLoginTty", Napi::Function::New(env, libcUnixNtoLoginTty_napi));
    exports.Set("libcUnixNtoUname", Napi::Function::New(env, libcUnixNtoUname_napi));
    exports.Set("libcUnixNtoGetpeereid", Napi::Function::New(env, libcUnixNtoGetpeereid_napi));
    exports.Set("libcUnixNtoStrerrorR", Napi::Function::New(env, libcUnixNtoStrerrorR_napi));
    exports.Set("libcUnixNtoAbs", Napi::Function::New(env, libcUnixNtoAbs_napi));
    exports.Set("libcUnixNtoLabs", Napi::Function::New(env, libcUnixNtoLabs_napi));
    exports.Set("libcUnixNtoRand", Napi::Function::New(env, libcUnixNtoRand_napi));
    exports.Set("libcUnixNtoSrand", Napi::Function::New(env, libcUnixNtoSrand_napi));
    exports.Set("libcUnixNtoSetpwent", Napi::Function::New(env, libcUnixNtoSetpwent_napi));
    exports.Set("libcUnixNtoEndpwent", Napi::Function::New(env, libcUnixNtoEndpwent_napi));
    exports.Set("libcUnixNtoGetpwent", Napi::Function::New(env, libcUnixNtoGetpwent_napi));
    exports.Set("libcUnixNtoSetgrent", Napi::Function::New(env, libcUnixNtoSetgrent_napi));
    exports.Set("libcUnixNtoEndgrent", Napi::Function::New(env, libcUnixNtoEndgrent_napi));
    exports.Set("libcUnixNtoGetgrent", Napi::Function::New(env, libcUnixNtoGetgrent_napi));
    exports.Set("libcUnixNtoSetspent", Napi::Function::New(env, libcUnixNtoSetspent_napi));
    exports.Set("libcUnixNtoEndspent", Napi::Function::New(env, libcUnixNtoEndspent_napi));
    exports.Set("libcUnixNtoShmOpen", Napi::Function::New(env, libcUnixNtoShmOpen_napi));
    exports.Set("libcUnixNtoFtok", Napi::Function::New(env, libcUnixNtoFtok_napi));
    exports.Set("libcUnixNtoMprotect", Napi::Function::New(env, libcUnixNtoMprotect_napi));
    exports.Set("libcUnixNtoPosixFallocate", Napi::Function::New(env, libcUnixNtoPosixFallocate_napi));
    exports.Set("libcUnixNtoMkostemp", Napi::Function::New(env, libcUnixNtoMkostemp_napi));
    exports.Set("libcUnixNtoMkostemps", Napi::Function::New(env, libcUnixNtoMkostemps_napi));
    exports.Set("libcUnixNtoSigtimedwait", Napi::Function::New(env, libcUnixNtoSigtimedwait_napi));
    exports.Set("libcUnixNtoSigwaitinfo", Napi::Function::New(env, libcUnixNtoSigwaitinfo_napi));
    exports.Set("libcUnixNtoPthreadSetschedprio", Napi::Function::New(env, libcUnixNtoPthreadSetschedprio_napi));
    exports.Set("libcUnixNtoIfNameindex", Napi::Function::New(env, libcUnixNtoIfNameindex_napi));
    exports.Set("libcUnixNtoIfFreenameindex", Napi::Function::New(env, libcUnixNtoIfFreenameindex_napi));
    exports.Set("libcUnixNtoGlob", Napi::Function::New(env, libcUnixNtoGlob_napi));
    exports.Set("libcUnixNtoGlobfree", Napi::Function::New(env, libcUnixNtoGlobfree_napi));
    exports.Set("libcUnixNtoPosixMadvise", Napi::Function::New(env, libcUnixNtoPosixMadvise_napi));
    exports.Set("libcUnixNtoShmUnlink", Napi::Function::New(env, libcUnixNtoShmUnlink_napi));
    exports.Set("libcUnixNtoSeekdir", Napi::Function::New(env, libcUnixNtoSeekdir_napi));
    exports.Set("libcUnixNtoTelldir", Napi::Function::New(env, libcUnixNtoTelldir_napi));
    exports.Set("libcUnixNtoMsync", Napi::Function::New(env, libcUnixNtoMsync_napi));
    exports.Set("libcUnixNtoRecvfrom", Napi::Function::New(env, libcUnixNtoRecvfrom_napi));
    exports.Set("libcUnixNtoMkstemps", Napi::Function::New(env, libcUnixNtoMkstemps_napi));
    exports.Set("libcUnixNtoGetdomainname", Napi::Function::New(env, libcUnixNtoGetdomainname_napi));
    exports.Set("libcUnixNtoSetdomainname", Napi::Function::New(env, libcUnixNtoSetdomainname_napi));
    exports.Set("libcUnixNtoSync", Napi::Function::New(env, libcUnixNtoSync_napi));
    exports.Set("libcUnixNtoPthreadGetschedparam", Napi::Function::New(env, libcUnixNtoPthreadGetschedparam_napi));
    exports.Set("libcUnixNtoUmount", Napi::Function::New(env, libcUnixNtoUmount_napi));
    exports.Set("libcUnixNtoSchedGetPriorityMax", Napi::Function::New(env, libcUnixNtoSchedGetPriorityMax_napi));
    exports.Set("libcUnixNtoSettimeofday", Napi::Function::New(env, libcUnixNtoSettimeofday_napi));
    exports.Set("libcUnixNtoSchedRrGetInterval", Napi::Function::New(env, libcUnixNtoSchedRrGetInterval_napi));
    exports.Set("libcUnixNtoSemTimedwait", Napi::Function::New(env, libcUnixNtoSemTimedwait_napi));
    exports.Set("libcUnixNtoSemGetvalue", Napi::Function::New(env, libcUnixNtoSemGetvalue_napi));
    exports.Set("libcUnixNtoSchedSetparam", Napi::Function::New(env, libcUnixNtoSchedSetparam_napi));
    exports.Set("libcUnixNtoMount", Napi::Function::New(env, libcUnixNtoMount_napi));
    exports.Set("libcUnixNtoSchedGetparam", Napi::Function::New(env, libcUnixNtoSchedGetparam_napi));
    exports.Set("libcUnixNtoPthreadMutexConsistent", Napi::Function::New(env, libcUnixNtoPthreadMutexConsistent_napi));
    exports.Set("libcUnixNtoPthreadMutexTimedlock", Napi::Function::New(env, libcUnixNtoPthreadMutexTimedlock_napi));
    exports.Set("libcUnixNtoPthreadSpinInit", Napi::Function::New(env, libcUnixNtoPthreadSpinInit_napi));
    exports.Set("libcUnixNtoPthreadSpinDestroy", Napi::Function::New(env, libcUnixNtoPthreadSpinDestroy_napi));
    exports.Set("libcUnixNtoPthreadSpinLock", Napi::Function::New(env, libcUnixNtoPthreadSpinLock_napi));
    exports.Set("libcUnixNtoPthreadSpinTrylock", Napi::Function::New(env, libcUnixNtoPthreadSpinTrylock_napi));
    exports.Set("libcUnixNtoPthreadSpinUnlock", Napi::Function::New(env, libcUnixNtoPthreadSpinUnlock_napi));
    exports.Set("libcUnixNtoPthreadBarrierattrInit", Napi::Function::New(env, libcUnixNtoPthreadBarrierattrInit_napi));
    exports.Set("libcUnixNtoPthreadBarrierattrDestroy", Napi::Function::New(env, libcUnixNtoPthreadBarrierattrDestroy_napi));
    exports.Set("libcUnixNtoPthreadBarrierattrGetpshared", Napi::Function::New(env, libcUnixNtoPthreadBarrierattrGetpshared_napi));
    exports.Set("libcUnixNtoPthreadBarrierattrSetpshared", Napi::Function::New(env, libcUnixNtoPthreadBarrierattrSetpshared_napi));
    exports.Set("libcUnixNtoPthreadBarrierInit", Napi::Function::New(env, libcUnixNtoPthreadBarrierInit_napi));
    exports.Set("libcUnixNtoPthreadBarrierDestroy", Napi::Function::New(env, libcUnixNtoPthreadBarrierDestroy_napi));
    exports.Set("libcUnixNtoPthreadBarrierWait", Napi::Function::New(env, libcUnixNtoPthreadBarrierWait_napi));
    exports.Set("libcUnixNtoSchedGetscheduler", Napi::Function::New(env, libcUnixNtoSchedGetscheduler_napi));
    exports.Set("libcUnixNtoClockNanosleep", Napi::Function::New(env, libcUnixNtoClockNanosleep_napi));
    exports.Set("libcUnixNtoPthreadAttrGetguardsize", Napi::Function::New(env, libcUnixNtoPthreadAttrGetguardsize_napi));
    exports.Set("libcUnixNtoPthreadAttrSetguardsize", Napi::Function::New(env, libcUnixNtoPthreadAttrSetguardsize_napi));
    exports.Set("libcUnixNtoSethostname", Napi::Function::New(env, libcUnixNtoSethostname_napi));
    exports.Set("libcUnixNtoSchedGetPriorityMin", Napi::Function::New(env, libcUnixNtoSchedGetPriorityMin_napi));
    exports.Set("libcUnixNtoPthreadCondattrGetpshared", Napi::Function::New(env, libcUnixNtoPthreadCondattrGetpshared_napi));
    exports.Set("libcUnixNtoPthreadSetschedparam", Napi::Function::New(env, libcUnixNtoPthreadSetschedparam_napi));
    exports.Set("libcUnixNtoSchedSetscheduler", Napi::Function::New(env, libcUnixNtoSchedSetscheduler_napi));
    exports.Set("libcUnixNtoSigsuspend", Napi::Function::New(env, libcUnixNtoSigsuspend_napi));
    exports.Set("libcUnixNtoGetgrgidR", Napi::Function::New(env, libcUnixNtoGetgrgidR_napi));
    exports.Set("libcUnixNtoSemClose", Napi::Function::New(env, libcUnixNtoSemClose_napi));
    exports.Set("libcUnixNtoGetdtablesize", Napi::Function::New(env, libcUnixNtoGetdtablesize_napi));
    exports.Set("libcUnixNtoGetgrnamR", Napi::Function::New(env, libcUnixNtoGetgrnamR_napi));
    exports.Set("libcUnixNtoInitgroups", Napi::Function::New(env, libcUnixNtoInitgroups_napi));
    exports.Set("libcUnixNtoPthreadSigmask", Napi::Function::New(env, libcUnixNtoPthreadSigmask_napi));
    exports.Set("libcUnixNtoSemOpen", Napi::Function::New(env, libcUnixNtoSemOpen_napi));
    exports.Set("libcUnixNtoGetgrnam", Napi::Function::New(env, libcUnixNtoGetgrnam_napi));
    exports.Set("libcUnixNtoPthreadCancel", Napi::Function::New(env, libcUnixNtoPthreadCancel_napi));
    exports.Set("libcUnixNtoPthreadKill", Napi::Function::New(env, libcUnixNtoPthreadKill_napi));
    exports.Set("libcUnixNtoSemUnlink", Napi::Function::New(env, libcUnixNtoSemUnlink_napi));
    exports.Set("libcUnixNtoDaemon", Napi::Function::New(env, libcUnixNtoDaemon_napi));
    exports.Set("libcUnixNtoGetpwnamR", Napi::Function::New(env, libcUnixNtoGetpwnamR_napi));
    exports.Set("libcUnixNtoGetpwuidR", Napi::Function::New(env, libcUnixNtoGetpwuidR_napi));
    exports.Set("libcUnixNtoSigwait", Napi::Function::New(env, libcUnixNtoSigwait_napi));
    exports.Set("libcUnixNtoPthreadAtfork", Napi::Function::New(env, libcUnixNtoPthreadAtfork_napi));
    exports.Set("libcUnixNtoGetgrgid", Napi::Function::New(env, libcUnixNtoGetgrgid_napi));
    exports.Set("libcUnixNtoGetgrouplist", Napi::Function::New(env, libcUnixNtoGetgrouplist_napi));
    exports.Set("libcUnixNtoPthreadMutexattrGetpshared", Napi::Function::New(env, libcUnixNtoPthreadMutexattrGetpshared_napi));
    exports.Set("libcUnixNtoPthreadMutexattrGetrobust", Napi::Function::New(env, libcUnixNtoPthreadMutexattrGetrobust_napi));
    exports.Set("libcUnixNtoPthreadMutexattrSetrobust", Napi::Function::New(env, libcUnixNtoPthreadMutexattrSetrobust_napi));
    exports.Set("libcUnixNtoPthreadCreate", Napi::Function::New(env, libcUnixNtoPthreadCreate_napi));
    exports.Set("libcUnixNtoGetitimer", Napi::Function::New(env, libcUnixNtoGetitimer_napi));
    exports.Set("libcUnixNtoSetitimer", Napi::Function::New(env, libcUnixNtoSetitimer_napi));
    exports.Set("libcUnixNtoPosixSpawn", Napi::Function::New(env, libcUnixNtoPosixSpawn_napi));
    exports.Set("libcUnixNtoPosixSpawnp", Napi::Function::New(env, libcUnixNtoPosixSpawnp_napi));
    exports.Set("libcUnixNtoPosixSpawnattrInit", Napi::Function::New(env, libcUnixNtoPosixSpawnattrInit_napi));
    exports.Set("libcUnixNtoPosixSpawnattrDestroy", Napi::Function::New(env, libcUnixNtoPosixSpawnattrDestroy_napi));
    exports.Set("libcUnixNtoPosixSpawnattrGetsigdefault", Napi::Function::New(env, libcUnixNtoPosixSpawnattrGetsigdefault_napi));
    exports.Set("libcUnixNtoPosixSpawnattrSetsigdefault", Napi::Function::New(env, libcUnixNtoPosixSpawnattrSetsigdefault_napi));
    exports.Set("libcUnixNtoPosixSpawnattrGetsigmask", Napi::Function::New(env, libcUnixNtoPosixSpawnattrGetsigmask_napi));
    exports.Set("libcUnixNtoPosixSpawnattrSetsigmask", Napi::Function::New(env, libcUnixNtoPosixSpawnattrSetsigmask_napi));
    exports.Set("libcUnixNtoPosixSpawnattrGetflags", Napi::Function::New(env, libcUnixNtoPosixSpawnattrGetflags_napi));
    exports.Set("libcUnixNtoPosixSpawnattrSetflags", Napi::Function::New(env, libcUnixNtoPosixSpawnattrSetflags_napi));
    exports.Set("libcUnixNtoPosixSpawnattrGetpgroup", Napi::Function::New(env, libcUnixNtoPosixSpawnattrGetpgroup_napi));
    exports.Set("libcUnixNtoPosixSpawnattrSetpgroup", Napi::Function::New(env, libcUnixNtoPosixSpawnattrSetpgroup_napi));
    exports.Set("libcUnixNtoPosixSpawnattrGetschedpolicy", Napi::Function::New(env, libcUnixNtoPosixSpawnattrGetschedpolicy_napi));
    exports.Set("libcUnixNtoPosixSpawnattrSetschedpolicy", Napi::Function::New(env, libcUnixNtoPosixSpawnattrSetschedpolicy_napi));
    exports.Set("libcUnixNtoPosixSpawnattrGetschedparam", Napi::Function::New(env, libcUnixNtoPosixSpawnattrGetschedparam_napi));
    exports.Set("libcUnixNtoPosixSpawnattrSetschedparam", Napi::Function::New(env, libcUnixNtoPosixSpawnattrSetschedparam_napi));
    exports.Set("libcUnixNtoPosixSpawnFileActionsInit", Napi::Function::New(env, libcUnixNtoPosixSpawnFileActionsInit_napi));
    exports.Set("libcUnixNtoPosixSpawnFileActionsDestroy", Napi::Function::New(env, libcUnixNtoPosixSpawnFileActionsDestroy_napi));
    exports.Set("libcUnixNtoPosixSpawnFileActionsAddopen", Napi::Function::New(env, libcUnixNtoPosixSpawnFileActionsAddopen_napi));
    exports.Set("libcUnixNtoPosixSpawnFileActionsAddclose", Napi::Function::New(env, libcUnixNtoPosixSpawnFileActionsAddclose_napi));
    exports.Set("libcUnixNtoPosixSpawnFileActionsAdddup2", Napi::Function::New(env, libcUnixNtoPosixSpawnFileActionsAdddup2_napi));
    exports.Set("libcUnixNtoPopen", Napi::Function::New(env, libcUnixNtoPopen_napi));
    exports.Set("libcUnixNtoFaccessat", Napi::Function::New(env, libcUnixNtoFaccessat_napi));
    exports.Set("libcUnixNtoInotifyRmWatch", Napi::Function::New(env, libcUnixNtoInotifyRmWatch_napi));
    exports.Set("libcUnixNtoInotifyInit", Napi::Function::New(env, libcUnixNtoInotifyInit_napi));
    exports.Set("libcUnixNtoInotifyAddWatch", Napi::Function::New(env, libcUnixNtoInotifyAddWatch_napi));
    exports.Set("libcUnixNtoGettid", Napi::Function::New(env, libcUnixNtoGettid_napi));
    exports.Set("libcUnixNtoPthreadGetcpuclockid", Napi::Function::New(env, libcUnixNtoPthreadGetcpuclockid_napi));
    exports.Set("libcUnixNtoGetnameinfo", Napi::Function::New(env, libcUnixNtoGetnameinfo_napi));
    exports.Set("libcUnixNtoMallopt", Napi::Function::New(env, libcUnixNtoMallopt_napi));
    exports.Set("libcUnixNtoGettimeofday", Napi::Function::New(env, libcUnixNtoGettimeofday_napi));
    exports.Set("libcUnixNtoCtermid", Napi::Function::New(env, libcUnixNtoCtermid_napi));
    exports.Set("libcUnixNtoIoctl", Napi::Function::New(env, libcUnixNtoIoctl_napi));
    exports.Set("libcUnixNtoGetpwentR", Napi::Function::New(env, libcUnixNtoGetpwentR_napi));
    exports.Set("libcUnixNtoPthreadGetnameNp", Napi::Function::New(env, libcUnixNtoPthreadGetnameNp_napi));
    exports.Set("libcUnixNtoPthreadSetnameNp", Napi::Function::New(env, libcUnixNtoPthreadSetnameNp_napi));
    exports.Set("libcUnixNtoSysctl", Napi::Function::New(env, libcUnixNtoSysctl_napi));
    exports.Set("libcUnixNtoGetrlimit", Napi::Function::New(env, libcUnixNtoGetrlimit_napi));
    exports.Set("libcUnixNtoSetrlimit", Napi::Function::New(env, libcUnixNtoSetrlimit_napi));
    exports.Set("libcUnixNtoLioListio", Napi::Function::New(env, libcUnixNtoLioListio_napi));
    exports.Set("libcUnixNtoDlIteratePhdr", Napi::Function::New(env, libcUnixNtoDlIteratePhdr_napi));
    exports.Set("libcUnixNtoMemsetS", Napi::Function::New(env, libcUnixNtoMemsetS_napi));
    exports.Set("libcUnixNtoRegcomp", Napi::Function::New(env, libcUnixNtoRegcomp_napi));
    exports.Set("libcUnixNtoRegexec", Napi::Function::New(env, libcUnixNtoRegexec_napi));
    exports.Set("libcUnixNtoRegerror", Napi::Function::New(env, libcUnixNtoRegerror_napi));
    exports.Set("libcUnixNtoRegfree", Napi::Function::New(env, libcUnixNtoRegfree_napi));
    exports.Set("libcUnixNtoDirfd", Napi::Function::New(env, libcUnixNtoDirfd_napi));
    exports.Set("libcUnixNtoDircntl", Napi::Function::New(env, libcUnixNtoDircntl_napi));
    exports.Set("libcUnixNtoAioCancel", Napi::Function::New(env, libcUnixNtoAioCancel_napi));
    exports.Set("libcUnixNtoAioError", Napi::Function::New(env, libcUnixNtoAioError_napi));
    exports.Set("libcUnixNtoAioFsync", Napi::Function::New(env, libcUnixNtoAioFsync_napi));
    exports.Set("libcUnixNtoAioRead", Napi::Function::New(env, libcUnixNtoAioRead_napi));
    exports.Set("libcUnixNtoAioReturn", Napi::Function::New(env, libcUnixNtoAioReturn_napi));
    exports.Set("libcUnixNtoAioSuspend", Napi::Function::New(env, libcUnixNtoAioSuspend_napi));
    exports.Set("libcUnixNtoAioWrite", Napi::Function::New(env, libcUnixNtoAioWrite_napi));
    exports.Set("libcUnixNtoMqClose", Napi::Function::New(env, libcUnixNtoMqClose_napi));
    exports.Set("libcUnixNtoMqGetattr", Napi::Function::New(env, libcUnixNtoMqGetattr_napi));
    exports.Set("libcUnixNtoMqNotify", Napi::Function::New(env, libcUnixNtoMqNotify_napi));
    exports.Set("libcUnixNtoMqOpen", Napi::Function::New(env, libcUnixNtoMqOpen_napi));
    exports.Set("libcUnixNtoMqReceive", Napi::Function::New(env, libcUnixNtoMqReceive_napi));
    exports.Set("libcUnixNtoMqSend", Napi::Function::New(env, libcUnixNtoMqSend_napi));
    exports.Set("libcUnixNtoMqSetattr", Napi::Function::New(env, libcUnixNtoMqSetattr_napi));
    exports.Set("libcUnixNtoMqTimedreceive", Napi::Function::New(env, libcUnixNtoMqTimedreceive_napi));
    exports.Set("libcUnixNtoMqTimedsend", Napi::Function::New(env, libcUnixNtoMqTimedsend_napi));
    exports.Set("libcUnixNtoMqUnlink", Napi::Function::New(env, libcUnixNtoMqUnlink_napi));
    exports.Set("libcUnixNtoGetErrnoPtr", Napi::Function::New(env, libcUnixNtoGetErrnoPtr_napi));
    exports.Set("libcUnixNtoMyThreadExit", Napi::Function::New(env, libcUnixNtoMyThreadExit_napi));
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
