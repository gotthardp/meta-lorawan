OpenEmbedded/Yocto Project layer for LoRaWAN support
====================================================

This layer depends on:
 * [Erlang](https://github.com/joaohf/meta-erlang)

Usage instructions
------------------

For conf/bblayers.conf you have to add

```bash
BBLAYERS ?= " \
    ...
    path_to_source/sources/meta-lorawan \
    "
```
