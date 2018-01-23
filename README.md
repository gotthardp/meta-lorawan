# OpenEmbedded/Yocto Project layer with LoRaWAN tools

This layer depends on:
 * [Erlang](https://github.com/joaohf/meta-erlang)

It can also be combined with other layers, such as:
 * [LoRa gateway software layer](https://github.com/sigysmund/meta-lora-net)

## Usage Instructions

Images for
[Multitech mLinux](http://www.multitech.net/developer/software/mlinux/)
or [LORIX One](https://www.lorixone.io/)
are provided and I would be delighted to accept pull requests with images for
more OpenEmbedded systems.

To build the image:
 - Follow instructions to download
   [mLinux](http://www.multitech.net/developer/software/mlinux/mlinux-building-images/building-a-custom-linux-image/),
   [LORIX One](https://github.com/Wifx/meta-wifx),
   or plain OpenEmbedded/Yocto sources
 - Add meta-lorawan to the `conf/bblayers.conf`
   ```bash
   BBLAYERS ?= " \
       ...
       path_to_source/sources/meta-lorawan \
       "
   ```
 - Uncomment the corresponding line in `meta-lorawan/conf/layer.conf`, or create
   your custom image recipe

## Getting Help

To ask server and LoRa related questions please join the
[lorawan-server mailing list](https://groups.google.com/forum/#!forum/lorawan-server).

For Bitbake related questions please read the
[documentation](http://www.openembedded.org/wiki/Documentation).
