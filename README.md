# OpenEmbedded/Yocto Project layer with LoRaWAN tools

This layer depends on:
 * [Erlang](https://github.com/joaohf/meta-erlang)

It can also be combined with other layers, such as:
 * [LoRa gateway software layer](https://github.com/sigysmund/meta-lora-net)

## Usage instructions

Images for
[Multitech mLinux](http://www.multitech.net/developer/software/mlinux/)
or [LORIX One](https://www.lorixone.io/)
are provided.

To build the mLinux or LORIX One image
 - follow instructions to download
   [mLinux](http://www.multitech.net/developer/software/mlinux/mlinux-building-images/building-a-custom-linux-image/),
   [LORIX One](https://github.com/Wifx/meta-wifx),
   or plain OpenEmbedded/Yocto sources
 - integrate meta-lorawan in the `conf/bblayers.conf`
   ```bash
   BBLAYERS ?= " \
       ...
       path_to_source/sources/meta-lorawan \
       "
   ```
 - uncomment the corresponding line in `meta-lorawan/conf/layer.conf`, or create
   your custom image recipe
