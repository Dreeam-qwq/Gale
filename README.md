<img src="logo.png" alt="Gale logo" align="right" width="26%">
<div align="center">
  <h1>Gale</h1>
  <h3>A reliable high-performance Minecraft server fork.</h3>

[![Discord](https://img.shields.io/discord/1045402468416233592?color=5865F2&label=discord&style=for-the-badge)](https://discord.com/invite/gwezNT8c24)
</div>

## About

Gale is a fork of [Paper](https://github.com/PaperMC/Paper) focused on reliable performance.

## Benefits

* **Reliability**\
  All features are reviewed with care. Every patch is carefully implemented and verified line-by-line.

* **No changes to game mechanics**\
  Gale improves performance without changing behavior (by default).

* **Configuration is optional**\
  By default, Gale behaves the same as Paper. Editing the configuration is optional.

## Contributing

Pull requests are welcomed! Don't be afraid to submit a pull request that you may feel is just for yourself. All ideas are welcome. If submitted pull requests do not meet our standards, we can work together to improve them.

## Building from source

* Clone the project
* Run `./gradlew applyAllPatches`
* Run `./gradlew :gale-server:createPaperclipJar`

## Acknowledgements

Of course, this fork would not exist without the years-long work of all the contributors to [Paper](https://github.com/PaperMC/Paper).

Additional thanks goes out to the contributors to [Spigot](https://www.spigotmc.org/) and Bukkit, and to the contributors to other Minecraft server software.

Gale prioritizes trust and reliability. If you wish to try more experimental software, consider [Leaf](https://www.leafmc.one/).

## License
Paperweight files are licensed under MIT.
Patches are licensed under GPL-3.0, unless indicated differently in their header.
Binaries are licensed under GPL-3.0.
