// port-lint: source new/linux_uapi/linux/keyctl.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux.keyctl

// Header: `linux / keyctl.h`

public val KEY_SPEC_THREAD_KEYRING: Int = -1

public val KEY_SPEC_PROCESS_KEYRING: Int = -2

public val KEY_SPEC_SESSION_KEYRING: Int = -3

public val KEY_SPEC_USER_KEYRING: Int = -4

public val KEY_SPEC_USER_SESSION_KEYRING: Int = -5

public val KEY_SPEC_GROUP_KEYRING: Int = -6

public val KEY_SPEC_REQKEY_AUTH_KEY: Int = -7

public val KEY_SPEC_REQUESTOR_KEYRING: Int = -8

public val KEY_REQKEY_DEFL_NO_CHANGE: Int = -1

public val KEY_REQKEY_DEFL_DEFAULT: Int = 0

public val KEY_REQKEY_DEFL_THREAD_KEYRING: Int = 1

public val KEY_REQKEY_DEFL_PROCESS_KEYRING: Int = 2

public val KEY_REQKEY_DEFL_SESSION_KEYRING: Int = 3

public val KEY_REQKEY_DEFL_USER_KEYRING: Int = 4

public val KEY_REQKEY_DEFL_USER_SESSION_KEYRING: Int = 5

public val KEY_REQKEY_DEFL_GROUP_KEYRING: Int = 6

public val KEY_REQKEY_DEFL_REQUESTOR_KEYRING: Int = 7

public val KEYCTL_GET_KEYRING_ID: UInt = 0u

public val KEYCTL_JOIN_SESSION_KEYRING: UInt = 1u

public val KEYCTL_UPDATE: UInt = 2u

public val KEYCTL_REVOKE: UInt = 3u

public val KEYCTL_CHOWN: UInt = 4u

public val KEYCTL_SETPERM: UInt = 5u

public val KEYCTL_DESCRIBE: UInt = 6u

public val KEYCTL_CLEAR: UInt = 7u

public val KEYCTL_LINK: UInt = 8u

public val KEYCTL_UNLINK: UInt = 9u

public val KEYCTL_SEARCH: UInt = 10u

public val KEYCTL_READ: UInt = 11u

public val KEYCTL_INSTANTIATE: UInt = 12u

public val KEYCTL_NEGATE: UInt = 13u

public val KEYCTL_SET_REQKEY_KEYRING: UInt = 14u

public val KEYCTL_SET_TIMEOUT: UInt = 15u

public val KEYCTL_ASSUME_AUTHORITY: UInt = 16u

public val KEYCTL_GET_SECURITY: UInt = 17u

public val KEYCTL_SESSION_TO_PARENT: UInt = 18u

public val KEYCTL_REJECT: UInt = 19u

public val KEYCTL_INSTANTIATE_IOV: UInt = 20u

public val KEYCTL_INVALIDATE: UInt = 21u

public val KEYCTL_GET_PERSISTENT: UInt = 22u

public val KEYCTL_DH_COMPUTE: UInt = 23u

public val KEYCTL_PKEY_QUERY: UInt = 24u

public val KEYCTL_PKEY_ENCRYPT: UInt = 25u

public val KEYCTL_PKEY_DECRYPT: UInt = 26u

public val KEYCTL_PKEY_SIGN: UInt = 27u

public val KEYCTL_PKEY_VERIFY: UInt = 28u

public val KEYCTL_RESTRICT_KEYRING: UInt = 29u

public val KEYCTL_MOVE: UInt = 30u

public val KEYCTL_CAPABILITIES: UInt = 31u

public val KEYCTL_SUPPORTS_ENCRYPT: UInt = 0x01u

public val KEYCTL_SUPPORTS_DECRYPT: UInt = 0x02u

public val KEYCTL_SUPPORTS_SIGN: UInt = 0x04u

public val KEYCTL_SUPPORTS_VERIFY: UInt = 0x08u

public val KEYCTL_CAPS0_CAPABILITIES: UInt = 0x01u

public val KEYCTL_CAPS0_PERSISTENT_KEYRINGS: UInt = 0x02u

public val KEYCTL_CAPS0_DIFFIE_HELLMAN: UInt = 0x04u

public val KEYCTL_CAPS0_PUBLIC_KEY: UInt = 0x08u

public val KEYCTL_CAPS0_BIG_KEY: UInt = 0x10u

public val KEYCTL_CAPS0_INVALIDATE: UInt = 0x20u

public val KEYCTL_CAPS0_RESTRICT_KEYRING: UInt = 0x40u

public val KEYCTL_CAPS0_MOVE: UInt = 0x80u

public val KEYCTL_CAPS1_NS_KEYRING_NAME: UInt = 0x01u

public val KEYCTL_CAPS1_NS_KEY_TAG: UInt = 0x02u
