# buntenacht-addR

![Build](https://github.com/Tyrrx/buntenacht-addR/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

## Baue Deine passende Entwicklungswerkzeuge selbst. Schnell und Effizient mit der IntelliJ-Plattform

Wir benutzen mächtige Werkzeuge fürs Programmieren und setzen Syntax Highlighting, Code-Completion, Navigation, 
Referenzsuche und automatisiertes Refactoring schon selbstverständlich voraus. 
Massiver Produktivitätsgewinn. Aber da geht noch viel mehr. 
Wir erweitern unsere Werkzeuge selber oder bauen neue. 
Wir zeigen an einem realen Projekt, wie man eigene Produktivitätswerkzeuge 
mit der IntelliJ-Plattform entwickelt, die es vorher noch nicht gab. 
Inklusive Abstract Syntax Tree, Parser, Lexer, Syntaxanalyse, 
Semantische Analyse und ganz vielen Pattern.

## addR ein minimales Beispiel für ein IntelliJ Sprach-Plugin

Schritte zum minimalen Setup:

- Verwendung des [IntelliJ Platform Plugin Template][template]
- Definition einer Sprache und Registrierung zugehöriger Dateitypen
- Definition eines Lexer und Parsers
- Generierung von Lexer und Parser
- Registrierung von Lexer und Parser
- Implementierung eines einfachen Syntax-Highlighters
- Definition von benannten Elementen
- Auflösung von Referenzen für Navigation und Rename-Refactoring

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [ ] Get familiar with the [template documentation][template].
- [ ] Verify the [pluginGroup](/gradle.properties), [plugin ID](/src/main/resources/META-INF/plugin.xml) and [sources package](/src/main/kotlin).
- [ ] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html).
- [ ] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate) for the first time.
- [ ] Set the Plugin ID in the above README badges.
- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html).
- [ ] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

<!-- Plugin description -->
This Fancy IntelliJ Platform Plugin is going to be your implementation of the brilliant ideas that you have.

This specific section is a source for the [plugin.xml](/src/main/resources/META-INF/plugin.xml) file which will be extracted by the [Gradle](/build.gradle.kts) during the build process.

To keep everything working, do not remove `<!-- ... -->` sections. 
<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "buntenacht-addR"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the [latest release](https://github.com/Tyrrx/buntenacht-addR/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
