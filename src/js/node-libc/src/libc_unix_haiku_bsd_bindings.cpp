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

static Napi::Value libc_unix_haiku_bsd_daemon_napi(const Napi::CallbackInfo& km_info) {
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
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "daemon"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "daemon"));
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

static Napi::Value libc_unix_haiku_bsd_getprogname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef const char* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "getprogname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_getprogname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "getprogname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_getprogname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "getprogname"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "getprogname"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "getprogname"));
        }
#endif
    }
#endif
    const char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_haiku_bsd_setprogname_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool progname_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string progname_str = progname_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* progname = progname_null ? nullptr : progname_str.c_str();
    typedef void (*km_fn_t)(const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "setprogname")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_setprogname")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "setprogname")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_setprogname")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "setprogname"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "setprogname"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "setprogname"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(progname);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_haiku_bsd_arc4random_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef uint32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "arc4random")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_arc4random")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "arc4random")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_arc4random")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "arc4random"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "arc4random"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "arc4random"));
        }
#endif
    }
#endif
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_haiku_bsd_arc4randomUniform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t upper_bound = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    typedef uint32_t (*km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "arc4random_uniform")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_arc4random_uniform")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "arc4random_uniform")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_arc4random_uniform")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "arc4random_uniform"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "arc4random_uniform"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "arc4random_uniform"));
        }
#endif
    }
#endif
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(upper_bound);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_haiku_bsd_arc4randomBuf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t n = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef void (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "arc4random_buf")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_arc4random_buf")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "arc4random_buf")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_arc4random_buf")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "arc4random_buf"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "arc4random_buf"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "arc4random_buf"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(buf, n);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_haiku_bsd_mkstemps_napi(const Napi::CallbackInfo& km_info) {
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
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "mkstemps"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "mkstemps"));
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

static Napi::Value libc_unix_haiku_bsd_strtonum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool nptr_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string nptr_str = nptr_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* nptr = nptr_null ? nullptr : nptr_str.c_str();
    int64_t minval = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t maxval = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* errstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    typedef int64_t (*km_fn_t)(const char*, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "strtonum")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_strtonum")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "strtonum")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_strtonum")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "strtonum"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "strtonum"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "strtonum"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(nptr, minval, maxval, errstr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_haiku_bsd_openpty_napi(const Napi::CallbackInfo& km_info) {
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
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "openpty"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "openpty"));
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

static Napi::Value libc_unix_haiku_bsd_loginTty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t arg_0_fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
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
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "login_tty"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "login_tty"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(arg_0_fd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_haiku_bsd_forkpty_napi(const Napi::CallbackInfo& km_info) {
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
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "forkpty"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "forkpty"));
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

static Napi::Value libc_unix_haiku_bsd_strsep_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool delimiters_null = (km_info.Length() <= 1 || km_info[1].IsNull() || km_info[1].IsUndefined());
    std::string delimiters_str = delimiters_null ? std::string() : km_info[1].ToString().Utf8Value();
    const char* delimiters = delimiters_null ? nullptr : delimiters_str.c_str();
    typedef char* (*km_fn_t)(void*, const char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "strsep")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_strsep")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "strsep")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_strsep")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "strsep"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "strsep"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "strsep"));
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(string, delimiters);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_haiku_bsd_explicitBzero_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    typedef void (*km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "explicit_bzero")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_explicit_bzero")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "explicit_bzero")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_explicit_bzero")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "explicit_bzero"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "explicit_bzero"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "explicit_bzero"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(buf, len);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_haiku_bsd_slInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef void* (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sl_init")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sl_init")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sl_init")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sl_init")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sl_init"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "sl_init"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "sl_init"));
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

static Napi::Value libc_unix_haiku_bsd_slAdd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* n = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(void*, char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sl_add")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sl_add")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sl_add")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sl_add")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sl_add"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "sl_add"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "sl_add"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sl, n);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_haiku_bsd_slFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    typedef void (*km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sl_free")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sl_free")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sl_free")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sl_free")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sl_free"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "sl_free"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "sl_free"));
        }
#endif
    }
#endif
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(sl, i);
    } else {
        errno = ENOSYS;
    }
    return km_env.Undefined();
}

static Napi::Value libc_unix_haiku_bsd_slFind_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    char* n = reinterpret_cast<char*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef char* (*km_fn_t)(void*, char*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "sl_find")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_sl_find")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "sl_find")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_sl_find")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "sl_find"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "sl_find"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "sl_find"));
        }
#endif
    }
#endif
    char* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sl, n);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value libc_unix_haiku_bsd_kqueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    typedef int32_t (*km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "kqueue")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_kqueue")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "kqueue")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_kqueue")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "kqueue"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "kqueue"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "kqueue"));
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

static Napi::Value libc_unix_haiku_bsd_kevent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t kq = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* changelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t nchanges = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* eventlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t nevents = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    typedef int32_t (*km_fn_t)(int32_t, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "kevent")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_kevent")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "kevent")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_kevent")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "kevent"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "kevent"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "kevent"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(kq, changelist, nchanges, eventlist, nevents, timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_haiku_bsd_dlIteratePhdr_napi(const Napi::CallbackInfo& km_info) {
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
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "dl_iterate_phdr"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "dl_iterate_phdr"));
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

static Napi::Value libc_unix_haiku_bsd_lutimes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool file_null = (km_info.Length() <= 0 || km_info[0].IsNull() || km_info[0].IsUndefined());
    std::string file_str = file_null ? std::string() : km_info[0].ToString().Utf8Value();
    const char* file = file_null ? nullptr : file_str.c_str();
    void* times = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    typedef int32_t (*km_fn_t)(const char*, void*);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "lutimes")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_lutimes")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "lutimes")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_lutimes")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "lutimes"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "lutimes"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "lutimes"));
        }
#endif
    }
#endif
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(file, times);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value libc_unix_haiku_bsd_preadv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* iov = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t iovcnt = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t offset = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "preadv")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_preadv")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "preadv")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_preadv")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "preadv"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "preadv"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "preadv"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, iov, iovcnt, offset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_haiku_bsd_pwritev_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fd = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* iov = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t iovcnt = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t offset = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    typedef int64_t (*km_fn_t)(int32_t, void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
#ifdef _WIN32
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_ucrt = GetModuleHandleA("ucrtbase.dll");
        if (km_h_ucrt == nullptr) km_h_ucrt = LoadLibraryA("ucrtbase.dll");
        if (km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "pwritev")));
        if (km_fn_ptr == nullptr && km_h_ucrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_ucrt, "_pwritev")));
        if (km_fn_ptr == nullptr) {
            HMODULE km_h_msvcrt = GetModuleHandleA("msvcrt.dll");
            if (km_h_msvcrt == nullptr) km_h_msvcrt = LoadLibraryA("msvcrt.dll");
            if (km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "pwritev")));
            if (km_fn_ptr == nullptr && km_h_msvcrt != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_msvcrt, "_pwritev")));
        }
    }
#else
    if (km_fn_ptr == nullptr) {
        km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(RTLD_DEFAULT, "pwritev"));
#ifdef __APPLE__
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "pwritev"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "pwritev"));
        }
#endif
    }
#endif
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fd, iov, iovcnt, offset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value libc_unix_haiku_bsd_wait4_napi(const Napi::CallbackInfo& km_info) {
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
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("/usr/lib/libbsd.dylib", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "wait4"));
        }
#elif defined(__linux__) && !defined(__ANDROID__)
        if (km_fn_ptr == nullptr) {
            static void* km_h_bsd = nullptr;
            static bool km_h_bsd_init = false;
            if (!km_h_bsd_init) {
                km_h_bsd_init = true;
                km_h_bsd = dlopen("libbsd.so", RTLD_LAZY | RTLD_LOCAL);
            }
            if (km_h_bsd != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(dlsym(km_h_bsd, "wait4"));
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

static void register_unix_haiku_bsd_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("libc_unix_haiku_bsd_daemon", Napi::Function::New(env, libc_unix_haiku_bsd_daemon_napi));
    exports.Set("libc_unix_haiku_bsd_getprogname", Napi::Function::New(env, libc_unix_haiku_bsd_getprogname_napi));
    exports.Set("libc_unix_haiku_bsd_setprogname", Napi::Function::New(env, libc_unix_haiku_bsd_setprogname_napi));
    exports.Set("libc_unix_haiku_bsd_arc4random", Napi::Function::New(env, libc_unix_haiku_bsd_arc4random_napi));
    exports.Set("libc_unix_haiku_bsd_arc4randomUniform", Napi::Function::New(env, libc_unix_haiku_bsd_arc4randomUniform_napi));
    exports.Set("libc_unix_haiku_bsd_arc4randomBuf", Napi::Function::New(env, libc_unix_haiku_bsd_arc4randomBuf_napi));
    exports.Set("libc_unix_haiku_bsd_mkstemps", Napi::Function::New(env, libc_unix_haiku_bsd_mkstemps_napi));
    exports.Set("libc_unix_haiku_bsd_strtonum", Napi::Function::New(env, libc_unix_haiku_bsd_strtonum_napi));
    exports.Set("libc_unix_haiku_bsd_openpty", Napi::Function::New(env, libc_unix_haiku_bsd_openpty_napi));
    exports.Set("libc_unix_haiku_bsd_loginTty", Napi::Function::New(env, libc_unix_haiku_bsd_loginTty_napi));
    exports.Set("libc_unix_haiku_bsd_forkpty", Napi::Function::New(env, libc_unix_haiku_bsd_forkpty_napi));
    exports.Set("libc_unix_haiku_bsd_strsep", Napi::Function::New(env, libc_unix_haiku_bsd_strsep_napi));
    exports.Set("libc_unix_haiku_bsd_explicitBzero", Napi::Function::New(env, libc_unix_haiku_bsd_explicitBzero_napi));
    exports.Set("libc_unix_haiku_bsd_slInit", Napi::Function::New(env, libc_unix_haiku_bsd_slInit_napi));
    exports.Set("libc_unix_haiku_bsd_slAdd", Napi::Function::New(env, libc_unix_haiku_bsd_slAdd_napi));
    exports.Set("libc_unix_haiku_bsd_slFree", Napi::Function::New(env, libc_unix_haiku_bsd_slFree_napi));
    exports.Set("libc_unix_haiku_bsd_slFind", Napi::Function::New(env, libc_unix_haiku_bsd_slFind_napi));
    exports.Set("libc_unix_haiku_bsd_kqueue", Napi::Function::New(env, libc_unix_haiku_bsd_kqueue_napi));
    exports.Set("libc_unix_haiku_bsd_kevent", Napi::Function::New(env, libc_unix_haiku_bsd_kevent_napi));
    exports.Set("libc_unix_haiku_bsd_dlIteratePhdr", Napi::Function::New(env, libc_unix_haiku_bsd_dlIteratePhdr_napi));
    exports.Set("libc_unix_haiku_bsd_lutimes", Napi::Function::New(env, libc_unix_haiku_bsd_lutimes_napi));
    exports.Set("libc_unix_haiku_bsd_preadv", Napi::Function::New(env, libc_unix_haiku_bsd_preadv_napi));
    exports.Set("libc_unix_haiku_bsd_pwritev", Napi::Function::New(env, libc_unix_haiku_bsd_pwritev_napi));
    exports.Set("libc_unix_haiku_bsd_wait4", Napi::Function::New(env, libc_unix_haiku_bsd_wait4_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_unix_haiku_bsd_napi, nullptr };
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
