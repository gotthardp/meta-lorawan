OpenEmbedded/Yocto Project layer with LoRaWAN tools
===================================================

This layer depends on:
 * [Erlang](https://github.com/joaohf/meta-erlang)

It can also be combined with other layers, such as:
 * [LoRa gateway software layer](https://github.com/sigysmund/meta-lora-net)

Usage instructions
------------------

For conf/bblayers.conf you have to add

```bash
BBLAYERS ?= " \
    ...
    path_to_source/sources/meta-lorawan \
    "
```
