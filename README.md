# TCE Navigation System — Accessible Campus Navigator

An **offline, node-based indoor navigation Android app** built for **TCE campus**, designed with accessibility at its core. Supports four user categories — each with a dedicated navigation experience tailored to their needs.

> Built on top of [FESTU Navigator](https://github.com/Gebort/FESTU.Navigator) by [Gebort](https://github.com/Gebort), adapted and deployed for TCE.

---

##  What It Does

Students, staff, and visitors can navigate the entire TCE campus — rooms, labs, offices, blocks, and corridors — **fully offline, no internet needed**.

The app supports **four accessibility modes**, each with its own purpose-mapped node graph:

| Mode | How it works |
|---|---|
| Normal User | Standard campus navigation across all routes |
| Wheelchair User | Routes mapped to **avoid stairs and inaccessible paths** |
| Deaf & Dumb User | Full visual navigation, same coverage as normal user |
| Visual Impaired User | Navigation + **"Call Assistant" button** that connects to a live helper |

---

## My Contributions

### 1. Mapped Multiple Accessibility Node Graphs
Using the admin app, I created **separate node databases for each user type** across TCE campus — covering:
- Main Entrance, Principal Office, Management Office, Placement Office
- All department branches
- Library, Auditorium, Labs

For the **wheelchair graph**, routes were deliberately mapped to exclude staircases and inaccessible corridors, requiring careful planning of alternative paths across the campus.

### 2. Set Up the Call Assistant System (Visual Impaired)
Configured the "Call Assistant" feature — a button that directly dials a designated helper's number, giving visually impaired users real human support while navigating.

### 3. Built an APK Distribution Website
Created a website where users can download the APK for each accessibility mode directly — since the four variants are separate builds with different node databases.

### 4. Dependency & Build Fixes
The original project had outdated or version-pinned Gradle dependencies. Resolved compatibility issues and removed stale version locks to get all modules building cleanly.

---

## Campus Coverage

The node graph covers the following areas of TCE:

- **Main Entrance Block** — Main Entrance, Office, Principal Office, Management Office, Placement Office
- **Branches** — All department blocks
- **Library**
- **Auditorium**
- **Labs**

---

## Screenshots

| Home Screen | Campus Blocks |
|---|---|
| ![Home](screenshots/home.png) | ![Blocks](screenshots/blocks.png) |

---

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Kotlin |
| Platform | Android |
| Navigation | Graph-based pathfinding (node/edge model) |
| Data | Local SQLite node database — fully offline |
| Build | Gradle |
| Distribution | Custom website for APK downloads |

---

## Getting Started

### Prerequisites
- Android Studio (latest stable)
- Android SDK 21+

### Run Locally

```bash
git clone https://github.com/YOUR_USERNAME/tce-navigator.git
# Open in Android Studio → Sync Gradle → Run
```

### Admin App — Editing the Node Graph

The `admin` module lets you add/edit nodes and paths:

1. Open the `admin` module in Android Studio
2. Add nodes (rooms, junctions, landmarks)
3. Connect nodes with edges — for wheelchair mode, **only add edges on accessible, stair-free paths**
4. Export — the main app reads the database automatically

---

## Credits

Core navigation engine, pathfinding logic, and UI are from [FESTU Navigator](https://github.com/Gebort/FESTU.Navigator) by [Gebort](https://github.com/Gebort). This repo is an accessibility-focused adaptation for TCE campus.

---

## 📄 License

Refer to the original project: [FESTU Navigator License](https://github.com/Gebort/FESTU.Navigator)
